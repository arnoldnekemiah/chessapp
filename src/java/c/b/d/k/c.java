/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Log
 *  c.b.b.a.g.o
 *  c.b.d.c
 *  c.b.d.e
 *  c.b.d.i.c
 *  c.b.d.k.a
 *  c.b.d.k.b
 *  c.b.d.k.c$a
 *  c.b.d.k.d
 *  c.b.d.k.e$a
 *  c.b.d.k.g
 *  c.b.d.k.h
 *  c.b.d.k.i
 *  c.b.d.k.j.b
 *  c.b.d.k.j.c
 *  c.b.d.k.j.c$a
 *  c.b.d.k.j.d
 *  c.b.d.k.j.d$a
 *  c.b.d.k.k.a$a
 *  c.b.d.k.k.c
 *  c.b.d.k.k.d
 *  c.b.d.k.k.d$a
 *  c.b.d.k.k.e
 *  c.b.d.k.k.e$a
 *  c.b.d.k.k.e$b
 *  c.b.d.m.f
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package c.b.d.k;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import c.b.b.a.g.o;
import c.b.d.g.k;
import c.b.d.k.c;
import c.b.d.k.e;
import c.b.d.k.g;
import c.b.d.k.h;
import c.b.d.k.i;
import c.b.d.k.j.a;
import c.b.d.k.j.b;
import c.b.d.k.j.c;
import c.b.d.k.j.d;
import c.b.d.k.k.a;
import c.b.d.k.k.b;
import c.b.d.k.k.d;
import c.b.d.k.k.e;
import c.b.d.m.f;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c
implements c.b.d.k.d {
    public static final Object k = new Object();
    public static final ThreadFactory l = new a();
    public final c.b.d.c a;
    public final c.b.d.k.k.c b;
    public final c.b.d.k.j.c c;
    public final i d;
    public final b e;
    public final g f;
    public final Object g;
    public final ExecutorService h;
    public String i;
    public final List<h> j;

    public c(c.b.d.c c8, f f10, c.b.d.i.c c10) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), l);
        c8.a();
        c.b.d.k.k.c c11 = new c.b.d.k.k.c(c8.a, f10, c10);
        c.b.d.k.j.c c12 = new c.b.d.k.j.c(c8);
        i i10 = new i();
        b b6 = new b(c8);
        g g4 = new g();
        this.g = new Object();
        this.i = null;
        this.j = new ArrayList();
        this.a = c8;
        this.b = c11;
        this.c = c12;
        this.d = i10;
        this.e = b6;
        this.f = g4;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), l);
        this.h = threadPoolExecutor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void a(c c8) {
        d d6;
        Object object;
        block13 : {
            boolean bl;
            boolean bl2;
            d6 = c8.d();
            if (d6 == null) throw null;
            try {
                bl = ((c.b.d.k.j.a)d6).b == c.a.e;
            }
            catch (IOException iOException) {
                break block13;
            }
            if (bl || (bl2 = ((c.b.d.k.j.a)d6).b == c.a.c)) {
                d6 = c8.d(d6);
            } else {
                i i10 = c8.d;
                if (i10 == null) {
                    throw null;
                }
                if (!TextUtils.isEmpty((CharSequence)((c.b.d.k.j.a)d6).c)) {
                    c.b.d.k.j.a a8 = (c.b.d.k.j.a)d6;
                    if (a8.f + a8.e >= i10.a() + i.a) return;
                }
                boolean bl3 = true;
                if (!bl3) return;
                d6 = c8.a(d6);
            }
            c8.b(d6);
            if (d6 == null) {
                throw null;
            }
            c.b.d.k.j.a a10 = (c.b.d.k.j.a)d6;
            boolean bl4 = a10.b == c.a.d;
            if (bl4) {
                c8.i = a10.a;
            }
            c.a a11 = a10.b;
            c.a a12 = c.a.e;
            boolean bl5 = false;
            if (a11 == a12) {
                bl5 = true;
            }
            if (bl5) {
                object = new e(e.a.a);
            } else {
                if (!d6.a()) {
                    c8.e(d6);
                    return;
                }
                object = new IOException("cleared fid due to auth error");
            }
        }
        c8.a(d6, (Exception)((Object)object));
    }

    public static c g() {
        c.b.d.c c8 = c.b.d.c.e();
        boolean bl = c8 != null;
        a.c.a.a.a(bl, (Object)"Null is not a valid value of FirebaseApp.");
        c8.a();
        return (c)c8.d.a(c.b.d.k.d.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final d a(d d6) {
        HttpURLConnection httpURLConnection;
        c.b.d.k.k.e e10;
        block11 : {
            b.b b6;
            e.b b8;
            c.b.d.k.k.c c8 = this.b;
            String string = this.a();
            c.b.d.k.j.a a8 = (c.b.d.k.j.a)d6;
            String string2 = a8.a;
            String string3 = this.f();
            String string4 = a8.d;
            if (c8 == null) {
                throw null;
            }
            Object[] arrobject = new Object[2];
            int n9 = 0;
            arrobject[0] = string3;
            arrobject[1] = string2;
            URL uRL = new URL(String.format((String)"https://%s/%s/%s", (Object[])new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format((String)"projects/%s/installations/%s/authTokens:generate", (Object[])arrobject)}));
            do {
                int n10;
                block12 : {
                    if (n9 > 1) {
                        throw new IOException();
                    }
                    httpURLConnection = c8.a(uRL, string);
                    try {
                        httpURLConnection.setRequestMethod("POST");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("FIS_v2 ");
                        stringBuilder.append(string4);
                        httpURLConnection.addRequestProperty("Authorization", stringBuilder.toString());
                        c8.c(httpURLConnection);
                        n10 = httpURLConnection.getResponseCode();
                        if (n10 == 200) {
                            e10 = c8.b(httpURLConnection);
                            break block11;
                        }
                        c.b.d.k.k.c.a((HttpURLConnection)httpURLConnection, null, (String)string, (String)string3);
                        if (n10 != 401 && n10 != 404) break block12;
                        e.a a10 = c.b.d.k.k.e.a();
                        b8 = e.b.c;
                        b6 = (b.b)a10;
                        break;
                    }
                    catch (Throwable throwable) {
                        httpURLConnection.disconnect();
                        throw throwable;
                    }
                }
                if (n10 != 429 && (n10 < 500 || n10 >= 600)) {
                    Log.e((String)"Firebase-Installations", (String)"Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    e.a a11 = c.b.d.k.k.e.a();
                    b8 = e.b.b;
                    b6 = (b.b)a11;
                    break;
                }
                ++n9;
                httpURLConnection.disconnect();
            } while (true);
            b6.c = b8;
            e10 = b6.a();
        }
        httpURLConnection.disconnect();
        c.b.d.k.k.b b9 = (c.b.d.k.k.b)e10;
        int n11 = b9.c.ordinal();
        if (n11 == 0) {
            String string = b9.a;
            long l6 = b9.b;
            long l10 = this.d.a();
            a.b b10 = (a.b)d6.b();
            b10.c = string;
            b10.e = l6;
            b10.f = l10;
            return b10.a();
        }
        if (n11 == 1) {
            a.b b11 = (a.b)d6.b();
            b11.g = "BAD CONFIG";
            b11.a(c.a.e);
            return b11.a();
        }
        if (n11 == 2) {
            this.i = null;
            d.a a12 = d6.b();
            a12.a(c.a.b);
            return a12.a();
        }
        throw new IOException();
    }

    public String a() {
        c.b.d.c c8 = this.a;
        c8.a();
        return c8.c.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(d d6, Exception exception) {
        Object object;
        Object object2 = object = this.g;
        synchronized (object2) {
            Iterator iterator = this.j.iterator();
            while (iterator.hasNext()) {
                if (!((h)iterator.next()).a(d6, exception)) continue;
                iterator.remove();
            }
            return;
        }
    }

    public String b() {
        c.b.d.c c8 = this.a;
        c8.a();
        return c8.c.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(d d6) {
        Object object;
        Object object2 = object = k;
        synchronized (object2) {
            c.b.d.c c8 = this.a;
            c8.a();
            c.b.d.k.a a8 = c.b.d.k.a.a((Context)c8.a, (String)"generatefid.lock");
            try {
                this.c.a(d6);
                return;
            }
            finally {
                if (a8 != null) {
                    a8.a();
                }
            }
        }
    }

    public o<String> c() {
        a.c.a.a.c(this.b());
        a.c.a.a.c(this.f());
        a.c.a.a.c(this.a());
        a.c.a.a.a(i.a((String)this.b()), (Object)"Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String string = this.a();
        a.c.a.a.a(i.b.matcher((CharSequence)string).matches(), (Object)"Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o o10 = new o();
        String string2 = this.i;
        if (string2 == null) {
            d d6 = this.e();
            this.h.execute((Runnable)new c.b.d.k.b(this));
            string2 = ((c.b.d.k.j.a)d6).a;
        }
        o10.a((Object)string2);
        return o10;
    }

    public final String c(d d6) {
        block5 : {
            block6 : {
                block4 : {
                    c.b.d.c c8 = this.a;
                    c8.a();
                    if (!c8.b.equals((Object)"CHIME_ANDROID_SDK") && !this.a.d()) break block4;
                    if (d6 == null) break block5;
                    boolean bl = ((c.b.d.k.j.a)d6).b == c.a.a;
                    if (bl) break block6;
                }
                return this.f.a();
            }
            String string = this.e.a();
            if (TextUtils.isEmpty((CharSequence)string)) {
                string = this.f.a();
            }
            return string;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final d d() {
        Object object;
        Object object2 = object = k;
        synchronized (object2) {
            c.b.d.c c8 = this.a;
            c8.a();
            c.b.d.k.a a8 = c.b.d.k.a.a((Context)c8.a, (String)"generatefid.lock");
            try {
                d d6 = this.c.a();
                return d6;
            }
            finally {
                if (a8 != null) {
                    a8.a();
                }
            }
        }
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public final d d(d d6) {
        c.b.d.k.j.a a8 = (c.b.d.k.j.a)d6;
        String string = a8.a.length() == 11 ? this.e.d() : null;
        c.b.d.k.k.c c8 = this.b;
        String string2 = this.a();
        String string3 = a8.a;
        String string4 = this.f();
        String string5 = this.b();
        if (c8 != null) {
            Object[] arrobject = new Object[1];
            arrobject[0] = string4;
            URL uRL = new URL(String.format((String)"https://%s/%s/%s", (Object[])new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format((String)"projects/%s/installations", (Object[])arrobject)}));
            for (int i10 = 0; i10 <= 1; ++i10) {
                HttpURLConnection httpURLConnection;
                block9 : {
                    c.b.d.k.k.d d8;
                    block8 : {
                        httpURLConnection = c8.a(uRL, string2);
                        try {
                            httpURLConnection.setRequestMethod("POST");
                            httpURLConnection.setDoOutput(true);
                            if (string != null) {
                                httpURLConnection.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                            }
                            c8.a(httpURLConnection, string3, string5);
                            int n9 = httpURLConnection.getResponseCode();
                            if (n9 == 200) {
                                d8 = c8.a(httpURLConnection);
                                break block8;
                            }
                            c.b.d.k.k.c.a((HttpURLConnection)httpURLConnection, (String)string5, (String)string2, (String)string4);
                            if (n9 == 429 || n9 >= 500 && n9 < 600) break block9;
                            Log.e((String)"Firebase-Installations", (String)"Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            d.a a10 = d.a.b;
                            d8 = new c.b.d.k.k.a(null, null, null, null, a10, null);
                        }
                        catch (Throwable throwable) {
                            httpURLConnection.disconnect();
                            throw throwable;
                        }
                    }
                    httpURLConnection.disconnect();
                    c.b.d.k.k.a a11 = (c.b.d.k.k.a)d8;
                    int n10 = a11.e.ordinal();
                    if (n10 != 0) {
                        if (n10 == 1) {
                            a.b b6 = (a.b)d6.b();
                            b6.g = "BAD CONFIG";
                            b6.a(c.a.e);
                            return b6.a();
                        }
                        throw new IOException();
                    }
                    String string6 = a11.b;
                    String string7 = a11.c;
                    long l6 = this.d.a();
                    c.b.d.k.k.b b8 = (c.b.d.k.k.b)a11.d;
                    String string8 = b8.a;
                    long l10 = b8.b;
                    a.b b9 = (a.b)d6.b();
                    b9.a = string6;
                    b9.a(c.a.d);
                    b9.c = string8;
                    b9.d = string7;
                    b9.e = l10;
                    b9.f = l6;
                    return b9.a();
                }
                httpURLConnection.disconnect();
            }
            throw new IOException();
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final d e() {
        Object object;
        Object object2 = object = k;
        synchronized (object2) {
            c.b.d.k.a a8;
            Throwable throwable2;
            block8 : {
                d d6;
                block7 : {
                    c.b.d.c c8 = this.a;
                    c8.a();
                    a8 = c.b.d.k.a.a((Context)c8.a, (String)"generatefid.lock");
                    try {
                        d6 = this.c.a();
                        if (!d6.a()) break block7;
                        String string = this.c(d6);
                        c.b.d.k.j.c c10 = this.c;
                        a.b b6 = (a.b)d6.b();
                        b6.a = string;
                        b6.a(c.a.c);
                        d6 = b6.a();
                        c10.a(d6);
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                if (a8 != null) {
                    a8.a();
                }
                return d6;
            }
            if (a8 != null) {
                a8.a();
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(d d6) {
        Object object;
        Object object2 = object = this.g;
        synchronized (object2) {
            Iterator iterator = this.j.iterator();
            while (iterator.hasNext()) {
                if (!((h)iterator.next()).a(d6)) continue;
                iterator.remove();
            }
            return;
        }
    }

    public String f() {
        c.b.d.c c8 = this.a;
        c8.a();
        return c8.c.g;
    }
}

