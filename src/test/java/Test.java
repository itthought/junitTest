/**
 * @author: Radhey Shyam
 * Date: 07/01/19
 * Time: 4:21 PM
 */

public class Test {
    @org.junit.Test
    public void test() {
        String args[] = { "test/testfile.txt" };
        TestJunit test2 = new TestJunit();
        test2.load(args[0]);
    }
}
