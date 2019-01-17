package springboot.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot入门系列
 * http://www.spring4all.com/article/246
 */
@SpringBootApplication
public class CommunityApp {

    private static Logger logger = LoggerFactory.getLogger(CommunityApp.class);

    public static void main(String[] args) {
        SpringApplication.run(CommunityApp.class, args);
        System.out.println("启动成功1");
        logger.info("启动成功2");
    }
}