QUESTION: Print below pattern alongwith the input taken by user for some customization in pattern:
* * * * 
* * * * 
* * * * 
* * * * 
SOLUTION:

import java.util.*;
public class Print1ton2{
    public static void main(String []args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter No.");
        int n=inp.nextInt();
        int i=1;
        while(i<=n) {
            System.out.println(i + " ");
            i++;
        }
    }
}
