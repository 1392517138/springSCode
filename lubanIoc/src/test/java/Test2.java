/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 17:52 2020/8/2 0002
 */
public class Test2 {
	public static void main(String[] args) {
		B b = new B();
	}
}
class B{
	final Integer a = new Integer(1);
	String b = "123";
	String c;
	public B(){
		System.out.println("B初始化了！！");
	}
}
