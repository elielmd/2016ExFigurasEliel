package br.univel.interfaces;

import br.univel.classeabstrata.DesenhoAbstrato;
public class ExB extends DesenhoAbstrato implements Desenho {

	public static int ALTURA = 8;
			
	public void desenhar() {
		
		identificar();
				
		int caracteres = ALTURA;
		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < caracteres; coluna++) {
				System.out.print("#");
			}
			caracteres--;
			System.out.print("\n");
		}				
	}

	@Override
	protected String getNome() {
		return "B";
	}	
}

