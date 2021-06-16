package src;
public class Principal{
	public static void main(String[] args) {
		Principal p=new Principal();
	}

	public Principal(){
		// Ejercicio 1
		System.out.println("Contador: ");
		Contador1 cont=new Contador1(5);
		Contador1 con2=cont;
		con2.setNumero(8);
		System.out.println("Contador: ");
		cont.mostrarContador();	

		// Ejercicio 2
		System.out.println("\nCuadrado: ");
		Cuadrado c1=new Cuadrado(10);
		Cuadrado c2=c1;
		c2.setLado(8);
		System.out.println("Perimetro: "+c1.perimetro());
		System.out.println("Area: "+c1.area());

		//Ejercicio3
		System.out.print("\nCirculo: ");
		Circulo circ1=new Circulo(5);
		Circulo circ2=circ1;
		circ2.setRadio(9);
		System.out.println("El perimetro es: "+circ1.perimetro());
		System.out.println("El area es: "+circ1.area());

		//Ejercicio 4
		System.out.println("\nRectangulo: ");
		Rectangulo r1=new Rectangulo(4,5);
		Rectangulo r2=r1;
		r2.setAncho(12);
		r2.setAlto(9);
		System.out.println("Perimetro: "+r1.calcularPerimetro());
		System.out.println("Area: "+r1.calcularArea());

		// Ejercicio 6 
		System.out.println("\nLibro: ");
		Libro lb1=new Libro("EL zorro","Guillermo",5,1);
		Libro lb2=lb1;
		lb2.setNombre("Don quijote de la mancha");
		lb1.mostrarDatos();

		// Ejercicio 7
		System.out.println("\nFraccion: ");
		Fraccion f1=new Fraccion(9,5,10,12);
		Fraccion f2=f1;
		f2.setDenom1(24);
		f1.suma();
		f1.resta();
		f1.multiplicacion();
		f1.division();
		System.out.println("Multiplicacion: "+f1.getNumer1()+"/"+f1.getDenom1()+"*"+f1.getNumer2()+"/"+f1.getDenom2()+"="+f1.getNumeradorMultiplicacion()+"/"+f1.getDenomMultiplicacion());
		System.out.println("Division: "+f1.getNumer1()+"/"+f1.getDenom1()+"÷"+f1.getNumer2()+"/"+f1.getDenom2()+"="+f1.getNumeradorDivision()+"/"+f1.getDenomDivision());
		System.out.println("Suma: "+f1.getNumer1()+"/"+f1.getDenom1()+"+"+f1.getNumer2()+"/"+f1.getDenom2()+"="+f1.getNumeradorSuma()+"/"+f1.getDenomSuma());
		System.out.println("Resta: "+f1.getNumer1()+"/"+f1.getDenom1()+"-"+f1.getNumer2()+"/"+f1.getDenom2()+"="+f1.getNumeradorResta()+"/"+f1.getDenomResta());
	}




}