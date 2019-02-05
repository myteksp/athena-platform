package com.vivala.sockets.client;

public interface VivalaSender {
	void send(final String message);
	void sendNotSafe(final String message);
	void close();
}
