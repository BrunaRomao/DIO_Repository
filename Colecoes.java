import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Colecoes {

    public static void main(String args []) {
        listaLetras();
        listaNumeros();

    }

    public static void listaLetras(){
        List <String> list = new ArrayList<>();
        list.add("Guilherme");
        list.add("Bruna");
        Collections.sort(list); // Ordenar lista
        System.out.println(list);
    }

    public static void listaNumeros(){
        List <Integer> numeros = new ArrayList<>();
        numeros.add(24);
        numeros.add(3);
        Collections.sort(numeros); // Funciona para numeros e letras.
        System.out.println(numeros);
    }



}
