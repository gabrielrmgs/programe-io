
public class Televisao {
    private String marca;
    private int canal;
    private int volume;


    public Televisao() {
    }

    public Televisao(String marca, int canal, int volume) {
        this.marca = marca;
        this.canal = canal;
        this.volume = volume;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", canal='" + getCanal() + "'" +
            ", volume='" + getVolume() + "'" +
            "}";
    }

}
