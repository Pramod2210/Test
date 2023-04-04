package Dav;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        String s="radhaAp";
        s.
        int a[]=new int[9];
        int k=0;
        for(Integer i:ar){
              a[k]=i;
              k++;
                }
        System.out.println(Arrays.toString(a));
        for(int x=0;x<a.length;x++){
            for(int y=x+1;y<a.length;y++){
                if(a[x]!=0){
                if(a[x]==a[y]){
                    n=n+1;
                    a[x]=0;
                    a[y]=0;
                }
            }
        }
            
            }
        System.out.println(n);
        n=n;
        return n;
	
        }
    }



public class Solution {
    public static void main(String[] args)  {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       /* int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }/
//10 20 20 10 10 30 50 10 20
        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        */
        
        
        ArrayList<Integer>ar= new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);
         int n=0;
        Result r=new Result();
        r.sockMerchant(n, ar);
        System.out.println(n);
    }
}


