import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[12];
        System.out.println("Enter the Elements in array : ");
        //get input from user
        for(int i=0;i<12;i++){
            arr[i] = sc.nextInt();
        }
        //printing the array
        System.out.println("---------Elements in Array------");
        for(int i=0;i<12;i++){
            System.out.println(arr[i]);
        }
    }
}




