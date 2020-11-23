package la.foton.treinamento.minibanco.vo;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

		 private String nomeDaPoupanca ;
		
		  private Integer variacaoPoupanca;
		
		 private BigDecimal rendimento;

		
		 
		 

		public String getNomeDaPoupanca() {
			return nomeDaPoupanca;
		}

		public void setNomeDaPoupanca(String nomeDaPoupanca) {
			this.nomeDaPoupanca = nomeDaPoupanca;
		}

		public Integer getVariacaoPoupanca() {
			return variacaoPoupanca;
		}

		public void setVariacaoPoupanca(Integer variacaoPoupanca) {
			this.variacaoPoupanca = variacaoPoupanca;
		}

		public BigDecimal getRendimento() {
			return rendimento;
		}

		public void setRendimento(BigDecimal rendimento) {
			this.rendimento = rendimento;
		}
		
		@Override
		public String toString() {
			String s = "ContaPoupanca[";
			s +="rendimento:" + rendimento;
			s += super.toString();
			s +="]";
			
			return s;
				
		}
		
		public void calcularRendimento (double saldoDisponivel) {
			
			saldoDisponivel-= .006;
			
		}
			
			}
	
		

