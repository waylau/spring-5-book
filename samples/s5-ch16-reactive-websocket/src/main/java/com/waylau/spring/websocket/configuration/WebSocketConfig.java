/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.websocket.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.server.WebSocketService;
import org.springframework.web.reactive.socket.server.support.HandshakeWebSocketService;
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;
import org.springframework.web.reactive.socket.server.upgrade.JettyRequestUpgradeStrategy;

import com.waylau.spring.websocket.handler.ChatHandler;

/**
 * WebSocket Config.
 * 
 * @since 1.0.0 2018年4月9日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Configuration
public class WebSocketConfig {

	@Bean
	public HandlerMapping webSocketMapping(final ChatHandler echoHandler) {
		final Map<String, WebSocketHandler> map = new HashMap<>(1);
		map.put("/chat", echoHandler);

		final SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
		mapping.setOrder(Ordered.HIGHEST_PRECEDENCE);
		mapping.setUrlMap(map);
		return mapping;
	}

	@Bean
	public WebSocketHandlerAdapter handlerAdapter() {
		 return new WebSocketHandlerAdapter(webSocketService());
    }

    @Bean
    public WebSocketService webSocketService() {
    	JettyRequestUpgradeStrategy strategy = new JettyRequestUpgradeStrategy();
        return new HandshakeWebSocketService(strategy);
    }
}
