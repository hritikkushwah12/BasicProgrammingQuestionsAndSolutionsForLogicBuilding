QUESTION:Print below pattern according to the input n given by the user for further customization in pattern by the user:
given here n=7
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
6 7 8 9 10 11 
7 8 9 10 11 12 13 
SOLUTION:


import java.util.Scanner;
public class printPatternH2{
    public static void main(String []args){
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=count;j++){
                System.out.print(j+" ");
            }
            count+=2;
            System.out.println();
        }

    }
}
