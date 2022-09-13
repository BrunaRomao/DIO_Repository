import javax.sound.midi.SysexMessage;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeExcecoes {

    public static void main(String args[]) {


        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite sua idade");

            int idade = scanner.nextInt();

            if (idade > 25) {
                System.out.println("Velha !");
            } else {
                System.out.println("Nova");

            }

        } catch (InputMismatchException erro) { // erro - > Nome do objeto
            System.err.println("Idade deve ser numérico");// err - > mensagem de erro

        }
    }
}