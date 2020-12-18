
public class FuncionesVarias {
	

	public static char letraDNI(long dni) {
		int posiLetraDNI;
		//char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		char[] letras = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
		posiLetraDNI = (int)(dni % 23);

		return letras[posiLetraDNI];
	}

	public static char letraDNI(String dni) {
		long lDni;
		lDni = Long.parseLong(dni);
		return letraDNI(lDni);
		}

	public static boolean validarDNI(String dni) {
		//dni=dni.trim();
		char letra = Character.toUpperCase(dni.charAt(dni.length()-1));
		char letraCorrecta;
		String dniSinLetra = dni.substring(0, dni.length()-1);
		letraCorrecta = letraDNI(dniSinLetra);

		return letra == letraCorrecta;
	}
	
	
	
	public static void separador(int numero, char caracter) {
		int i;
		for (i = 1; i <= numero; i++) {
			System.out.print(caracter);
		}
		System.out.println();
	}
	
	public static int[] tablaEnteros(int tamaño) {
		
		int[] tabla = new int[tamaño];
		for (int i = 0; i < tamaño; i++) {
			tabla[i] = FuncionesNumeros.numeroAleatorio(-100, 100);
		}
		return tabla;
	}
	
	public static void println(int[] t) {
		int i;
		System.out.print("{");
		if(t.length!=0) {
			for (i = 0; i < t.length-1; i++) {
				System.out.print(t[i]+" , ");
			}
			System.out.print(t[i]);
		}
		System.out.println("}");
	}
	
	
}