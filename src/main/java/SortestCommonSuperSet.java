/**
 * Created by braj on 18/11/19.
 */
public class SortestCommonSuperSet {

    public static void main(String[] args) {

        char[] row = "AGTAB".toCharArray();
        char[] col = "GXTXAYB".toCharArray();

        int[][] cache = new int[row.length+1][col.length+1];

        for (int i = 0; i <=row.length ; i++) {
            for (int j = 0; j <=col.length ; j++) {
                if(i==0){
                    cache[i][j]=j;
                    continue;
                }


                if(j==0){
                    cache[i][j]=i;
                    continue;
                }


                int min=Math.min(cache[i][j-1],cache[i-1][j]);
                if(row[i-1]==col[j-1]){
                    cache[i][j]=cache[i-1][j-1]+1;
                }else {
                    cache[i][j]=min+1;
                }
            }
        }

        for (int i = 0; i <=row.length ; i++) {
            for (int j = 0; j <=col.length ; j++) {
                System.out.printf(","+cache[i][j]);
            }
            System.out.println();
        }

    }
}
