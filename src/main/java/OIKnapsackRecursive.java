/**
 * Created by braj on 19/11/19.
 */
public class OIKnapsackRecursive {

    static int[] value= {60,100,120};
    static int[] weight= {10,20,30};

    int W = 50;

    public static void main(String[] args) {



        System.out.println(maxValue(3,50));


    }

    private static int maxValue(int i, int w){
        if(w==0 || i==0)
            return 0;
        return Math.max(
                maxValue(i-1,w-weight[i-1])+value[i-1]
                ,maxValue(i-1,w)
        );

    }
}
