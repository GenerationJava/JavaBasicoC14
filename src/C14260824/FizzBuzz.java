package C14260824;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        //Los múltiplos de 3 son "fizz", los múltiplos de 5 son "buzz" y cuando son múltiplos de ambos son "fizzbuzz"

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresa el número máximo");
        Integer numeroMaximo = miScanner.nextInt();

        for (int i = 1; i <= numeroMaximo; i++) {
            //Si es múltiplo o divisible entre 15 o cumple ambas condiciones, imprime FizzBuzz
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                //Si es múltiplo o divisible entre 3, imprime Fizz
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                //Si es múltiplo o divisible entre 5, imprime Buzz
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
