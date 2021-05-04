import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CloudsJumping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> clouds = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int count = 0;
        int i = 0;
        while (i < clouds.size() - 1) {
            if(i + 2 < clouds.size() && clouds.get(i + 2) != 1) {
                count++;
                i += 2;
            } else {
                count++;
                i++;
            }
        }
        System.out.println(count);
    }

}
