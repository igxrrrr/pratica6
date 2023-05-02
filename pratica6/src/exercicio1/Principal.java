package exercicio1;

import java.util.ArrayList;

// Classe Principal
public class Principal {
    public static void main(String[] args) {
        // Solicitar os dados de uma Rede Social e criar o objeto
        // Substitua os valores pelos solicitados com JOptionPane ou System.out.println()
        RedeSocial redeSocial = new RedeSocial("01/01/2010", "usuario", "20/04/1990", "senha123");

        // Criar dois ou mais objetos do tipo Publicacao
        // Substitua os valores pelos solicitados com JOptionPane ou System.out.println()
        Publicacao publi1 = new Publicacao("02/05/2023", "Primeira publicação", "http://link.midia.com");
        Publicacao publi2 = new Publicacao("03/05/2023", "Segunda publicação", "http://link2.midia.com");

        // Inserir os objetos do tipo Publicacao na Rede Social
        redeSocial.inserePublicacao(publi1);
        redeSocial.inserePublicacao(publi2);

        // Chamar o imprimePublicacoes ao final
        redeSocial.imprimePublicacoes();
    }
}
