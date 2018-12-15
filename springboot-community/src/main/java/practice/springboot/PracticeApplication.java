package practice.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

    private static Logger logger = LoggerFactory.getLogger(PracticeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);
//        System.out.println("启动成功");
        logger.info("启动成功");
    }
}
