import java.util.*;
public class prefixSum{
    public static void main(String[] args){
        System.out.println("Enter the size:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }

        System.out.println(Arrays.toString(arr));
    }
}