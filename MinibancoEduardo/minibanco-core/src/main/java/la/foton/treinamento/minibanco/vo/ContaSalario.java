package la.foton.treinamento.minibanco.vo;

public class ContaSalario extends Conta_old{
		
		
	private String NomeGerente;
	private int Numero;
	private float Agencia;
	private double VSaldo;
	private boolean isContaSalario;
	
	
	
	public String getNomeGerente() {
		return NomeGerente;
	}
	public void setNomeGerente(String nomeGerente) {
		NomeGerente = nomeGerente;
	}



	public int getNumero() {
		return Numero;
	}



	public void setNumero(int numero) {
		Numero = numero;
	}



	public float getAgencia() {
		return Agencia;
	}



	public void setAgencia(int agencia) {
		Agencia = agencia;
	}



	public double getVSaldo() {
		return VSaldo;
	}



	public void setVSaldo(double vSaldo) {
		VSaldo = vSaldo;
	}


	public boolean isContaSalario() {
		return isContaSalario;
	}
	public void setContaSalario(boolean isContaSalario) {
		this.isContaSalario = isContaSalario;
	}
	
	
	
	
	public String getTipo() {
		return "Conta Salario";
	}
		
		
		
		
		



}
