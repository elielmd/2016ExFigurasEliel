package br.univel.interfaces;

import br.univel.classeabstrata.DesenhoAbstrato;

public class ExL extends DesenhoAbstrato implements Desenho {

	public static int ALTURA = 12;
	
	public void desenhar() {
		identificar();
		for (int lin = 0;lin<ALTURA;lin++){			
			for (int col = 0;col<ALTURA;col++){
				if ((((((ALTURA/2) - lin) <= col) && (col <= ((ALTURA/2) + lin)) && (lin <= ALTURA/2))) || ((ALTURA/2 + 1 <= lin) && (col >= lin-(ALTURA/2)) && (col < (ALTURA - (lin - (ALTURA/2)))))){
					System.out.print("#");
				} else if ((lin > ALTURA) && (lin <= col) && (col <= ((ALTURA-1) - lin)))
					System.out.print("#");
				else{
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
		return "L";
	}
}