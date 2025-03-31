import java.util.Scanner;

public class setRun {
    public static void main (String[] args) {
      System.out.println("Hello");
      Scanner kb = new Scanner(System.in);
      int[] numArr = new int[5];
      for(int i = 0; i < 5; i++) {
        numArr[i] = kb.nextInt();
      }
      Set a = new Set(numArr);
      System.out.println(a.getSetMember());
    }
}