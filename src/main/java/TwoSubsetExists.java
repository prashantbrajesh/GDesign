/**
 * Created by braj on 20/11/19.
 */
public class TwoSubsetExists {



    public static void main(String[] args) {

        int [] in= {3,3,4,4};

        int res =5;

        System.out.printf(" "+ exists(in,res,in.length-1));

    }

    private static boolean exists(int[] in,int res, int len) {

        if(res==0){
            return true;
        }else if(res<0 || len<=0){
            return false;
        }
        return exists(in,res-in[len],len-1) || exists(in, res,len-1);
    }
}
