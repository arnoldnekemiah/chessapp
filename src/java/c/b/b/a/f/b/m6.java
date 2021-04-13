/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.util.List
 *  java.util.Map
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.g4;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.l6;
import c.b.b.a.f.b.n6;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public final class m6
implements Runnable {
    public final URL a;
    public final String b;
    public final /* synthetic */ n6 c;
    public final g4 d;

    public m6(String string, URL uRL, byte[] arrby, Map<String, String> map, g4 g42) {
        this.c = string;
        a.c((String)uRL);
        a.a(arrby);
        a.a(map);
        this.a = arrby;
        this.d = map;
        this.b = uRL;
    }

    public final void a(int n2, Exception exception, byte[] arrby, Map<String, List<String>> map) {
        f4 f42 = this.c.a.d();
        l6 l62 = new l6(this, n2, exception, arrby, map);
        f42.a(l62);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map map;
        int n2;
        IOException iOException;
        block22 : {
            Throwable throwable;
            block21 : {
                InputStream inputStream;
                void var11_11;
                block23 : {
                    byte[] arrby;
                    this.c.f();
                    httpURLConnection = this.c.a(this.a);
                    n2 = httpURLConnection.getResponseCode();
                    map = httpURLConnection.getHeaderFields();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        int n10;
                        byte[] arrby2 = new byte[1024];
                        while ((n10 = inputStream.read(arrby2)) > 0) {
                            byteArrayOutputStream.write(arrby2, 0, n10);
                        }
                        arrby = byteArrayOutputStream.toByteArray();
                    }
                    catch (Throwable throwable2) {}
                    inputStream.close();
                    httpURLConnection.disconnect();
                    this.a(n2, null, arrby, (Map<String, List<String>>)map);
                    return;
                    break block23;
                    catch (Throwable throwable3) {
                        inputStream = null;
                    }
                }
                if (inputStream == null) throw var11_11;
                try {
                    inputStream.close();
                    throw var11_11;
                }
                catch (Throwable throwable4) {}
                catch (IOException iOException2) {}
                finally {
                    break block21;
                }
                catch (Throwable throwable5) {
                    map = null;
                    break block21;
                }
                catch (IOException iOException3) {
                    map = null;
                    break block22;
                }
                catch (Throwable throwable6) {
                    throwable = throwable6;
                    n2 = 0;
                    map = null;
                    break block21;
                }
                catch (IOException iOException4) {
                    iOException = iOException4;
                    n2 = 0;
                    map = null;
                    break block22;
                }
                catch (Throwable throwable7) {
                    map = null;
                    throwable = throwable7;
                    n2 = 0;
                    httpURLConnection = null;
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            this.a(n2, null, null, (Map<String, List<String>>)map);
            throw throwable;
            catch (IOException iOException5) {
                map = null;
                iOException = iOException5;
                n2 = 0;
                httpURLConnection = null;
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.a(n2, (Exception)((Object)iOException), null, (Map<String, List<String>>)map);
    }
}

