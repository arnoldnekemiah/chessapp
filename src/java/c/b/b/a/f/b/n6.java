/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  c.b.b.a.f.b.i9
 *  java.io.IOException
 *  java.lang.String
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  javax.net.ssl.HttpsURLConnection
 *  javax.net.ssl.SSLSocketFactory
 */
package c.b.b.a.f.b;

import android.os.Build;
import c.b.b.a.f.b.d5;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.i9;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class n6
extends d5 {
    public final SSLSocketFactory c;

    public n6(i4 i42) {
        super(i42);
        i9 i92 = Build.VERSION.SDK_INT < 19 ? new i9(HttpsURLConnection.getDefaultSSLSocketFactory()) : null;
        this.c = i92;
    }

    public final HttpURLConnection a(URL uRL) {
        URLConnection uRLConnection = uRL.openConnection();
        if (uRLConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.c;
            if (sSLSocketFactory != null && uRLConnection instanceof HttpsURLConnection) {
                ((HttpsURLConnection)uRLConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRLConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    @Override
    public final boolean h() {
        return false;
    }
}

