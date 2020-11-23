package la.foton.treinamento.minibanco.util;

public class ContaUtil {
	
	
	   public static int extraiNumeroConta(long numeroAgenciaConta)
	   {
	      return (int) (numeroAgenciaConta % 1000000000);
	   }

	   public static int extraiNumeroAgencia(long numeroAgenciaConta)
	   {
	      return (int) (numeroAgenciaConta / 1000000000);
	

	   }	
	
	


}
