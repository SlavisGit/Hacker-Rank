import java.util.*;

public class SockPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        String[] arItems = scanner.nextLine().split(" ");
        Set<Integer> socks = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int item = Integer.parseInt(arItems[i]);
            arr[i] = item;
        }
        int pairs = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if(!socks.contains(arr[i])) {
                socks.add(arr[i]);
            } else {
                socks.remove(arr[i]);
                pairs++;
            }
        }
        System.out.println(pairs);
    }
}
