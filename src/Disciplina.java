
public class Disciplina {

    // 2. Implemente o exercício do slide 16

    public void solucaoA() {
        // A. o número de m maneiras que um estudante pode escolher uma de cada tipo de disciplina

        String[] engSoftware = {"Métodos Ágeis", "Processos de Software"};
        String[] bancoDados = {"SQL", "NoSQL", "GIS"};
        String[] linguaPrograma = {"Python", "Java", "C", "PHP"};
        String[] possibilidade = new String[3];


        int count = 1;
        for (String str : engSoftware) {
            possibilidade[0] = str;

            for (String bancoDado : bancoDados) {
                possibilidade[1] = bancoDado;

                for (String linguagem : linguaPrograma) {
                    possibilidade[2] = linguagem;
                    exibir(possibilidade, count);
                    count++;
                }
            }
        }
    }

    private static void exibir(String[] arr, int count) {

        System.out.println("Possibilidade " + count);

        for (String s : arr) {
            System.out.println("- " + s);
            count++;
        }
        System.out.println("\n");
    }

    public void solucaoB() {
        // B. O número de n maneiras que um estudante pode escolher apenas uma disciplina

        String[] disciplinas = {"Métodos Ágeis", "Processos de Software", "SQL", "NoSQL", "GIS", "Python", "Java", "C", "PHP"};

        int count = 1;
        for (String disciplina : disciplinas) {
            System.out.println("Possibilidade " + count);
            System.out.println("- " + disciplina + "\n");
            count++;
        }
    }
}
