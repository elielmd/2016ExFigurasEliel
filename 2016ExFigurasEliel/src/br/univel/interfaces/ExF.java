package br.univel.interfaces;

import br.univel.classeabstrata.DesenhoAbstrato;

public class ExF extends DesenhoAbstrato implements Desenho {

	public static int ALTURA = 8;

	public void desenhar() {
	
		identificar();

		int caracter = 0;
		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < ALTURA; coluna++) {
				if (linha == 0 || linha == ALTURA - 1 || coluna == caracter) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			caracter++;
			System.out.print("\n");
		}
	}

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "F";
	}
}