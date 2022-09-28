package Collections.List.Exercicios;

import java.util.*;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

class Temperatura {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        int count = 0;
        while (true) { // enquanto houver entradas
            if (count == 6) break;

            System.out.println("Digite a temperatura");
            temperaturas.add(scanner.nextDouble());
            count++;
        }
        System.out.println("Lista de temperaturas" + temperaturas);

        // Soma e média

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double proximo = iterator.next();
            soma += proximo;
        }
        System.out.println("Tamanho da lista: " + temperaturas.size());

        System.out.println("Soma das temperaturas: " + soma);


        Double media = soma / temperaturas.size();

        System.out.println("Medias das 6 temperaturas = " + media);

        System.out.println("Temperaturas acima da media: ");
        for (int i = 0; i <= temperaturas.size(); i++) {

                if (i == 0) {
                    if (temperaturas.get(0) > media) System.out.println("Janeiro: " + temperaturas.get(0));
                }
                if (i == 1) {
                    if (temperaturas.get(1) > media) System.out.println("Fevereiro: " + temperaturas.get(1));
                }
                if (i == 2) {
                    if (temperaturas.get(2) > media) System.out.println("Março: " + temperaturas.get(2));
                }
                if (i == 3) {
                    if (temperaturas.get(3) > media) System.out.println("Abril: " + temperaturas.get(3));
                }
                if (i == 4) {
                    if (temperaturas.get(4) > media) System.out.println("Maio: " + temperaturas.get(4));
                }
                if (i == 5) {
                    if (temperaturas.get(5) > media) System.out.println("Junho: " + temperaturas.get(5));
                }

        }
    }
}

