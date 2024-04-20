package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 20;
        int soma = num1+num2;
        float div = num2/(float)num1;

        //Operadores matemáticos --> + - * /

        System.out.println("Valor: " + num2+num1);
        System.out.println(num2+num1);
        System.out.println("Valor: " + soma);
        System.out.println("Valor: " + div);

        // % Operador de resto
        int resto = 20 % 3;
        System.out.println(resto);

        // Operadores relacionais --> < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte? " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte? " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte? " + isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte? " + isDezDiferenteQueVinte);

        //Operadores logicos --> &&(AND) ||(OR) !(NOT)

        int idade = 29;
        float salario = 3400f;
        boolean isDentroDaLeiMaiorQueTrinta = (idade > 30) && (salario > 4612);
        boolean isDentroDaLeiMenorQueTrinta = (idade < 30) && (salario >= 3381);

        System.out.println("isDentroDaLeiMaiorQueTrinta? " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta? " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 5000;
        float valorPS5 = 5000F;
        boolean isPS5Compravel = valorTotalContaCorrente > valorPS5 ||
                valorTotalContaPoupanca > valorPS5 ||
                (valorTotalContaPoupanca + valorTotalContaCorrente) > valorPS5;

        System.out.println("isPS5Compravel? " + isPS5Compravel);

        //Operadores de atribuicao -> += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 2000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        //Incrementos ++ --
        int contador = 0;
        contador += 1;
        contador++;
        System.out.println(contador);


    }
}
