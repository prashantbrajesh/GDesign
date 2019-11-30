package dynamicProgramming;

/**
 * Created by braj on 27/07/19.
 */
public class Permutation {

    int count=0;

    public void printPermutation(String in,int s, int e ){

        if(s==e)
            printData(in.toString());

        for (int i = s; i <=e ; i++) {
            in=swap(in,i,s);
            printPermutation(in,s+1,e);
            in=swap(in,i,s);
        }

    }


    private String swap(String in, int a, int b){
        char[] array= in.toCharArray();

        char tmp = array[a];
        array[a]=array[b];
        array[b]=tmp;
        return String.valueOf(array);
    }

    private void printData(String s){
        System.out.printf(""+ this.count++ +" ,");
        System.out.println(s);
    }
}
