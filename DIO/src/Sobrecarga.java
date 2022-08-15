// Exemplo de sobrecarga 

public class Sobrecarga {
	
	public static double areaQuadrilateros(double alturaQuadrado,double baseQuadrado ) {
		double quadrado;
		quadrado = alturaQuadrado*baseQuadrado;
		return quadrado;
	}
	
	public static double areaQuadrilateros(double alturaTriangulo,int baseTriangulo ) {
		double triangulo;
		triangulo = alturaTriangulo*baseTriangulo;
		return triangulo;
	}
	
	public static double areaQuadrilateros(double baseMaior, double baseMenor, double altura) {
		double trapezio;
		double trapezioSoma;
		trapezioSoma = baseMaior + baseMenor;
		trapezio = trapezioSoma/2;
		return trapezio;
	}

	
	
	public static void main (String [] args) {
		
		System.out.println("A área do quadrado é " + areaQuadrilateros(12,12));	
		System.out.println("A área do triângulo é " + areaQuadrilateros(13,17));
		System.out.println("A área do trapézio é " + areaQuadrilateros(10,8,12));
		
	}

	
}
