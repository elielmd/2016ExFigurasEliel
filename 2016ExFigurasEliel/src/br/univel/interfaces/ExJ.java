package br.univel.interfaces;

import br.univel.classeabstrata.DesenhoAbstrato;

public class ExJ extends DesenhoAbstrato implements Desenho {

	public static int ALTURA = 13;

	public void desenhar() {
		identificar();
		for (int lin = 0;lin<ALTURA;lin++) {
			for (int col = 0;col<ALTURA;col++) {
				if (((lin) <= col) && (col <= ((ALTURA-1) - lin))){
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
		return "J";
	}
}