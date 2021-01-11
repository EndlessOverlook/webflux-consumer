package endless.overlook.webfluxconsumer.webflux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Description:<b></b>
 *
 * @author LKL
 * @since 1/8/21 10:07 PM
 **/
@Configuration
public class RoutingConfiguration {

    @Bean
    public RouterFunction<ServerResponse> monoRouterFunction(
            HelloHandler helloHandler) {
        return RouterFunctions.route(RequestPredicates.GET("/webclient")
                        .and(RequestPredicates.contentType(MediaType.APPLICATION_JSON)),
                helloHandler::hello);

    }
}
