package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 numeros de um dado valor. Por exemplo 50

        int num = 50;
        int c = 0;
        while(c <= num){
            System.out.println(c);
            if(c == 25)
                break;
            c++;
        }
    }
}
