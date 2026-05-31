package br.com.alura.screenmatch.principal;
import java.util.ArrayList;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme = new Filme("O poderoso chefão",1978);
        filme.rate(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        filme.rate(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filme.rate(10);
        Serie serie = new Serie("Lost", 2000);
        
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(filme);
        lista.add(outroFilme);
        lista.add(serie);
        for (Titulo item : lista) {
            System.out.println(item);
            Filme novoFilme = (Filme) item;
            System.out.println("Classificacao: " + novoFilme.getClassificacao());
        }
    }
}
