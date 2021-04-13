/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.util.Log
 *  com.google.android.gms.ads.identifier.zzc
 *  java.io.IOException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.Map
 *  java.util.Set
 */
package c.b.b.a.a.e;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.ads.identifier.zzc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

public final class a
extends Thread {
    public final /* synthetic */ Map a;

    public a(Map map) {
        this.a = map;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        StringBuilder stringBuilder;
        void var6_12;
        String string2;
        String string3;
        String string;
        block10 : {
            HttpURLConnection httpURLConnection;
            block8 : {
                new zzc();
                Map map = this.a;
                Uri.Builder builder = Uri.parse((String)"https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String string4 : map.keySet()) {
                    builder.appendQueryParameter(string4, (String)map.get((Object)string4));
                }
                string3 = builder.build().toString();
                httpURLConnection = (HttpURLConnection)new URL(string3).openConnection();
                int n2 = httpURLConnection.getResponseCode();
                if (n2 >= 200 && n2 < 300) break block8;
                StringBuilder stringBuilder2 = new StringBuilder(65 + String.valueOf((Object)string3).length());
                stringBuilder2.append("Received non-success response code ");
                stringBuilder2.append(n2);
                stringBuilder2.append(" from pinging URL: ");
                stringBuilder2.append(string3);
                Log.w((String)"HttpUrlPinger", (String)stringBuilder2.toString());
                {
                    catch (Throwable throwable) {
                        httpURLConnection.disconnect();
                        throw throwable;
                    }
                }
            }
            try {
                httpURLConnection.disconnect();
                return;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            string = var6_12.getMessage();
            stringBuilder = new StringBuilder(c.a.b.a.a.a(string, c.a.b.a.a.a(string3, 27)));
            string2 = "Error while pinging URL: ";
            break block10;
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                string = indexOutOfBoundsException.getMessage();
                stringBuilder = new StringBuilder(c.a.b.a.a.a(string, c.a.b.a.a.a(string3, 32)));
                string2 = "Error while parsing ping URL: ";
            }
        }
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(". ");
        stringBuilder.append(string);
        Log.w((String)"HttpUrlPinger", (String)stringBuilder.toString(), (Throwable)var6_12);
    }
}

