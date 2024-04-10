package acm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class T9_FlattenTheBlocks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;

        while ( in.hasNext() ){
            n = in.nextInt();
            if (n == 0){
                return;

            }
            int arr[] = new int[n];
            int sum = 0;
            for ( int i = 0; i < n; i++ ){
                arr[i] = in.nextInt();
                sum+=arr[i];
            }
            int avg = sum/n;
            int count = 0;
            for ( int i = 0; i < n; i++ ){
                if ( arr[i] > avg ){
                    count += arr[i] - avg;
                }
            }
            System.out.println(count);
            System.out.println();
        }
    }
}
