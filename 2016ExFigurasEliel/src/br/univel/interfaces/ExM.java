package br.univel.interfaces;

import br.univel.classeabstrata.DesenhoAbstrato;

public class ExM extends DesenhoAbstrato implements Desenho {

	public static int ALTURA = 10;
	
	public void desenhar() {
		identificar();
		for (int linha = 1; linha <= ALTURA; linha++) {
			for (int col = 1; col <= ALTURA; col++) {
				if (col > linha) {
					System.out.print(" ");
				} else {
					System.out.print(col + " ");
				}
			}
			System.out.print("\n");
		}
	}
	
	@Override
	protected String getNome() {
		return "M";
	}
}