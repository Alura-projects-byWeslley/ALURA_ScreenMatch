public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "O poderoso chefão";
        filme.anoDeLancamento = 1978;
        filme.duracaoEmMinutos = 180;
        
        filme.showTechnical();
        filme.rate(8);
        filme.rate(5);
        filme.rate(10);
        System.out.println(filme.totalDeAvaliacoes);
        System.out.println(filme.somaDasAvaliacoes);

        System.out.println(filme.getMedia());

    }
}
