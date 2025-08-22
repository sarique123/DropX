package org.example.dropx.logic.server;

public interface ClientConnectionObserver {
    void onClientConnected(String clientInfo);
    void onClientDisconnected(String clientInfo);
}
