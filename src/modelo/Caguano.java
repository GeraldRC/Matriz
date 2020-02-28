package modelo;

public class Caguano extends Carro {
	
	private float alcanceDeTiro;
	private String colorConfeti;
	
	public Caguano() {
		super();
	}

	public Caguano(int cantidadDeOcupantes, String fechaDeIngreso, int ubiFila, int ubiColumna, float alcanceDeTiro,
			String colorConfeti) {
		super(cantidadDeOcupantes, fechaDeIngreso, ubiFila, ubiColumna);
		this.alcanceDeTiro = alcanceDeTiro;
		this.colorConfeti = colorConfeti;
	}

	public float getAlcanceDeTiro() {
		return alcanceDeTiro;
	}

	public void setAlcanceDeTiro(float alcanceDeTiro) {
		this.alcanceDeTiro = alcanceDeTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

	@Override
	public String toString() {
		return "Caguano [alcanceDeTiro=" + alcanceDeTiro + ", colorConfeti=" + colorConfeti + "]";
	}
	
	
	

}
