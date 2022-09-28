package Collections.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExemplosMap {
    public static void main(String args[]) {

        System.out.println("**Crie um dicionario que relacione os modelos e seus respectivos consumos**");
        Map<String, Double> carrosPop = new HashMap<>() {{
            put("gol",14.5);
            put("mobi",15.6);
            put("uno",16.1);
            put("hb20",16.1);
            put("kwid",15.6);
        }};
        System.out.println(carrosPop.toString());

        System.out.println("**Substitua o consumo do gol por 15,2 km/l**");
        carrosPop.put("gol",15.2);
        System.out.println(carrosPop.toString());

        System.out.println("**Confira se o modelo tucson esta no dicionario: " + carrosPop.containsKey("tucson"));

        System.out.println("**Exiba o consumo do uno :" + carrosPop.get("uno"));

        System.out.println("**Exiba os modelos**");
        Set<String> modelos = carrosPop.keySet();
        System.out.println(modelos); // Retorna um Set <>

        System.out.println("**Exiba os consumos**");
        System.out.println(carrosPop.values()); // Retorna uma Collections

        System.out.println("**Exiba o modelo mais economico e seu consumo **");
        Double consumoMaisEficiente = Collections.max(carrosPop.values());
        Set<Map.Entry<String, Double>> entries = carrosPop.entrySet();//retorna um set e elementos do tipo set
        String modeloMaisEficiente = "";
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("**Modelo mais eficiente: " + modeloMaisEficiente + " " + consumoMaisEficiente);
            }

        }




    }

}
