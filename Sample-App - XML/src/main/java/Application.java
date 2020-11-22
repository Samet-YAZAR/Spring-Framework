import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //We just bootstrep our xml file where we did the injection.

        SpeakerService service = appContext.getBean("speakerService",SpeakerService.class);
        //SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstname());
    }
}

