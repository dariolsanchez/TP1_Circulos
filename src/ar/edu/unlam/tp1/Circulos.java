package ar.edu.unlam.tp1;

public class Circulos {

	//Declaramos el valor fijo de PI
	private static final double PI = 3.1415926535897932384626433832795;
	
	//Declaramos la variable para el radio de un círculo
	private double radioDeUnCirculo;
	
	public double getRadio() {
		return radioDeUnCirculo;
	}

	public void setRadio(double radio) {
		this.radioDeUnCirculo = radio;
	}
	
	//Declaramos el perímetro en decimal, la calculamos y devolemos el valor correspondiente
	public double calcularPerimetroDeUnCirculo(){
		
        double perimetroDeUnCirculo=0.00;
		
		perimetroDeUnCirculo = 2*PI*getRadio();
		
		return perimetroDeUnCirculo;	
	}	
	
	//Declaramos el area en decimal, la calculamos y devolemos el valor correspondiente
	public double calcularAreaDeUnCirculo(){
		
		double areaDeUnCirculo = 0.00;
		
		areaDeUnCirculo = PI*(getRadio()*getRadio());
		
		return areaDeUnCirculo;		
	}
	
}