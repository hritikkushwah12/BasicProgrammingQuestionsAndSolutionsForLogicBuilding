QUESTION: Print below pattern alongwith the input taken by user for some customization in pattern:
* * * * 
* * * * 
* * * * 
* * * * 
SOLUTION:

public class pattern2 {

        public static void main(String args[]){
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
