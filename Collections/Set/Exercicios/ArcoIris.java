package Collections.Set.Exercicios;

import java.util.*;

public class ArcoIris {

    public static void main (String args []){
        System.out.println("**Imprima as cores do arco iris uma em baixo da outra**");
        Set<String> cores = new HashSet<>();
            cores.add("vermelho");
            cores.add("laranja");
            cores.add("amarelo");
            cores.add("verde");
            cores.add("azul");
            cores.add("azulEscuro");
            cores.add("violeta");
            for(String cor: cores) System.out.println(cor);


        System.out.println("**Quantidade de cores do arco iris** : " + cores.size() );

        System.out.println("Exiba as cores em ordem alfabética**");
        Set<String> cores1 = new TreeSet<>(cores);
        for(String cor: cores1) System.out.println(cor);

        System.out.println("**Exiba as cores na ordem inversa em que foi informada**");
        Set<String> cores2 = new LinkedHashSet<>(
                Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "azulEscuro", "violeta"));
       List<String> coresInversas = new ArrayList<>(cores2);
       Collections.reverse(coresInversas);
       for(String cor: coresInversas) System.out.println(cor);


        System.out.println("**Exiba todas as cores que começam com a letra 'V' **");
        for (String cor : cores){
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("**Remova todas as cores que começam com a letra 'v'**");
        Iterator<String> iterator = cores.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(cores);

        System.out.println("** Limpe o conjunto**");
        cores.clear();
        System.out.println("** Verifique se está limpo** " +  cores.isEmpty());







    }
}








