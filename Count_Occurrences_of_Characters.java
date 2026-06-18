import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (ch == '0') {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < charArray.length; j++) {
                if (ch == charArray[j]) {
                    count++;
                    charArray[j] = '0';
                }
            }
            System.out.println(ch + " : " + count);
        }
    }
}
