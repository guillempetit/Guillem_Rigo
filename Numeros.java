import java.io.*;

public class Numeros {
	public static void main(String[] args) {
	int n1,n2;
	System.out.print("Introduce un número: ");
	n1=Entrada.entero();
		System.out.print("Introduce otro número: ");
	n2=Entrada.entero();
	if(n1==n2)
	System.out.println("Son iguales");
	else
	System.out.println("No son iguales");
	}
}

