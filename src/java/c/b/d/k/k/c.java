/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  android.util.JsonReader
 *  android.util.Log
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  java.util.zip.GZIPOutputStream
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package c.b.d.k.k;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.JsonReader;
import android.util.Log;
import c.b.d.i.c;
import c.b.d.k.k.a;
import c.b.d.k.k.b;
import c.b.d.k.k.d;
import c.b.d.k.k.e;
import c.b.d.m.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    public static final Pattern d = Pattern.compile((String)"[0-9]+s");
    public static final Charset e = Charset.forName((String)"UTF-8");
    public final Context a;
    public final f b;
    public final c.b.d.i.c c;

    public c(Context context, f f10, c.b.d.i.c c10) {
        this.a = context;
        this.b = f10;
        this.c = c10;
    }

    public static long a(String string) {
        a.c.a.a.a(d.matcher((CharSequence)string).matches(), (Object)"Invalid Expiration Timestamp.");
        if (string != null && string.length() != 0) {
            return Long.parseLong((String)string.substring(0, -1 + string.length()));
        }
        return 0L;
    }

    /*
     * Exception decompiling
     */
    public static void a(HttpURLConnection var0, String var1, String var2, String var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl75.1 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static void a(URLConnection uRLConnection, byte[] arrby) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(arrby);
            }
            catch (Throwable throwable) {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                }
                catch (IOException iOException) {}
                throw throwable;
            }
            try {
                gZIPOutputStream.close();
                outputStream.close();
            }
            catch (IOException iOException) {}
            return;
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public final d a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader((Reader)new InputStreamReader(inputStream, e));
        e.a a10 = e.a();
        jsonReader.beginObject();
        String string = null;
        String string2 = null;
        String string3 = null;
        e e10 = null;
        while (jsonReader.hasNext()) {
            String string4 = jsonReader.nextName();
            if (string4.equals((Object)"name")) {
                string = jsonReader.nextString();
                continue;
            }
            if (string4.equals((Object)"fid")) {
                string2 = jsonReader.nextString();
                continue;
            }
            if (string4.equals((Object)"refreshToken")) {
                string3 = jsonReader.nextString();
                continue;
            }
            if (string4.equals((Object)"authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String string5 = jsonReader.nextName();
                    if (string5.equals((Object)"token")) {
                        String string6;
                        ((b.b)a10).a = string6 = jsonReader.nextString();
                        continue;
                    }
                    if (string5.equals((Object)"expiresIn")) {
                        a10.a(c.a(jsonReader.nextString()));
                        continue;
                    }
                    jsonReader.skipValue();
                }
                e10 = a10.a();
                jsonReader.endObject();
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        d.a a11 = d.a.a;
        a a12 = new a(string, string2, string3, e10, a11, null);
        return a12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final HttpURLConnection a(URL uRL, String string) {
        c.a a10;
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setConnectTimeout(10000);
        int n10 = 0;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.addRequestProperty("Content-Type", "application/json");
        httpURLConnection.addRequestProperty("Accept", "application/json");
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
        httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
        c.b.d.i.c c10 = this.c;
        if (c10 != null && this.b != null && (a10 = c10.a("fire-installations-id")) != c.a.b) {
            httpURLConnection.addRequestProperty("x-firebase-client", this.b.a());
            httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString((int)a10.a));
        }
        String string2 = null;
        try {
            MessageDigest messageDigest;
            Context context = this.a;
            String string3 = this.a.getPackageName();
            PackageInfo packageInfo = c.b.b.a.b.k.b.b((Context)context).a.getPackageManager().getPackageInfo(string3, 64);
            Signature[] arrsignature = packageInfo.signatures;
            byte[] arrby = arrsignature != null && arrsignature.length == 1 && (messageDigest = c.b.b.a.b.j.a.a("SHA1")) != null ? messageDigest.digest(packageInfo.signatures[0].toByteArray()) : null;
            if (arrby == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not get fingerprint hash for package: ");
                stringBuilder.append(this.a.getPackageName());
                Log.e((String)"ContentValues", (String)stringBuilder.toString());
                string2 = null;
            } else {
                int n11 = arrby.length;
                StringBuilder stringBuilder = new StringBuilder(n11 << 1);
                while (n10 < n11) {
                    stringBuilder.append(c.b.b.a.b.j.d.a[(240 & arrby[n10]) >>> 4]);
                    stringBuilder.append(c.b.b.a.b.j.d.a[15 & arrby[n10]]);
                    ++n10;
                }
                string2 = stringBuilder.toString();
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            StringBuilder stringBuilder = c.a.b.a.a.a("No such package: ");
            stringBuilder.append(this.a.getPackageName());
            Log.e((String)"ContentValues", (String)stringBuilder.toString(), (Throwable)nameNotFoundException);
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", string2);
        httpURLConnection.addRequestProperty("x-goog-api-key", string);
        return httpURLConnection;
    }

    public final void a(HttpURLConnection httpURLConnection, String string, String string2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("fid", (Object)string);
            jSONObject.put("appId", (Object)string2);
            jSONObject.put("authVersion", (Object)"FIS_v2");
            jSONObject.put("sdkVersion", (Object)"a:16.3.2");
        }
        catch (JSONException jSONException) {
            throw new IllegalStateException((Throwable)jSONException);
        }
        c.a((URLConnection)httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
    }

    public final e b(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader((Reader)new InputStreamReader(inputStream, e));
        e.a a10 = e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            if (string.equals((Object)"token")) {
                String string2;
                ((b.b)a10).a = string2 = jsonReader.nextString();
                continue;
            }
            if (string.equals((Object)"expiresIn")) {
                a10.a(c.a(jsonReader.nextString()));
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        e.b b10 = e.b.a;
        b.b b11 = (b.b)a10;
        b11.c = b10;
        return ((e.a)b11).a();
    }

    public final void c(HttpURLConnection httpURLConnection) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sdkVersion", (Object)"a:16.3.2");
            jSONObject = new JSONObject();
            jSONObject.put("installation", (Object)jSONObject2);
        }
        catch (JSONException jSONException) {
            throw new IllegalStateException((Throwable)jSONException);
        }
        c.a((URLConnection)httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
    }
}

