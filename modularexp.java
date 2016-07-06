//Algoritmo para calcular exponenciação modular
/**
* @author Marcos Vinicius dos Santos Sombra
* @author Antônio Victor Figueiredo Porto
**/

// imports
import java.util.Scanner;
import java.lang.*;
// class modularexp
class modularexp {
	// metodo main
	public static void main(String[] args){
		//criação do objeto scanner
		Scanner scanner = new Scanner(System.in);
		//declaração de variaveis
		double b, e1, e2, mod, result;
		e1 = 1;
		// lê o valor da base
		System.out.println("Insira o valor da base (Apenas inteiros):");
		b = scanner.nextDouble();
		// lê o valor do expoente
		System.out.println("Insira o valor do expoente (Apenas inteiros):");
		e2 = scanner.nextDouble();
		// lê o valor do módulo
		System.out.println("Insira o valor do módulo (Apenas inteiros):");
		mod = scanner.nextDouble();
		result = (Math.pow(b, e2)) % mod;
		System.out.println(result);
			
	}
}
