import junit.framework.TestCase;

/**
 * Created by braj on 23/11/19.
 */
public class TriTest extends TestCase {


    public void testInsert() throws Exception {
        Tri t = new Tri();
        t.insert("ANT");

        t.insert("AROPLANE");

        t.printTreeUtil();
    }

}