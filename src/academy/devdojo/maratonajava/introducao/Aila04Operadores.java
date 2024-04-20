package academy.devdojo.maratonajava.introducao;

public class Aila04Operadores {
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
    }
}
