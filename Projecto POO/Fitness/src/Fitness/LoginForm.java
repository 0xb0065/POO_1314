/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitness;

import java.awt.Font;
import java.awt.font.TextAttribute;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author jmano
 */
public class LoginForm extends javax.swing.JFrame {

	/**
	 * Creates new form MenuInicial
	 */
	public LoginForm() {
		initComponents();
		this.setLocationRelativeTo(null);
		fitness = new FitnessUM();
		User u1 = new User("1", "1", "user1", 'M', new GregorianCalendar(), 170, 70.0, "Futebol");
		User u2 = new User("2", "2", "user2", 'M', new GregorianCalendar(), 160, 70.0, "Running");
		User u3 = new User("3", "3", "user3", 'F', new GregorianCalendar(), 155, 50.0, "Tenis");
		User u4 = new User("4", "4", "user4", 'F', new GregorianCalendar(), 161, 52.0, "Yoga");
		fitness.addUser(u1.getEmail(), u1.getPassword(), u1.getName(), u1.getGender(), u1.getDate(), u1.getHeight(), u1.getWeight(), u1.getFavoriteActivity());
		fitness.addUser(u2.getEmail(), u2.getPassword(), u2.getName(), u2.getGender(), u2.getDate(), u2.getHeight(), u2.getWeight(), u2.getFavoriteActivity());
		fitness.addUser(u3.getEmail(), u3.getPassword(), u3.getName(), u3.getGender(), u3.getDate(), u3.getHeight(), u3.getWeight(), u3.getFavoriteActivity());
		fitness.addUser(u4.getEmail(), u4.getPassword(), u4.getName(), u4.getGender(), u4.getDate(), u4.getHeight(), u4.getWeight(), u4.getFavoriteActivity());
		fitness.getUserByEmail("1").addActivity(new Yoga("YOGA com os amigos", new GregorianCalendar(), 120), "Yoga");
		fitness.getUserByEmail("1").addActivity(new Yoga("YOGA2222 com os amigos", new GregorianCalendar(), 110), "Yoga");
		fitness.sendFriendRequest(fitness.getUserByEmail("1"), fitness.getUserByEmail("4"));
		fitness.sendFriendRequest(fitness.getUserByEmail("1"), fitness.getUserByEmail("3"));
		fitness.sendFriendRequest(fitness.getUserByEmail("2"), fitness.getUserByEmail("3"));
		fitness.sendFriendRequest(fitness.getUserByEmail("3"), fitness.getUserByEmail("3"));
		
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        butOK = new javax.swing.JButton();
        butLimpar = new javax.swing.JButton();
        textPw = new javax.swing.JPasswordField();
        labelRegistar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("LOGIN"));

        jLabel2.setText("Email");

        jLabel3.setText("Password");

        butOK.setText("Entrar");
        butOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOKActionPerformed(evt);
            }
        });

        butLimpar.setText("Limpar");
        butLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textEmail)
                    .addComponent(textPw, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(butLimpar)
                    .addComponent(textPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelRegistar.setText("Registar");
        labelRegistar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRegistarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRegistarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelRegistar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRegistar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimparActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_butLimparActionPerformed

    private void labelRegistarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistarMouseClicked
		try {
			JLabel labelEmail = new JLabel("Email");
			JLabel labelNome = new JLabel("Nome");
			JLabel labelSexo = new JLabel("Sexo (M/F)");
			JLabel labelDataNasc = new JLabel("Data de Nascimento (dd-mm-aaaa)");
			JLabel labelAltura = new JLabel("Altura");
			JLabel labelPeso = new JLabel("Peso");
			JLabel labelDesporto = new JLabel("Desporto favorito");
			JLabel labelPw = new JLabel("Password");
			JLabel labelPwVer = new JLabel("Confirmação da password");
			JTextField textEmail = new JTextField();
			JTextField textNome = new JTextField();
			JTextField textSexo = new JTextField(1);
			JFormattedTextField textData = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
			JTextField textAltura = new JTextField();
			JFormattedTextField textPeso = new JFormattedTextField(new MaskFormatter("##,##"));
			JTextField textDesporto = new JTextField();
			JPasswordField textPw = new JPasswordField();
			JPasswordField textPwVer = new JPasswordField();
			Object[] registar = {labelEmail, textEmail, labelNome, textNome, labelSexo, textSexo, labelDataNasc, textData, labelAltura, textAltura, labelPeso, textPeso, labelDesporto, textDesporto, labelPw, textPw, labelPwVer, textPwVer};

			JOptionPane.showConfirmDialog(this, registar, "Registar utilizador", JOptionPane.OK_CANCEL_OPTION);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(this, "Data inserida incorretamente...");
		}
    }//GEN-LAST:event_labelRegistarMouseClicked

    private void labelRegistarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistarMouseEntered

    }//GEN-LAST:event_labelRegistarMouseEntered

    private void labelRegistarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistarMouseExited

    }//GEN-LAST:event_labelRegistarMouseExited

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
		Font font = this.labelRegistar.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		this.labelRegistar.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_formWindowGainedFocus

    private void butOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOKActionPerformed
        String email = this.textEmail.getText();
		String pw = String.copyValueOf(this.textPw.getPassword());
		if (fitness.existPassAndUser(email, pw)) {
			if (!fitness.isAdmin(email)) {
				fitness.setFitnessPerson(fitness.getUserByEmail(email));
				UserForm userForm = new UserForm(this, this.fitness);
				this.setVisible(false);
				userForm.setVisible(true);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Login incorreto...", "Login", JOptionPane.ERROR_MESSAGE);
			//menuLogin();
		}
    }//GEN-LAST:event_butOKActionPerformed
	
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;

				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(LoginForm.class
					.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LoginForm.class
					.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LoginForm.class
					.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoginForm.class
					.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginForm().setVisible(true);
			}
		});
	}
	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butLimpar;
    private javax.swing.JButton butOK;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelRegistar;
    private javax.swing.JTextField textEmail;
    private javax.swing.JPasswordField textPw;
    // End of variables declaration//GEN-END:variables
	FitnessUM fitness;
}
