package com.vivala.sockets.client;

import java.util.List;

public interface VivalaMultichannelSender {
	void send(final List<String> channels, final String message);
	void sendNotSafe(final List<String> channels, final String message);
	void close();
}
