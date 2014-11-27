///////////////////////////////////////////////////////////////////
//Billy Delucia
//CSE002
//
//Play file made for testing ideas and code 
//
import java.util.Scanner;
public class Play{
	public static void main(String [] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter and integer to be the length of your array: ");
		int length=input.nextInt();
		int [] one= new int [length];
		for (int i=0; i<length; i++){
			one[i]=(int)(Math.random()*length);
		}
		printArray(one);
		minMaxAvg(one);
		sort(one);
		printArray(one);
		int at=Bsearch(one);
		System.out.println(at);
		minMaxAvg(one);
		
	}
	
	public static void minMaxAvg(int [] A){
		int min=A[0];
		int max=A[0];
		double sum=0;
		int j=0;
		for(int i: A){
			if (i<min){
				min=i;
			}
			if(i>max){
				max=i;
			}
			sum+=i;
		}
		double average=(sum/A.length);
		System.out.println("Max="+max+"  Min="+min+"  Average="+average+"   Sum="+sum);
	}
	
	public static int Bsearch(int [] A){
		Scanner input= new Scanner(System.in);
		System.out.print("Find this int: ");
		int find=input.nextInt();
		int min=0;
		int max=A.length-1;
		System.out.println(max);
		int check=0;
		int index=0;
		int cancel=0;
		do{
			cancel++;
			index=(int)((min+max)/2);
			check=A[index];
			System.out.println("C: "+check+"  I: "+index);
			if(check>find){
				max=index-1;
				//System.out.println("less");
			}
			if(check<find){
				min=index+1;
				//System.out.println("more");
			}
			if(cancel>100){
				break;
			}
		}while(check!=find);
		return index;
	}
	
	public static void sort(int [] A){
		for( int i=0; i<A.length; i++){
			int min=findMinRange(A,i,A.length-1);
			swapMember(A,i,min);
		}
	}
	
	public static void swapMember( int [] A, int one, int two){
		if( one<0 || one>A.length || two<0 || two>A.length){
			System.out.println("Error");
			return;
		}
		int temp=A[one];
		A[one]=A[two];
		A[two]=temp;
	}
	
	public static int findMinRange(int A [], int min, int max){
		if (min>=max){
			System.out.println("Error");
			return -1;
		}
		int index=max;
		int tempMin=A[max];
		for (int i=min; i<=max; i++){
			if(A[i]<tempMin){
				index=i;
				tempMin=A[i];
			}
		}
		return index;
	}
	
	
	public static int findMinRange(int A []){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a Min and a Max");
		int min= input.nextInt();
		int max= input.nextInt();
		if (min>=max){
			System.out.println("Error");
			return -1;
		}
		int index=max;
		int tempMin=A[max];
		for (int i=min; i<=max; i++){
			if(A[i]<tempMin){
				index=i;
				tempMin=A[i];
			}
		}
		return index;
	}
	
	
	public static double dot(double [] u, double [] v){
		int limit=v.length;
		if (limit!=u.length){
			System.out.println("Error");
			return 0;
		}
		double output=0;
		for (int i=0; i<limit; i++){
			output+=u[i]*v[i];
		}
		return output;
	}
	
	public static void printArray(int [] input){
		System.out.print("{");
		for (int i=0; i<input.length; i++){
			System.out.print(input[i]);
			if(i<input.length-1){
				System.out.print(",");
			}
		}
		System.out.print("}");
		System.out.println();
	}
	
	public static int [] shuffle(int [] input){
		int [] output=new int [input.length];
		
		for (int i: output){
			System.out.print(i);
			output[(i)%input.length]=input[(i+1)%input.length];
		}
		//System.out.println();
		/*
		for (int i=1; i<=input.length; i++){
			if(i==input.length){
				output[0]=input[i-1];
			}
			else{
			output[i]=input[i-1];
			}
		}
		*/
		return output;
	}
	
	public static int [] twice(int [] input){
		int limit=2*input.length;
		int [] output= new int [limit];
		for (int i=0; i<input.length; i++){
			output[i]=input[i];
		}
		return output;
		
	}
 	
}	