import java.time.LocalDate;

public class Cliente {

    private String nome;
    private int idade;
    private boolean maiorDeIdade;
    private String cpf;
    private String telefone;
    private String sexo;
    private int anoDeNascimento;
    public int anoAtual = LocalDate.now().getYear();

    
    
    public Cliente(String nome, String cpf, String telefone, String sexo, int anoDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
        this.anoDeNascimento = anoDeNascimento;
    }


    public void todosDados() {
        System.out.println("Nome: "+getNome()+" idade: "+getIdade()+", cpf: "+getCpf());
    }

    public int calcularIdade(){
/*         System.out.println(anoAtual - anoDeNascimento);
 */        return anoAtual - anoDeNascimento;
    }

    public boolean maiorIdade(){
        if (calcularIdade() > 18) {
            System.out.println("Maior de idade");
            return true;
        } else {
            System.out.println("Menor de idade");
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isMaiorDeIdade() {
        return maiorDeIdade;
    }

    public void setMaiorDeIdade(boolean maiorDeIdade) {
        this.maiorDeIdade = maiorDeIdade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }


   

}