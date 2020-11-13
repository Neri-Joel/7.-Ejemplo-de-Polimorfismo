package com.tcca;

public class Triangulo extends Figura implements IFigura {
	
	double base;
	double altura;
	double a, b, c;
	
	public Triangulo(double base, double altura, double a, double  b, double c) {
	
    this.base = base;
    this.altura = altura;
    this.a = a;
    this.b = b;
    this.c = c;
	}
	
	@Override
	public void calculaArea() {
		area = base * altura / 2.0;
	}

	@Override
	public void calculaPerimetro() {
		perimetro = a + b + c;
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 0;
		
	}

	
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Triangulo";
	}
}
