package src;
import java.util.*;
public class Circulo{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		float radio;
		System.out.print("Ingrese el radio del circulo: ");
		radio=scanner.nextInt();
		Circulo circ=new Circulo(radio);
		circ.area();
		circ.perimetro();
		System.out.println("El perimetro es: "+circ.perimetro());
		System.out.println("El area es: "+circ.area());
	}

	private float radio;
	private float area;
	private float perimetro;

	public void setRadio(float radio){
		this.radio=radio;
	}

	public float getRadio(){
		return radio;
	}

	public Circulo(float radio){
		this.radio=radio;
	}

	public float area(){
		area=(float)(Math.PI*(Math.pow(radio,2)));
		return area;
	}

	public float perimetro(){
		perimetro=(float)(2*Math.PI*radio);
		return perimetro;
	}

}