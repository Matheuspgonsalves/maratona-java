package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Gojo";
        nomes[1] = "Itadori";
        nomes[2] = "Megumi";
        nomes[2] = "Sukuna";
        nomes[2] = "Nanami";

        for (int i = 0; i <= nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
