import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS1 {

	public void doThis() {
		System.out.println("I am from another class-PS2");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("I am before Method");
	}
	@AfterMethod
	public void AM() {
		System.out.println("I am after Method");
	}

}
