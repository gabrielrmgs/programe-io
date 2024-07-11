public class Contato {
    private TipoContato tipoContato;
    private String numero;


    public String mostrarContato(){
        return "Tipo: "+String.valueOf(tipoContato)+"\nNúmero: "+numero;
    }

    public Contato(TipoContato tipoContato, String numero) {
        this.tipoContato = tipoContato;
        this.numero = numero;
    }

    public TipoContato getTipoContato() {
        return this.tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
