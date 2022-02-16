package me.bruna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q03 {
	
	public static void main(String[] args) {
		int counter = 0;
		
		//Leitura do input do usuario do tipo string
		Scanner reader = new Scanner(System.in);
		String palavra = reader.nextLine();
		reader.close();
		
		ArrayList<ArrayList<Integer>> anagramas = new ArrayList<>();
		for (int len = 1; len <= palavra.length(); len++) {
            for (int i = 0; i <= palavra.length() - len; i++) {
                int j = i + len - 1;
                ArrayList<Integer> pos = new ArrayList<Integer>();
                for (int k = i; k <= j; k++) {
                    pos.add(k);
                }
                anagramas.add(pos);
            }
        }
		char[] c_palavra = palavra.toCharArray();
		
		ArrayList<ArrayList<Integer>> analysed = new ArrayList<>();
		for (ArrayList<Integer> anagrams : anagramas) {
			analysed.add(anagrams);
			
			String str1 = "";
			for (Integer pos : anagrams) {
				str1+= c_palavra[pos];
			}
			
			for (ArrayList<Integer> anagrams2 : anagramas) {
				if (!analysed.contains(anagrams2)) {
					String str2 = "";
					for (Integer pos : anagrams2) {
						str2+= c_palavra[pos];
					}
					if (isAnagrama(str1, str2)) {
						counter+=1;
					}
				}
			}
		}
		System.out.println(counter);
		
	}
	
	static boolean isAnagrama(String str1, String str2) {
		if (str1.length() == str2.length()) {
			char[] c1 = str1.toCharArray();
		    char[] c2 = str2.toCharArray();
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    return Arrays.equals(c1, c2);
		}
		return false;
	}

}
