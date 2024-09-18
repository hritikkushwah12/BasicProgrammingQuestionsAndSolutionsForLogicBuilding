QUESTION:Print below pattern according to the input n given by the user for further customization in pattern by the user:
given here n=6
1 2 3 4 5 6 6 5 4 3 2 1 
1 2 3 4 5 * * 5 4 3 2 1 
1 2 3 4 * * * * 4 3 2 1 
1 2 3 * * * * * * 3 2 1 
1 2 * * * * * * * * 2 1 
1 * * * * * * * * * * 1 
SOLUTION:


import java.util.Scanner;
public class DiamondNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=2*i;k++){
                System.out.print("* ");
            }
            for(int l=n-i;l>0;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }


    }
}
