package Collections.Set;

import java.util.Objects;

public class Series implements Comparable <Series>{

    private String nome;
    private String genero;
    private Integer duracao;

    public Series(String nome, String genero, Integer duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public int compareTo(Series series) {
        int duracao = Integer.compare(this.getDuracao(),series.getDuracao());
        if(duracao != 0) return duracao;// 0 - > diferentes / 1 -> Iguais
        return this.getGenero().compareTo(series.getGenero());

    }
}
