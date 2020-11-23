package la.foton.treinamento.minibanco.enums;

public enum TipoBloqueioConta {

	  SEM_BLOQUEIO(0), BLOQUEIO_TOTAL(1), BLOQUEIO_DEBITO(2), BLOQUEIO_CREDITO(3);

	   public final int tipoBloqueio;

	   private TipoBloqueioConta(int tipoBloqueio)
	   {
	      this.tipoBloqueio = tipoBloqueio;
	   }
}
