package exercicio1;

import java.util.ArrayList;

// Classe Principal
public class Principal {
    public static void main(String[] args) {
        
        RedeSocial redeSocial = new RedeSocial("01/01/2010", "usuario", "20/04/1990", "senha123");
        Publicacao publi1 = new Publicacao("02/05/2023", "Primeira publicação", "http://link.midia.com");
        Publicacao publi2 = new Publicacao("03/05/2023", "Segunda publicação", "http://link2.midia.com");

        redeSocial.inserePublicacao(publi1);
        redeSocial.inserePublicacao(publi2);
        redeSocial.imprimePublicacoes();
    }
}
