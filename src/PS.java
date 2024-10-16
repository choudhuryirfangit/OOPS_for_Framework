import org.testng.annotations.Test;

public class PS extends PS1 {
	
	@Test
	public void getPS1() {
		int a=3;
		PS2 ps2=new PS2(a);
		doThis();
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		
//		PS3 ps3=new PS3(a);
		System.out.println(ps2.multiplytwo());
		System.out.println(ps2.multiplythree());
		
	}
}
