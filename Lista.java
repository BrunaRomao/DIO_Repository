import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Lista{

    public static void main (String args []){

        listas();

    }

    public static void listas(){

        List<Aluno> list = new ArrayList<Aluno>();

        Aluno a = new Aluno("Guilherme" , "Economia", 9);
        Aluno b = new Aluno("Bruna","engenharia de software", 10 );
        Aluno c = new Aluno ("Tasha", "Agronomia", 5);

        list.add(a);
        list.add(b);
        list.add(c);
        //System.out.println("**Lista sem ordem**" + list);
        Collections.sort(list); // Comparable já ordena as variáveis da lista
        System.out.println("**Lista com ordem**" + list);

        ComparaNota comparaNota = new ComparaNota();
        Collections.sort(list,comparaNota); // Uso de Implements Compare para comparar variaveis de outros conjuntos
        System.out.println("**Compara Nota**" + list);








    }


}