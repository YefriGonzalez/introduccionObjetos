package src;
import java.util.*;

public class Cuadrado{
	
	private double lado;
	private double area;
	private double perimetro;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double lado;
		System.out.print("Ingrese el lado del cuadrado: ");
		lado=scanner.nextInt();
		Cuadrado cuadrado=new Cuadrado(lado);
		System.out.println("Perimetro: "+cuadrado.perimetro());
		System.out.println("Area: "+cuadrado.area());
	}

	
	public Cuadrado(double lado){
		this.lado=lado;
	}

	public void setLado(double lado){
		this.lado=lado;
	}

	public double getLado(){
		return lado;
	}

	public double area(){
		area=Math.pow(lado,2);
		return area;
	}

	public double perimetro(){
		perimetro=4*lado;
		return perimetro;
	}

	
}