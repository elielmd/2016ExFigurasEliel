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
		lista.add(new ExE());
		lista.add(new ExF());
		lista.add(new ExG());
		lista.add(new ExH());
		lista.add(new ExI());
		lista.add(new ExJ());
		lista.add(new ExK());
		lista.add(new ExL());
		
		for (Desenho d : lista) {
			d.desenhar();
		}
	}

}
