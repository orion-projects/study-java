package org.example.spring.web.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.DelegatingWebSocketConfiguration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.support.WebSocketHttpRequestHandler;

import java.util.List;

//@Configuration
public class WebSocketConfig extends DelegatingWebSocketConfiguration {

    @Override
    protected void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        super.registerWebSocketHandlers(registry);
        registry.addHandler(new WebSocketHandler(), "/ws/websocket");
    }
}
