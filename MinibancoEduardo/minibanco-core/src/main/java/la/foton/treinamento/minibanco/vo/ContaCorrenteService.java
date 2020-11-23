package la.foton.treinamento.minibanco.vo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class ContaCorrenteService  {



	private Map<Long, ContaCorrente> contasCorrentes = new HashMap<>();

	public void abreConta(Conta conta, ContaCorrente contaCorrente  ){

		this.contasCorrentes.put(conta.getNumeroConta(), contaCorrente);
		
		return ;

	}



	   public BigDecimal debitaValorConta(BigDecimal valor, Conta conta){

		   BigDecimal novoSaldoDisponivel = conta.getSaldoDisponivel().subtract(valor);

		   if(novoSaldoDisponivel.compareTo(BigDecimal.ZERO) < 0) {
		   System.out.println("Saldo Indisponivel");
		   }
		   conta.setSaldoDisponivel(novoSaldoDisponivel);
		   return novoSaldoDisponivel;

		   }





	   



	public BigDecimal deposita(BigDecimal valor, long numeroAgenciaConta) throws Exception  {

		   ContaCorrente contaCorrenteMemoria = contasCorrentes.get(((Conta) contasCorrentes).getNumeroConta());

		   if(contaCorrenteMemoria == null){

		   throw new Exception("Conta Corrente nao encontrada");
		   }
		   //deposito o dinheiro na conta do cliente
		   contaCorrenteMemoria.getSaldoDisponivel().add(valor);

		   return valor ;
		   }




	   public void creditaValorConta(BigDecimal valor,Conta conta){

		   BigDecimal debitaValorConta = conta.getSaldoDisponivel().add(valor);

		   if(debitaValorConta.compareTo(BigDecimal.ZERO) == 0) {
			   System.out.println("Credito indisponivel");
		   }
		   conta.setSaldoDisponivel(debitaValorConta);

		   return ;

		   }







	   public static int extraiNumeroConta(long numeroAgenciaConta) {

		   return(int) numeroAgenciaConta;
	   }









}
