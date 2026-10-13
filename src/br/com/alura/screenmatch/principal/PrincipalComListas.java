package br.com.alura.screenmatch.principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        
        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(filme);
        lista.add(outroFilme);
        lista.add(serie);
        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Filme novoFilme && novoFilme.getClassificacao() > 2){
                System.out.println("Classificacao: " + novoFilme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Paulo");
        buscaPorArtistas.add("Jacqueline");
        System.out.println(buscaPorArtistas);
        Collections.sort(buscaPorArtistas);
        System.out.println("Depois da Ordenação");
        System.out.println(buscaPorArtistas);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano:");
        System.out.println(lista);
    }
}
