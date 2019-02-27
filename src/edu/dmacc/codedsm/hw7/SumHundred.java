package edu.dmacc.codedsm.hw7;

public class SumHundred {

    public static void main(String[] args) {

        int firstInput = 20;
        int secondInput = 10;
        int total = 0;
        int iterations = 0;

        while (total < 100) {
            total = addNumber(firstInput, secondInput, total);
            iterations++;
        }
        System.out.println(total);
        output(total, iterations);

    }
    public static int addNumber(int firstInput, int secondInput, int priorResult) {
        return firstInput + secondInput + priorResult;

    }

    public static void output(int finalResult, int iterations) {
        System.out.println("The first result greater than 100 was " + finalResult + " and took " + iterations + " to complete");

    }


}


