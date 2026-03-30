public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public void showTechnical(){
        System.out.println("Nome do Filme: "+nome);
        System.out.println("Ano de Lançamento: "+ anoDeLancamento);
    }

    public void rate(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double getMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
