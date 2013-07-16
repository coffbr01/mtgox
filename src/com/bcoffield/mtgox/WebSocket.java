package com.bcoffield.mtgox;

import android.util.Log;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

public class WebSocket extends WebSocketClient {
    public WebSocket(String s) {
        super(URI.create(s));
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        Log.w(getClass().getSimpleName(), "Open!");
    }

    @Override
    public void onMessage(String s) {
        Log.w(getClass().getSimpleName(), "Message! " + s);
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        Log.w(getClass().getSimpleName(), "Close!");
    }

    @Override
    public void onError(Exception e) {
        Log.e(getClass().getSimpleName(), "Error!", e);
    }
}
