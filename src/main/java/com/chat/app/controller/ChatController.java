package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ChatController {

  @MessageMapping("/sendMessage")
  @SendTo("/topic/messages")
  public ChatMessage sendMessage(ChatMessage message) {
    return message;
  }

  @GetMapping("chat")
  public String chat() {
    return "chat";
  }

}
