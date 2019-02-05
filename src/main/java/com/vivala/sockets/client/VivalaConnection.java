package com.vivala.sockets.client;

public interface VivalaConnection extends VivalaSender{
	void addHandler(final MessageHandler handler);
	void deleteHandler(final MessageHandler handler);
}
