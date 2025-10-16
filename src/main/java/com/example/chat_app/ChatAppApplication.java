package com.example.chat_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@SpringBootApplication
public class ChatAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(ChatAppApplication.class, args);

		new Thread(() -> ChatServer.startServer(2006)).start();

	}


}
