package la.foton.treinamento.minibanco.util;

public class ContaUtil {
	
	
	
	
	
	
	public static int extraiNumeroConta(long numeroAgenciaConta) {
		
  
		
		
		
		
	/*	String numeroConta = String.valueOf(numeroAgenciaConta).substring(4);
		
		return   Integer.parseInt(numeroConta);*/
		
		return (int) numeroAgenciaConta ;
		
	}
	
	

	public static int extraiNumeroAgencia(long numeroAgenciaConta) {
		
		
		
		
		/*String numeroAgencia = String.valueOf(numeroAgenciaConta).substring(0,4);
		
		
		
		return Integer.parseInt(numeroAgencia); */
		
		
		return (int) numeroAgenciaConta ;
	}
	
	
	 

	 
	  
	
	
	
	
	

}
