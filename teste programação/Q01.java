package me.bruna;

import java.util.Scanner;

public class Q01 {
	
	public static void main(String[] args) {
		//Leitura do input do usuario do tipo inteiro
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		//Fechamento do scanner
		reader.close();
		
		//Loop para realizar o print de cada linha da escada
		for (int i = 1; i <= n; i++) {
			
			//String para armazenar os espacos
			String espaco = "";
			//String para armazenar os asteriscos
			String asterisco = "";
			
			//A quantidade de espacoes é definida pela quantidade de linhas-linha_atual-1
			for (int j = 0; j < (n-i); j++) {
				espaco+= " ";
			}
			//A quantidade de espacoes é definida pela linha_atual
			for (int j = 0; j < i; j++) {
				asterisco+= "*";
			}
			
			//Print de cada linha da escada
			System.out.print(espaco);
			System.out.println(asterisco);
		}
		
        
	}

}
