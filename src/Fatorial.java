public class Fatorial {

    public void solucao() {
        // 1. Programa que imprima o valor fatorial e todas as etapas do seu processo

        long numero = 15;
        long auxNum;
        
        System.out.println("Fatorial de " + numero);

        for (long i = numero; i > 1; i--) {
            auxNum = i - 1;

            System.out.println(numero + " * " + auxNum + " = " + (numero * auxNum));

            numero *= auxNum;
        }
        
        System.out.println("Resultado do fatorial: " + numero);
    }
}
