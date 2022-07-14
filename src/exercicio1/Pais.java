package src.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Pais {
    private String codigoIso;
    private String nome;
    private int populacao;
    private double dimensaoQuilometroQuadrado;
    private Set<Pais> vizinhos = new HashSet<>();

    public Pais() {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensaoQuilometroQuadrado = dimensaoQuilometroQuadrado;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensaoQuilometroQuadrado() {
        return dimensaoQuilometroQuadrado;
    }

    public void setDimensaoQuilometroQuadrado(double dimensaoQuilometroQuadrado) {
        this.dimensaoQuilometroQuadrado = dimensaoQuilometroQuadrado;
    }

    public Set<Pais> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(Set<Pais> vizinhos) {
        this.vizinhos = vizinhos;
    }

    public void adicionarVizinho(Pais p1) {
        vizinhos.add(p1);
    }
}
