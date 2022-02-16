package me.bruna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
	
	public static void main(String[] args) {
		//Leitura do input do usuario do tipo string
		Scanner reader = new Scanner(System.in);
		String senha = reader.nextLine();
		//Fechamento do scanner
		reader.close();
		
		//Booleans que validam a senha
		boolean haveDigit = false;
		boolean haveUpper = false;
		boolean haveLower = false;
		boolean haveSpecial = false;
		
		ArrayList<Character> specials = new ArrayList<>();
		specials.add('!');
		specials.add('@');
		specials.add('#');
		specials.add('$');
		specials.add('%');
		specials.add('^');
		specials.add('&');
		specials.add('*');
		specials.add('(');
		specials.add(')');
		specials.add('-');
		specials.add('+');
		
		//Caso a senha tenha menos que 6 digitos, independente da composição, a quantidade minima a ser adicionada é 6 - tamanho da senha atual
		if (senha.length() < 6) {
			System.out.println(6-senha.length());
		} else {
			int counter = 0;
			
			//Varredura pelos chars da String
			for (char c : senha.toCharArray()) {
				//Verifica se o char está compreendido entre os caracteres (seguindo a tabela ascii)
		         if (c >= '0' && c <= '9') {
		        	 haveDigit = true;
		         } else if (c >= 'A' && c <= 'Z') {
		        	 haveUpper = true;
		         } else if (c >= 'a' && c <= 'z') {
		        	 haveLower = true;
		         } else if (specials.contains(c)) {
		        	 haveSpecial = true;
		         }
		    }
			
			
			if (!haveDigit) {
				counter += 1;
			}
			if (!haveUpper) {
				counter += 1;
			}
			if (!haveSpecial) {
				counter += 1;
			}
			if (!haveLower) {
				counter += 1;
			}
			System.out.println(counter);
			
		}
		
	}

}
