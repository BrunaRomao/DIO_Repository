// Exemplo de sobrecarga com m�todo void

public class SobrecargaVoid {
	
	public static void main (String [] args) {
		
		areaQuadrilateros(12,12);
		areaQuadrilateros(13,17);
		areaQuadrilateros(10,8,12);
	
	}
	
	public static void areaQuadrilateros(double alturaQuadrado,double baseQuadrado ) {
		double quadrado;
		quadrado = alturaQuadrado*baseQuadrado;
		System.out.println("A �rea do quadrado � " + quadrado);
	}
	
	public static void areaQuadrilateros(double alturaTriangulo,int baseTriangulo ) {
		double triangulo;
		triangulo = alturaTriangulo*baseTriangulo;
		System.out.println("A �rea do quadrado � " + triangulo);
	}
	
	public static void areaQuadrilateros(double baseMaior, double baseMenor, double altura) {
		double trapezio;
		double trapezioSoma;
		trapezioSoma = baseMaior + baseMenor;
		trapezio = trapezioSoma/2;
		System.out.println("A �rea do quadrado � " + trapezio);
	}

	
	

}
