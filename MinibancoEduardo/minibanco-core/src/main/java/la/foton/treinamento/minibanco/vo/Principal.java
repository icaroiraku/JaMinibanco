package la.foton.treinamento.minibanco.vo;

import java.math.BigDecimal;
import java.util.Scanner;





public class Principal {
	

	public static void main(String[] args) {
	
		
		
		
		
		System.out.println("****Mini Banco***\n");

		try (Scanner input = new Scanner(System.in)) {
			
			int op;
			int oc;
			
			ContaPoupanca cpo = new ContaPoupanca();
			ContaCorrente cc = new ContaCorrente();

			
			ContaPoupancaService cps = new ContaPoupancaService();
			
			ContaCorrenteService cis = new ContaCorrenteService();
			
		

			
			do {
				
				
			
				System.out.println("1-Abrir Conta");

				System.out.println("2-Debita Conta Corrente");
				System.out.println("3-Credita Conta Corrente");
				System.out.println("4-Consulta saldo conta corrente");
				System.out.println("5-Aplica Conta Poupança");
				System.out.println("6-Resgata Conta Poupança");
				System.out.println("7-Consulta saldo Conta Poupança\n");

				op = input.nextInt();

				if (op == 1) {

					System.out.println("Qual tipo de conta?\n1.Poupança\n2.Corrente");
					
					oc = input.nextInt();
					if (oc == 1) {
						ContaPoupanca cp = new ContaPoupanca();
						System.out.print("Digite sua Agencia e Conta:\n");
						op= (int) input.nextLong();
						cp.setNumeroAgenciaConta((int)(op/1000000000L));
						
						 System.out.println("Agencia: " + cp.getNumeroAgencia());
						 cp.setNumeroConta(op % 1000000000L);
					   

					     System.out.println("Conta: " + cp.getNumeroConta());
					     
						cps.abreConta(cp);
						
						
					} else {
						
						
						ContaCorrente ci = new ContaCorrente();
						System.out.print("Digite sua Agencia e Conta:\n");
						oc = (int) input.nextLong();
						ci.setNumeroAgenciaConta((int)(oc/1000000000L));
						
						 System.out.println("Agencia: " + ci.getNumeroAgencia());
						 ci.setNumeroConta(oc % 1000000000L);
					     
						 
					     System.out.println("Conta: " + ci.getNumeroConta());
					     
					     cis.abreConta(ci,cc);
					     
					}

					System.out.println("Conta criada com sucesso!\n");

				}
				
				if (op == 2) {
					System.out.println("Digite o valor a ser debitado Conta Corrente:");
					
					BigDecimal valor = input.nextBigDecimal();
					cis.debitaValorConta(valor,cc );
					
					

						System.out.println("Saldo da sua conta  Corrente Debitada é:\n" + cc.getSaldoDisponivel());
					
                   
					}
				if (op == 3) {
					System.out.println("Digite o valor a ser Creditado:");
					
					BigDecimal valor = input.nextBigDecimal();
					cis.creditaValorConta(valor, cc);

						System.out.println("Credito da sua Conta corrente é:\n" + cc.getSaldoDisponivel());
					
					}
				
				if (op == 4) {

						System.out.println("Seu Saldo Na Conta corrente é:\n" + cc.getSaldoDisponivel());
					
					}
				
				
				if (op == 5) {

					System.out.println("Digite o valor a ser aplicado:");

					BigDecimal valor = input.nextBigDecimal();
					cps.aplicarValor(valor, cpo);
					
					System.out.println("Saldo da sua aplicação na  conta poupança é:\n"+ cpo.getSaldoDisponivel());
					

				}
				if (op == 6) {

					System.out.println("Digite o valor a ser aplicado:");

					BigDecimal valor = input.nextBigDecimal();
					cps.resgataValor(valor, cpo);
					
					System.out.println("Saldo do resgate da conta poupança é:\n"+ cpo.getSaldoDisponivel());
					

				}
				
				if (op == 4) {

					System.out.println("Seu Saldo Na Conta Poupança é:\n" + cpo.getSaldoDisponivel());
				
				}
			

			} while (op != 3);
		}

	}

}
