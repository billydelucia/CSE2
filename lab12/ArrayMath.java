////////////////////////////////////////////////////////////////////////
//Billy DeLucia
//lab12
//
//

public class ArrayMath{
      public static void main(String [] arg){
            double x[]={2.3, 3, 4, -2.1, 82, 23},
              y[]={2.3, 3, 4, -2.1, 82, 23},
              z[]={2.3, 13, 14},
              w[]={2.3, 13, 14, 12}, 
              v[],
              u[]={2.3, 12, 14};
            //
            v=new double[10];
            //
           v=addArrays(x,y);
            System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
            System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                                 +display(addArrays(x,z)));
            System.out.println("It is " + equals(x,y)+" that "+display(x)+
                               " == "+display(y));
            System.out.println("It is " + equals(z,w)+" that "+display(z)+
                               " == "+display(w));
            System.out.println("It is " + equals(u,z)+" that "+display(u)+
                               " == "+display(z));
    
      }
  
     public static String display(double [] x){
            String out="{";
            for(int j=0;j<x.length;j++){
              if(j>0){
                out+=", ";
              }
              out+=x[j];
            }
            return out+"}";
     }

    // adds the contents of two integer arrays and returns the sum of each 
    // indexed integer in an output array.
    public static double [] addArrays(double [] a, double [] b){
        int limit=0;
        if (a.length< b.length){
            limit=a.length;
        }
        else{
            limit=b.length;
        }
        double [] output= new double[limit];
        
        for (int  i=0; i<limit; i++){
         output [i]=a[i]+b[i];   
        }
        return output;
    }
    
    // Checks if two arrays have teh same integer values in each of their indexes
    public static boolean equals(double [] a, double [] b){
        int limit=0;
        if (a.length!= b.length){
            return false;
        }
        else{
            limit=b.length;
        }
        boolean output=false;
        for (int i=0; i<limit; i++){
            if(a[i]!=b[i]){
                output=false;
                break;
            }
            else{
                output=true;
            }
        }
        return output;
    }
}
