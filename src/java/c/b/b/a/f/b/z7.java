/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 *  android.util.Pair
 *  c.b.b.a.b.j.c
 *  c.b.b.a.e.d.z8
 *  c.b.b.a.f.b.a9
 *  c.b.b.a.f.b.f
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.u2
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient$Info
 *  java.lang.Boolean
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigInteger
 *  java.security.MessageDigest
 *  java.util.Locale
 */
package c.b.b.a.f.b;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.z8;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.r8;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public final class z7
extends r8 {
    public String d;
    public boolean e;
    public long f;

    public z7(a9 a92) {
        super(a92);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Deprecated
    public final Pair<String, Boolean> a(String string) {
        this.g();
        if ((c)this.a.n == null) {
            throw null;
        }
        long l6 = SystemClock.elapsedRealtime();
        String string2 = this.d;
        if (string2 != null && l6 < this.f) {
            return new Pair((Object)string2, (Object)this.e);
        }
        this.f = l6 + this.a.g.a(string, (t2<Long>)u2.b);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck((boolean)true);
        try {
            AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo((Context)this.a.a);
            if (info != null) {
                this.d = info.getId();
                this.e = info.isLimitAdTrackingEnabled();
            }
            if (this.d == null) {
                this.d = "";
            }
        }
        catch (Exception exception) {
            this.a.a().m.a("Unable to get advertising id", (Object)exception);
            this.d = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck((boolean)false);
        return new Pair((Object)this.d, (Object)this.e);
    }

    public final Pair<String, Boolean> a(String string, f f10) {
        z8.c();
        if (this.a.g.c(null, (t2<Boolean>)u2.y0) && !f10.b()) {
            return new Pair((Object)"", (Object)false);
        }
        return this.a(string);
    }

    @Deprecated
    public final String b(String string) {
        this.g();
        String string2 = (String)this.a((String)string).first;
        MessageDigest messageDigest = g9.q();
        if (messageDigest == null) {
            return null;
        }
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{new BigInteger(1, messageDigest.digest(string2.getBytes()))};
        return String.format((Locale)locale, (String)"%032X", (Object[])arrobject);
    }

    @Override
    public final boolean j() {
        return false;
    }
}

