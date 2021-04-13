/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.net.InetAddress
 *  java.net.Socket
 *  javax.net.ssl.SSLSocket
 *  javax.net.ssl.SSLSocketFactory
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.h9;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class i9
extends SSLSocketFactory {
    public final SSLSocketFactory a;

    public i9(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    public final Socket createSocket() {
        return new h9((SSLSocket)this.a.createSocket());
    }

    public final Socket createSocket(String string, int n2) {
        return new h9((SSLSocket)this.a.createSocket(string, n2));
    }

    public final Socket createSocket(String string, int n2, InetAddress inetAddress, int n10) {
        return new h9((SSLSocket)this.a.createSocket(string, n2, inetAddress, n10));
    }

    public final Socket createSocket(InetAddress inetAddress, int n2) {
        return new h9((SSLSocket)this.a.createSocket(inetAddress, n2));
    }

    public final Socket createSocket(InetAddress inetAddress, int n2, InetAddress inetAddress2, int n10) {
        return new h9((SSLSocket)this.a.createSocket(inetAddress, n2, inetAddress2, n10));
    }

    public final Socket createSocket(Socket socket, String string, int n2, boolean bl) {
        return new h9((SSLSocket)this.a.createSocket(socket, string, n2, bl));
    }

    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }
}

