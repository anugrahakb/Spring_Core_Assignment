package question3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  


public class Main
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("Beans.xml");  
        BankAccController obj=(BankAccController)applicationcontext.getBean("obj");  
        obj.withdraw();     
        }
}
