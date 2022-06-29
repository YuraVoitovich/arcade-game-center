package com.example.ksis_3.service;

import com.example.ksis_3.websocket.SessionMessage;
import com.example.ksis_3.websocket.UsersSession;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketSession;

@Service
public interface GameWebSocketService {

    void afterConnectionClosed(WebSocketSession session);

    void handleMessage(WebSocketSession session, SessionMessage sessionMessage);

}
