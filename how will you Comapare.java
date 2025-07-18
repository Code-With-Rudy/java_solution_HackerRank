import java.util.*;

public class Arithmetic {

    public Integer sum(Integer[] ints) {
        int total = 0;
        for (Integer num : ints) {
            total += num;
        }
        return total;
    }

    
    public String sum(String[] strs) {
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmetic a = new Arithmetic();

        int T = Integer.parseInt(sc.nextLine());

        for (int t = 0; t < T; t++) {
            String line = sc.nextLine().trim();
            String[] tokens = line.split(" ");

            
            boolean isInteger = true;
            for (String token : tokens) {
                if (!token.matches("\\d+")) {
                    isInteger = false;
                    break;
                }
            }

            if (isInteger) {
                Integer[] nums = new Integer[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    nums[i] = Integer.parseInt(tokens[i]);
                }
                System.out.println(a.sum(nums));
            } else {
                System.out.println(a.sum(tokens));
            }
        }

        sc.close();
    }
}
