package com.tcca;

public class Circulo extends Figura implements IFigura {
	private double radio;
	
	public Circulo(double radio) {
	this.radio = radio;
	}
	
	
	public void calculaArea() {
		area = Math.PI * radio * radio;
	}
	
	public void calculaPerimetro() {
		// TODO Auto-generated method stub
		perimetro = 2.0 * Math.PI * radio;
	}
	
	
	public double getArea(){
		// TODO Auto-generated method stub
		return area;
	}
	
	public double getPerimetro(){
		// TODO Auto-generated method stub
		return perimetro;
		

	}
	
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Circulo";
	}

	
		
	}

