/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fitness;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jmano
 */
public class AdminForm extends javax.swing.JFrame {

	/**
	 * Creates new form AdminForm
	 */
	public AdminForm(JFrame parent, FitnessUM fit, Admin admin) {
		initComponents();
		this.setLocationRelativeTo(parent);
		this.setName(admin.getName() + " - Administrador");
		this.fit = fit;
		this.admin = admin;
		this.setStats();
		this.checkEvents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butAddEvento = new javax.swing.JButton();
        butDelUser = new javax.swing.JButton();
        butLogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelUsersReg = new javax.swing.JLabel();
        labelActs = new javax.swing.JLabel();
        labelEvents = new javax.swing.JLabel();
        labelOpenEvents = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        butAddEvento.setText("+ EVENTO");
        butAddEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddEventoActionPerformed(evt);
            }
        });

        butDelUser.setText("- USER");

        butLogout.setText("LOGOUT");
        butLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLogoutActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ESTATÍSTICAS"));

        jLabel1.setText("Utilizadores registados");

        jLabel2.setText("Atividades realizadas");

        jLabel3.setText("Eventos realizados");

        jLabel4.setText("Eventos abertos");

        labelUsersReg.setText("users");

        labelActs.setText("acts");

        labelEvents.setText("events");

        labelOpenEvents.setText("events");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOpenEvents)
                    .addComponent(labelEvents)
                    .addComponent(labelActs)
                    .addComponent(labelUsersReg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelUsersReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelActs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelEvents))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelOpenEvents))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butAddEvento)
                        .addGap(61, 61, 61)
                        .addComponent(butDelUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(butLogout)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butAddEvento)
                    .addComponent(butDelUser)
                    .addComponent(butLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLogoutActionPerformed
        this.dispose();
        this.guardaEstado();
	    LoginForm login = new LoginForm();
        login.setVisible(true);
    }//GEN-LAST:event_butLogoutActionPerformed
	
	private void checkEvents() {
		GregorianCalendar now = new GregorianCalendar();
		for (Event e : this.fit.getEvents()) {
			if (e.getDate().before(now) && e.getSimulacao().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Existem eventos que devem ser simulados. Por favor simule-os...");
			}
		}
	}
	
    private void butAddEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddEventoActionPerformed
        AddEventForm addEvent = new AddEventForm(this, this.fit);
		this.setVisible(false);
		addEvent.setVisible(true);
    }//GEN-LAST:event_butAddEventoActionPerformed

	private void guardaEstado() {
		try {
			FileOutputStream out = new FileOutputStream("data.obj");
			ObjectOutputStream oout = new ObjectOutputStream(out);
			oout.writeObject(this.fit);
			oout.flush();
			oout.close();
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage() + " | " + ex.getLocalizedMessage());
		}
	}
	
	public void setStats(){
		this.labelUsersReg.setText(String.valueOf(this.fit.getNumUsers()));
		this.labelActs.setText(String.valueOf(this.fit.getNumActivities()));
		this.labelEvents.setText(String.valueOf(this.fit.getOccurredEvents().size()));
		this.labelOpenEvents.setText(String.valueOf(this.fit.getOpenEvents().size()));
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAddEvento;
    private javax.swing.JButton butDelUser;
    private javax.swing.JButton butLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelActs;
    private javax.swing.JLabel labelEvents;
    private javax.swing.JLabel labelOpenEvents;
    private javax.swing.JLabel labelUsersReg;
    // End of variables declaration//GEN-END:variables
	
	private FitnessUM fit;
	private Admin admin;
}
