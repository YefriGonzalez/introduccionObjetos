package src;
import java.util.*;

public class Rectangulo{

	private double ancho;
	private double alto;
	private double area;
	private double perimetro;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double ancho;
		double altura;
		System.out.print("Ingrese la altura: ");
		altura=scanner.nextInt();
		System.out.print("Ingres el ancho: ");
		ancho=scanner.nextInt();
		Rectangulo rec=new Rectangulo(ancho,altura);
		System.out.println("El Área es: "+rec.calcularArea()+" U²");
		System.out.println("El Perimetro es: "+rec.calcularPerimetro()+" U");			
		
	}


	public Rectangulo(double ancho, double alto){
		this.ancho=ancho;
		this.alto=alto;
	}

	public void setAncho(double ancho){
		this.ancho=ancho;
	}

	public double getAncho(){
		return ancho;
	}

	public void setAlto(double alto){
		this.alto=alto;
	}

	public double getAlto(){
		return alto;
	}


	public double calcularArea(){
		if (ancho!=alto) {
			area=ancho*alto;	
		} else {
			System.out.println("Error, altura y ancho no puede ser iguales");
			area=0;
		}
		return area;
	}

	public double calcularPerimetro(){
		if (ancho!=alto) {
			perimetro=2*alto+2*ancho;
		} else {
			System.out.println("Error, altura y ancho no puede ser iguales");
			perimetro=0;
		}
		return perimetro;
	}
	
}
