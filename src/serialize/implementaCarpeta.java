package serialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class implementaCarpeta extends implementaDato implements CarpetaDatos, Serializable {
	
	public implementaCarpeta(String nombre) {
		super(nombre);
		
	}

	List<Dato> lista = new ArrayList<Dato>();




	@Override
	public Dato[] getDatos() {

		return lista.toArray(new Dato[0]);
	}

	@Override
	public DatoTexto addDatoTexto(String nombre, String valor) {
		DatoTexto d = new implementaDatoTexto(nombre, valor);
		lista.add(d);
		return d;
	}

	@Override
	public CarpetaDatos addCarpetaDatos(String nombre) {
		CarpetaDatos c = FabricaDeDatos.creaCarpetaDatos(nombre);
		lista.add(c);
		return c;
	}

	/**
	 * Dos {@code CarpetaDato} son iguales si tienen el mismo nombre y su
	 * contenido es igual. Da igual el orden.
	 */
	@Override
	public boolean equals(Object obj) {
		implementaCarpeta p1 = null;
		if (super.equals(obj)) {
			return true;
		}
		if (obj instanceof implementaCarpeta) {
			p1 = (implementaCarpeta) obj;
		}

		else {
			return false;
		}

		if (this.getNombre().equals(p1.getNombre()) && this.lista.containsAll(p1.lista)
				&& this.lista.size() == (p1.lista.size())) {
			return true;
		}

		return false;
	}

	@Override 
	public String toString(){
		return super.getNombre();
	}

}
