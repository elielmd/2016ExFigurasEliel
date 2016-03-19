package br.univel.classeabstrata;

import br.univel.interfaces.Desenho;

public abstract class DesenhoAbstrato {
	
	public void identificar() {
		System.out.println("\n");
		System.out.println("*===================================*");
		System.out.println(getNome());
		System.out.println("*===================================*");
		System.out.println("\n");
		
	}
	protected abstract String getNome();
	
}
