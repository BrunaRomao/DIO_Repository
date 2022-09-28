package Collections.Set;

//Crie um conjunto e ordene este conjunto exibindo - > nome, genero, tempo de episodio

import java.util.*;

public class ExemplosOrdenacaoSet {
    public static void main (String args []){
        System.out.println("**Ordem aleatoria**");
        Set<Series> series = new HashSet<>(){{
            add(new Series("friends","comedia",60));
            add(new Series("friends","comedia",50));
            add(new Series("witcher","terror",50));
        }};
        //System.out.println(series);//Também pode ser assim
        for (Series serie: series) System.out.println(serie.getNome() + "-" + serie.getGenero() +  "-"
                + serie.getDuracao());

        System.out.println("**Ordem de insercao**");
        Set<Series> series1 = new LinkedHashSet<>(){{
            add(new Series("friends","comedia",20));
            add(new Series("vampire", "drama", 50));
            add(new Series("witcher","terror",50));
        }};
        //System.out.println(series1);//Também pode ser assim
        for(Series seriess:series1) System.out.println(seriess.getNome() + "-" + seriess.getGenero() +  "-"
                + seriess.getDuracao());

        System.out.println("**Ordem natural - tempo de episódio**");
        Set<Series> series2 = new TreeSet<>(series1); // Implementar Comparable com o método compareTo
        for(Series series3 : series2) System.out.println(series3.getNome() + "-" + series3.getGenero() +  "-"
                + series3.getDuracao());

        System.out.println("Ordem Nome/Genero/Duracao");
        Set<Series> series3 = new TreeSet<>(new NomeGeneroDuracao());
        series3.addAll(series);// Adiciona todos os elementos da collection series
        for(Series series4 : series3) System.out.println(series4.getNome() + "-" + series4.getGenero() +  "-"
                + series4.getDuracao());

    }

}

class NomeGeneroDuracao implements Comparator<Series>{

    @Override
    public int compare(Series o1, Series o2) {
        int nome =o1.getNome().compareToIgnoreCase(o2.getNome());
        if(nome != 0) return nome;

        int genero = o1.getGenero().compareToIgnoreCase(o2.getGenero());
        if(genero!=0) return genero;

        return Integer.compare(o1.getDuracao(),o2.getDuracao());
    }
}

