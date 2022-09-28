package Collections.List;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemplosList {

    public static void main (String args []){

        List<Double> notas = new ArrayList<>();
        notas.add(2d);
        notas.add(3d);
        notas.add(8d);
        notas.add(3d);
        notas.add(9d);
        notas.add(7d);
        notas.add(9d);

        System.out.println(notas); // Imprimir a lista inteira
        System.out.println(notas.toString()); //Imprimi a lista inteira também
        System.out.println(notas.get(0)); // Imprimir a posição 0
        System.out.println(notas.indexOf(2d)); // Posição da nota 2d
        System.out.println(notas.size());
        notas.add(0,5d); //Add o numero 3d no posição 0
        System.out.println(notas);
        System.out.println(notas.size());
        notas.set(notas.indexOf(3d),6d); //Substitui a posição que contém 3d por 6d
        System.out.println(notas);
        System.out.println(notas.contains(5d)); // Retorna true or false - contém ou não o elemento
        for(Double nota : notas) System.out.println(nota); // Passa pela lista
        System.out.println(Collections.min(notas));//Imprimi a menor nota da lista
        System.out.println(Collections.max(notas));//Imprimi a maior nota da lista
        Iterator<Double> iterator = notas.iterator();//Soma dos valores :
        Double soma = 0d; // Inicializa a variável soma
        while(iterator.hasNext()){ // equanto o iterator tem próximo
            Double next = iterator.next(); // pega o próximo iterator
            soma += next; // soma = soma + next = soma = 0+5 = 5 - > 5+2 = 7 - > 7+6 = 13
        }

        System.out.println(soma);

        System.out.println(soma/notas.size()); //Média das notas
        notas.remove(0); //remove a posição
        notas.remove(2d); // remove o objeto
        System.out.println(notas);
        Iterator<Double> iterator1 = notas.iterator(); // Remove elementos menor que 7
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next<7)iterator1.remove();
        }
        System.out.println(notas);
        notas.clear(); // Apaga a lista toda
        System.out.println(notas.isEmpty()); // Retorna true or false se está vazio ou não



    }
}
