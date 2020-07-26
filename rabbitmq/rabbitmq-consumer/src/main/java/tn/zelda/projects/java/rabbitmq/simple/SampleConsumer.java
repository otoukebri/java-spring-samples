package tn.zelda.projects.java.rabbitmq.simple;

//import com.rabbitmq.client

import java.io.IOException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class SampleConsumer {

	private final static String QUEUE_NAME = "my-rabbit-q1";

	public static void main(String[] argv) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		 Connection connection = factory.newConnection();
		 Channel channel = connection.createChannel();
		
		 channel.queueDeclare(QUEUE_NAME, true, false, false, null);
		 System.out.println(" [*] Waiting for messages. To exit pressCTRL+C");
		
		 Consumer consumer = new DefaultConsumer(channel) {
		 @Override
		 public void handleDelivery(String consumerTag, Envelope envelope,
		 AMQP.BasicProperties properties, byte[] body)
		 throws IOException {
		 String message = new String(body, "UTF-8");
		 System.out.println(" [x] Received '" + message + "'");
		 }
		 };
		 channel.basicConsume(QUEUE_NAME, true, consumer);
	}
}