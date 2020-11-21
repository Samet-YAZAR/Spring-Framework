import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    //configure Annotations.
    //@Configuration

        @Bean(name="speakerService")
        public SpeakerService getSpeakerService(){
            SpeakerServiceImpl service = new SpeakerServiceImpl();
            service.setRepository(getSpeakerRepository());
            return service;
        }

        @Bean(name="speakerRepository")
        public SpeakerRepository getSpeakerRepository(){
            return new HibernateSpeakerRepositoryImpl();
        }
    } // bu altli ustlu yapiya Setter injection Diyoruz.




/*
* simdi dusunelim, repository paketi altinda bir speakerRepo var ama onu implement eden
* 10 class olsun, bu 10 farkli Dependancy injection anlamina gelir, bu cok istedigimi
* bir sey degil, aynisii service icinde dusunelim.
* Biz burada sub classta service olarak reponun interfaceini field olarak kullanip setterini yazdik.
*
* */