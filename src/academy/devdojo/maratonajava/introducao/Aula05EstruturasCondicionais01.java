package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Pó beber");
        } else {
            System.out.println("Pó beber nao");
        }
        System.out.println("Divirta-se");
    }
}
