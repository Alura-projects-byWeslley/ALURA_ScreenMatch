package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
//////
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme("O poderoso chefão",1978);
        filme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: "+filme.getDuracaoEmMinutos());
        
        filme.showTechnical();
        filme.rate(8);
        filme.rate(5);
        filme.rate(10);
        System.out.println("Total de avalições: "+ filme.getTotalDeAvaliacoes());
        System.out.println(filme.getMedia());

        Serie serie = new Serie("Lost", 2000);
        serie.showTechnical();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar serie: "+serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(filme);
        calc.inclui(outroFilme);
        calc.inclui(serie);
        System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);
        
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVizu(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.rate(10);

        ArrayList<Filme> listadefilmes = new ArrayList<>();
        listadefilmes.add(filmeDoPaulo);
        listadefilmes.add(filme);
        listadefilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listadefilmes.size());
        System.out.println("Primeiro filme: " + listadefilmes.get(0).getNome());
        System.out.println(listadefilmes);
        System.out.println("toString do filme " + listadefilmes.get(0).toString());

        
    }
}
