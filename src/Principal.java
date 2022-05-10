public class Principal {

    public static void main(String[] args) {

        Fatorial fatorial = new Fatorial();

        //System.out.println("Exercicio Fatorial\n");
        System.out.println("1. Programa que imprima o valor fatorial e todas as etapas do seu processo\n");
        fatorial.solucao();

        Disciplina disciplina = new Disciplina();

        System.out.println("\n\n2. Exercicio Escolha de Disciplinas\n");

        System.out.println("A. o número de m maneiras que um estudante pode escolher uma de cada tipo de disciplina \n");
        disciplina.solucaoA();

        System.out.println("B. O número de n maneiras que um estudante pode escolher apenas uma disciplina \n");
        disciplina.solucaoB();

        System.out.println("Fim do programa.");
    }
}
