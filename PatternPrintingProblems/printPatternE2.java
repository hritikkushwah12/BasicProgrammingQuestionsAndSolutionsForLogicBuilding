Question:Print below pattern only:
      * 
    * * * 
  * * * * * 
* * * * * * * 
SOLUTION:


public class printPatternE2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i + 3; j++) {
                if (j <= 4 - i) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
