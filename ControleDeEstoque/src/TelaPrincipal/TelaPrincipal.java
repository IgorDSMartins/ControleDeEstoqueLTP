package TelaPrincipal;


import Ajuda.SobreInternalFrame;
import BancoDeDados.DBConnection;
import Cadastro.CadastroFornecedorInternalFrame;
import Cadastro.CadastroProdutoInternalFrame;
import Consulta.ConsultaInternalFrame;
import Produtos.AlterarProdutoInternalFrame;
import Produtos.InserirProdutoInternalFrame;
import Produtos.RemoverProdutoInternalFrame;
import Relatorios.RelatoriosProdutosInternalFrame;
import Relatorios.RelatoriosVendasInternalFrame;
import Vendas.AlterarVendasInternalFrame;
import Vendas.InserirVendasInternalFrame;
import Vendas.RemoverVendasInternalFrame;
import java.sql.Connection;
import javax.swing.JInternalFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanfelipevillalba
 */
public class TelaPrincipal extends javax.swing.JFrame {

        private JInternalFrame atualInternalFrame;
        private HomeInternalFrame homeInternalFrame;
        private SobreInternalFrame sobreInternalFrame;
        
        private CadastroFornecedorInternalFrame cadastroFornecedorInternalFrame;
        private CadastroProdutoInternalFrame cadastroProdutoInternalFrame;
        
        private ConsultaInternalFrame consultaInternalFrame;
        
        private InserirVendasInternalFrame inserirVendasInternalFrame;
        private AlterarVendasInternalFrame alterarVendasInternalFrame;
        private RemoverVendasInternalFrame removerVendasInternalFrame;
        
        private InserirProdutoInternalFrame inserirProdutoInternalFrame;
        private AlterarProdutoInternalFrame alterarProdutoInternalFrame;
        private RemoverProdutoInternalFrame removerProdutoInternalFrame;
        
        private RelatoriosProdutosInternalFrame relatoriosProdutosInternalFrame;
        private RelatoriosVendasInternalFrame relatoriosVendasInternalFrame;
        
        private Connection conn;
        
    /**
     * Creates new form TelaPrincipal
     */
        
    public TelaPrincipal() {
        
        initComponents();
        
        atualInternalFrame = new JInternalFrame();        
        homeInternalFrame = new HomeInternalFrame();
        atualInternalFrame = homeInternalFrame;
        jDesktopPane.add(atualInternalFrame);
        atualInternalFrame.setVisible(true);
        
        DBConnection db = new DBConnection();
        this.conn = db.connect();
        db.criarTabelas(conn);
        
        
        sobreInternalFrame = new SobreInternalFrame();
        
        cadastroFornecedorInternalFrame = new CadastroFornecedorInternalFrame();
        
        
        consultaInternalFrame = new ConsultaInternalFrame();
        
        inserirVendasInternalFrame = new InserirVendasInternalFrame();
        alterarVendasInternalFrame = new AlterarVendasInternalFrame();
        removerVendasInternalFrame = new RemoverVendasInternalFrame();
        
        relatoriosProdutosInternalFrame = new RelatoriosProdutosInternalFrame();
        relatoriosVendasInternalFrame = new RelatoriosVendasInternalFrame();
        
    }
    /**
     * Métodos recebe o novo JInternalFrame e atualiza a tela
     * @param novo 
     */
    public void TrocaDeTela(JInternalFrame novo) {
        atualInternalFrame.setVisible(false);
        jDesktopPane.remove(atualInternalFrame);
        atualInternalFrame = novo;
        jDesktopPane.add(atualInternalFrame);
        atualInternalFrame.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jLabelPrincipal = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHome = new javax.swing.JMenu();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuCadastroFornecedor = new javax.swing.JMenuItem();
        jMenuCadastroProduto = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuVendas = new javax.swing.JMenu();
        jMenuVendasInserir = new javax.swing.JMenuItem();
        jMenuVendasAlterar = new javax.swing.JMenuItem();
        jMenuVendasRemover = new javax.swing.JMenuItem();
        jMenuProdutos = new javax.swing.JMenu();
        jMenuProdutosInserir = new javax.swing.JMenuItem();
        jMenuProdutosAlterar = new javax.swing.JMenuItem();
        jMenuProdutosRemover = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuRelatoriosVendas = new javax.swing.JMenuItem();
        jMenuRelatoriosProdutos = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuAjudaSobre = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jDesktopPane.setLayout(new javax.swing.OverlayLayout(jDesktopPane));

        jLabelPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrincipal.setText("Sistema Gestão de Estoque - Copyright 2017");

        jMenuHome.setText("Home");
        jMenuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHomeActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuHome);

        jMenuCadastro.setText("Cadastro");

        jMenuCadastroFornecedor.setText("Fornecedor");
        jMenuCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuCadastroFornecedor);

        jMenuCadastroProduto.setText("Produto");
        jMenuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroProdutoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuCadastroProduto);

        jMenuBar1.add(jMenuCadastro);

        jMenuConsulta.setText("Consulta");
        jMenuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuConsulta);

        jMenuVendas.setText("Vendas");

        jMenuVendasInserir.setText("Inserir");
        jMenuVendasInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendasInserirActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuVendasInserir);

        jMenuVendasAlterar.setText("Alterar");
        jMenuVendasAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendasAlterarActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuVendasAlterar);

        jMenuVendasRemover.setText("Remover");
        jMenuVendasRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendasRemoverActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuVendasRemover);

        jMenuBar1.add(jMenuVendas);

        jMenuProdutos.setText("Produtos");

        jMenuProdutosInserir.setText("Inserir");
        jMenuProdutosInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProdutosInserirActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuProdutosInserir);

        jMenuProdutosAlterar.setText("Alterar");
        jMenuProdutosAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProdutosAlterarActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuProdutosAlterar);

        jMenuProdutosRemover.setText("Remover");
        jMenuProdutosRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProdutosRemoverActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuProdutosRemover);

        jMenuBar1.add(jMenuProdutos);

        jMenuRelatorios.setText("Relatórios");

        jMenuRelatoriosVendas.setText("Vendas");
        jMenuRelatoriosVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRelatoriosVendasActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuRelatoriosVendas);

        jMenuRelatoriosProdutos.setText("Produtos");
        jMenuRelatoriosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRelatoriosProdutosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuRelatoriosProdutos);

        jMenuBar1.add(jMenuRelatorios);

        jMenuAjuda.setText("Ajuda");

        jMenuAjudaSobre.setText("Sobre");
        jMenuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAjudaSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuAjudaSobre);

        jMenuBar1.add(jMenuAjuda);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelPrincipal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuVendasInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendasInserirActionPerformed
        // TODO add your handling code here:
        TrocaDeTela(inserirVendasInternalFrame);
    }//GEN-LAST:event_jMenuVendasInserirActionPerformed

    private void jMenuVendasAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendasAlterarActionPerformed
        // TODO add your handling code here:
        TrocaDeTela(alterarVendasInternalFrame);
    }//GEN-LAST:event_jMenuVendasAlterarActionPerformed

    private void jMenuVendasRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendasRemoverActionPerformed
        // TODO add your handling code here:
        TrocaDeTela(removerVendasInternalFrame);
    }//GEN-LAST:event_jMenuVendasRemoverActionPerformed

    private void jMenuProdutosInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutosInserirActionPerformed
        // TODO add your handling code here:
        inserirProdutoInternalFrame = new InserirProdutoInternalFrame(conn);
        TrocaDeTela(inserirProdutoInternalFrame);
    }//GEN-LAST:event_jMenuProdutosInserirActionPerformed

    private void jMenuProdutosRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutosRemoverActionPerformed
        // TODO add your handling code here:
        removerProdutoInternalFrame = new RemoverProdutoInternalFrame(conn);
        TrocaDeTela(removerProdutoInternalFrame);
    }//GEN-LAST:event_jMenuProdutosRemoverActionPerformed

    private void jMenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAjudaSobreActionPerformed
        // TODO add your handling code here:
        TrocaDeTela(sobreInternalFrame);
    }//GEN-LAST:event_jMenuAjudaSobreActionPerformed

    private void jMenuRelatoriosVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRelatoriosVendasActionPerformed
        // TODO add your handling code here:
        TrocaDeTela(relatoriosVendasInternalFrame);
    }//GEN-LAST:event_jMenuRelatoriosVendasActionPerformed

    private void jMenuRelatoriosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRelatoriosProdutosActionPerformed
        // TODO add your handling code here:
        TrocaDeTela(relatoriosProdutosInternalFrame);
    }//GEN-LAST:event_jMenuRelatoriosProdutosActionPerformed

    private void jMenuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHomeActionPerformed
        // TODO add your handling code here:
        TrocaDeTela(homeInternalFrame);
    }//GEN-LAST:event_jMenuHomeActionPerformed

    private void jMenuProdutosAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutosAlterarActionPerformed
        // TODO add your handling code here:
        alterarProdutoInternalFrame = new AlterarProdutoInternalFrame(conn);
        TrocaDeTela(alterarProdutoInternalFrame);
    }//GEN-LAST:event_jMenuProdutosAlterarActionPerformed

    private void jMenuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaActionPerformed
        // TODO add your handling code here:
        TrocaDeTela(consultaInternalFrame);
    }//GEN-LAST:event_jMenuConsultaActionPerformed

    private void jMenuCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroFornecedorActionPerformed
        // TODO add your handling code here:
        TrocaDeTela(cadastroFornecedorInternalFrame);
    }//GEN-LAST:event_jMenuCadastroFornecedorActionPerformed

    private void jMenuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroProdutoActionPerformed
        // TODO add your handling code here:
        cadastroProdutoInternalFrame = new CadastroProdutoInternalFrame();
        TrocaDeTela(cadastroProdutoInternalFrame);
    }//GEN-LAST:event_jMenuCadastroProdutoActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabelPrincipal;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuItem jMenuAjudaSobre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuCadastroFornecedor;
    private javax.swing.JMenuItem jMenuCadastroProduto;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenu jMenuProdutos;
    private javax.swing.JMenuItem jMenuProdutosAlterar;
    private javax.swing.JMenuItem jMenuProdutosInserir;
    private javax.swing.JMenuItem jMenuProdutosRemover;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenuItem jMenuRelatoriosProdutos;
    private javax.swing.JMenuItem jMenuRelatoriosVendas;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuVendas;
    private javax.swing.JMenuItem jMenuVendasAlterar;
    private javax.swing.JMenuItem jMenuVendasInserir;
    private javax.swing.JMenuItem jMenuVendasRemover;
    private javax.swing.JSeparator jSeparator;
    // End of variables declaration//GEN-END:variables
}
