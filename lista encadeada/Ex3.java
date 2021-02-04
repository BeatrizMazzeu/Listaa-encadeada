package lg2;

import java.util.LinkedList;

public class Ex3 {
public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		Integer soma = 0;
		
		lista.add(3);
		lista.add(5);
		lista.add(7);
		lista.add(9);
		lista.add(11);
		
		System.out.println( "Os elementos da lista são: " + lista );
		
		for( int cont = 0; cont < lista.size() ; cont++ )	{			
			soma = soma + lista.get( cont );
		}
		System.out.println( "A soma dos elementos é: " + soma );
	}
}
