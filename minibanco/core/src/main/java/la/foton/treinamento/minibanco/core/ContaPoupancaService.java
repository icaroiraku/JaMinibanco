package la.foton.treinamento.minibanco.core;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import la.foton.treinamento.minibanco.vo.Conta;
import la.foton.treinamento.minibanco.vo.ContaPoupanca;

public class ContaPoupancaService {
	
	private Map<Long,ContaPoupanca>contasPoupancas = new HashMap<>();

	public void aplicarValor(BigDecimal valor, ContaPoupanca conta) {

		BigDecimal novoSaldo = conta.getSaldoDisponivel().add(valor);
		conta.setSaldoDisponivel(novoSaldo);


	}

	public BigDecimal resgataValor(BigDecimal valor, Conta conta) {

		BigDecimal novoResgate = conta.getSaldoDisponivel();

		if (novoResgate.compareTo(BigDecimal.ZERO) == 0 || novoResgate.compareTo(valor) < 0) {

		} else {

			conta.setSaldoDisponivel(novoResgate.subtract(valor));
		}

		return conta.getSaldoDisponivel();

	}
	
	public void deposita (ContaPoupanca contaPoupanca,BigDecimal valor) throws Exception {
		
	
	}

	
	public void abreConta(ContaPoupanca contaPoupanca) {
		
		
		
	
	}
	
	public static int extraiNumeroAgencia(long numeroAgenciaConta) {
	
		return (int) numeroAgenciaConta ;
		}
		

}
