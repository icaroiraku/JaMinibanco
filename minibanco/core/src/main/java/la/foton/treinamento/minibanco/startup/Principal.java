package la.foton.treinamento.minibanco.startup;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import la.foton.treinamento.minibanco.core.ContaCorrenteService;
import la.foton.treinamento.minibanco.core.ContaPoupancaService;
import la.foton.treinamento.minibanco.util.ContaUtil;
import la.foton.treinamento.minibanco.vo.Conta;
import la.foton.treinamento.minibanco.vo.ContaCorrente;
import la.foton.treinamento.minibanco.vo.ContaPoupanca;




public class Principal
{

   public static void main(String[] args)
   {
      System.out.println("****Mini Banco***\n");

      try (Scanner input = new Scanner(System.in))
      {
         ContaPoupanca cpo = new ContaPoupanca();
        

         ContaPoupancaService contaPoupancaService = new ContaPoupancaService();

         ContaCorrenteService contaCorrenteService = new ContaCorrenteService();

         int op = 0;

         do
         {
        	
            System.out.println("1-Abrir Conta");
            System.out.println("2-Debita Conta Corrente");
            System.out.println("3-Credita Conta Corrente");
            System.out.println("4-Consulta saldo conta corrente");
            System.out.println("5-Aplica Conta Poupança");
            System.out.println("6-Resgata Conta Poupança");
            System.out.println("7-Consulta saldo Conta Poupança\n");            
            
            int op1 = input.nextInt();
               

            if (op1 == 1)
            {

               System.out.println("Qual tipo de conta?\n1.Poupança\n2.Corrente");

               int oc = input.nextInt();

               if (oc == 1)
               {
                  ContaPoupanca cp = new ContaPoupanca();
                  System.out.print("Digite sua Agencia e Conta:\n");
                  long numeroAgenciaConta =  input.nextLong();
                  cp.setNumeroAgenciaConta(numeroAgenciaConta);

                  System.out.println("Agencia: " + ContaUtil.extraiNumeroAgencia(numeroAgenciaConta));
                  

                  System.out.println("Conta: " + ContaUtil.extraiNumeroConta(numeroAgenciaConta));

                  contaPoupancaService.abreConta(cp);

               }
               if (oc == 2)
               {
            	   
                  ContaCorrente contaCorrente = new ContaCorrente();
                  
                  System.out.print("Digite sua Agencia e Conta:\n");
                  long numeroAgenciaConta =  input.nextLong();
                  
                  contaCorrente.setNumeroAgenciaConta( numeroAgenciaConta );

                  System.out.println("Agencia: " + ContaUtil.extraiNumeroAgencia(numeroAgenciaConta));
                  

                  System.out.println("Conta: " + ContaUtil.extraiNumeroConta(numeroAgenciaConta));

                  contaCorrenteService.abreConta(contaCorrente);
                  

               }

               System.out.println("Conta criada com sucesso!\n");

            }

            if (op1 == 2)
            {
            
            	
            	System.out.println("Digite sua conta :");
            	
            	Long numeroAgenciaConta = input.nextLong();
            	
            	System.out.println("Digite o valor a ser debitado Conta Corrente:");
            	
            	BigDecimal valor = input.nextBigDecimal();
            	System.out.println("Numero Da Agencia: " + ContaUtil.extraiNumeroAgencia(numeroAgenciaConta));

            	Conta conta = contaCorrenteService.depositaValor(valor, numeroAgenciaConta);
            	
            	
            	
            	
               
               		
            }
            if (op1 == 3)
            {
            	ContaCorrente contasCorrentes = new ContaCorrente();
               System.out.println("Digite o valor a ser Creditado:");

               BigDecimal valor = input.nextBigDecimal();
               Long numeroAgenciaConta = input.nextLong();
               contaCorrenteService.buscaConta(numeroAgenciaConta);
               
               contaCorrenteService.debitaValor(valor, numeroAgenciaConta);

               System.out.println("Credito da sua Conta corrente é:\n" + contasCorrentes.getSaldoDisponivel());
              
            }

            if (op1 == 4)
            {
            	ContaCorrente contasCorrentes = new ContaCorrente();
               System.out.println("Seu Saldo Na Conta corrente é:\n" +  contasCorrentes.getSaldoDisponivel());

            }

            if (op1 == 5)
            {

               System.out.println("Digite o valor a ser aplicado:");

               BigDecimal valor = input.nextBigDecimal();
               contaPoupancaService.aplicarValor(valor, cpo);

               System.out.println("Saldo da sua aplicação na  conta poupança é:\n" + cpo.getSaldoDisponivel());

            }
            if (op1 == 6)
            {

               System.out.println("Digite o valor a ser aplicado:");

               BigDecimal valor = input.nextBigDecimal();
               contaPoupancaService.resgataValor(valor, cpo);

               System.out.println("Saldo do resgate da conta poupança é:\n" + cpo.getSaldoDisponivel());

            }

            if (op1 == 4)
            {

               System.out.println("Seu Saldo Na Conta Poupança é:\n" + cpo.getSaldoDisponivel());

            }

         }
         while (op != 3);
      }

   }

}
