package src;
import java.util.*;
public class Fraccion{
	private int numer1;
	private int numer2;
	private int denom1;
	private int denom2;
	private int denomSuma;
	private int denomResta;
	private int denomMultiplicacion;
	private int denomDivision;
	private int numeradorResta;
	private int numeradorMultiplicacion;
	private int numeradorDivision;
	private int numeradorSuma;

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int numerador1;
		int denominador1;
		int numerador2;
		int denominador2;
		System.out.println("Primera Fraccion");
		System.out.print("Numerador: ");
		numerador1=scanner.nextInt();
		System.out.print("Denominador: ");
		denominador1=scanner.nextInt();
		System.out.println("Segunda Fraccion");
		System.out.print("Numerador: ");
		numerador2=scanner.nextInt();
		System.out.print("Denominador: ");
		denominador2=scanner.nextInt();
		Fraccion f=new Fraccion(numerador1,denominador1,numerador2,denominador2);
		f.multiplicacion();
		f.division();
		f.suma();
		f.resta();
		System.out.println("Multiplicacion: "+f.getNumer1()+"/"+f.getDenom1()+"*"+f.getNumer2()+"/"+f.getDenom2()+"="+f.getNumeradorMultiplicacion()+"/"+f.getDenomMultiplicacion());
		System.out.println("Division: "+f.getNumer1()+"/"+f.getDenom1()+"÷"+f.getNumer2()+"/"+f.getDenom2()+"="+f.getNumeradorDivision()+"/"+f.getDenomDivision());
		System.out.println("Suma: "+f.getNumer1()+"/"+f.getDenom1()+"+"+f.getNumer2()+"/"+f.getDenom2()+"="+f.getNumeradorSuma()+"/"+f.getDenomSuma());
		System.out.println("Resta: "+f.getNumer1()+"/"+f.getDenom1()+"-"+f.getNumer2()+"/"+f.getDenom2()+"="+f.getNumeradorResta()+"/"+f.getDenomResta());
	}

	public Fraccion(int n1,int d1, int n2, int d2){
		this.numer1=n1;
		this.setDenom1(d1);
		this.numer2=n2;
		this.setDenom2(d2);
	}

	public void setNumer1(int numer1){
		this.numer1=numer1;
	}
	

	public void setNumer2(int numer2){
		this.numer2=numer2;
	}

	public void setDenom1(int denom1){
		if (denom1==0) {
			System.out.println("El denominador no  puede ser 0");
		} else {
			this.denom1=denom1;	
		}
	}

	public void setDenom2(int denom2){
		if (denom2==0) {
			System.out.println("El denominador no  puede ser 0");	
		} else {
			this.denom2=denom2;
		}
	}

	public int getNumer1(){
		return numer1;
	}

	public int getNumer2(){
		return numer2;
	}

	public int getDenom1(){
		return denom1;
	}

	public int getDenom2(){
		return denom2;
	}

	public int getDenomSuma(){
		return denomSuma;
	}

	public int getNumeradorSuma(){
		return numeradorSuma;
	}

	public int getNumeradorResta(){
		return numeradorResta;
	}
	

	public int getDenomResta(){
		return denomResta;
	}

	public int getNumeradorDivision(){
		return numeradorDivision;
	}

	public int getNumeradorMultiplicacion(){
		return numeradorMultiplicacion;
	}

	public int getDenomMultiplicacion(){
		return denomMultiplicacion;
	}

	public int getDenomDivision(){
		return denomDivision;
	}


	public void suma(){
		numeradorSuma=numer1+numer2;
		denomSuma=denom1*denom2;
	}

	public void resta(){
		numeradorResta=numer1-numer2;
		denomResta=denom1*denom2;
	}

	public void multiplicacion(){
		numeradorMultiplicacion=numer1*numer2;
		denomMultiplicacion=denom1*denom2;
	}

	public void division(){
		numeradorDivision=numer1*denom2;
		denomDivision=numer2*denom1;
	}


}