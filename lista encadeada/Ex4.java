package lg2;

import java.util.LinkedList;

public class Ex4 {
public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		Integer maior = 0;
		
		lista.add(4);
		lista.add(3);
		lista.add(6);
		lista.add(17);
		lista.add(9);
		lista.add(2);
		
		
		System.out.println( "Os elementos da lista são: " + lista );


		for( int cont = 0; cont < lista.size() ; cont++ )	{
			
			if ( maior < lista.get(cont))	
				maior = lista.get(cont);
			}
			
			System.out.println("O maior elemento da lista é: " + maior);
		}
	}


