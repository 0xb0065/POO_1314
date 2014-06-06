/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fitness;

import java.awt.event.ItemEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author jmano
 */
public class AddEventForm extends javax.swing.JFrame {

	/**
	 * Creates new form EventForm
	 */
	public AddEventForm(AdminForm parent, FitnessUM fit) {
		initComponents();
		this.setLocationRelativeTo(parent);
		this.parent = parent;
		this.fit = fit;
		GregorianCalendar now = new GregorianCalendar();
		this.now = now;
		this.cboxDia.setSelectedItem(now.get(Calendar.DAY_OF_MONTH));
		this.cboxMes.setSelectedIndex(now.get(Calendar.MONTH));
		this.cboxAno.setSelectedItem(now.get(Calendar.YEAR));
		this.cboxDia1.setSelectedItem(now.get(Calendar.DAY_OF_MONTH));
		this.cboxMes1.setSelectedIndex(now.get(Calendar.MONTH));
		this.cboxAno1.setSelectedItem(now.get(Calendar.YEAR));
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        cboxEventos = new javax.swing.JComboBox();
        textLocal = new javax.swing.JTextField();
        textNumMax = new javax.swing.JTextField();
        cboxDia = new javax.swing.JComboBox();
        labelDay = new javax.swing.JLabel();
        cboxMes = new javax.swing.JComboBox();
        labelMonth = new javax.swing.JLabel();
        cboxAno = new javax.swing.JComboBox();
        labelYear = new javax.swing.JLabel();
        cboxDia1 = new javax.swing.JComboBox();
        labelDay1 = new javax.swing.JLabel();
        cboxMes1 = new javax.swing.JComboBox();
        labelMonth1 = new javax.swing.JLabel();
        cboxAno1 = new javax.swing.JComboBox();
        labelYear1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textDistancia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        butAddEvento = new javax.swing.JButton();
        butCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar novo evento");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "EVENTO"));

        jLabel1.setText("Nome");

        jLabel2.setText("Tipo de Evento");

        jLabel3.setText("Localização");

        jLabel4.setText("Máximo de Participantes");

        jLabel5.setText("Data limite de inscrição");

        jLabel6.setText("Data");

        cboxEventos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maratona", "Meia Maratona", "Maratona BTT", "Trail" }));
        cboxEventos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxEventosItemStateChanged(evt);
            }
        });

        cboxDia.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        cboxDia.setModel(new javax.swing.DefaultComboBoxModel(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}));
        cboxDia.setMaximumSize(new java.awt.Dimension(45, 21));
        cboxDia.setMinimumSize(new java.awt.Dimension(45, 21));
        cboxDia.setPreferredSize(new java.awt.Dimension(45, 21));

        labelDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDay.setText("Dia");
        labelDay.setMaximumSize(new java.awt.Dimension(45, 14));
        labelDay.setMinimumSize(new java.awt.Dimension(45, 14));
        labelDay.setPreferredSize(new java.awt.Dimension(45, 14));

        cboxMes.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        cboxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
        cboxMes.setMaximumSize(new java.awt.Dimension(95, 21));
        cboxMes.setMinimumSize(new java.awt.Dimension(95, 21));
        cboxMes.setPreferredSize(new java.awt.Dimension(95, 21));

        labelMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMonth.setText("Mês");
        labelMonth.setMaximumSize(new java.awt.Dimension(95, 14));
        labelMonth.setMinimumSize(new java.awt.Dimension(95, 14));
        labelMonth.setPreferredSize(new java.awt.Dimension(95, 14));

        cboxAno.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        cboxAno.setModel(new javax.swing.DefaultComboBoxModel(new Integer[] { 2014, 2015, 2016, 2017, 2018, 2019, 2020 }));
        cboxAno.setMaximumSize(new java.awt.Dimension(68, 21));
        cboxAno.setMinimumSize(new java.awt.Dimension(68, 21));
        cboxAno.setPreferredSize(new java.awt.Dimension(68, 21));

        labelYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelYear.setText("Ano");
        labelYear.setMaximumSize(new java.awt.Dimension(68, 14));
        labelYear.setMinimumSize(new java.awt.Dimension(68, 14));
        labelYear.setPreferredSize(new java.awt.Dimension(68, 14));

        cboxDia1.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        cboxDia1.setModel(new javax.swing.DefaultComboBoxModel(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}));
        cboxDia1.setMaximumSize(new java.awt.Dimension(45, 21));
        cboxDia1.setMinimumSize(new java.awt.Dimension(45, 21));
        cboxDia1.setPreferredSize(new java.awt.Dimension(45, 21));

        labelDay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDay1.setText("Dia");
        labelDay1.setMaximumSize(new java.awt.Dimension(45, 14));
        labelDay1.setMinimumSize(new java.awt.Dimension(45, 14));
        labelDay1.setPreferredSize(new java.awt.Dimension(45, 14));

        cboxMes1.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        cboxMes1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
        cboxMes1.setMaximumSize(new java.awt.Dimension(95, 21));
        cboxMes1.setMinimumSize(new java.awt.Dimension(95, 21));
        cboxMes1.setPreferredSize(new java.awt.Dimension(95, 21));

        labelMonth1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMonth1.setText("Mês");
        labelMonth1.setMaximumSize(new java.awt.Dimension(95, 14));
        labelMonth1.setMinimumSize(new java.awt.Dimension(95, 14));
        labelMonth1.setPreferredSize(new java.awt.Dimension(95, 14));

        cboxAno1.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        cboxAno1.setModel(new javax.swing.DefaultComboBoxModel(new Integer[] { 2014, 2015, 2016, 2017, 2018, 2019, 2020 }));
        cboxAno1.setMaximumSize(new java.awt.Dimension(68, 21));
        cboxAno1.setMinimumSize(new java.awt.Dimension(68, 21));
        cboxAno1.setPreferredSize(new java.awt.Dimension(68, 21));

        labelYear1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelYear1.setText("Ano");
        labelYear1.setMaximumSize(new java.awt.Dimension(68, 14));
        labelYear1.setMinimumSize(new java.awt.Dimension(68, 14));
        labelYear1.setPreferredSize(new java.awt.Dimension(68, 14));

        jLabel7.setText("Distância");

        textDistancia.setEnabled(false);

        jLabel8.setText("KMs");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboxEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textLocal)
                            .addComponent(textNome)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(textNumMax, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelDay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboxAno1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel5))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboxAno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel8)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNumMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboxDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxAno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6))
        );

        butAddEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fitness/ok2.png"))); // NOI18N
        butAddEvento.setText("EVENTO");
        butAddEvento.setToolTipText("Adicionar evento com os dados introduzidos");
        butAddEvento.setIconTextGap(10);
        butAddEvento.setMargin(new java.awt.Insets(2, 9, 2, 9));
        butAddEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddEventoActionPerformed(evt);
            }
        });

        butCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fitness/close.png"))); // NOI18N
        butCancel.setText("CANCEL");
        butCancel.setIconTextGap(10);
        butCancel.setMargin(new java.awt.Insets(2, 9, 2, 9));
        butCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butCancel)
                .addGap(18, 18, 18)
                .addComponent(butAddEvento)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butAddEvento)
                    .addComponent(butCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.parent.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void butAddEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddEventoActionPerformed
        boolean ok = true;
		try{
			String nome = this.textNome.getText();
			String local = this.textLocal.getText();
			int diaData = (int) this.cboxDia.getSelectedItem();
			int mesData = this.cboxMes.getSelectedIndex();
			int anoData = (int) this.cboxAno.getSelectedItem();
			GregorianCalendar data = new GregorianCalendar(anoData, mesData, diaData);
			int diaDataInsc = (int) this.cboxDia1.getSelectedItem();
			int mesDataInsc = this.cboxMes1.getSelectedIndex();
			int anoDataInsc = (int) this.cboxAno1.getSelectedItem();
			GregorianCalendar dataInsc = new GregorianCalendar(anoDataInsc, mesDataInsc, diaDataInsc);
			int numMax = Integer.parseInt(this.textNumMax.getText());
			String evento = (String) this.cboxEventos.getSelectedItem();
			if(nome.isEmpty() || local.isEmpty() || numMax == 0){
				ok = false;
				JOptionPane.showMessageDialog(this, "Por favor introduza todos os dados...");
			}
			
			if ((evento.equals("Maratona BTT") || evento.equals("Trail")) && Double.parseDouble(this.textDistancia.getText()) == 0.0){
				ok = false;
				JOptionPane.showMessageDialog(this, "A distância deste tipo de evento não pode ser 0 (zero)...");
			}
			
			if(data.before(this.now) || dataInsc.before(this.now) || dataInsc.after(data)){
				ok = false;
				JOptionPane.showMessageDialog(this, "Datas incorretas...\n\nCertifique-se que:\n- O evento não ocorre antes das inscrições terminarem\n- O evento é criado com pelo menos um dia de antecedência\n- A data limite de inscrição é de hoje a pelo menos um dia");
			}
				
			if(ok){
				switch (evento){
					case "Maratona":
						this.fit.addMarathon(nome, local, numMax, dataInsc, data);
						break;
					case "Meia Maratona":
						this.fit.addHalfmarathon(nome, local, numMax, dataInsc, data);
						break;
					case "Maratona BTT":
						double dist = Double.parseDouble(this.textDistancia.getText());
						this.fit.addMarathonBTT(nome, local, numMax, dataInsc, data, dist);
						break;
					default:
						double dista = Double.parseDouble(this.textDistancia.getText());
						this.fit.addTrail(nome, local, numMax, dataInsc, data, dista);
						break;
				}
				JOptionPane.showMessageDialog(this, "Evento adicionado com sucesso!");
				this.parent.setStats();
				this.dispose();
				this.parent.setVisible(true);
			}
			
		}
		catch (NumberFormatException e){
			JOptionPane.showMessageDialog(this, "Dados inseridos incorretamente ou não inseridos...");
		}
    }//GEN-LAST:event_butAddEventoActionPerformed

    private void butCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelActionPerformed
        this.dispose();
		this.parent.setVisible(true);
    }//GEN-LAST:event_butCancelActionPerformed

    private void cboxEventosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxEventosItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
			String sport = this.cboxEventos.getSelectedItem().toString();
			if(sport.equals("Maratona BTT") || sport.equals("Trail"))
				this.textDistancia.setEnabled(true);
			else
				this.textDistancia.setEnabled(false);
		}
    }//GEN-LAST:event_cboxEventosItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAddEvento;
    private javax.swing.JButton butCancel;
    private javax.swing.JComboBox cboxAno;
    private javax.swing.JComboBox cboxAno1;
    private javax.swing.JComboBox cboxDia;
    private javax.swing.JComboBox cboxDia1;
    private javax.swing.JComboBox cboxEventos;
    private javax.swing.JComboBox cboxMes;
    private javax.swing.JComboBox cboxMes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDay;
    private javax.swing.JLabel labelDay1;
    private javax.swing.JLabel labelMonth;
    private javax.swing.JLabel labelMonth1;
    private javax.swing.JLabel labelYear;
    private javax.swing.JLabel labelYear1;
    private javax.swing.JTextField textDistancia;
    private javax.swing.JTextField textLocal;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textNumMax;
    // End of variables declaration//GEN-END:variables

	private FitnessUM fit;
	private AdminForm parent;
	private GregorianCalendar now;
}
