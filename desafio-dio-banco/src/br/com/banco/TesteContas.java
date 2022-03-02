package br.com.banco;

public class TesteContas {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("ALLAN");
		
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);
		
		cc.depositar(100);
		cc.transferir(50, cp);
		
		cp.imprimirExtrato();
		cp.imprimirExtrato();
		
		
	}

}
