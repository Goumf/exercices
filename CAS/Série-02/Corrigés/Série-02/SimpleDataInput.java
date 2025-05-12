import java.util.Scanner;

public class SimpleDataInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String readString() {
        return scanner.nextLine();
    }

    public static double readDouble() {
        return Double.parseDouble(readString());
    }

    public static int readInt() {
        return Integer.parseInt(readString());
    }

    public static long readLong() {
        return Long.parseLong(readString());
    }

    public static float readFloat() {
        return Float.parseFloat(readString());
    }

    public static char readChar() {
        return readString().charAt(0);
    }
}
