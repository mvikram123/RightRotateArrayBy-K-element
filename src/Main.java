import java.util.*;

class Solution {

    public void rightRotate(int[] arr, int n, int k) {
        while(k>n)
        {
            k=k-n;
        }
        int temp[]=new int[n-k];
        for(int i=0; i<n-k; i++)
        {

            temp[i]=arr[i];
        }//copying first three element(n-k) in temporary array

        for(int i=n-k;i<n; i++)
        {

            arr[i-n+k]=arr[i];  //now copying k element in from index (3,4)to index(0,1) in given array
        }
        for(int i=0; i<n-k; i++)
        {
            arr[i+k]=temp[i];   //copying the element of temp array in given array
        }

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        scn.close();
        Obj.rightRotate(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}