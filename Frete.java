package carrinho_pizzaria;

public class Frete {
	
	public static double getValorFrete(String local) {
		switch(local) {
		case "ASA NORTE":
			return 2;
		case "ASA SUL":
			return 7;
		case "SUDOESTE":
			return 9;
		default: 
			return 0;
		}
	}
}
