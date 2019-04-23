import java.util.Scanner;

public class multiplication_table {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число для которого вы хотите увидеть таблицу умножения: ");
        int variable_input = in.nextInt();     //Объявляем переменную вводимую извне и запрашиваем её.
        long summ;              //Вводим переменную для хранения результата.

            //Data processing

        summ = variable_input;
        System.out.println(variable_input + " * 1 = " + summ);
        summ = variable_input * 2;
        System.out.println(variable_input + " * 2 = " + summ);
        summ = variable_input * 3;
        System.out.println(variable_input + " * 3 = " + summ);
        summ = variable_input * 4;
        System.out.println(variable_input + " * 4 = " + summ);
        summ = variable_input * 5;
        System.out.println(variable_input + " * 5 = " + summ);
        summ = variable_input * 6;
        System.out.println(variable_input + " * 6 = " + summ);
        summ = variable_input * 7;
        System.out.println(variable_input + " * 7 = " + summ);
        summ = variable_input * 8;
        System.out.println(variable_input + " * 8 = " + summ);
        summ = variable_input * 9;
        System.out.println(variable_input + " * 9 = " + summ);
        summ = variable_input * 10;
        System.out.println(variable_input + " * 10 = " + summ);
    }
}
