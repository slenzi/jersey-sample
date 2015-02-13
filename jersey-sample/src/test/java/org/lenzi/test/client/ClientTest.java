package org.lenzi.test.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

public class ClientTest {

	private final String SAMPLE_ENDPOINT = "http://localhost:8080/jersey-sample/jersey";
	
	public ClientTest() {

	}

	public static void main(String[] args) {
		(new ClientTest()).doClientTest();
	}
	
	public void doClientTest(){
		
		ClientConfig config = new ClientConfig();
	    Client client = ClientBuilder.newClient(config);
	    
	    doHelloTest(client);
	    doHelloJsonTest(client);
	    doSampleTest(client);
	    
	}

	/**
	 * Fetch hello message in plain text format
	 * 
	 * @param client
	 */
	private void doHelloTest(Client client){
	    WebTarget target = client.target(SAMPLE_ENDPOINT);
	    target = target.path("/sample");
	    Response resp = target.request().accept(MediaType.TEXT_PLAIN).get();
	    String message = resp.readEntity(String.class);
	    System.out.println("Reply from server: " + message);		
	}
	
	/**
	 * Fetch hello message in json format
	 * 
	 * @param client
	 */
	private void doHelloJsonTest(Client client){
	    WebTarget target = client.target(SAMPLE_ENDPOINT);
	    target = target.path("/sample/samplejson");
	    Response resp = target.request().accept(MediaType.APPLICATION_JSON).get();
	    String message = resp.readEntity(String.class);
	    System.out.println("Reply from server: " + message);		
	}
	
	/**
	 * Fetch sample test
	 * 
	 * @param client
	 */
	private void doSampleTest(Client client) {
	    WebTarget target = client.target(SAMPLE_ENDPOINT);
	    target = target.path("/sample/1");
	    Response resp = target.request().accept(MediaType.TEXT_PLAIN).get();
	    String message = resp.readEntity(String.class);
	    System.out.println("Reply from server: " + message);
	}	

}
