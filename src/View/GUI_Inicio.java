/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import static View.GUI_Index.panelChamar;

/**
 *
 * @author lab0519
 */
public class GUI_Inicio extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Gerar1
     */
    public GUI_Inicio() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 400));
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setMaximumSize(new java.awt.Dimension(545, 395));
        panel.setMinimumSize(new java.awt.Dimension(545, 395));
        panel.setPreferredSize(new java.awt.Dimension(545, 395));
        panel.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("             \n\tO  software  GERADOR DE PROVA  ( desenvolvido por Daniel Lima \n e  Victor  Santos )   foi   criado  para  facilitar  a  vida  de  você  professor, \nconvertendo as provas e trabalhos criados para PDF, com todos os padrões.\n\tVocê  usuário,   apenas  irá   adicionar  as  perguntas  e  preencher\nos campos solicitados, que automaticamente converte para o padrão.\n\tCom  os  termos  de  serviço  aceitado  no  período de instalação do\nsoftware, você  concordou  que  nessa  versão  FREE  nenhum  dado  fica salvo,\nou seja, não  tendo  banco  de  dados  para  acessar  novamente  seus arquivos.\n\tConcluindo, o  software  instalado  em  seu  dispositivo é simples de \nmanusear, com funções básicas.\n");
        jScrollPane1.setViewportView(jTextArea1);

        panel.add(jScrollPane1);
        jScrollPane1.setBounds(40, 80, 480, 230);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GERADOR DE PROVAS");
        panel.add(jLabel1);
        jLabel1.setBounds(0, 30, 550, 30);

        jButton1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton1.setText("Gerar prova");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 1, true));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1);
        jButton1.setBounds(200, 330, 160, 40);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 550, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       panelChamar.setViewportView(new GUI_Gerar1().panel);  
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public static final javax.swing.JPanel panel = new javax.swing.JPanel();
    // End of variables declaration//GEN-END:variables
}
