package la.foton.treinamento.minibanco.enums;

public enum TipoDaContaCorrente {
	
	PESSOA_FISICA_SIMPLES(1),
	PESSOA_FISICA_CONJUNTA(2),
	PESSOA_JURIDICA(3);

	 
	private int tipoDaContaCorrente;
	
	TipoDaContaCorrente(int tipoDaContaCorrente){
		this.tipoDaContaCorrente = tipoDaContaCorrente; 
	}
	
	public int gettipoDaContaCorrente() {
    	return this.tipoDaContaCorrente;
    }
	
	
	
	
	
	
	
	
	    }
	    

