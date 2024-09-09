
public class Principal {
    public static void main(String[] args) {
        Televisao televisao = new Televisao("LG", 12, 10);
        ControleRemoto controleRemoto = new ControleRemoto();

        controleRemoto.aumentarVolume(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.trocarCanal(33, televisao);
        controleRemoto.trocarCanal(33, televisao);
        controleRemoto.consultarInformacoes(televisao);
        
    }
}
