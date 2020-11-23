package la.foton.treinamento.minibanco.vo;

import java.math.BigDecimal;

import la.foton.treinamento.minibanco.enums.TipoDaConta;

public class ContaPoupanca extends Conta {

		 private String nomeDaPoupanca ;
		
		  private Integer variacaoPoupanca;
		
		 private BigDecimal rendimento;
		 
		 
		 public ContaPoupanca() {
			 
		 }
		 
		 public ContaPoupanca(Long numeroAgenciaConta, BigDecimal saldoDisponivel,boolean inativa,String nomeGerente,
				 ContaPoupanca tipoDaContaPoupanca)
		 {
		 super(numeroAgenciaConta, saldoDisponivel, inativa, nomeGerente, TipoDaConta.CONTA_POUPANCA);
		 
		 this.setSaldoDisponivel(BigDecimal.ZERO);
			 
		 }

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
		 

			
			}
	
		

