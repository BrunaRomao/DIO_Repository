package Collections.Set.Exercicios;

import Collections.Set.Series;

import java.util.*;

public class LinguagemFavorita {

    public static void main (String args []){
        Set<Linguagens> programacao = new LinkedHashSet<>(){{
            add(new Linguagens("python",1992,"IDLEpython"));
            add(new Linguagens("ruby",1992,"IDERuby"));
            add(new Linguagens("java",1985,"inteliJ"));

        }};

        System.out.print("**Ordem de insercao**: ");
        System.out.println(programacao);
        for(Linguagens linguagens: programacao) System.out.println(linguagens.getNome() + "-" + linguagens.getAnoDeCriacao() + "-" + linguagens.getIde());

        System.out.print("**Ordem natural (nome)**: ");
        Set<Linguagens> programacao1 = new TreeSet<>(programacao); // Recebe a lista anterior usando Comparable
        for(Linguagens linguagens: programacao1) System.out.println(linguagens.getNome() + "-" + linguagens.getAnoDeCriacao() + "-" + linguagens.getIde());

        System.out.println("**Ordem natural (IDE)**: ");
        Set<Linguagens> programacao3 = new TreeSet<>(new ComparaIde()); // Comparator (Nova Classe)
        programacao3.addAll(programacao);
        for(Linguagens linguagens: programacao3) System.out.println(linguagens.getNome() + "-" + linguagens.getAnoDeCriacao() + "-" + linguagens.getIde());

        System.out.println("**Ordem natural (Ano , IDE)**: "); // Comparator (Nova Classe)
        Set<Linguagens> programacao4 = new TreeSet<>(new ComparaAnoNome());
        programacao4.addAll(programacao);
        for(Linguagens linguagens: programacao4) System.out.println(linguagens.getNome() + "-" + linguagens.getAnoDeCriacao() + "-" + linguagens.getIde());

        System.out.println("**Ordem natural (Nome , Ano, IDE)**: "); // Comparator (Nova Classe)
        Set<Linguagens> programacao5 = new TreeSet<>(new ComparaNomeAnoIde());
        programacao5.addAll(programacao);
        for (Linguagens linguagens: programacao5) System.out.println(linguagens.getNome() + "-" + linguagens.getAnoDeCriacao() + "-" + linguagens.getIde());





    }

}

class Linguagens implements Comparable<Linguagens>  {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    public Linguagens(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public int compareTo(Linguagens linguagens) {
        int nome = getNome().compareToIgnoreCase(linguagens.getNome());
        if(nome != 1 ); // = 0 -> diferentes 1 -> iguais -1 - > menor que o nome sendo comparado
        return nome;
    }

    }

class ComparaIde implements Comparator<Linguagens>{

    @Override
    public int compare(Linguagens ide1, Linguagens ide2) {
        int ide = ide1.getIde().compareToIgnoreCase(ide2.getIde());
        if(ide != 0);
        return ide;
    }
}

class ComparaAnoNome implements Comparator<Linguagens>{

    @Override
    public int compare(Linguagens o1, Linguagens o2) {
        int ano = Integer.compare(o1.getAnoDeCriacao(),o2.getAnoDeCriacao());
        if(ano!= 0) return ano;

        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if(nome!= 0);
        return nome;
    }
}

class ComparaNomeAnoIde implements Comparator<Linguagens>{

    @Override
    public int compare(Linguagens o1, Linguagens o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0 ) return nome;

        int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (ano != 0) return ano;

        int ide = o1.getIde().compareToIgnoreCase(o2.getIde());
        if (ide != 0);
        return ide;
    }
}
