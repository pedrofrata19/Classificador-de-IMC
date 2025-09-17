import java.util.Locale;
import java.util.Scanner;

public class ClassificadorDeIMC {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("<----- Classificador de IMC ----->");

        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Baixo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobre peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }

        System.out.printf("O seu IMC é: %.2f%n", imc);

        sc.close();
    }
}