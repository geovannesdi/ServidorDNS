package ExercicioDNS;

public class ServidoresDNS{
	 
	public static void main(String argv[]) throws Exception
	{
		ServidorRaiz serverRaiz = new ServidorRaiz();
		serverRaiz.start();
		
		ServidorTopo serverTopo = new ServidorTopo();
		serverTopo.start();
	
		ServidorAutoridade serverAutoridade = new ServidorAutoridade();
		serverAutoridade.start();
	}
}
 