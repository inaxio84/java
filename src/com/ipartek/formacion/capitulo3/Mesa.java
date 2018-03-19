//1.definicion paquete package
package com.ipartek.formacion.capitulo3;
//2. imports => ahora mismo no tenemos ninguno

//3. definicion de la Clase
public class Mesa {
	// precio en €
	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;
	final int PRECIO_MATERIAL_MADERA = 4;
	final int PRECIO_MATERIAL_ACERO = 6;
	final int PRECIO_MATERIAL_ALUMINIO = 5;
	final int PRECIO_MATERIAL_PLASTICO = 2;
	final int PRECIO_COLOR_CUSTOM = 23;
	final String PRECIO_COLOR_NAME_CUSTOM = "custom";
	final int MATERIAL_MADERA = 1;
	final int MATERIAL_ACERO = 2;
	final int MATERIAL_ALUMINIO = 3;
	final int MATERIAL_PLASTICO = 4;
	// 4. definicion de Atributos (siempre van a ser private)
	private int numeroPatas;
	private int dimension; // m2
	private String color;
	private int material;

	/*
	 * 5. Metodos 5.1 constructore 5.2 getters & setters 5.3 constructores
	 */
	public Mesa() {
		super();
		this.numeroPatas = 4;
	}

	/**
	 * OBjeto que representa una mesa
	 * 
	 * @author Curso
	 * @param numeroPatas
	 *            int en caso de ser negativo se inicializa a 0
	 */

	public Mesa(int numeroPatas) {
		super();
		// this.numeroPatas = numeroPatas;
		this.setNumeroPatas(numeroPatas);
	}

	public int getNumeroPatas() {
		return this.numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {

		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
	}

	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + "]";
	}

	public int calcularPrecio() {

		int precio;
	}

}
