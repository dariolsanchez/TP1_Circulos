package ar.edu.unlam.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {	
	
	//Creación de círculo de radio 2.
	@Test
	public void crearUnCirculoConRadio2() {
		
		Circulos circuloDeRadio2 = new Circulos();
		circuloDeRadio2.setRadio(2);
		assertEquals(12.56, circuloDeRadio2.calcularPerimetroDeUnCirculo(), 0.01);
		
	}
	//Creación de círculo de radio 3.7.
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulos circuloRadio3Punto7 = new Circulos();
		circuloRadio3Punto7.setRadio(3.7);
		assertEquals(23.24, circuloRadio3Punto7.calcularPerimetroDeUnCirculo(), 0.01);
	}
	
	//Creación de círculo de radio 5.
	@Test
	public void crearUnCirculoConRadio5() {
		Circulos circuloRadio5 = new Circulos();
		circuloRadio5.setRadio(5);
		assertEquals(31.41, circuloRadio5.calcularPerimetroDeUnCirculo(), 0.01);
	}
	
	//Creación de círculo de radio 10.9.
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulos circuloRadio10Punto9 = new Circulos();
		circuloRadio10Punto9.setRadio(10.9);
		assertEquals(68.48, circuloRadio10Punto9.calcularPerimetroDeUnCirculo(), 0.01);
	}
	
	//Creación de círculo de radio 9.8.
   @Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulos areaDeUnCirculoRadio9Punto8Es615Punto73 = new Circulos();
		areaDeUnCirculoRadio9Punto8Es615Punto73.setRadio(9.8);
		assertNotEquals(615.73, areaDeUnCirculoRadio9Punto8Es615Punto73.calcularAreaDeUnCirculo(), 0.01);
	}
   
   //El area del círculo de radio 9.8.
   @Test
    public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto71(){
	   Circulos areaDeUnCirculoRadio9Punto8Es301Punto71 = new Circulos();
	   areaDeUnCirculoRadio9Punto8Es301Punto71.setRadio(9.8);
	   assertEquals(301.71, areaDeUnCirculoRadio9Punto8Es301Punto71.calcularAreaDeUnCirculo(), 0.01);
   }

   //Creación de círculo de radio 16.6.
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulos circuloRadio16Punto6 = new Circulos();
		circuloRadio16Punto6.setRadio(16.6);
		assertNotEquals(865.67, circuloRadio16Punto6.calcularPerimetroDeUnCirculo(), 0.01);
	}
	
	//El area del círculo de radio 16.6. 
	@Test
	 public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto69(){
		Circulos areaDeUnCirculoRadio16Punto6 = new Circulos();
		areaDeUnCirculoRadio16Punto6.setRadio(16.6);
		assertEquals(865.69, areaDeUnCirculoRadio16Punto6.calcularAreaDeUnCirculo(), 0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/*
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}