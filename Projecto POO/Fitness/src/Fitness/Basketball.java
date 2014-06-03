package Fitness;

import java.util.GregorianCalendar;
import java.io.Serializable;

/**
 * Classe da actividade Basketeball
 * 
 * @author Bruno Pereira
 * @author João Mano
 * @author Miguel Guimarães
 * @version 2014
 */
public class Basketball extends Indoor implements UserVs, Serializable
{
    private int myScore;
    private int opScore;
    
    /**
     *Construtor vazio
     */
    public Basketball(){
        super();
    }

    /**
     *
     * @param name Nome da actividade
     * @param date  Data da realização da actividade
     * @param timeSpent Tempo gasto em minutos
     * @param myScore Pontos feitos
     * @param opScore Pontos recebidos
     */
    public Basketball(String name, GregorianCalendar date, double timeSpent,int myScore,int opScore){
        super(name,date,timeSpent);
        this.myScore=myScore;
        this.opScore=opScore;
    }

    /**
      * Construtor de cópia
     * @param tb Uma actividade Basketball
     */
    public Basketball(Basketball tb){
        super(tb);
        this.myScore=tb.getMyScore();
        this.opScore=tb.getOpScore();
    }

    /**
     *
     * @return int -Inteiro dos pontos feitos
     */
    @Override
    public int getMyScore() {
      return this.myScore;
    }

    /**
     *
     * @return int Inteiro dos pontos recebidos
     */
    @Override
    public int getOpScore() {
        return this.opScore;
          }
    
    @Override
    public void setCalories(double peso) {//MET=6
      double mets=6;
      double calories=mets*peso*(this.getTimeSpent()/60);
      this.setActivityCalories(calories);    
    }
    
    ////////////toString equals clone
    
    
    @Override
     public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(super.toString());
        sb.append("My Score").append("\n");
        sb.append(this.myScore).append("\n");
        sb.append("Opponent Score").append("\n");
        sb.append(this.opScore).append("\n");
        return sb.toString();      
    }
    
    
    
    @Override
    public boolean equals(Object a){
        if(this == a)
            return true;
        if(a == null || this.getClass() != a.getClass())
            return false;
        Basketball act = (Basketball) a;
        return  ( super.equals(act)
                && this.myScore==act.getMyScore()
                && this.opScore==act.getOpScore());
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.myScore;
        hash = 23 * hash + this.opScore;
        return hash;
    }

    @Override
     public Basketball clone(){
        return new Basketball(this);
    }
}
