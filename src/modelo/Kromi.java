package modelo;


/**
 *
 * @author Edgardo 
 */

public class Kromi extends Carro{
    
 
	
	private int anoDeFabricacion;
	private String marca;
	
	public Kromi() {
		super();
	}

	public Kromi(int cantidadDeOcupantes, String fechaDeIngreso, int ubiFila, int ubiColumna, int anoDeFabricacion,
			String marca) {
		super(cantidadDeOcupantes, fechaDeIngreso, ubiFila, ubiColumna);
		this.anoDeFabricacion = anoDeFabricacion;
		this.marca = marca;
	}

	public int getAnoDeFabricacion() {
		return anoDeFabricacion;
	}

	public void setAnoDeFabricacion(int anoDeFabricacion) {
		this.anoDeFabricacion = anoDeFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi [a�oDeFabricacion=" + anoDeFabricacion + ", marca=" + marca + "]";
	}
	
	
	
	

}
