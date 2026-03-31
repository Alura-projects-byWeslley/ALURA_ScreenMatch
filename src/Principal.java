import br.com.alura.screenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O poderoso chefão");
        filme.setAnoDeLancamento(1978);
        filme.setDuracaoEmMinutos(180);
        
        filme.showTechnical();
        filme.rate(8);
        filme.rate(5);
        filme.rate(10);
        System.out.println("Total de avalições: "+ filme.getTotalDeAvaliacoes());
        System.out.println(filme.getMedia());

    }
}
