package br.univel.interfaces;

import br.univel.classeabstrata.DesenhoAbstrato;

public class ExC extends DesenhoAbstrato implements Desenho {

	public static int ALTURA = 8;
	
	public void desenhar() {
		
		identificar();
	
		int brancos = 0;
		for (int linha = 0; linha <= 8; linha++) {
			for (int coluna = 0; coluna <= ALTURA; coluna++) {
				if (coluna > brancos) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			brancos++;
			System.out.print("\n");
		}
	}
	
	@Override
	protected String getNome() {
		return "C";
	}		
}
