package exercicio3;

import java.util.ArrayList;

// Classe Main
public class Main {
    public static void main(String[] args) {
        // Criar um ArrayList de 10 objetos da classe Artigos
        ArrayList<Artigo> artigos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            artigos.add(new Artigo("Artigo " + i, "Resumo do Artigo " + i, "Autor " + i));
        }

        // Criar um objeto do tipo Edicao e adicionar todos os artigos
        Edicao edicao = new Edicao(1, 1, "01/01/2023", 1000);
        for (Artigo artigo : artigos) {
            edicao.adicionaArtigo(artigo);
        }

        // Criar uma Revista Científica e adicionar a Edição
        RevistaCientifica revista = new RevistaCientifica("Revista Científica Exemplo", 1234567890L, "Mensal");
        revista.adicionaEdicao(edicao);
    }
}
