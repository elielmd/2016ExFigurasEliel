package br.univel.interfaces;

import br.univel.classeabstrata.DesenhoAbstrato;

public class ExG extends DesenhoAbstrato implements Desenho {

	public static int ALTURA = 8;

	public void desenhar() {
		identificar();
		for (int lin = 0;lin<ALTURA;lin++) {
			for (int col = 0;col<ALTURA;col++) {
				if ((lin + (ALTURA - 1) == (ALTURA - 1)) || (lin == (ALTURA - 1) || (((col + lin) == (ALTURA - 1))))) {
					System.out.print("#");					
				} else {
					System.out.print(" ");
				}
				if (col == (ALTURA - 1))
					System.out.println();			
			}
		}
	}
	
	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "G";
	}
}
