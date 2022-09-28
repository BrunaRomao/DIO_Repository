package Collections.Set;

import java.util.*;

public class ExemplosSet {
    public static void main (String args []){

        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,10d,4d,5d,7d)); //HashSet fica de forma aleatória
        System.out.println(notas.toString()); // toString imprime a mesma coisa que apenas notas.
        System.out.println("Confira se a nota 10 está no conjunto: " + notas.contains(10d)); // Bolleana
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d; //Varável de controle
        while (iterator.hasNext()){ // Enquanto houver próximo
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos elementos: " + soma);
        System.out.println("Média das notas: " + soma/notas.size());
        System.out.println("Remova a nota 5: ");
        notas.remove(5d);
        System.out.println(notas);
        System.out.println("Remova as notas menores que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next<7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Exiba as notas na ordem em que foram informadas (Apenas com LinkedHashSet)");
        // Para isso devemos usar LinkedHashSet

        Set<Double> notasLinked = new LinkedHashSet<>(Arrays.asList(7d,10d,4d,5d,7d));
        System.out.println(notasLinked);
        System.out.println("Exibir as notas em ordem crescente");
        Set<Double> notasTree = new TreeSet<>(notasLinked); //Notas linked é Double , logo implementa comparator
        System.out.println(notasTree);
        System.out.println("Apagar todo o conjunto");
        notas.clear();
        System.out.println("Conferir se está vazio: " + notas.isEmpty());







    }
}
