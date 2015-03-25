package ExercicioDNS;

import java.awt.Color;
import java.awt.SplashScreen;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.awt.windows.ThemeReader;


public class AppServidoresDNS extends javax.swing.JFrame {
    
    ServidorRaiz serverRaiz = new ServidorRaiz();
    ServidorTopo serverTopo = new ServidorTopo();
    ServidorAutoridade serverAutoridade = new ServidorAutoridade();
    
    public AppServidoresDNS() {
        initComponents();
        
    }
    
    //Metodo para iniciar o servidor Raiz 
    private void iniciarServidorRaiz(){
        new Thread(){
           
            public void run (){
                
                jPBServidorRaiz.setForeground(Color.red);
                
                for(int i = 0; i<101; i++){
                    try {
                        sleep(10);
                        jPBServidorRaiz.setValue(i);
                        jPBServidorRaiz.setString("Servidor Ouvindo na Porta 9877");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                }
               
            }
           
        }.start();
  	serverRaiz.start();
    }
    
    //Metodo para iniciar Servidor Topo
    private void iniciarServidorTopo(){
        new Thread(){
           
            public void run (){
                
                jPBServidorTopo.setForeground(Color.YELLOW);
                
                for(int i = 0; i<101; i++){
                    try {
                        sleep(10);
                        jPBServidorTopo.setValue(i);
                       
                       jPBServidorTopo.setString("Servidor Ouvindo na Porta 9878");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }        
                }     
            }       
        }.start();
       serverTopo.start();
    }
    
    //Metodo para iniciar servidor Autoridade
    private void iniciarServidorAutoridade(){
        new Thread(){
           
            public void run (){
                
                jPBServidorAutoridade.setForeground(Color.GREEN);
                
                for(int i = 0; i<101; i++){
                    try {
                        sleep(10);
                        jPBServidorAutoridade.setValue(i);
                       
                       jPBServidorAutoridade.setString("Servidor Ouvindo na Porta 9879");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                }
               
            }
           
        }.start();
        
        
	   serverAutoridade.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPBServidorTopo = new javax.swing.JProgressBar();
        jLServidorTopo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBLigarServidorRaiz = new javax.swing.JButton();
        jPBServidorAutoridade = new javax.swing.JProgressBar();
        jPBServidorRaiz = new javax.swing.JProgressBar();
        jLServidorRaiz = new javax.swing.JLabel();
        jLServidorAutoridade = new javax.swing.JLabel();
        jBDesligarServidorRaiz = new javax.swing.JButton();
        jBLigarServidorTopo = new javax.swing.JButton();
        jBDesligarServidorTopo = new javax.swing.JButton();
        jBLigarServidorAutoridade = new javax.swing.JButton();
        jBDesligarServidorAutoridade = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBExecutarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servidores DNS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Servidores DNS"));

        jPBServidorTopo.setStringPainted(true);

        jLServidorTopo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Servidor Raiz:");

        jLabel3.setText("Servidor Autoridade:");

        jLabel4.setText("Servidor Topo:");

        jBLigarServidorRaiz.setText("Ligar");
        jBLigarServidorRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLigarServidorRaizActionPerformed(evt);
            }
        });

        jPBServidorAutoridade.setStringPainted(true);

        jPBServidorRaiz.setStringPainted(true);

        jLServidorRaiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLServidorAutoridade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jBDesligarServidorRaiz.setText("Desligar");
        jBDesligarServidorRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesligarServidorRaizActionPerformed(evt);
            }
        });

        jBLigarServidorTopo.setText("Ligar");
        jBLigarServidorTopo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLigarServidorTopoActionPerformed(evt);
            }
        });

        jBDesligarServidorTopo.setText("Desligar");
        jBDesligarServidorTopo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesligarServidorTopoActionPerformed(evt);
            }
        });

        jBLigarServidorAutoridade.setText("Ligar");
        jBLigarServidorAutoridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLigarServidorAutoridadeActionPerformed(evt);
            }
        });

        jBDesligarServidorAutoridade.setText("Desligar");
        jBDesligarServidorAutoridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesligarServidorAutoridadeActionPerformed(evt);
            }
        });

        jLabel5.setText("Produced by Geovanne Barreto");

        jBExecutarTodos.setText("Executar Todos");
        jBExecutarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExecutarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLServidorTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLServidorRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPBServidorAutoridade, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jPBServidorTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLServidorAutoridade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jBLigarServidorRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBDesligarServidorRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBLigarServidorAutoridade, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addComponent(jBLigarServidorTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBDesligarServidorAutoridade, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addComponent(jBDesligarServidorTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jBExecutarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPBServidorRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(225, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBDesligarServidorRaiz, jBLigarServidorRaiz});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLigarServidorRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBDesligarServidorRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jLServidorRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBLigarServidorTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBDesligarServidorTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPBServidorTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLServidorTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBLigarServidorAutoridade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBDesligarServidorAutoridade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPBServidorAutoridade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLServidorAutoridade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBExecutarTodos)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jPBServidorRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(240, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLigarServidorRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLigarServidorRaizActionPerformed
         iniciarServidorRaiz();
    }//GEN-LAST:event_jBLigarServidorRaizActionPerformed

    private void jBLigarServidorTopoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLigarServidorTopoActionPerformed
        iniciarServidorTopo();
    }//GEN-LAST:event_jBLigarServidorTopoActionPerformed

    private void jBLigarServidorAutoridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLigarServidorAutoridadeActionPerformed
        iniciarServidorAutoridade();
    }//GEN-LAST:event_jBLigarServidorAutoridadeActionPerformed

    private void jBExecutarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExecutarTodosActionPerformed
        iniciarServidorRaiz();
        iniciarServidorTopo();
        iniciarServidorAutoridade();
    }//GEN-LAST:event_jBExecutarTodosActionPerformed

    private void jBDesligarServidorRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesligarServidorRaizActionPerformed
       serverRaiz.stop();
       jPBServidorRaiz.setString("!!!!! Servidor Desconectado !!!!!");
       jPBServidorRaiz.setForeground(Color.black);
    }//GEN-LAST:event_jBDesligarServidorRaizActionPerformed

    private void jBDesligarServidorTopoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesligarServidorTopoActionPerformed
       serverTopo.stop();
       jPBServidorTopo.setString("!!!!! Servidor Desconectado !!!!!");
       jPBServidorTopo.setForeground(Color.black);
    }//GEN-LAST:event_jBDesligarServidorTopoActionPerformed

    private void jBDesligarServidorAutoridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesligarServidorAutoridadeActionPerformed
       serverAutoridade.stop();
       jPBServidorAutoridade.setString("!!!!! Servidor Desconectado !!!!!");
       jPBServidorAutoridade.setForeground(Color.black);
    }//GEN-LAST:event_jBDesligarServidorAutoridadeActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AppServidoresDNS().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDesligarServidorAutoridade;
    private javax.swing.JButton jBDesligarServidorRaiz;
    private javax.swing.JButton jBDesligarServidorTopo;
    private javax.swing.JButton jBExecutarTodos;
    private javax.swing.JButton jBLigarServidorAutoridade;
    private javax.swing.JButton jBLigarServidorRaiz;
    private javax.swing.JButton jBLigarServidorTopo;
    private javax.swing.JLabel jLServidorAutoridade;
    private javax.swing.JLabel jLServidorRaiz;
    private javax.swing.JLabel jLServidorTopo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar jPBServidorAutoridade;
    private javax.swing.JProgressBar jPBServidorRaiz;
    private javax.swing.JProgressBar jPBServidorTopo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}