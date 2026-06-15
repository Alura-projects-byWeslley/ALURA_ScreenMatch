package br.com.alura.screenmatch.modelo;

import com.google.gson.annotations.SerializedName;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    
    public Titulo(TituloOMDB meuTituloOMDB){
        this.nome = meuTituloOMDB.title();
        if (meuTituloOMDB.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não foi possivel converter o ano"+
            " porque tem mais de 4 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOMDB.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOMDB.runtime()
         .substring(0,2));
    }


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

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

    public int compareTo(Titulo outroTitulo){
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    public String toString(){
        return "nome= '"+this.nome+ '\''+
                ", anoDeLancamento="+anoDeLancamento + "," +
                " duração=" + duracaoEmMinutos;
    }
}
