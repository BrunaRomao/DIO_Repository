package Collections.List.Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crime {
    public static void main (String arg []){
        Scanner scanner = new Scanner(System.in);
        List<Integer> respostas = new ArrayList<>();
        int count = 0;
        while(count<=4){
            if(count == 0){
                System.out.println("Telefonou para a vitima? Responda 1 para 'Sim' e 2 para 'Nao'");
            }
            if (count ==1){
                System.out.println("Esteve no local do crime?Responda 1 para 'Sim' e 2 para 'Nao'");
            }
            if(count == 2){
                System.out.println("Mora perto da vitima?Responda 1 para 'Sim' e 2 para 'Nao'");
            }
            if(count == 3){
                System.out.println("Devia para a vitima?Responda 1 para 'Sim' e 2 para 'Nao'");
            }
            if (count == 4){
                System.out.println("Ja trabalhou com a vitimaResponda 1 para 'Sim' e 2 para 'Nao'?");
            }

            respostas.add(scanner.nextInt());
            count++;
        }

        System.out.println(respostas);

        int countSim = 0;
        for (int i = 0; i<= respostas.size() -1; i++){//Nao tem posicao 5 (-1)
            if(respostas.get(i) == 1){
                countSim++;
            }
        }

        if(countSim == 2){
            System.out.println("Classificação : Suspeita");
        }
        if(countSim == 3 || countSim == 4){
            System.out.println("Classificação : Cumplice");
        }
        if (countSim == 5){
            System.out.println("Classificação : Assasina");
        }
        if(countSim == 1){
            System.out.println("Classificação : Inocente");
        }



    }
}
