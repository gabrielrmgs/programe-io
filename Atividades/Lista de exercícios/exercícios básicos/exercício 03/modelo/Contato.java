public class Contato {
    private TipoContato tipoContato;
    private String nome;
    private String numero;


    public String mostrarContato(){
        return "nome: "+nome+"Tipo: "+String.valueOf(tipoContato)+"\nNúmero: "+numero;
    }


    public Contato(TipoContato tipoContato, String nome, String numero) {
        this.tipoContato = tipoContato;
        this.nome = nome;
        this.numero = numero;
    }

    public TipoContato getTipoContato() {
        return this.tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    

}
