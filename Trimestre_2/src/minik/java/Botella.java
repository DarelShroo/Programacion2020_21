package minik.java;

public class Botella {
	private float contenido;
	private boolean cerrada;
	private static String unidades="litros";
	
	public Botella() {
		contenido=0;
		cerrada=false;
	}
	
	public Botella(float liq) {
		if(liq<0.0f || liq>1.0f)
			throw new RuntimeException("Esta botella solo acepta un contenido de entre 0 y 1.");
		contenido=liq;
		cerrada=true;
	}
	
	public float getContenido() {
		return contenido;
	}

	public void cerrar() {
		cerrada = true;
	}

	public void abrir() {
		cerrada = false;
	}

	public boolean estaCerrada() {
		return cerrada;
	}

	public boolean estaAbierta() {
		return !cerrada;
	}

	public boolean estaLlena() {
		return contenido == 1.0f;
	}

	public boolean estaVacia() {
		return contenido == 0.0f;
	}

	public float meter(float liq) {
		float sobra = liq;
		if (!cerrada)
			if (contenido + liq <= 1.0f) {
				sobra = 0;
				contenido += liq;
			} 
			else {
				sobra = contenido + liq - 1.0f;
				contenido = 1.0f;
			}
		return sobra;
	}

	public float extraer(float liq) {
		float saca = 0.0f;
		if (!cerrada) {
			if (liq <= contenido) {
				saca = liq;
				contenido -= liq;
			} else {
				saca = contenido;
				contenido = 0.0f;
			}
		}
		return saca;
	}

	public String toString() {
		// return "Botella["+contenido+" "+unidades+" , "+(cerrada?"cerrada":"abierta")+"]";
		return String.format("Botella[%.2f %s, %s]", contenido, unidades, (cerrada ? "cerrada" : "abierta"));
	}
	
	public static Caja caja(int tam) {
		if(tam!=10 && tam!=12 && tam!=24)
			throw new RuntimeException();
		return new Caja(tam);
	}
	
	
}








