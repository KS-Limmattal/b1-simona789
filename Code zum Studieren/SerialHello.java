public class SerialHello {
    static void serialHello1(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello " + names[i] + "!");
        }
    }

    static void serialHello2(String[] names) {
        for (String name : names) {
            System.out.println("Hello " + name + "!");
        }
    }

    public static void main(String[] args) {
        String[] studentNames = { "Andreas", "Ania", "Janna", "Marius", "Mateo", "Kai" };
        serialHello1(studentNames);
    }
}