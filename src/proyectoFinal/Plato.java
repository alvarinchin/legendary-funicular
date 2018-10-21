package proyectoFinal;

public class Plato {
	private String cod_platos;
	private String nombre;
	private int precio;
	private String detalles;
	
	public Plato(String cod_platos,String nombre,int precio,String detalles){
		setCod_platos(cod_platos);
		setDetalles(detalles);
		setNombre(nombre);
		setPrecio(precio);
	}
	public String getCod_platos() {
		return cod_platos;
	}
	public void setCod_platos(String cod_platos) {
		this.cod_platos = cod_platos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	
}
