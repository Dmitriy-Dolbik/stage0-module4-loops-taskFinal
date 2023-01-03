package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();

        Scanner scanner = new Scanner(System.in);

        int numberTableToPrint = scanner.nextInt();

        multiplicationTable.printTable(numberTableToPrint);
    }
    public void printTable(int numberTableToPrint){
        for (int i = 1; i <= numberTableToPrint; i++) {
            for (int j = 1; j <= numberTableToPrint ; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }


    }
}
