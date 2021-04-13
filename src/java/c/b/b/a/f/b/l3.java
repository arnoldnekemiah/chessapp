/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.c9;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j3;
import c.b.b.a.f.b.k3;
import c.b.b.a.f.b.m3;
import c.b.b.a.f.b.r8;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Set;

public final class l3
implements Runnable {
    public final URL a;
    public final byte[] b;
    public final j3 c;
    public final String d;
    public final Map<String, String> e;
    public final /* synthetic */ m3 f;

    public l3(String string, URL uRL, byte[] arrby, Map<String, String> map, j3 j32) {
        this.f = var1_1;
        a.c(string);
        a.a(uRL);
        a.a(j32);
        this.a = uRL;
        this.b = arrby;
        this.c = j32;
        this.d = string;
        this.e = map;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        k3 k32;
        f4 f42;
        block38 : {
            HttpURLConnection httpURLConnection;
            OutputStream outputStream;
            int n2;
            Map map;
            IOException iOException;
            block40 : {
                block34 : {
                    IOException iOException2;
                    block37 : {
                        Throwable throwable;
                        block35 : {
                            block33 : {
                                IOException iOException3;
                                block36 : {
                                    void var22_29;
                                    InputStream inputStream;
                                    block39 : {
                                        byte[] arrby;
                                        block32 : {
                                            this.f.f();
                                            outputStream = null;
                                            httpURLConnection = this.f.a(this.a);
                                            Map<String, String> map2 = this.e;
                                            if (map2 != null) {
                                                for (Map.Entry entry : map2.entrySet()) {
                                                    httpURLConnection.addRequestProperty((String)entry.getKey(), (String)entry.getValue());
                                                }
                                            }
                                            if (this.b == null) break block32;
                                            byte[] arrby2 = this.f.b.r().b(this.b);
                                            f3 f32 = this.f.a.a().n;
                                            int n10 = arrby2.length;
                                            f32.a("Uploading data. size", n10);
                                            httpURLConnection.setDoOutput(true);
                                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                                            httpURLConnection.setFixedLengthStreamingMode(n10);
                                            httpURLConnection.connect();
                                            OutputStream outputStream2 = httpURLConnection.getOutputStream();
                                            try {
                                                outputStream2.write(arrby2);
                                                outputStream2.close();
                                            }
                                            catch (Throwable throwable2) {
                                                map = null;
                                                outputStream = outputStream2;
                                                break block33;
                                            }
                                            catch (IOException iOException4) {
                                                map = null;
                                                iOException = iOException4;
                                                outputStream = outputStream2;
                                                break block34;
                                            }
                                        }
                                        n2 = httpURLConnection.getResponseCode();
                                        map = httpURLConnection.getHeaderFields();
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        inputStream = httpURLConnection.getInputStream();
                                        try {
                                            int n11;
                                            byte[] arrby3 = new byte[1024];
                                            while ((n11 = inputStream.read(arrby3)) > 0) {
                                                byteArrayOutputStream.write(arrby3, 0, n11);
                                            }
                                            arrby = byteArrayOutputStream.toByteArray();
                                        }
                                        catch (Throwable throwable3) {}
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        f42 = this.f.a.d();
                                        String string = this.d;
                                        j3 j32 = this.c;
                                        k32 = new k3(string, j32, n2, null, arrby, map);
                                        break block38;
                                        break block39;
                                        catch (Throwable throwable4) {
                                            inputStream = null;
                                        }
                                    }
                                    if (inputStream == null) throw var22_29;
                                    try {
                                        inputStream.close();
                                        throw var22_29;
                                    }
                                    catch (Throwable throwable5) {
                                        throwable = throwable5;
                                        outputStream = null;
                                        break block35;
                                    }
                                    catch (IOException iOException5) {
                                        iOException3 = iOException5;
                                        break block36;
                                    }
                                    catch (Throwable throwable6) {
                                        outputStream = null;
                                        map = null;
                                        break block35;
                                    }
                                    catch (IOException iOException6) {
                                        map = null;
                                    }
                                }
                                iOException = iOException3;
                                outputStream = null;
                                break block40;
                                catch (Throwable throwable7) {
                                    map = null;
                                    outputStream = null;
                                    break block33;
                                }
                                catch (IOException iOException7) {
                                    map = null;
                                    break block37;
                                }
                                catch (Throwable throwable8) {
                                    throwable = throwable8;
                                    httpURLConnection = null;
                                    map = null;
                                }
                            }
                            n2 = 0;
                        }
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            }
                            catch (IOException iOException8) {
                                this.f.a.a().f.a("Error closing HTTP compressed POST connection output stream. appId", h3.a(this.d), (Object)iOException8);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        f4 f43 = this.f.a.d();
                        k3 k33 = new k3(this.d, this.c, n2, null, null, map);
                        f43.a(k33);
                        throw throwable;
                        catch (IOException iOException9) {
                            iOException2 = iOException9;
                            httpURLConnection = null;
                            map = null;
                        }
                    }
                    iOException = iOException2;
                }
                n2 = 0;
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                }
                catch (IOException iOException10) {
                    this.f.a.a().f.a("Error closing HTTP compressed POST connection output stream. appId", h3.a(this.d), (Object)iOException10);
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            f42 = this.f.a.d();
            String string = this.d;
            j3 j33 = this.c;
            k32 = new k3(string, j33, n2, iOException, null, map);
        }
        f42.a(k32);
    }
}

