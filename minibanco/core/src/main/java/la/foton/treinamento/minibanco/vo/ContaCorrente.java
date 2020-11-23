
package la.foton.treinamento.minibanco.vo;

import java.math.BigDecimal;



import la.foton.treinamento.minibanco.enums.TipoDaConta;
import la.foton.treinamento.minibanco.enums.TipoDaContaCorrente;

public class ContaCorrente<TipoBloqueioConta> extends Conta  {
		
		
	private TipoDaContaCorrente tipoDaContaCorrente;
	private TipoBloqueioConta tipoBloqueioConta;
	private BigDecimal chequeEspecial;
	
	public ContaCorrente() {
		
	}
	
	 	public ContaCorrente(Long numeroAgenciaConta, BigDecimal saldoDisponivel, boolean inativa, String nomeGerente,
		      TipoDaContaCorrente tipoDaContaCorrente)
		   {
		      super(numeroAgenciaConta, saldoDisponivel, inativa, nomeGerente, TipoDaConta.CONTA_CORRENTE);
		      this.tipoDaContaCorrente = tipoDaContaCorrente;
		      this.chequeEspecial = new BigDecimal("1000.0");
		      this.setSaldoDisponivel(BigDecimal.ZERO);
		      
		   }

	
	
	
	
	public TipoDaContaCorrente getTipoDaContaCorrente() {
		return tipoDaContaCorrente;
	}
	public void setTipoDaContaCorrente(TipoDaContaCorrente tipoDaContaCorrente) {
		this.tipoDaContaCorrente = tipoDaContaCorrente;
	}
	public TipoBloqueioConta getTipoBloqueioConta() {
		return tipoBloqueioConta;
	}
	public void setTipoBloqueioConta(TipoBloqueioConta tipoBloqueioConta) {
		this.tipoBloqueioConta = tipoBloqueioConta;
	}
	public BigDecimal getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(BigDecimal chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	
	
		
	}

	

	
	

