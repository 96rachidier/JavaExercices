/*Ejercicio de suma: Escribe un programa que solicite al usuario
dos números enteros e imprima la suma de los dos números*/

import javax.swing.*;

public class SumIntegers {
    public static void main(String[] args) {

        String number1 = JOptionPane.showInputDialog("Insert number 1: ");
        int num1 = Integer.parseInt(number1);

        String number2 = JOptionPane.showInputDialog("Insert number 3: ");
        int num2 = Integer.parseInt(number2);

        int sum = (num1 + num2);

        JOptionPane.showMessageDialog(null, sum, "Result", JOptionPane.INFORMATION_MESSAGE);


    }
}