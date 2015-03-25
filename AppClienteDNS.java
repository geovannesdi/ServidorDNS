package ExercicioDNS;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppClienteDNS extends javax.swing.JFrame {

    private String ipServidor;
    private int portaServidor;
    private String dominio;
    
    private static String ServidorRaiz(String ipSer, int port, String dominio) throws Exception
    {
       	String sentence;  
        String ipServidor;  
 
        Socket clientSocket = new Socket(ipSer, port);  
     
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));  
         
        outToServer.writeBytes(dominio + '\n');  
   
        ipServidor = inFromServer.readLine();  
   
        System.out.println("SERVER RAIZ: " + ipServidor);  
       
        clientSocket.close(); 
        //retorna o ip do servidor
        return ipServidor;
    }
    
    private static String ServidorTopo(String ipDominio, int porta, String dominio) throws Exception
    {
       	String sentence;  
        String ipServidor;  
  
        Socket clientSocket = new Socket(ipDominio, 9878);  
     
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));  
                      
      	outToServer.writeBytes(dominio + '\n');  
   
        ipServidor = inFromServer.readLine();  
   
        System.out.println("SERVER TOPO: " + ipServidor);  
       
        clientSocket.close();
        
        //retorna o ip do dominio 
        return ipServidor;
    }
    
    private static String ServidorAutoridade(String ipDominio, int porta, String dominio) throws Exception
    {
       	String sentence;  
        
        String ipServidor;  
  
        Socket clientSocket = new Socket(ipDominio, 9879);  
     
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));  
                     
      	outToServer.writeBytes(dominio + '\n');  
   
        ipServidor = inFromServer.readLine();  
   
        System.out.println("SERVER AUTORIDADE: " + ipServidor);  
       
        clientSocket.close();
        
        //retorna o ip da requisição inicial do cliente 
        return ipServidor;
    }    
    
    public AppClienteDNS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBSend = new javax.swing.JButton();
        jTFIpServidor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFPorta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFDominio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAIpsValidos = new javax.swing.JTextArea();
        jBDelete = new javax.swing.JButton();
        jBExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente DNS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente DNS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jBSend.setText("Send");
        jBSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSendActionPerformed(evt);
            }
        });

        jTFIpServidor.setText("127.0.0.1");

        jLabel1.setText("IP SERVIDOR:");

        jLabel2.setText("PORTA:");

        jTFPorta.setText("9877");

        jLabel3.setText("DOMINIO:");

        jTFDominio.setText("www.google.com.br");

        jTAIpsValidos.setColumns(20);
        jTAIpsValidos.setRows(5);
        jScrollPane1.setViewportView(jTAIpsValidos);

        jBDelete.setText("Delete");
        jBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeleteActionPerformed(evt);
            }
        });

        jBExit.setText("Exit");

        jLabel4.setText("Produced by Geovanne Barreto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBSend, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTFDominio)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFIpServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(4, 4, 4)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIpServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSend)
                    .addComponent(jBDelete)
                    .addComponent(jBExit))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeleteActionPerformed
        jTFIpServidor.setText("");
        jTFPorta.setText("");
        jTFDominio.setText("");
    }//GEN-LAST:event_jBDeleteActionPerformed

    private void jBSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSendActionPerformed
        //ServidorRaiz();
                //ServidorTopo("moita.br");
        this.ipServidor = jTFIpServidor.getText();
        this.portaServidor = Integer.parseInt(jTFPorta.getText());
        this.dominio = jTFDominio.getText();
        
        try {
            
            jTAIpsValidos.setText("Ip do Servidor: " + ServidorAutoridade(ServidorTopo(ServidorRaiz(ipServidor, portaServidor, dominio )
                               ,portaServidor, dominio), 
            portaServidor, dominio));
           
        } catch (Exception ex) {
            jTAIpsValidos.setText("Desculpa esse dominio não \n existe em nosso banco de dados!!!!!!");
            Logger.getLogger(AppClienteDNS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBSendActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AppClienteDNS().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDelete;
    private javax.swing.JButton jBExit;
    private javax.swing.JButton jBSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAIpsValidos;
    private javax.swing.JTextField jTFDominio;
    private javax.swing.JTextField jTFIpServidor;
    private javax.swing.JTextField jTFPorta;
    // End of variables declaration//GEN-END:variables
}
