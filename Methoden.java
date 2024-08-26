public class Methoden {

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static void hours(int secondstot) {
        int hours = secondstot/3600;
        int minutes = (secondstot % 3600)/60;
        int seconds = secondstot%60;
        System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);
    } 

    public static double distance(int x1, int y1, int x2, int y2){
        int dx = x2 - x1;
        int dy = y2 - y1;

        return Math.sqrt(dx*dx + dy*dy);
    }
    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        hours(100);
        hours(3);
        hours(75);
        hours(4000);
        hours(0);
    

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");

        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println(distance(0,0,3,4));
        System.out.println(distance(-1,-1,-1,-1));
        System.out.println(distance(3,6,-3,-4));
    }
}
