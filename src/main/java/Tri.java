/**
 * Created by braj on 23/11/19.
 */
public class Tri {

    private TriNode root= new TriNode();

    static Character[] cha = new Character[26];



    public void insert(String in){

        TriNode tmp = root;
        for (Character c:in.toCharArray()
             ) {
            if(tmp.getNodes()[c-'A']==null){
                tmp.getNodes()[c-'A']=new TriNode();
            }
            tmp.getNodes()[c-'A'].setLast(false);
                tmp= tmp.getNodes()[c-'A'];

            }
        }


    public void printTreeUtil(){
        printTree(root);
    }

    private void printTree( TriNode node){


            for (int i = 0; i <node.getNodes().length ; i++) {

                if(node.getNodes()[i]!=null){
                    System.out.print((char)(i+'A'));
                    if(node.getNodes()[i].getLast()){
                        System.out.println();
                        return;

                    }

                    printTree(node.getNodes()[i]);
                }

            }


    }


}
