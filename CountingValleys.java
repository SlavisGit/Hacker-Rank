import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        int level = 0;
        int valley = 0;
        String path = scanner.nextLine();
        for (int i = 0; i <= path.length() - 1; i++) {
            char current = path.charAt(i);
            if(current == 'D') {
                level--;
            } else if (current == 'U') {
                level++;
            }
            if(level == 0 && current == 'U') {
                valley++;
            }
        }
        System.out.println(valley);
    }
}