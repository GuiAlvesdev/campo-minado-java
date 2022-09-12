package br.com.guilhermealvesdev.cm;

import br.com.guilhermealvesdev.cm.modelo.Tabuleiro;
import br.com.guilhermealvesdev.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}
}
