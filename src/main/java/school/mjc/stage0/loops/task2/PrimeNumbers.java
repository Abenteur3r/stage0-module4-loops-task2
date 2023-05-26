package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number1 = 0;
        int number2 = printToInclusive;
        if(printToInclusive==0){
            System.out.print("");
        }
        while (number1 <= number2) {
            int i = 2, count = 0;
            while (i <= number1 / 2) {
                if (number1 % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0 && number1 != 0 && number1 != 1) {
                System.out.println(number1);
            }
            number1++;
        }


        }
    }

