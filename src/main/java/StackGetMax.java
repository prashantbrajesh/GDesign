import java.util.Stack;

/**
 * Created by braj on 23/11/19.
 */
public class StackGetMax {



    public static void main(String[] args) {

        StackUtils stackUtils = new StackUtils();
        stackUtils.push(1);
        System.out.printf(stackUtils.max().toString());
        stackUtils.push(2);
        System.out.printf(stackUtils.max().toString());
        stackUtils.push(5);
        System.out.printf(stackUtils.max().toString());
        stackUtils.push(3);
        stackUtils.pop();
        stackUtils.pop();
        System.out.printf(stackUtils.max().toString());
        stackUtils.push(9);
        System.out.printf(stackUtils.max().toString());
        stackUtils.push(6);
        System.out.printf(stackUtils.max().toString());


    }


    public static class StackUtils{
       private Stack<Integer> inOutStack = new Stack<Integer>();
       private Stack<Integer> maxStack = new Stack<Integer>();

        public void push(Integer in){
            if(inOutStack.empty())
                inOutStack.push(in);
            else if(inOutStack.peek()>in){
                maxStack.push(inOutStack.pop());
                inOutStack.push(in);
            }else {
                inOutStack.push(in);
            }
        }

        public Integer pop(){
            if(inOutStack.empty()){
                throw new RuntimeException(" nothing to pop");
            }else if (!maxStack.empty()){
                int tmp=inOutStack.pop();
                if(!inOutStack.empty()&&tmp<maxStack.peek()){
                    inOutStack.push(maxStack.pop());
                }
                return tmp;
            }else {
                return inOutStack.pop();
            }

        }

        private Integer max(){
            if (!maxStack.empty()){
                return maxStack.peek();
            }else if(!inOutStack.empty()){
                return inOutStack.peek();
            }else {
                throw new RuntimeException(" no max found");
            }
        }

    }



}
