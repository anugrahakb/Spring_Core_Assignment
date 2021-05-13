package question2;
import java.util.List;
import java.util.Map;

public class Questions {

	int questionId;
	String question;
	Map<Integer,String> answers;
	
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswers(Map<Integer,String> answers) {
		this.answers = answers;
	}
	public int getQuestionId() {
		return questionId;
	}
	public String getQuestion() {
		return question;
	}
	public Map<Integer,String> getAnswers() {
		return answers;
	}
	
	public void output()
	{
		System.out.println("Question ID is :"+this.getQuestionId());
		System.out.println("Question is :"+this.getQuestion());
		System.out.println("Answers are :"+this.getAnswers());
		
	}
	
}