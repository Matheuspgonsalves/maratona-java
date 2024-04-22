package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 1;
        while(count <= 10){
            System.out.println(count);
            count++;
        }
        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        }while (count < 10);

        for(int c = 0; c < 10; c++){
            System.out.println(c);
        }
    }
}
