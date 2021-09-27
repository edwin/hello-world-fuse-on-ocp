package com.edw.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * <pre>
 *     com.edw.routes.HelloWorldRoute
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 13 Agt 2021 15:53
 */
@Component
public class HelloWorldRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        rest()
                .get("hello")
                .route()
                .setHeader(Exchange.HTTP_RESPONSE_CODE, simple("200"))
                .setHeader(Exchange.CONTENT_TYPE, simple("application/json"))
                .setBody(constant("{\"hello\":\"world\"}"))
                .endRest()
        ;
    }

}
