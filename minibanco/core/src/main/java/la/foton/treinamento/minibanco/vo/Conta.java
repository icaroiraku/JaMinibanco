package la.foton.treinamento.minibanco.vo;

import java.math.BigDecimal;

import la.foton.treinamento.minibanco.core.ContaCorrenteService;
import la.foton.treinamento.minibanco.core.ContaPoupancaService;
import la.foton.treinamento.minibanco.enums.TipoDaConta;

public class Conta {

	protected Long numeroAgenciaConta;

	private BigDecimal saldoDisponivel;

	private boolean inativa;
	
	private String nomeGerente;
	
	private TipoDaConta tipoDaConta;
	
	public Conta() {
		
	}
	
	public Conta(Long numeroAgenciaConta, BigDecimal saldoDisponivel, boolean inativa, String nomeGerente, TipoDaConta tipoDaConta) {
		
		this.numeroAgenciaConta = numeroAgenciaConta;
		this.saldoDisponivel = saldoDisponivel;
		this.inativa = inativa;
		this.nomeGerente = nomeGerente;
		this.tipoDaConta = tipoDaConta;
		
	}


	public Long getNumeroAgenciaConta() {
		return numeroAgenciaConta;
	}

	public void setNumeroAgenciaConta(long numeroAgenciaConta) {
		this.numeroAgenciaConta = numeroAgenciaConta;
	}

	public BigDecimal getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(BigDecimal saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}


	
	public boolean inativa() {

		return inativa;

	}

	public boolean isInativa() {
		return inativa;
	}

	public void setInativa(boolean inativa) {
		this.inativa = inativa;
	}

	public String getNomeGerente() {
		return nomeGerente;
	}

	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}

	public TipoDaConta getTipoDaConta() {
		return tipoDaConta;
	}

	public void setTipoDaConta(TipoDaConta tipoDaConta) {
		this.tipoDaConta = tipoDaConta;
	}

	

	}


