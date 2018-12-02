import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Zero {

	public static void main(String[] args){
		PrintZero();
	}

    public static int[] PrintZero(){
    	
    	Scanner s=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }

        for(int i=0;i<n;i++){ //for printing array
        	
        	if(arr[i]<0)
        	{
        		arr[i]=0;
        	}
        	
            System.out.println(arr[i]);

        }
		return arr;
    }
	}
