package carrinho_pizzaria;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	Map<Pizza, Double> pedido = new HashMap<Pizza,Double>();
	
	void addPizza(Pizza p) {
		if (!p.ingredientePizza.isEmpty())
			pedido.put(p, p.getPreco());
	}
	
	double getTotal() {
		double total = 0;
		for (Pizza key : pedido.keySet())        
            total += pedido.get(key);
		return total;
	}
}
