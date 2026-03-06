import java.util.*;
public class shiftzero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int index =0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
            }
        }

        /* Another method.
        int index =0;
        for(int i =0;i<n;i++){
        if(arr[i])}
        */
        System.out.println(Arrays.toString(arr));
    }
}