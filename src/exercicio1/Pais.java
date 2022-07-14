package src.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Pais {
    private String codigoIso;
    private String nome;
    private int populacao;
    private double dimensaoQuilometroQuadrado;
    private Set<Pais> vizinhos = new HashSet<>();

    public Pais(String codigoIso, String nome, int populacao, double dimensaoQuilometroQuadrado) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensaoQuilometroQuadrado = dimensaoQuilometroQuadrado;
        this.vizinhos = vizinhos;
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

    public double calcularDensidadePopulacional() {
        return this.getPopulacao() / this.getDimensaoQuilometroQuadrado();
    }
    public void adicionarVizinho(Pais p1) {
        this.vizinhos.add(p1);
        p1.vizinhos.add(this);
    }

    public void listarPaisesVizinhos() {
        for (Pais pais : vizinhos) {
            System.out.println(pais.getNome());
        }
    }
    public boolean paisVizinho(Pais p1) {
        if (this.vizinhos.contains(p1)) {
            return true;
        } else {
            return false;
        }
    }

}
