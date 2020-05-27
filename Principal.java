package carrinho_pizzaria;

import java.util.*;
import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
            
            List<Pizza> pizzas = new ArrayList<>();
            int continuar = 0;
            String ingrediente = "";
            
             do{
                    continuar = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho da pizza desejada?\n1 - Pequena\n2 - Média\n3 - Grande"));
                    if(continuar == 1){
                        Pizza p1 = new Pizza("P"); 
                    }else if(continuar == 2){
                        Pizza p2 = new Pizza("M");
                    }else if(continuar == 3){
                        Pizza p3 = new Pizza("G");
                    }else{
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                    }
                }while(continuar != 2);
		Pizza p1 = new Pizza("P");
		Pizza p2 = new Pizza("M");
		Pizza p3 = new Pizza("G");

		CarrinhoDeCompras cp = new CarrinhoDeCompras();

                do{
                    continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja acrescentar algum ingrediente?\n1 - Sim\n2 - Não"));
                    if(continuar == 1){
                        ingrediente = JOptionPane.showInputDialog("Que ingrediente deseja adicionar?");
                        p1.adicionaIngrediente(ingrediente);
                    }else if(continuar == 2){
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                    }
                }while(continuar != 2);
                
		
		JOptionPane.showMessageDialog(null, "Pizza 1 preço: " + p1.getPreco());
		
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Orégano");
		p2.adicionaIngrediente("Manjericão");
		System.out.println("Pizza 2 preço: " + p2.getPreco());

		
		p3.adicionaIngrediente("Salame");
		p3.adicionaIngrediente("Batata palha");
		p3.adicionaIngrediente("Queijo");
		p3.adicionaIngrediente("Orégano");
		p3.adicionaIngrediente("Manjericão");
		p3.adicionaIngrediente("Queijo");
		p3.adicionaIngrediente("Orégano");
		
		System.out.println("Pizza 3 preço: " + p3.getPreco());		
		
		cp.addPizza(p1);
		cp.addPizza(p2);
		cp.addPizza(p3);
		
		System.out.println("Total a pagar: R$ "+(cp.getTotal() + Frete.getValorFrete("ASA NORTE")));
		System.out.println("Quantidade utilizada de cada ingrediente");
		Pizza.imprimeIngredientes();
	}
}