package br.com.alura.screenmatch.modelo;
public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }
    
    
    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }
    
    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }
    
    public double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }
    
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

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
