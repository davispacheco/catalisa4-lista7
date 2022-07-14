package src.exercicio1;

public class Main {
    public static void main(String[] args) {
        Brasil brasil = new Brasil();
        Equador equador = new Equador();
        Paraguai paraguai = new Paraguai();
        Uruguai uruguai = new Uruguai();
        brasil.adicionarVizinho(equador);
        brasil.adicionarVizinho(paraguai);
        brasil.adicionarVizinho(uruguai);
        equador.adicionarVizinho(brasil);
        equador.adicionarVizinho(uruguai);
        paraguai.adicionarVizinho(brasil);
        paraguai.adicionarVizinho(equador);
    }
}
