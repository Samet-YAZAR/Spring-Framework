import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    //configure Annotations.
    //@Configuration

        @Bean(name="speakerservice")
        public SpeakerService getSpeakerService(){
            return new SpeakerServiceImpl();
        }
}
