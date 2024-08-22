package CrudJava;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Janela extends javax.swing.JFrame {

    ArrayList<String> alunos = new ArrayList<>();

    public Janela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JPanel();
        btnCadastro = new javax.swing.JButton();
        btnExibir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tela.setBackground(new java.awt.Color(255, 255, 255));
        tela.setLayout(null);

        btnCadastro.setBackground(new java.awt.Color(0, 255, 102));
        btnCadastro.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        btnCadastro.setText("Cadastro");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        tela.add(btnCadastro);
        btnCadastro.setBounds(20, 180, 100, 30);

        btnExibir.setBackground(new java.awt.Color(51, 153, 255));
        btnExibir.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        btnExibir.setText("Exibir");
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });
        tela.add(btnExibir);
        btnExibir.setBounds(140, 180, 100, 30);

        btnEditar.setBackground(new java.awt.Color(255, 255, 51));
        btnEditar.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        btnEditar.setText("Editar");
        tela.add(btnEditar);
        btnEditar.setBounds(260, 180, 100, 30);

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        tela.add(btnExcluir);
        btnExcluir.setBounds(380, 180, 100, 30);

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sala.jpg"))); // NOI18N
        tela.add(imagem);
        imagem.setBounds(0, 0, 510, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        String nome = JOptionPane.showInputDialog(this, "Digite o nome do aluno!");
        alunos.add(nome);
        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed
        JOptionPane.showMessageDialog(this, alunos);
    }//GEN-LAST:event_btnExibirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String nome = JOptionPane.showInputDialog(this, "Digite o nome do aluno!");
        alunos.remove(nome);
        JOptionPane.showMessageDialog(this, "Aluno removido com sucesso!");
    }//GEN-LAST:event_btnExcluirActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExibir;
    private javax.swing.JLabel imagem;
    private javax.swing.JPanel tela;
    // End of variables declaration//GEN-END:variables
}
