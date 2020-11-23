
package la.foton.treinamento.minibanco.core;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import la.foton.treinamento.minibanco.enums.TipoBloqueioConta;
import la.foton.treinamento.minibanco.vo.Conta;
import la.foton.treinamento.minibanco.vo.ContaCorrente;

public class ContaCorrenteService
{

   // Armazena em memória as contas correntes
   private Map<Long, ContaCorrente> contasCorrentes = new HashMap<>();
   
   	
   
   

   public ContaCorrente buscaConta(Long numeroAgenciaConta)
   {
     System.out.println("Conta a ser pesquisada: " + numeroAgenciaConta);
   
	   return contasCorrentes.get(numeroAgenciaConta);
	   
   }
   
    

   /**
    * Abre uma conta
    *
    * @param conta
    */
   public void abreConta(ContaCorrente conta)
   {
      this.contasCorrentes.put(conta.getNumeroAgenciaConta(), conta);
   }

   public Conta debitaValor(BigDecimal valor, Long numeroAgenciaConta)
   {
      ContaCorrente conta = buscaConta(numeroAgenciaConta);

      if (conta == null)
      {
         System.out.println("Conta nao cadastrada");
         return conta ;
      }
      System.out.println( "Saldo disponivel: " + conta.getSaldoDisponivel() + " -- Valor a debitar: " + valor);
      BigDecimal novoSaldoDisponivel = conta.getSaldoDisponivel().subtract(valor);

      System.out .println("Saldo Disponivel da Conta: [" + conta.getNumeroAgenciaConta() + "] -> R$" + 
      conta.getSaldoDisponivel().toString());

      if (novoSaldoDisponivel.compareTo(BigDecimal.ZERO) < 1)
      {
         System.out.println("Conta nao possui saldo disponivel. Valor do debito: R$" + valor.toString());
      }
      else
      {
         conta.setSaldoDisponivel(novoSaldoDisponivel);
         System.out.println("Novo saldo disponivel da conta: R$" + conta.getSaldoDisponivel().toString());
      }
	return conta;
   }
   
   

   public Conta depositaValor(BigDecimal valor, long numeroAgenciaConta)
   {
      ContaCorrente conta = buscaConta(numeroAgenciaConta);

      if (conta == null)
      {
         System.out.println("Conta nao cadastrada");
         
      }

      System.out.println("Saldo disponivel da conta: R$" + conta.getSaldoDisponivel().toString());

      // deposito o dinheiro na conta do cliente
      conta.getSaldoDisponivel().add(valor);

      System.out.println("Novo saldo disponivel da conta: R$" + conta.getSaldoDisponivel().toString());
	return conta;
   }

   
   
   
   public void bloqueiaConta(TipoBloqueioConta tipoBloqueioConta, Long numeroAgenciaConta)
   {
      ContaCorrente conta = buscaConta(numeroAgenciaConta);

      if (conta == null)
      {
    	  
         System.out.println("Conta nao cadastrada");
         return;
      }

      conta.setTipoBloqueioConta(tipoBloqueioConta);
   }

}
