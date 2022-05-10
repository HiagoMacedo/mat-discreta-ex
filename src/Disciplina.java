
public class Disciplina {

    // 2. Implemente o exercício do slide 16

    public void solucaoA() {
        // A. o número de m maneiras que um estudante pode escolher uma de cada tipo de disciplina

        String[] engSoftware = new String[2];
        String[] bancoDados = new String[3];
        String[] linguaPrograma = new String[4];
        String[] combinacao = new String[3];

        engSoftware[0] = "Métodos Ágeis";
        engSoftware[1] = "Processos de Software";

        bancoDados[0] = "SQL";
        bancoDados[1] = "NoSQL";
        bancoDados[2] = "GIS";

        linguaPrograma[0] = "Python";
        linguaPrograma[1] = "Java";
        linguaPrograma[2] = "C";
        linguaPrograma[3] = "PHP";

        int count = 1;
        for (String str : engSoftware) {
            combinacao[0] = str;

            for (String bancoDado : bancoDados) {
                combinacao[1] = bancoDado;

                for (String linguagem : linguaPrograma) {
                    combinacao[2] = linguagem;
                    exibir(combinacao, count);
                    count++;
                }
            }
        }
    }

    public static void exibir(String [] arr, int count) {

        System.out.println("Possibilidade " + count);

        for (String s : arr) {
            System.out.println("- " + s);
            count++;
        }

        System.out.println("\n");
    }

    public void solucaoB() {
        // B. O número de n maneiras que um estudante pode escolher apenas uma disciplina

        String[] disciplinas = new String[9];

        disciplinas[0] = "Métodos Ágeis";
        disciplinas[1] = "Processos de Software";
        disciplinas[2] = "SQL";
        disciplinas[3] = "NoSQL";
        disciplinas[4] = "GIS";
        disciplinas[5] = "Python";
        disciplinas[6] = "Java";
        disciplinas[7] = "C";
        disciplinas[8] = "PHP";

        int count = 1;
        for (String disciplina : disciplinas) {
            System.out.println("Possibilidade " + count);
            System.out.println("- " + disciplina + "\n");
            count++;
        }
    }
}
