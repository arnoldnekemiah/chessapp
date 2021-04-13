/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.RecentlyNonNull
 *  c.b.b.a.e.d.f0
 *  c.b.b.a.f.a.a
 *  c.b.d.a
 *  c.b.d.c
 *  c.b.d.f.a.a
 *  c.b.d.f.a.d
 *  c.b.d.h.b
 *  c.b.d.h.d
 *  c.b.d.l.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package c.b.d.f.a;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import c.b.b.a.e.d.f0;
import c.b.d.c;
import c.b.d.f.a.a;
import c.b.d.f.a.d;
import c.b.d.f.a.e;
import c.b.d.g.t;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class b
implements a {
    public static volatile a b;
    public final c.b.b.a.f.a.a a;

    public b(c.b.b.a.f.a.a a8) {
        a.c.a.a.a(a8);
        this.a = a8;
        new ConcurrentHashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @RecentlyNonNull
    public static a a(@RecentlyNonNull c c8, @RecentlyNonNull Context context, @RecentlyNonNull c.b.d.h.d d6) {
        a.c.a.a.a(c8);
        a.c.a.a.a(context);
        a.c.a.a.a(d6);
        a.c.a.a.a(context.getApplicationContext());
        if (b != null) return b;
        Class<b> class_ = b.class;
        synchronized (b.class) {
            if (b != null) return b;
            Bundle bundle = new Bundle(1);
            if (c8.d()) {
                d6.a(c.b.d.a.class, d.a, e.a);
                c8.a();
                bundle.putBoolean("dataCollectionDefaultEnabled", ((c.b.d.l.a)c8.g.get()).c.get());
            }
            b = new b(f0.a((Context)context, null, null, null, (Bundle)bundle).d);
            // ** MonitorExit[var9_3] (shouldn't be in output)
            return b;
        }
    }
}

