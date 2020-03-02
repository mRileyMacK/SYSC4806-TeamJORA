package Application;

import Model.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages={"Application","Model", "Repository"})
@EnableJpaRepositories("Repository")
public class BootApplication {

    private static final Logger log = LoggerFactory.getLogger(BootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(StudentRepository repository) {
        return (args) -> {

            repository.save(new Student("Omar"));
            repository.save(new Student("Jack"));
            repository.save(new Student("Riley"));
            repository.save(new Student("Andrew"));
            repository.save(new Student("Logan"));

            log.info("Students found with findAll():");
            log.info("-------------------------------");

            for (Student student : repository.findAll()) {
                log.info(student.toString());
            }

            log.info("");

            /*
            Student buddyInfo = repository.findById(1L);
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(buddyInfo.toString());
            log.info("");
            */
        };
    }
}