/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.sun.glass.events.KeyEvent;
import controller.UsuarioController;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Usuario;
import utils.Utils;

/**
 *
 * @author s.lucas
 */
public class FrAutenticacao extends javax.swing.JFrame {

    /**
     * Creates new form FrAutenticacao
     */
    public FrAutenticacao() {
        initComponents();
                this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        PwSenha = new javax.swing.JPasswordField();
        lbSenha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlBackground.setBackground(new java.awt.Color(102, 0, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setInheritsPopupMenu(true);

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4829869_arrow_next_right_icon.png"))); // NOI18N
        btnLogin.setText("Entrar");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1564535_customer_user_userphoto_account_person_icon.png"))); // NOI18N
        jLabel1.setText("    Login");
        jLabel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lbEmail.setBackground(new java.awt.Color(255, 255, 255));
        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1216571_mail_communication_envelope_inbox_letter_icon.png"))); // NOI18N
        lbEmail.setText("E-mail");

        txtEmail.setText("nome@a");
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        PwSenha.setText("qswdefrgth");
        PwSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PwSenhaFocusLost(evt);
            }
        });
        PwSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PwSenhaMouseClicked(evt);
            }
        });
        PwSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwSenhaActionPerformed(evt);
            }
        });
        PwSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PwSenhaKeyPressed(evt);
            }
        });

        lbSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(255, 255, 255));
        lbSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1785201_door_key_open_security_protect_icon.png"))); // NOI18N
        lbSenha.setText("Senha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSenha)
                    .addComponent(PwSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PwSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setText("<html><u>Criar conta</u>");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(369, 369, 369))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLogin)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49)))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Logar();
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void PwSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PwSenhaActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_PwSenhaActionPerformed

    private void PwSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PwSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Logar();
        } 
    }//GEN-LAST:event_PwSenhaKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
URL caminhoImagem = getClass().getResource("/images/logo.png");
        
        ImageIcon Icon = new ImageIcon(caminhoImagem);
        
        this.setIconImage(Icon.getImage());        // TODO add your handling code here:
         setTitle("Sistema de Gerenciamento de Usuarios - Login");
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
          FrCadastro a = new FrCadastro  (this,rootPaneCheckingEnabled);
         a.setVisible(true);
   
    }//GEN-LAST:event_jLabel2MouseClicked

    private void PwSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PwSenhaMouseClicked
        
            if(PwSenha.getText().equals("qswdefrgth")){
          PwSenha.setText("");
      }
    }//GEN-LAST:event_PwSenhaMouseClicked

    private void PwSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PwSenhaFocusLost
          if(PwSenha.getText().equals("")){
          PwSenha.setText("qswdefrgth");
      }
    
    }//GEN-LAST:event_PwSenhaFocusLost

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        if(txtEmail.getText().equals("nome@a")){
          txtEmail.setText("");
      }
    }//GEN-LAST:event_txtEmailMouseClicked

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
       if(txtEmail.getText().equals("")){
          txtEmail.setText("nome@a");
      }
    }//GEN-LAST:event_txtEmailFocusLost
   
    private void Logar(){
       
        String login = txtEmail.getText();
        String senha = PwSenha.getText();
        
        
        if(login.equals("")){
        JOptionPane.showMessageDialog(null, "o email nao pode estar vazio!!");
        return;
        }
           if(login.equals("") && senha.equals ("")){
            JOptionPane.showMessageDialog(null, "o email e a senha nao podem estar vazios!!" );
        return;
           }
          if(senha.equals ("")){
        JOptionPane.showMessageDialog(null, "a senha nao pode estar vazia!!" );
        return;
        }
          String senhaHash =Utils.calcularHash(senha);
          
        UsuarioController Controller = new UsuarioController();
        
        
        
        if (Controller.autenticar(login,senhaHash )){
        JOptionPane.showMessageDialog(null,"conta logada!!!"); 
        
          FrMain a = new FrMain();
           Usuario usu = new Usuario();

            usu.setEmail( txtEmail.getText());
            
            a.setUsuario(usu);
            
            a.setVisible(true);
        this.dispose();
        
        }else{
         JOptionPane.showMessageDialog(null,"senha ou usuario esta incorreta"); 
        }
   }
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
            java.util.logging.Logger.getLogger(FrAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrAutenticacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PwSenha;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
