/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package li3_java;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author jmano
 */
public class FormInicial extends javax.swing.JFrame {

	/**
	 * Creates new form FormInicial
	 */
	public FormInicial() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pathText = new javax.swing.JTextField();
        butFileChoose = new javax.swing.JButton();
        butLerFicheiro = new javax.swing.JButton();
        butSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão de Autores");
        setMinimumSize(new java.awt.Dimension(402, 300));
        setName("formInicial"); // NOI18N

        jLabel1.setText("CARREGAR FICHEIRO");
        jLabel1.setToolTipText("");

        pathText.setMinimumSize(new java.awt.Dimension(64, 18));

        butFileChoose.setText("...");
        butFileChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFileChooseActionPerformed(evt);
            }
        });

        butLerFicheiro.setText("OK");
        butLerFicheiro.setMaximumSize(new java.awt.Dimension(59, 24));
        butLerFicheiro.setMinimumSize(new java.awt.Dimension(59, 24));
        butLerFicheiro.setPreferredSize(new java.awt.Dimension(59, 24));
        butLerFicheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLerFicheiroActionPerformed(evt);
            }
        });

        butSair.setText("SAIR");
        butSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSairActionPerformed(evt);
            }
        });

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pathText, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butFileChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butLerFicheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butFileChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butLerFicheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butFileChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFileChooseActionPerformed
        // TODO add your handling code here:
		JFileChooser fChoose = new JFileChooser();
		File f;
		String path;
		int res;
		this.setEnabled(false);
		fChoose.setCurrentDirectory(new java.io.File("/home/jmano/NetBeansProjects/LI3_JAVA"));
		res = fChoose.showDialog(null, "Abrir...");
		this.setEnabled(true);
		if(res == JFileChooser.APPROVE_OPTION){
			f = fChoose.getSelectedFile();
			path = f.getAbsolutePath();
			this.pathText.setText(path);
		}
		
    }//GEN-LAST:event_butFileChooseActionPerformed

    private void butSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSairActionPerformed
        // TODO add your handling code here:
		System.exit(0);
    }//GEN-LAST:event_butSairActionPerformed
	
	
    private void butLerFicheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLerFicheiroActionPerformed
        // TODO add your handling code here:
		GestAutores gest = new GestAutores();
		RedeGlobalAutores redeGlobal = new RedeGlobalAutores();
		gest.lerFicheiro(this.pathText.getText(), redeGlobal);
		//this.textArea.setText(redeGlobal.statsString());
		
		this.textArea.setText(redeGlobal.consulta21a(2012, 2012, 3).toString());
		this.textArea.setText(this.textArea.getText().concat("\nLinhas dup: " + redeGlobal.getLinhasDuplicado()));
		//this.textArea.setText(redeGlobal.getPubsAno(2014).toString());
		//this.textArea.setText(redeGlobal.toString());
		//this.textArea.setText(this.textArea.getText().);
    }//GEN-LAST:event_butLerFicheiroActionPerformed

	/**
	 * @param args the command line arguments
	 */
/*	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		/*try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        //</editor-fold>

		/* Create and display the form */
		/*java.awt.EventQueue.invokeLater(new Runnable() {
			//public void run() {
				new FormInicial().setVisible(true);
			}
		});
	}*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butFileChoose;
    private javax.swing.JButton butLerFicheiro;
    private javax.swing.JButton butSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pathText;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
