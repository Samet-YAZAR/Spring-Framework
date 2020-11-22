import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import util.CalendarFactory;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {
    //configure Annotations.
    //@Configuration

    @Bean(name="cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }
    @Bean
    public Calendar cal()throws Exception{
        return calFactory().getObject();
    }
/*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        // service.setRepository(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }*/
}
// bu altli ustlu yapiya Setter injection Diyoruz.
//likely setter injection, in constructor injection, we just assing service through the
//way of constructior.l



/*
 * simdi dusunelim, repository paketi altinda bir speakerRepo var ama onu implement eden
 * 10 class olsun, bu 10 farkli Dependancy injection anlamina gelir, bu cok istedigimi
 * bir sey degil, aynisii service icinde dusunelim.
 * Biz burada sub classta service olarak reponun interfaceini field olarak kullanip setterini yazdik.
 * */