package com.example.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.model.User;

@Service
public class ConsumerService {

	@KafkaListener(topics = "user", groupId = "group_id", containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed JSON Message: " + user);
	}
}
