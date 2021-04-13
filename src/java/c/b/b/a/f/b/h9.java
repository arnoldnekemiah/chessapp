/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.net.InetAddress
 *  java.net.SocketAddress
 *  java.nio.channels.SocketChannel
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  javax.net.ssl.HandshakeCompletedListener
 *  javax.net.ssl.SSLSession
 *  javax.net.ssl.SSLSocket
 */
package c.b.b.a.f.b;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

public final class h9
extends SSLSocket {
    public final SSLSocket a;

    public h9(SSLSocket sSLSocket) {
        this.a = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) {
        this.a.bind(socketAddress);
    }

    public final void close() {
        h9 h92 = this;
        synchronized (h92) {
            this.a.close();
            return;
        }
    }

    public final void connect(SocketAddress socketAddress) {
        this.a.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int n2) {
        this.a.connect(socketAddress, n2);
    }

    public final boolean equals(Object object) {
        return this.a.equals(object);
    }

    public final SocketChannel getChannel() {
        return this.a.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.a.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.a.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.a.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.a.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.a.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.a.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.a.getNeedClientAuth();
    }

    public final boolean getOOBInline() {
        return this.a.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.a.getOutputStream();
    }

    public final int getPort() {
        return this.a.getPort();
    }

    public final int getReceiveBufferSize() {
        h9 h92 = this;
        synchronized (h92) {
            int n2 = this.a.getReceiveBufferSize();
            return n2;
        }
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.a.getReuseAddress();
    }

    public final int getSendBufferSize() {
        h9 h92 = this;
        synchronized (h92) {
            int n2 = this.a.getSendBufferSize();
            return n2;
        }
    }

    public final SSLSession getSession() {
        return this.a.getSession();
    }

    public final int getSoLinger() {
        return this.a.getSoLinger();
    }

    public final int getSoTimeout() {
        h9 h92 = this;
        synchronized (h92) {
            int n2 = this.a.getSoTimeout();
            return n2;
        }
    }

    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.a.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() {
        return this.a.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.a.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.a.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.a.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.a.isBound();
    }

    public final boolean isClosed() {
        return this.a.isClosed();
    }

    public final boolean isConnected() {
        return this.a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.a.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int n2) {
        this.a.sendUrgentData(n2);
    }

    public final void setEnableSessionCreation(boolean bl) {
        this.a.setEnableSessionCreation(bl);
    }

    public final void setEnabledCipherSuites(String[] arrstring) {
        this.a.setEnabledCipherSuites(arrstring);
    }

    public final void setEnabledProtocols(String[] arrstring) {
        if (arrstring != null && Arrays.asList((Object[])arrstring).contains((Object)"SSLv3")) {
            ArrayList arrayList = new ArrayList((Collection)Arrays.asList((Object[])this.a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove((Object)"SSLv3");
            }
            arrstring = (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
        }
        this.a.setEnabledProtocols(arrstring);
    }

    public final void setKeepAlive(boolean bl) {
        this.a.setKeepAlive(bl);
    }

    public final void setNeedClientAuth(boolean bl) {
        this.a.setNeedClientAuth(bl);
    }

    public final void setOOBInline(boolean bl) {
        this.a.setOOBInline(bl);
    }

    public final void setPerformancePreferences(int n2, int n10, int n11) {
        this.a.setPerformancePreferences(n2, n10, n11);
    }

    public final void setReceiveBufferSize(int n2) {
        h9 h92 = this;
        synchronized (h92) {
            this.a.setReceiveBufferSize(n2);
            return;
        }
    }

    public final void setReuseAddress(boolean bl) {
        this.a.setReuseAddress(bl);
    }

    public final void setSendBufferSize(int n2) {
        h9 h92 = this;
        synchronized (h92) {
            this.a.setSendBufferSize(n2);
            return;
        }
    }

    public final void setSoLinger(boolean bl, int n2) {
        this.a.setSoLinger(bl, n2);
    }

    public final void setSoTimeout(int n2) {
        h9 h92 = this;
        synchronized (h92) {
            this.a.setSoTimeout(n2);
            return;
        }
    }

    public final void setTcpNoDelay(boolean bl) {
        this.a.setTcpNoDelay(bl);
    }

    public final void setTrafficClass(int n2) {
        this.a.setTrafficClass(n2);
    }

    public final void setUseClientMode(boolean bl) {
        this.a.setUseClientMode(bl);
    }

    public final void setWantClientAuth(boolean bl) {
        this.a.setWantClientAuth(bl);
    }

    public final void shutdownInput() {
        this.a.shutdownInput();
    }

    public final void shutdownOutput() {
        this.a.shutdownOutput();
    }

    public final void startHandshake() {
        this.a.startHandshake();
    }

    public final String toString() {
        return this.a.toString();
    }
}

