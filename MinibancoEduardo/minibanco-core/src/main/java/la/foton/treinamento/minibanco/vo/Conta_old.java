
package la.foton.treinamento.minibanco.vo;

import java.math.BigDecimal;

import la.foton.treinamento.minibanco.util.ContaUtil;

/**
* Descrição do Fonte
* 
* @author <Mês por extenso>/2020: Icaro Araujo De Souza
*/



public class Conta_old {

	  	private	String nome; 
		private long numeroAgenciaConta = 1234123456789L; /*numero completo: 4 numeros para agencia mais 9 digitos para a conta */
		private BigDecimal saldo; 		
		
		
		
		



		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public long getNumeroAgenciaConta() {
			return numeroAgenciaConta;
		}


		public void setNumeroAgenciaConta(long numeroAgenciaConta) {
			this.numeroAgenciaConta = numeroAgenciaConta;
		}


		public BigDecimal getSaldo() {
			return saldo;
		}


		public void setSaldo(BigDecimal saldo) {
			this.saldo = saldo;
		}


		public int getNumeroConta(){
			
			 return ContaUtil.extraiNumeroConta(numeroAgenciaConta);
			
		}
	
		
		public int getNumeroAgencia() {
			
			return ContaUtil.extraiNumeroAgencia(numeroAgenciaConta);
		}
		
		
		
		
		
		  public static void main(String[] args)
		  {

		     long numeroAgenciaConta = 1123456789L;

		     System.out.println("Agencia e Conta: " + numeroAgenciaConta);

		     int agencia = (int) (numeroAgenciaConta / 1000000000L);

		     System.out.println("Agencia: " + agencia);

		     int conta = (int) (numeroAgenciaConta % 1000000000L);

		     System.out.println("Conta: " + conta);

		     StringBuilder agenciaComZerosAEsquerda = new StringBuilder(String.valueOf(agencia));

		     while (agenciaComZerosAEsquerda.length() < 4)
		     {
		        agenciaComZerosAEsquerda = agenciaComZerosAEsquerda.insert(0, '0');
		     }

		     System.out.println("Agencia completada com zeros a esquerda: " + agenciaComZerosAEsquerda);

		  }
		
}
