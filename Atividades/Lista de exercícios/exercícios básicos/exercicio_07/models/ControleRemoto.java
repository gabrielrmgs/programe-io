import javax.swing.JOptionPane;

public class ControleRemoto {


    public void aumentarVolume(Televisao televisao) {
        televisao.setVolume(televisao.getVolume()+1);
        JOptionPane.showMessageDialog(null, "Volume = " + televisao.getVolume());
    }
    
    public void diminuirVolume(Televisao televisao) {
        televisao.setVolume(televisao.getVolume()-1);
        JOptionPane.showMessageDialog(null, "Volume = " + televisao.getVolume());
    }

    public void aumentarCanal(Televisao televisao) {
        televisao.setCanal(televisao.getCanal()+1);
        JOptionPane.showMessageDialog(null, "Canal = " + televisao.getCanal());
    }
    
    public void diminuirCanal(Televisao televisao) {
        televisao.setCanal(televisao.getCanal()-1);
        JOptionPane.showMessageDialog(null, "Canal = " + televisao.getCanal());
    }

    public void trocarCanal(int canalSelecionado, Televisao televisao) {
        
        if (televisao.getCanal() != canalSelecionado) {
            televisao.setCanal(canalSelecionado);
            JOptionPane.showMessageDialog(null, "Canal = " + televisao.getCanal());
        } else {
            JOptionPane.showMessageDialog(null, "Canal já é o "+televisao.getCanal());
        }
    }

    public void consultarInformacoes(Televisao televisao) {
        JOptionPane.showMessageDialog(null, "Marca televisão: " + televisao.getMarca() + "\n"
        + "Volume atual: " + televisao.getVolume() + "\n"
        + "Canal atual: " + televisao.getCanal());
    }
    
}