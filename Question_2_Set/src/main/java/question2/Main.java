package question2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Questions question=(Questions) context.getBean("Questions");
		question.output();

	}

}