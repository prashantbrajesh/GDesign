/**
 * Created by braj on 23/11/19.
 */
public  class TriNode{
    private TriNode[] nodes = new TriNode[26];
    private Boolean isLast=true;



    public TriNode[] getNodes() {
        return nodes;
    }

    public void setNodes(TriNode[] nodes) {
        this.nodes = nodes;
    }

    public Boolean getLast() {
        return isLast;
    }

    public void setLast(Boolean last) {
        isLast = last;
    }
}
