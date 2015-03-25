package ExercicioDNS;

import com.sun.xml.internal.ws.message.saaj.SAAJHeader;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ServidorRaiz extends Thread {
	
	public void run() {
	      String clientSentence;  
	      String capitalizedSentence; 
              try {
		  //cria o ServerSocket na porta 9877
		  ServerSocket servidor = new ServerSocket(9877);  
		  System.out.println("Servidor Raiz ouvindo na porta 9877");
		      
		  while(true)
		  { 
		   	//fica ouvindo as requisições de pedido 
		    	Socket ouvindoSocket = servidor.accept();  
		 
		    	//leutura de entrada do socket 
		    	//cria cadeia de entrada, conectada ao socket 
		        BufferedReader inFromClient   = new BufferedReader(new InputStreamReader(ouvindoSocket.getInputStream()));
		        
		        //leitura de siada do socket
		        //cria cadei de saida conectada ao socket 
		        DataOutputStream  outToClient = new DataOutputStream(ouvindoSocket.getOutputStream());  
		       
		        clientSentence = inFromClient.readLine();  
		        
		        System.out.println("Cliente digitou: " + clientSentence);
		          
                        capitalizedSentence =  arquivo(clientSentence);
		       //chama o metodo para achar no arquivo e retorna o ip da maquina 			   
		        outToClient.writeBytes(capitalizedSentence + '\n'); 
		    }
		} catch (Exception e) {}			
	}
        
        public String arquivo(String url) 
        {  
            String linha = null;  
            
            try {  
                // instancia do arquivo que vou ler  
                FileReader reader = new FileReader("/home/geovanne/ServidorRaiz");  
                BufferedReader leitor = new BufferedReader(reader);  
                
                //quebra a url digitada a que vem por paramentro
                System.out.println(url);
                String[] vetURL = url.split("\\.");

                // loop que percorrerá todas as  linhas do arquivo.txt que eu quero ler  
                while ((linha = leitor.readLine()) != null) {  
                        //quebra linha por linha do arquivo dividindo .br 127.0.0.1
                        String[] vet = linha.split(" ");
                           System.out.println(vetURL.length);
                     if(("."+vetURL[vetURL.length-1]).equals(vet[0])){
                           return vet[1];
                      }
                }  
                leitor.close();reader.close();  
               } catch (Exception e) {e.printStackTrace();}
            return "Dominio Não Existe";
        }  
}