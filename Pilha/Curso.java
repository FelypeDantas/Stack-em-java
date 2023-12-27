package Pilha;

import java.util.Stack;

public class Curso {

	public static void main(String[] args) {
		Stack<String> carros = new Stack<>();
        
		carros.push("HRV");
		carros.push("Golf");
		carros.push("Polo");
		carros.push("Camaro");
		carros.push("Tiggo 3x");
		
		System.out.println("topo: " + carros.peek());
		System.out.println("________________________ \n");
		System.out.println("topo: " + carros.pop());
		System.out.println("________________________ \n ");
		System.out.println(carros);
		System.out.println("________________________ \n ");
		System.out.println(carros.empty()? "Pilha vazia": "Pilha com Elementos");
		System.out.println("________________________ \n");
		
		for(String c: carros) {
			System.out.println(c);
		}
		
		System.out.println("________________________ \n ");
		carros.clear();
		System.out.println(carros.empty()? "Pilha vazia": "Pilha com Elementos");
	}

}
