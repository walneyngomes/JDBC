package br.com.unifacisa.bd2;

public class BancoFactory {
	public static BancoDAO instancia(TipoDeBanco tipo) {
		switch (tipo) {
		case BancoDoBrasil:
			return new BancoDoBrasil();
		case Bradesco:
			return new Bradesco();
		case Itau:
			return new Itau();
		case Santander:
			return new Santander();
		default:
			return new TrindadeSA();
		}
	}

}
