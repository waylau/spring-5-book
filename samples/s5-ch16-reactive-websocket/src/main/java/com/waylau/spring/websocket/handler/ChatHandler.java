/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.websocket.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;

import reactor.core.publisher.Mono;

/**
 * Chat Handler.
 * 
 * @since 1.0.0 2018年4月9日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Component
public class ChatHandler implements WebSocketHandler {

	@Override
	public Mono<Void> handle(WebSocketSession session) {
		return session.send(
				session.receive().map(msg 
						-> session.textMessage(session.getId() + ":" + msg.getPayloadAsText())));
	}

}
