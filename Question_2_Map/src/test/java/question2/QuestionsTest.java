package question2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class QuestionsTest {

	@Test
	void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Questions que=(Questions) context.getBean("Questions");
		assertAll(
				()->assertEquals(que.getQuestion(),"Can you share your hobbies?"),
				()->assertEquals(que.getQuestionId(),3)
			);
	}

}