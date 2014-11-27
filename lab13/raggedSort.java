/////////////////////////////////////////
//Billy DeLucia
//CSE002
//Lab13
//
//
public class raggedSort{
    public static void main(String [] args){
       int [][] Array=new int [5] [];
       int raggedLength=0;
       //assign
       for (int i=0; i<5;i++){
           raggedLength=i*3 + 5;
           Array[i]= new int [raggedLength];
           //
           //     System.out.println(Array[i].length);
           //Populate
           for (int j=0; j<raggedLength; j++){
               Array[i][j]=(int)(Math.random()*40);
           }
           
       }
       printArray(Array);
       sort(Array);
       System.out.println("- - - - - - - -");
       printArray(Array);
    }
    
    public static void printArray(int [] [] Array){
        int x=Array.length;
        int y=0;
        for (int i=0; i<x; i++){
            y=Array[i].length;
            for (int j=0; j<y; j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    //finds the minimum value within a certain range in a single row of a two dimentional array
    public static int findMinInRange(int [] [] A, int row, int min, int max){
        if( min<0 || min>max || max>A[row].length){
            System.out.println("Error");
            return -1;
        }
        int index=min;
        int tempMin= A [row][min];
        for(int i=min; i<=max; i++){
            if (tempMin>A[row][i]){
                tempMin=A[row][i];
                index=i;
                
            }
        }
        
        return index;
        
    }
    
    public static void swapMember(int [][] A, int row, int a, int b){
        int temp=A[row][a];
        A[row][a]=A[row][b];
        A[row][b]=temp;
    }
    
    //sorts a single row of the two dimentional array
    public static void sort(int [][] Array){
        int x=Array.length;
        int y=0;
        int swap=0;
        for (int i=0; i<x; i++){
            y=Array[i].length;
            for (int j=0; j<y; j++){
                swap=findMinInRange(Array, i, j, y-1);
                swapMember(Array, i, j, swap);
            }
        }
    }
}