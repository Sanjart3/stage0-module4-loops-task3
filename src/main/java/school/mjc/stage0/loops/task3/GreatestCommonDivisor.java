package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first==0||second==0){
            System.out.println(Math.max(first,second));
        }else if (first%second==0||second%first==0){
            System.out.println(Math.min(first,second));
        }else {
            int gcd=1;
            for (int i=1;i<=Math.min(first,second)/2;i++){
                if (first%i==0&&second%i==0){
                    gcd = i;
                }
            }
            System.out.println(gcd);
        }
    }
}
