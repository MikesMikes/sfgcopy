package sfg.sfgcopy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sfg.sfgcopy.repositories.EnglishGreetingRepository;
import sfg.sfgcopy.repositories.EnglishGreetingRepositoryImpl;
import sfg.sfgcopy.services.I18nEnglishGreetingService;

@Configuration
public class GreetingServiceConfig {


    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }
}
