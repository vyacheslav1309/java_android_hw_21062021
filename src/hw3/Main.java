package hw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        Random numbers = new Random();
        int pop = 0;
        int random = numbers.nextInt(9);
        System.out.print("Угадайте число с трёх раз!");

        while (pop < 3) {
            System.out.println("Введите от 0 до 9: ");
            int number = input.nextInt();

            if (number > random) {
                System.out.println("Загаданное число меньше!");
                System.out.println("");
            } else if (number < random) {
                System.out.println("Загаданное число больше!");
                System.out.println("");
            } else if (number == random) {
                System.out.println("Вы отгадали!");
                System.out.println("");
            }
            pop++;
        }
        System.out.println("Ваши попытки закончились. Начать игру заново? Да? Нажмите 1; Нет? нажмите 0:");

        String userData = input.next();
        if(userData.equals("1")){

            main(null);
        }
    }
}
