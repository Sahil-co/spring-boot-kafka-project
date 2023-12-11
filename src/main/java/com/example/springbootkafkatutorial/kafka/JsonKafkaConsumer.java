package com.example.springbootkafkatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.springbootkafkatutorial.payload.User;

@Service
public class JsonKafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);
	
	@KafkaListener(topics = "javaguides_json", groupId = "myGroup")
	public void consume(User user) {
		LOGGER.info(String.format("Json Message recieved -> %s" , user.toString()));
	}
}
