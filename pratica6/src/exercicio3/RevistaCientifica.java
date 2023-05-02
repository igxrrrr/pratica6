package exercicio3;

import java.util.ArrayList;

public class RevistaCientifica {
    private String titulo;
    private long issn;
    private String peridiocidade;
    private ArrayList<Edicao> edicoes;

    public RevistaCientifica(String titulo, long issn, String peridiocidade) {
        this.titulo = titulo;
        this.issn = issn;
        this.peridiocidade = peridiocidade;
        this.edicoes = new ArrayList<>();
    }

    public void adicionaEdicao(Edicao edicao) {
        edicoes.add(edicao);
    }


}
