//////////////////////////////////////////////////////
//Billy DeLucia
//
/*
Program should print out:

6666
666
66
6
555
55
5
44
4
3
2
1

*/
//

public class nestedLoops{
    public static void main(String [] args){
        for(int i=6; i>0; i--){
            int j=0;
            int z=i;
            do{
                //single triangle
                int k=0;
                do{
                    //single line
                    System.out.print(i);
                    k++;
                }while(k<z-2);
                System.out.println();
                j++;
                z--;
            }while(j<i-2);
        }
    }
}