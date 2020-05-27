package carrinho_pizzaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
	double preco;
	String tamanho;
	List<String> ingredientePizza = new ArrayList<String>();
	static Map<String,Integer> ingredientes = new HashMap<String,Integer>();
	
	Pizza(String tamanho){
		this.tamanho = tamanho;
	}
	
	//adicionar ingredientes em uma pizza
	public void adicionaIngrediente(String ingrediente){
		ingredientePizza.add(ingrediente);
		
		//faz uma lista geral de ingredientes
		contabilizaIngrediente(ingrediente);
	}
	
	//verifica preço da pizza
	public double getPreco(){
		switch(tamanho) {
		case "P":
			preco = 15;
			break;
		case "M":
			preco= 20;
			break;
		case "G":
			preco = 30;
			break;
		}
		
		if (ingredientePizza.size()<=2)
			return preco+=2;
		else if(ingredientePizza.size()<=5)
			return preco+=7;
		else
			return preco+=10;
	}
	
	//verifica todos os ingredientes já conhecidos e suas quantidades
	static void contabilizaIngrediente(String ingrediente) {
		if(ingredientes.containsKey(ingrediente)) {
            Integer qtd = ingredientes.get(ingrediente);
            qtd++;
			ingredientes.put(ingrediente, qtd);
		}else {
			ingredientes.put(ingrediente, 1);
		}
	}
	
	//só para teste
	static void imprimeIngredientes() {
		for (String key : ingredientes.keySet()) {        
            //Capturamos o valor a partir da chave
            Integer value = ingredientes.get(key);
            System.out.println(key + " = " + value);
		}

	}
}