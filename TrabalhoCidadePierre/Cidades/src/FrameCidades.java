
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FrameCidades extends javax.swing.JFrame {
    
    String matriz[][] = new String[9714][2]; // L = cidades  C = estados
    String EstadoCivil;
    
    public FrameCidades() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstadoCivil = new javax.swing.ButtonGroup();
        jTFFilePath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboUF = new javax.swing.JComboBox<>();
        jComboCidade = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jLabelConhecimento = new javax.swing.JLabel();
        jRadioButtonSolteiro = new javax.swing.JRadioButton();
        jRadioButtonCasado = new javax.swing.JRadioButton();
        jCheckBoxJava = new javax.swing.JCheckBox();
        jCheckBoxC = new javax.swing.JCheckBox();
        jCheckBoxPHP = new javax.swing.JCheckBox();
        jButtonSalvar = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Arquivo:");

        jButton1.setText("Localizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboUFActionPerformed(evt);
            }
        });

        jComboCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCidadeActionPerformed(evt);
            }
        });

        jLabel2.setText("UF:");

        jLabel3.setText("Cidade:");

        jLabelEstadoCivil.setText("Estado Civil");

        jLabelConhecimento.setText("Conhecimento");

        buttonGroupEstadoCivil.add(jRadioButtonSolteiro);
        jRadioButtonSolteiro.setText("Solteiro");

        buttonGroupEstadoCivil.add(jRadioButtonCasado);
        jRadioButtonCasado.setText("Casado");

        jCheckBoxJava.setText("Java");
        jCheckBoxJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxJavaActionPerformed(evt);
            }
        });

        jCheckBoxC.setText("C/C++");

        jCheckBoxPHP.setText("PHP");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome");

        jButtonConsultar.setText("Consultar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelEstadoCivil))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelConhecimento))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonSolteiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCasado))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBoxJava)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxPHP))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSalvar)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel1)
                    .addComponent(jComboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboUF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonConsultar)))))
                .addContainerGap(479, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jComboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabelNome)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConsultar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEstadoCivil)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonSolteiro)
                    .addComponent(jRadioButtonCasado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelConhecimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxJava)
                    .addComponent(jCheckBoxC)
                    .addComponent(jCheckBoxPHP))
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int i = file.showOpenDialog(null);
        if (i == 1) { // 1 = nenhum arquivo selecionado
            jTFFilePath.setText("");
        } else { // 0 = arquivo selecionado
            File arquivo = file.getSelectedFile();
            jTFFilePath.setText(arquivo.getPath());

            importarDadosArquivo(jTFFilePath.getText());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboUFActionPerformed
        jComboCidade.removeAllItems();
        listarCidadesEspecificas(jComboUF.getSelectedItem()+"");
    }//GEN-LAST:event_jComboUFActionPerformed

    private void jComboCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCidadeActionPerformed
        String cidade = jComboCidade.getSelectedItem()+"";
        if (cidade.equals("Santa Maria")) {
            JOptionPane.showMessageDialog(this, "Melhor cidade do planeta");
        }
        else if (cidade.equals("Agudo")) {
            JOptionPane.showMessageDialog(this, "Agudo é uma ótima cidade");
        }
            
    }//GEN-LAST:event_jComboCidadeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        //ler todos os conteudos e salvar em arquivo txt
        System.out.println("nome: "+jTextFieldNome.getText());
        
        
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(jTextFieldNome.getText()+".txt"));
            String linha = "";
            
            
            write.append("Nome: "+ jTextFieldNome.getText()+"\n");
            write.close();
            
        } catch (IOException ex) {
            System.out.println("Não abriu o arquivo ");
        }
        
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jCheckBoxJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxJavaActionPerformed
        
        
    }//GEN-LAST:event_jCheckBoxJavaActionPerformed

    private void importarDadosArquivo(String arquivo) {
        String linha = null;
        int L = 0;
        
        // ler arquivo e inserir dados na matriz
        try {
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            while ((linha = br.readLine()) != null) {
                // obter linhas que contenham informação/dados e que iniciem com a letra I de INSERT
                if ((linha.length() > 0) && (linha.charAt(0) == 'I')) {
                    //System.out.println(linha);
                    //exibir estado e cidade de cada linha
                    String UF = linha.substring(44, 46);
                    //System.out.println(UF);
                    String cidade = linha.substring(50, linha.lastIndexOf('\''));
                    //System.out.println(cidade);
                    matriz[L][0] = UF;
                    matriz[L][1] = cidade;
                    L++;
                    if (cidade.equals("Xambioa")) { // significa que leu a última cidade existente no arquivo
                        break;
                    }
                    
                }
            }
            
            
            // exibir matriz com estados e cidades
            for (int Linha=0; Linha<9714; Linha++) {
                System.out.println(matriz[Linha][0] + " " + matriz[Linha][1]);
            }
            
            // popular o jcomboBox dos estados
            
            String UFAtual = "";
            String UFAnterior = "x"; // qualquer caractere inicial só para diferenciar na primeira comparação
            while (!UFAtual.equals("TO")) {
                for (int Linha=0; Linha<9714; Linha++) {
                    UFAtual = matriz[Linha][0];
                   if (!UFAtual.equals(UFAnterior)) {
                        jComboUF.addItem(UFAtual);
                        UFAnterior = UFAtual;
                   }     
                }
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    private void listarCidadesEspecificas(String UF) {
        for (int linha=0; linha<9714; linha++) {
            if (matriz[linha][0].equals(UF)) {
                jComboCidade.addItem(matriz[linha][1]);
            }
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
            java.util.logging.Logger.getLogger(FrameCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstadoCivil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxC;
    private javax.swing.JCheckBox jCheckBoxJava;
    private javax.swing.JCheckBox jCheckBoxPHP;
    private javax.swing.JComboBox<String> jComboCidade;
    private javax.swing.JComboBox<String> jComboUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelConhecimento;
    private javax.swing.JLabel jLabelEstadoCivil;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JRadioButton jRadioButtonCasado;
    private javax.swing.JRadioButton jRadioButtonSolteiro;
    private javax.swing.JTextField jTFFilePath;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
