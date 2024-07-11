public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("gabriel", "111111", "1212", "masculin", 2003);
        cliente1.todosDados();
        System.out.println(cliente1.calcularIdade());
        cliente1.maiorIdade();
    }
}