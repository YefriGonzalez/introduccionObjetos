package src;
import java.util.*;

public class Contador1{
	
	private int contador;
	private int numero;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int numero;
		Contador1 c1=new Contador1();
		System.out.print("Ingrese el numero: ");
		numero=scanner.nextInt();
		Contador1 c2=new Contador1(numero);
		c2.mostrarContador();
	}

	public Contador1(){
		this.contador=0;
	}	

	public Contador1(int numero){
		this.contador=0;
		this.numero=numero;
		
	}

	public Contador1(Contador1 c){
		this.numero=c.getNumero();
	}

	public void setNumero(int numero){
		this.numero=numero;
	}

	public int getNumero(){
		return numero;
	}

	public void incrementarContador(){
		for (int i=0;i<numero;i++ ) {
			contador+=1;
			System.out.print(""+contador+",   ");
		}
		System.out.println("");
	}

	public void decrementarContador(){
		for (int i=numero;i<0;i++) {
			contador-=1;
			System.out.print(""+contador+",  ");
		}
		System.out.println("");
	}

	public void mostrarContador(){
		if (numero<0) {
			decrementarContador();
		} else {
			incrementarContador();
		}		
	}



}