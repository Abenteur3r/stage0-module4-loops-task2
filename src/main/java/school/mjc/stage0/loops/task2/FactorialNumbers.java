package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i =0;
        int result = 1;
        if(printToInclusive==0){
            System.out.println(1);
        }
        while(i<printToInclusive){
            if (i==0) {
                System.out.println(1);
            }
            result *= (i+1);
            System.out.println(result);
            i++;
        }
    }
}
