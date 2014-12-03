//////////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//homework 11
//
//This program creates a ragged three demential array. 
//Then it sorts the array.

public class MatrixSorter{
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+
      			findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);

   }
   
   //This method alocates a three demential array
   //Then populates the array with random numbers [0,99]
   public static int [][][] buildMat3d(){
       int output[][][]= new int [3][][];
       int rows=0;
       int columns=0;
       for (int i=0; i<3; i++){
           rows=3 + 2*i;
            output[i]=new int [rows][];
            for (int j=0; j<rows; j++){
                columns=i+j+1;
                output[i][j]=new int [columns];
                for (int z=0; z<columns; z++){
                    output[i][j][z]=(int)(Math.random()*100);
                }
            }
       }
       return output;
   }
   
   // This method prints out a three demential array
   public static void show(int [][][] array){
       int slabs=0, rows=0, columns=0;
       slabs=array.length;
       for (int i=0; i<slabs; i++){
           System.out.println("--------------------------Slab "+(i+1));
           rows=array[i].length;
           for (int j=0; j<rows; j++){
               columns=array[i][j].length;
               for(int z=0; z<columns; z++){
                   System.out.print(array[i][j][z]+" ");
               }
               System.out.println();
           }
       }
   }
   
   //This method finds the smallest value in a three demential array
   public static int findMin(int [][][] array){
       int min=array[0][0][0];
       int slabs=array.length;
       int rows=0, columns=0;
       for (int i=0; i<slabs; i++){
           rows=array[i].length;
           for (int j=0; j<rows; j++){
               columns=array[i][j].length;
               for (int z=0; z<columns; z++){
                   if (array[i][j][z]<min){
                       min=array[i][j][z];
                   }
               }
           }
       }
       return min;
   }
   
   //This method sorts a two demential array or a single slab of a three demential array
   public static void sort(int [][] slab){
       int rows=slab.length;
       int columns=0;
       for (int i=0; i<rows; i++){
           sort(slab[i]);
           rowsort(slab);
       }
   }
   
   //This method sorts a single demential array
   public static void sort(int [] row){
       int columns=row.length;
       int min=row[0];
       for (int i=0; i<columns; i++){
           min=findMinInRange(row,i,columns-1);
           swapMember(row,i,min);
       }
   }
   
   //This method finds the index of the minimum value in a certain range of a single demential array
   public static int findMinInRange(int [] array, int min, int max){
       int index=min;
       for (int i=min; i<=max; i++){
           if(array[index]>array[i]){
               index=i;
           }
       }
       return index;
   }
   
   //This method swaps two members of an array with given indicies
   public static void swapMember(int [] array, int a, int b){
       int temp=array[a];
       array[a]=array[b];
       array[b]=temp;
   }
   
   //This method sorts the rows in a two demential array based on their first value
   public static void rowsort(int [][] array){
       int rows=array.length;
       for (int i=0; i<rows; i++){
           int minRow=findRowWithMinInRange(array,i,rows-1);
           swapRows(array,i,minRow);
       }
   }
   
   //This method finds the row with the samllest first value in a two demential array
   public static int findRowWithMinInRange(int [][] array, int min, int max){
       int row=min;
       for (int i=min; i<=max; i++){
           if (array[min][0]>array[i][0]){
               row=i;
           }
       }
       return row;
   }
   
   //This method swaps two rows in a two demential array
   public static void swapRows(int [][] array, int a, int b){
       int [] temp=new int [array[a].length];
       for (int i=0; i<array[a].length; i++){
           temp[i]=array[a][i];
       }
       array[a]=array[b];
       array[b]=temp;
   }
}