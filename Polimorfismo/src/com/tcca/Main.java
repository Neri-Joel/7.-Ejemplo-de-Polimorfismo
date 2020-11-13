package com.tcca;

public class Main {

	public static void main(String[] args) {
		

		IFigura Figuras[] = new IFigura[5];
		Figuras [0] = new Circulo(1.0);
		Figuras [1] = new Triangulo(1.0, 2.0, 1.0, 1.0, 1.0);
		Figuras [2] = new Circulo(2.0);
		Figuras [3] = new Triangulo(2.0, 3.0, 4.0, 4.0, 4.0);
		Figuras [4] = new Circulo(10.0);
		
		for (IFigura i: Figuras) {
			i.calculaArea();
			i.calculaPerimetro();
			System.out.println(i.getNombre());
			System.out.println(i.getArea());
			System.out.println(i.getPerimetro());
			System.out.println();
		}
		
	}

}
