package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte
mensagem:

Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salario de
<salario>, na data <data>

 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        //Variaveis
        String nome = "Matheus Pereira";
        String endereco = "Rua Tanana Tanana 200 - Cidade Nova";
        double salario = 1640.42;
        String data = "27/02/2332";

        //Saida para usuario
        System.out.println("Eu " + nome + ", morando no endereço " + endereco +
                ", \nconfirmo que recebi o salario de " + salario + ", na data " +
                data + ".");
    }
}
