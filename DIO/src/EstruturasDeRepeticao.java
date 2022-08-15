import java.util.Random;
import java.util.Scanner;

public class EstruturasDeRepeticao {
	
	public static void main (String [] args) {
		whileNomeIdade();
		whileNota();
		MaiorMedia();
		imparPar();
		tabuada();
		fatorial();
		ordemInversaArrays();
		consoante();
		numeros();
		numerosAleatorios();
	}

	public static void whileNomeIdade() {
		String nomeIdade = "";
		Scanner scan = new Scanner(System.in);
		while (!nomeIdade.equals ("Bruna 24")) { // ! .equals - > para String
			System.out.println("Digite seu nome e sua idade");
			nomeIdade = scan.nextLine(); // Tem nextInt e nextLine -> para string)
		}
	}
		
	public static void whileNota() {
		int nota = 0 ;
		Scanner scan = new Scanner(System.in);
		while (nota != 15 ) { 
			System.out.println("Digite uma nota de 0 a 10");
			nota = scan.nextInt();
		if(nota != 15) System.out.println("NOTA ERRADA, TENTAR NOVAMENTE");
	 }
	}
	
	public static void MaiorMedia() {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int count = 0; // Contador até 5
		int maior = 0;
		int soma = 0;
	
		do {
			System.out.println("Número: ");
			numero = scan.nextInt(); // nextLine - > String
			soma = soma + numero;
			
			if(numero > maior) maior = numero; // Se o numero inputado for maior que a variavel maior
			
			count = count +1; // Add 1 na variável count 
			
		} while(count < 5); // Começou em 0 ;
		
		System.out.println("Maior:  " + maior); // Contar todas as vezes 
		System.out.println("Média: " + (soma/5));
		
	}
	
	public static void imparPar() {
		Scanner scan = new Scanner(System.in);
		int quantNumero ;
		int count = 0;
		int numero;
		int quantPar = 0, quantImpar = 0;
		
		System.out.println("Quantidade de números: ");
		quantNumero = scan.nextInt();
		
		do {
			System.out.println("Numeros: ");
			numero = scan.nextInt();
			if(numero % 2 == 0) quantPar ++;
			else quantImpar ++;
			count ++ ; // count = count +1
		}while(count < quantNumero);
		
		System.out.println("Quantidade par: " + quantPar);
		System.out.println("Quantidade impar: " + quantImpar);
	}
	
	public static void tabuada() {
		Scanner scan = new Scanner(System.in);
		int tabuada;
		System.out.println("Tabuada de 0 a 10");
		tabuada = scan.nextInt();
		System.out.println("Tabuada do numero " + tabuada);
		for( int count = 0; count<=10 ;  count++) {
			System.out.println("Resultado : " + tabuada + "x" + count  +  " = " + (tabuada*count));		
		}	
		
	}
	
	public static void fatorial() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Fatorial de qual número ?");
		int fatorial = scan.nextInt();
		int multiplicacao = 1;
		for(int i = fatorial ; i >= 1; i --) {
			multiplicacao = multiplicacao * i;
			
		}
		
		System.out.println(fatorial + "!= " + multiplicacao);
	}
	
	public static void ordemInversaArrays() {
		//Faça um Programa que leia um vetor de 6 números inteiros e mostre-os na ordem inversa
		int numero [] = {1,2,3,4,5,6}; // 6
		int count = 0;
		System.out.print("Vetor: ");
		while(count< numero.length) {
			System.out.print(numero[count]+ " ");
			count++ ;		
		}
		System.out.print("\nVetor: ");
		for(int i = numero.length-1; i >= 0 ; i--) {
			System.out.print(numero[i]+ " "); 
		}	
		
	}
	
	public static void consoante() { 
		Scanner scan = new Scanner(System.in);
		String caractere [] = new String [3];
		
		int count = 0;
		int quantidadeConsoantes = 0;
		
		do {
			System.out.println("Digite uma letra : ");
			String letra = scan.next();
			if(!(letra.equalsIgnoreCase ("A")|	
			    letra.equalsIgnoreCase ("E")|	
			    letra.equalsIgnoreCase ("I")|
			    letra.equalsIgnoreCase ("O")|
			    letra.equalsIgnoreCase ("U")) ) {
				caractere[count] = letra;
				quantidadeConsoantes ++;
			}
			
			count ++;
				
		}while (count < caractere.length);
		
		System.out.println("Quantidade de consoantes " + quantidadeConsoantes);
		System.out.print("Possições do array : ");
	
		for(String consoantes : caractere) { //For each - criar nova variável com tipo 
			if(consoantes != null)
			System.out.print(consoantes + " ");
		}
	}
	
	public static void numeros() {
		Scanner scan = new Scanner (System.in);
		int numeros [] = new int [3];
		int count = 0 ;
		
		
		do {
			System.out.println("Digite numeros de 0 a 100");
			int numero = scan.nextInt();
			if(numero <= 100) {
				numeros[count] = numero;
			} else continue ;// System.out.println("Números devem ser de 0 a 100"); 
			
			count++;
			
		}while(count < numeros.length);
		
		System.out.print("Possições do array : ");
		for(int numbers : numeros ) {
			System.out.print(numbers + " " );
		}
	}
	
	public static void numerosAleatorios() {
		Random random = new Random();
		int [] numeros = new int [20];
		
		
		for(int i = 0 ; i < numeros.length; i++) {
			int numero = random.nextInt(100); // Limite do número aleatório
			numeros [i] = numero;
		}
		
		System.out.print("Possições do array : ");
		for(int numbers : numeros) {
			System.out.print(numbers + " " );
		}
		
		System.out.print("\nSucessores do array : "); 
		for(int numbers : numeros) {
			System.out.print((numbers + 1 ) + " " );
		}
		
		System.out.print("\nAntecessores do array : "); 
		for(int numbers : numeros) {
			System.out.print((numbers - 1 ) + " " );
		}
	}

	
	
	
}
