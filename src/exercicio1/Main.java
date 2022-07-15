package src.exercicio1;

public class Main {
    public static void main(String[] args) {
        Pais argentina = new Pais("arg", "Argentina", 20000000, 3215431.032);
        Pais brasil = new Pais("bra", "Brasil", 193000000, 6000000.049);
        Pais chile = new Pais("chi", "Chile", 30000, 231450.031);
        Pais equador = new Pais("ecu", "Equador", 50000, 594321.032);
        Pais uruguai = new Pais("ury", "Uruguai", 5000000, 3512440.031);
        argentina.adicionarVizinho(uruguai);
        brasil.adicionarVizinho(argentina);
        brasil.adicionarVizinho(uruguai);
        equador.adicionarVizinho(uruguai);
        System.out.println("Vizinhos de " + brasil.getNome() + ":");
        brasil.listarPaisesVizinhos();
        if (brasil.paisVizinho(equador)) {
            System.out.println(brasil.getNome() + " é vizinho de " + equador.getNome());
        } else {
            System.out.println(brasil.getNome() + " não é vizinho de " + equador.getNome());
        }
        System.out.println("Dados sobre " + brasil.getNome());
        System.out.println("Código ISO: " + brasil.getCodigoIso());
        System.out.println("População: " + brasil.getPopulacao());
        System.out.println("Dimensão por quilômetro quadrado: " + brasil.getDimensaoQuilometroQuadrado());
        System.out.println("Densidade populacional: " + brasil.calcularDensidadePopulacional());
    }
}
