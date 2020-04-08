package musicprojectnamingserver.music_naming_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MusicNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicNamingServerApplication.class, args);
    }

}
