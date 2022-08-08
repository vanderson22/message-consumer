package br.com.prill.cm.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${prill.rabbitmq.queue}")
	public void recievedMessage(String employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee );
	}
}