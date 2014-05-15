/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package li3_java;

/**
 * Write a description of class RedeGlobalAutores here.
 *
 * @author jmano
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class RedeGlobalAutores implements Serializable {

	private TreeMap<Integer, RedeAnualAutores> redeGlobalAutores;
	private String ficheiroLido;
	private int artigosLidos;
	private int nomesLidos;
	private int nomesDistintos;
	private int menorAno;
	private int maiorAno;

	public RedeGlobalAutores() {
		this.redeGlobalAutores = new TreeMap<Integer, RedeAnualAutores>();
		this.ficheiroLido = "";
		this.artigosLidos = 0;
		this.nomesLidos = 0;
		this.nomesDistintos = 0;
		this.menorAno = 20000;
		this.maiorAno = 0;
	}
	
	public RedeGlobalAutores(RedeGlobalAutores rede){
		this.redeGlobalAutores = (TreeMap<Integer, RedeAnualAutores>)  rede.getRedeGlobalAutores();
		this.ficheiroLido = rede.getFIcheiroLido();
		this.artigosLidos = rede.getArtigosLidos();
		this.nomesLidos = rede.getNomesLidos();
		this.nomesDistintos = rede.getNomesDistintos();
		this.menorAno = rede.getMenorAno();
		this.maiorAno = rede.getMaiorAno();
	}
	
	public void leFicheiro(String fileName) {
		String endName = fileName.substring(fileName.length() - 4);
		switch (endName) {
			case ".obj":
				this.leFicheiroObj(fileName);

				break;
			case ".txt":
				this.leFicheiroTxt(fileName);
				break;

			default:
				System.out.println("ERROR default");
				break;

		}
	}
	// Getters
	
	private Map<Integer, RedeAnualAutores> getRedeGlobalAutores() {
		TreeMap<Integer, RedeAnualAutores> aux = new TreeMap<Integer, RedeAnualAutores>();
		for(RedeAnualAutores redeAnual : this.redeGlobalAutores.values()){
			aux.put(redeAnual.getAno(), redeAnual.clone());
		}
		return aux;
	}

	private String getFIcheiroLido() {
		return this.ficheiroLido;
	}

	private int getArtigosLidos() {
		return this.artigosLidos;
	}

	private int getNomesLidos() {
		return this.nomesLidos;
	}

	private int getNomesDistintos() {
		return this.nomesDistintos;
	}

	private int getMenorAno() {
		return this.menorAno;
	}

	private int getMaiorAno() {
		return this.maiorAno;
	}

	public void leFicheiroObj(String fileName) {
		try {
			ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(fileName));
			redeGlobalAutores = (TreeMap<Integer, RedeAnualAutores>) objInput.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public void leFicheiroTxt(String fileName) {
		String linha;
		ArrayList<String> linhaTok = new ArrayList<String>();
		int ano;
		Scanner fichScan;
		StringTokenizer sTok;
		HashSet<String> autDist = new HashSet<String>();
		this.ficheiroLido = fileName;

		try {
			fichScan = new Scanner(new FileReader(fileName));
			fichScan.useDelimiter(System.getProperty("line.separator"));

			while (fichScan.hasNext()) {
				linha = fichScan.next();
				sTok = new StringTokenizer(linha, ",");

				while (sTok.hasMoreTokens()) {
					linhaTok.add(sTok.nextToken().trim());
				}
				
				if(linhaTok.size() > 1){
					this.artigosLidos++;
				}

				ano = Integer.valueOf(linhaTok.get(linhaTok.size() - 1));
				if(ano < this.menorAno)
					this.menorAno = ano;
				if(ano > this.maiorAno)
					this.maiorAno = ano;
				
				linhaTok.remove(linhaTok.size() - 1);
				
				autDist.addAll(linhaTok);
				this.nomesLidos += linhaTok.size();
				this.adicionaPublicacao(ano, linhaTok);

				linhaTok.clear();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		this.nomesDistintos = autDist.size();
	}

	public void guardaDados() {

		try {
			FileOutputStream out = new FileOutputStream("RedeGlobalAutores.obj");
			ObjectOutputStream oout = new ObjectOutputStream(out);

			oout.writeObject(this.redeGlobalAutores);
			oout.flush();

		} catch (SecurityException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void adicionaPublicacao(int ano, List<String> autores) {
		if (this.redeGlobalAutores.containsKey(ano)) {
			this.redeGlobalAutores.get(ano).insereAutores(autores);
		} else {
			RedeAnualAutores novoAno = new RedeAnualAutores(ano, autores);
			this.redeGlobalAutores.put(ano, novoAno);
		}
	}

	public RedeAnualAutores getPubsAno(int ano) {
		if (this.redeGlobalAutores.containsKey(ano)) {
			return this.redeGlobalAutores.get(ano).clone();
		}
		return null; // NADA DE NULL!!!!
	}
	
	public String statsString(){
		StringBuilder s = new StringBuilder("Rede de Autores: " + this.getFIcheiroLido());
		s.append("\nAnos: [").append(this.getMenorAno()).append(", ").append(this.getMaiorAno()).append("]");
		s.append("\nPublicações: ").append(this.getArtigosLidos());
		s.append("\nAutores lidos: ").append(this.getNomesLidos());
		s.append("\nAutores distintos: ").append(this.getNomesDistintos());
		//for (RedeAnualAutores ano : this.redeGlobalAutores.values()) {
		//	s.append("\n\t").append(ano.toString()).append("\n");
		//}
		return s.toString();
	}
	
	public int getNumPubsAutorAnos(String nome, int anoInicial, int anoFinal){
		int count = 0;
		RedeAnualAutores redeAux;
		for(int i = anoInicial; i <= anoFinal; i++){
			if(this.redeGlobalAutores.containsKey(i)){
				redeAux = this.redeGlobalAutores.get(i).clone();
				count += redeAux.numPubsAutor(nome);
			}
		}
		return count;
	}
	
	public Set<String> consulta21a (int anoInicial, int anoFinal, int topX){
		TreeSet<Autor> maxPubsAutores = new TreeSet<Autor>(new CompareAutorPubs());
		//TreeSet<String> res = new TreeSet<String>();
		Iterator<Autor> it;
		Autor autAux;
		boolean sair = false;
		
		for(int i = anoInicial; i <= anoFinal; i++){
			for(Autor aut: this.redeGlobalAutores.get(i).getRedeAnualAutores().values()){
				it = maxPubsAutores.iterator();
				if(maxPubsAutores.contains(aut))
					while(it.hasNext() && !sair){
						autAux = it.next();
						if(autAux.getNome().equals(aut.getNome())){
							autAux.incrementaPubs(aut.getNumeroPubsSolo(), aut.getNumeroPubsCoAutores());
							sair = true;
						}
					}
				else
					maxPubsAutores.add(aut.clone());
			}
		}
		
		return this.consulta21aAux(maxPubsAutores, topX);
	}
	
	private Set<String> consulta21aAux(TreeSet<Autor> auts, int topX){
		TreeSet<String> res = new TreeSet<String>();
		for(int i = 0; i < topX; i++){
			res.add(auts.pollFirst().getNome());
		}
		
		return res;
	}
	
	public int getLinhasDuplicado(){
		HashSet<String> linhas = new HashSet<String>();
		int numLinhas = 0;
		Scanner fichScan;
		
		try {
			fichScan = new Scanner(new FileReader(this.ficheiroLido));
			fichScan.useDelimiter(System.getProperty("line.separator"));
			while(fichScan.hasNext()){
				linhas.add(fichScan.next());
				numLinhas++;
			}
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		return numLinhas - linhas.size();			
	}
	
	public Set<String> consulta21b(int topX, int anoInicial, int anoFinal){
		TreeSet<ParCoAutores> paresAutores = new TreeSet<ParCoAutores>(new CompareParCoAutores());
		Iterator<ParCoAutores> it;
		ParCoAutores par, parAux;
		boolean sair;

		for(int i = anoInicial; i < anoFinal; i++){
			for (Autor aut: this.redeGlobalAutores.get(i).getRedeAnualAutores().values()) {
				for (CoAutor coaut : aut.getCoAutores().values()) {
					par = new ParCoAutores(aut.getNome(), coaut.getNome(), coaut.getNumeroPubsComAutor());
					it = paresAutores.iterator();
					if (paresAutores.contains(par)){
						sair = false;
						while(it.hasNext() && !sair){
							parAux = it.next();
							if(par.equals(parAux)){
								parAux.addPubs(coaut.getNumeroPubsComAutor());
								sair = true;
							}
						}
					} else paresAutores.add(par);
				}
			}
		}
		return consulta21bAux(paresAutores, topX);
	}
	
	public Set<String> consulta21bAux(TreeSet<ParCoAutores> pares, int topX){
		TreeSet<String> res = new TreeSet<String>();
		for(int i = 0; i < topX; i++){
			res.add(pares.pollFirst().toString());
		}
		
		return res;
	}
	
	public Set<String> consulta22b(char c) {
		TreeSet<String> autoresLetra = new TreeSet<String>();
		for(RedeAnualAutores redeAnual: this.redeGlobalAutores.values())
			for(String nome: redeAnual.getRedeAnualAutores().keySet())
				if(nome.startsWith(""+ c))
					autoresLetra.add(nome);
		
		return autoresLetra;					
	}
	
	public String consulta22c(String autor, int ano){
		RedeAnualAutores redeAnual;
		Autor aut;
		StringBuilder sb = new StringBuilder();
		if(this.redeGlobalAutores.containsKey(ano)){
			redeAnual = this.redeGlobalAutores.get(ano).clone();
			if(redeAnual.getRedeAnualAutores().containsKey(autor)){
				aut = redeAnual.getRedeAnualAutores().get(autor).clone();
				sb.append("Número de publicações com co-autores: ");
				sb.append(aut.getNumeroPubsCoAutores());
				sb.append("\n");
				for(CoAutor coAut: aut.getCoAutores().values())
					sb.append(coAut.getNome()).append(("\n"));
			}
		}
		else{
			sb.append("Ano não existente no ficheiro...\n\n");
		}
		return sb.toString();
	}
	
	public Set<String> consulta22d(String autor){
		TreeSet<String> coAutores = new TreeSet<String>();
		for(RedeAnualAutores redeAnual: this.getRedeGlobalAutores().values())
			if(redeAnual.getRedeAnualAutores().containsKey(autor))
				for(CoAutor coAut: redeAnual.getRedeAnualAutores().get(autor).getCoAutores().values())
					coAutores.add(coAut.getNome());
		
		return coAutores;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder("Rede de Autores: " + this.getFIcheiroLido());
		s.append("\nAnos: [").append(this.getMenorAno()).append(", ").append(this.getMaiorAno()).append("]");
		s.append("\nPublicações: ").append(this.getArtigosLidos());
		s.append("\nAutores lidos: ").append(this.getNomesLidos());
		s.append("\nAutores distintos: ").append(this.getNomesDistintos());
		for (RedeAnualAutores ano : this.redeGlobalAutores.values()) {
			s.append("\n\t").append(ano.toString()).append("\n");
		}
		return s.toString();
	}

	
}
