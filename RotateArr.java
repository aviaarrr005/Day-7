import java.util.*;
public class RotateArr{
    public static void main(String[] args){
        /*
        int[] arr = {1,2,3,4,5};

        int n = arr.length;
        int[] ror = new int[n];
        int temp = arr[n-1];

        for(int i=1;i<n;i++){
            ror[i]=arr[i-1];
        }

        ror[0] = temp;

        for(int i =0;i<ror.length;i++){
            System.out.print(ror[i]+ " ");
        }*/



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        int temp = arr1[n-1];
        for(int i = n-1 ;i>0;i--){
            arr1[i]=arr1[i-1];
        }
        arr1[0]=temp;

        //for(int i =0;i<arr1.length;i++){
        //    System.out.print(arr1[i]+ " ");
        //}

        System.out.println(Arrays.toString(arr1));

    }
}