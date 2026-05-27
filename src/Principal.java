import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O poderoso chefão");
        filme.setAnoDeLancamento(1978);
        filme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: "+filme.getDuracaoEmMinutos());
        
        filme.showTechnical();
        filme.rate(8);
        filme.rate(5);
        filme.rate(10);
        System.out.println("Total de avalições: "+ filme.getTotalDeAvaliacoes());
        System.out.println(filme.getMedia());

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.showTechnical();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar serie: "+serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
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
        episodio.setSerie(serie);;
        episodio.setTotalVizu(300);
        filtro.filtra(episodio);
    }
}
