
import junit.framework.TestCase;
public class factorialTest extends TestCase{
public void test1(){
int a=3;
int b=6;
assertEquals(b,factorial.fact(a));
}
public void test2(){
int a=4;
int b=24;
assertEquals(b,factorial.fact(a));
}
}