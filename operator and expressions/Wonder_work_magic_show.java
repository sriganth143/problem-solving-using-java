import java.util.*;
public class Wonder_work_magic_show{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        float r1=sc.nextFloat();
        int n2=sc.nextInt();
        float r2=sc.nextFloat();
        int n3=sc.nextInt();
        float r3=sc.nextFloat();
        float output=(n1*r1+n2*r2+n3*r3)/(n1+n2+n3);
        System.out.println(output);
    }

}