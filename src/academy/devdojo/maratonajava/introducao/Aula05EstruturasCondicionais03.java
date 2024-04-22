package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Nao tenho condições";
        String mensagemResultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(mensagemResultado);
    }
}
