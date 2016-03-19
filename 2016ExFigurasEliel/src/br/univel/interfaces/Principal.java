package br.univel.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		List<Desenho> lista = new LinkedList<Desenho>();
		
		lista.add(new ExA());
		lista.add(new ExB());
		lista.add(new ExC());
		lista.add(new ExD());
		
		for (Desenho d : lista) {
			d.desenhar();
		}
	}

}
