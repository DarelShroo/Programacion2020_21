package pruebas;

import java.util.Arrays;

import pizarra.figuras.Circulo;
import pizarra.figuras.Figura;
import pizarra.figuras.Rectangulo;

public class PruebaComparar03 {

	public static void main(String[] args) {
	
		Rectangulo r1,r2;
		r1=new Rectangulo(0, 0, 122, 17);
		r2=new Rectangulo(0, 0, 15, 15);
	
		Circulo c1 = new Circulo(0,0,15);
		Circulo c2 = new Circulo(0,0,25);
		Object[] figuras = {r1,r2,c1,c2,"Hola"};
		
		for (int i = 0; i < figuras.length; i++) {
			System.out.println(figuras[i]);
		}
		
		
		// Sort fallará porque Figura y String  no son mutuamente comprables
		Arrays.sort(figuras);
		System.out.println("___________");
		
		for (int i = 0; i < figuras.length; i++) {
			System.out.println(figuras[i]);
		}
	}
	
}
