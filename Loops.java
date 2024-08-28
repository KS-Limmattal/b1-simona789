public class Loops {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.

    public static void primeFactorisation(int n){
        if (n <= 1) {
            System.out.println("Number must be greater than 1");
        }
        System.out.printf("Prime factorisation of %d =" , n);
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

        }
    }
    
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        System.out.println(hours(3));
        System.out.println(hours(75));
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (int n = 0; n < 12; n++){
            System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        System.out.println();
    }
}
