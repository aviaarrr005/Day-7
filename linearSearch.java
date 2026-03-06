import java.util.*;
public class linearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to be searched: ");
        int element = sc.nextInt();

        for(int i =0;i<n;i++){
            if(arr[i]==element){
                System.out.println("Element "+element+ " found at index "+i);
                return ;
            }
        }
        System.out.println("Element Not found");
    }
}