QUESTION:Print below pattern only:
123456
123456
123456
123456
123456
123456     
SOLUTION:

        
public class printPatternF2 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
