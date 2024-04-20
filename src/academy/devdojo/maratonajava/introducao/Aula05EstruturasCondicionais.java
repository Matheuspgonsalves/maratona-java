package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Pó beber");
        }

        if(!isAutorizadoComprarBebida) {
            System.out.println("Pó beber não");
        }
        System.out.println("Divirta-se");
    }
}
