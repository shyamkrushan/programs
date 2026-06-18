import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (Character.isUpperCase(ch)) {
                charArray[i] = Character.toLowerCase(ch);
            } 
            else if (Character.isLowerCase(ch)) {
                charArray[i] = Character.toUpperCase(ch);
            }
        }
        String result = new String(charArray);
        System.out.println("Output: " + result);
    }
}
