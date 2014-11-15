/////////////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//homework 10
//
//This Program accepts ten user entered integers and stored them in an array. It then 
// checks the array to see if the user entered any two equal integers and then checks to see if you entered exactluy one 
//matching pair. 
import java.util.Scanner;
public class FindDuplicates{
    public static void main(String [] arg){
      Scanner scan=new Scanner(System.in);
      int num[]=new int[10];
      String answer="";
      do{
        System.out.print("Enter 10 ints- ");
        for(int j=0;j<10;j++){
          num[j]=scan.nextInt();
        }
        String out="The array ";
        out+=listArray(num); //return a string of the form "{2, 3, -9}"   
        if(hasDups(num)){
          out+="has ";
        }
        else{
          out+="does not have ";
        }
        out+="duplicates.";
        System.out.println(out);
        out="The array ";
        out+=listArray(num);    
        if(exactlyOneDup(num)){
          out+="has ";
        }
        else{
          out+="does not have ";
        }
        out+="exactly one duplicate.";
        System.out.println(out);
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        answer=scan.next();
      }while(answer.equals("Y") || answer.equals("y"));
    }
  
    public static String listArray(int num[]){
      String out="{";
      for(int j=0;j<num.length;j++){
        if(j>0){
          out+=", ";
        }
        out+=num[j];
      }
      out+="} ";
      return out;
    }
    
    //
    public static boolean hasDups(int [] a){
      int limit=a.length;
      for (int i=0; i<limit; i++){
        for (int j=0; j<limit; j++){
          if (j==i){
            continue;
          }
          else{
            if (a[i]==a[j]){
              return true;
            }
          }
        }
      }
      return false;
    }
    
    //
    public static boolean exactlyOneDup(int [] a){
      int limit=a.length;
      int dubs=0;
      for (int i=0; i<limit; i++){
        for (int j=0; j<limit; j++){
          if (j==i){
            continue;
          }
          else{
            if (a[i]==a[j]){
              dubs++;
            }
          }
        }
      }
      boolean output= dubs==1;
      return output;
    }
}