/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/SUMA/
 */

import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
 
		int liczba=0;
		int suma=0;
		while(in.hasNextInt())
		{
			liczba = in.nextInt();
			suma+=liczba;
			System.out.println(suma);
		}
		in.close();
	}
}
