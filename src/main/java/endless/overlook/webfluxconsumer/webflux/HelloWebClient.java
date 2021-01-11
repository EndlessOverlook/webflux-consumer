package endless.overlook.webfluxconsumer.webflux;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * Description:<b></b>
 *
 * @author LKL
 * @since 1/8/21 10:19 PM
 **/
public class HelloWebClient {

    private WebClient client = WebClient.create("http://localhost:8080");

    private Mono<ClientResponse> result = client.get().uri("/hello")
            .accept(MediaType.APPLICATION_JSON).exchange();

    public String getResult() {
        return ">> result = " + result
                .flatMap(res -> res.bodyToMono(String.class)).block();
    }
}
