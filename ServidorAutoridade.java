package ExercicioDNS;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorAutoridade extends Thread {

public void run() {

                   try {
		
		      String clientSentence;  
		      String capitalizedSentence;  
		 
		      //cria o ServerSocket na porta 9879
		      ServerSocket servidor = new ServerSocket(9879);  
			   
		      System.out.println("Servidor Autoridade ouvindo na porta 9879");
		   	      
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

                                outToClient.writeBytes(capitalizedSentence + '\n');    
                            }

		} catch (Exception e) {	}	
	}


   public String arquivo(String url) 
        {  
            String linha = null;  
            
            try {  
                // instancia do arquivo que vou ler  
                FileReader reader = new FileReader("/home/geovanne/ServidorAutoridade");  
                BufferedReader leitor = new BufferedReader(reader);  
            
                // loop que percorrerá todas as  linhas do arquivo.txt que eu quero ler  
                while ((linha = leitor.readLine()) != null) 
                {  
                     //quebra linha por linha do arquivo dividindo .br 127.0.0.1
                     String[] vet = linha.split(" ");
                           
                     if(url.equals(vet[0]))
                         return vet[1];
                }  
                leitor.close();reader.close();  
               } catch (Exception e) {e.printStackTrace();}
            return "Dominio Não Existe";
        }
}