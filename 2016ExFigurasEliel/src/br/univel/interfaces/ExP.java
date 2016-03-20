package br.univel.interfaces;

import br.univel.classeabstrata.DesenhoAbstrato;

public class ExP extends DesenhoAbstrato implements Desenho {

	public static int ALTURA = 10;
	
	public void desenhar() {
		identificar();
		for(int lin = 0;lin<ALTURA;lin++){
			for(int col = 0;col<ALTURA;col++){
				if ((col == lin) && (lin > 0)){
					System.out.println();
				}
				if(lin<=col){
					System.out.print(ALTURA - col + " ");
				}			
			}
		}
	}
	@Override
	protected String getNome() {
		return "p";
	}
}