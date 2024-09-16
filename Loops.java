public class Loops {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    // Teilaufgabe c)
    public static void primeFactorisation(int n){
        if (n <= 1) {
            System.out.println("Number must be greater than 1");
        }
        System.out.printf("Prime factorisation of %d = " , n);
        int factor = 2;
        boolean firstfactor = true;

        while (n > 1){
            while (n % factor == 0){
                if (!firstfactor){
                    System.out.print(" * ");
                }
                System.out.printf("%d", factor);
                n /= factor;
                firstfactor = false;

            }
            factor += 1;
        }
        System.out.println(); //neue Zeile
        }
    //Teilaufgabe d)
    
    public static double pi(int digits){
        double n = Math.pow(10, digits) / 2.0;
        if (n < 0){
            System.out.println("Digits must be a positive integer");
            return -1;
        } else {
            double res = 1.0;
            double sign= -1.0;
            for (int i = 0; i < n; i++) {
                double factor = (sign * 1.0) / (2 * (i + 1) + 1);
                res = res + factor;
                sign = sign * (-1);
            }

            res = res * 4;
            return res;
        } 
        
    }

    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        primeFactorisation(3);
        primeFactorisation(75);
        // TODO: Schreibe mehr Testcode
        primeFactorisation(51);
        primeFactorisation(35);
        primeFactorisation(32);
 

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (int n = 0; n < 12; n++){
            System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        System.out.println();
    }

}
