import java.util.*;
public class rotateByd{
    public static void main(String[] args){



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the d value:");
        int d = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        
        int[] ror = new int[n];
        for(int i=0;i<n;i++){
            ror[(i+d)%n]=arr1[i];
        }

        //for(int i =0;i<arr1.length;i++){
        //    System.out.print(arr1[i]+ " ");
        //}

        System.out.println(Arrays.toString(ror));

    }
}