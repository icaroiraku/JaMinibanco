package la.foton.treinamento.minibanco.enums;

public enum TipoDaConta {
	CONTA_CORRENTE(1),
    CONTA_POUPANCA(2),
    CONTA_SALARIO(3);

 private int tipoDaConta;

 TipoDaConta(int tipoDaConta)
 {
    this.tipoDaConta = tipoDaConta;
 }

 public int gettipoDaConta()
 {
    return this.tipoDaConta;
 }

}
