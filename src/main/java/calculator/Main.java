package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        calc(input);


    }


    public static String calc(String input) throws Exception {

        String[] arrayInput = input.split(" ");
        int dlina = arrayInput.length;
        if (dlina != 3) {
            throw new Exception("throws Exception //т.к. формат математической операции не " +
                    "удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        int firstOperand = Integer.parseInt(arrayInput[0]);
        String mathOperator = arrayInput[1];
        int secondOperand = Integer.parseInt(arrayInput[2]);
        int otvet = 0;

        if (firstOperand > 10 || secondOperand > 10 || firstOperand < 1 || secondOperand < 1) {
            throw new Exception("Числа операндов не входят в нужный диапазон");
        }

        switch (mathOperator) {
            case "+":
                otvet = firstOperand + secondOperand;
                break;
            case "-":
                otvet = firstOperand - secondOperand;
                break;
            case "*":
                otvet = firstOperand * secondOperand;
                break;
            case "/":
                otvet = firstOperand / secondOperand;
                break;
            default:
                throw new Exception("Недопустимая операция");
        }
        System.out.println(otvet);


        return String.valueOf(otvet);
    }
}

