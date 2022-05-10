public class Fatorial {

    public void solucao() {
        // 1. Programa que imprima o valor fatorial e todas as etapas do seu processo

        int numero = 5;
        int auxNum;

        for (int i = numero; i > 1; i--) {
            auxNum = i - 1;

            System.out.println(numero + "\t\t * \t\t" + auxNum + "\t\t = \t\t" + (numero*auxNum));

            numero *= auxNum;
        }
    }
}
