package Collections.List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {

    public static void main (String args []){

        List<Gatos> gatosList = new ArrayList<>(){{
            add(new Gatos("Tasha",14,"preto"));
            add(new Gatos("Tasha",4,"Caramelo"));
            add(new Gatos("Tashinha",10,"Branco"));
        }};

        System.out.println(gatosList); // Lista normal com ordem de inserção
        Collections.shuffle(gatosList); // Ordem aleatória
        System.out.println(gatosList);
        Collections.sort(gatosList);//Ordem natural de acordo com os nomes - > CopareTo
        System.out.println("Lista comparando o nome pela classe Comparable - metodo CompareTo " +gatosList);
        //Collections.sort(gatosList, new ComparatorIdade());
        gatosList.sort(new ComparatorIdade()); //Outra forma de comparar sem Collections
        System.out.println("Lista comparando a idade pela classe Comparator - metodo Compare" + gatosList);
        gatosList.sort(new ComparatorCor());
        System.out.println("Lista comparando a cor pela classe Comparator - metodo Compare" + gatosList);
        gatosList.sort(new ComparatorNomeCorIdade());
        System.out.println("Lista comparando Nome , Cor e Idade " + gatosList);




    }

}

class Gatos implements Comparable<Gatos > {
    private String nome;
    private Integer idade;
    private String cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Gatos(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gatos{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gatos gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome()); // Usa o this pq está na mesma classe
        /* Retorno = 0 - > Possuem o mesmo nome
        retorno = 1 - > Nome é maior que o nome sendo comparado
        retorno = -1 - > Nome é menor que o nome sendo comparado
         */
    }
}

class ComparatorIdade implements Comparator<Gatos>{ // Classe que implementa Comparator para a idade

    @Override
    public int compare(Gatos g1, Gatos g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade()); //
    }
}

class ComparatorCor implements Comparator<Gatos>{

    @Override
    public int compare(Gatos g1, Gatos g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gatos>{

    @Override
    public int compare(Gatos g1, Gatos g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome; // 0 - > quando são iguais

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}

