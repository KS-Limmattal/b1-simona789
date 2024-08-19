public class Powers { 

    static int power(int base, int n) {
        int power = 1;
        for (int i = 0; i < n; i++) {
            power = power * base;
        }
        // Alternative Lösung mit while:
        // int i = 0; //counter
        // while (i < n) { // repeats what is in {} as long as () is true
        //     power = power * base;
        //     i++; //short for "i = i + 1";
        // }
        return power;
    }


    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println("The " + b + "-th power of " + a + " is " + power(a,b));
    }
}
