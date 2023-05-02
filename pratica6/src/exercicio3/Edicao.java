package exercicio3;

import java.util.ArrayList;

// Classe Edicao
public class Edicao {
    private int numero;
    private int volume;
    private String dataEdicao;
    private int tiragem;
    private ArrayList<Artigo> artigos;

    public Edicao(int numero, int volume, String dataEdicao, int tiragem) {
        this.numero = numero;
        this.volume = volume;
        this.dataEdicao = dataEdicao;
        this.tiragem = tiragem;
        this.artigos = new ArrayList<>();
    }

    public void adicionaArtigo(Artigo artigo) {
        artigos.add(artigo);
    }

}
