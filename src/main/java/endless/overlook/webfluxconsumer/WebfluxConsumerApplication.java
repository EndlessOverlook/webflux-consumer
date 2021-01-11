package endless.overlook.webfluxconsumer;

import endless.overlook.webfluxconsumer.webflux.HelloWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxConsumerApplication.class, args);

        HelloWebClient gwc = new HelloWebClient();
        System.out.println(gwc.getResult());
    }

}
