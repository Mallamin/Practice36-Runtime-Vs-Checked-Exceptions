
public class Application {

	public static void main(String[] args) {
		try {
		String []text= {"one","two"};
		System.out.println(text[2]);

	}catch (RuntimeException e) {
		System.out.println(e.toString());
	}

}}
