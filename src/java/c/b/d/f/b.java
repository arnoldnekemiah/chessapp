/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  c.b.b.a.e.d.b
 *  c.b.b.a.e.d.c
 *  c.b.b.a.e.d.f0
 *  c.b.b.a.e.d.h
 *  c.b.b.a.e.d.i
 *  c.b.b.a.e.d.j
 *  c.b.b.a.e.d.k
 *  c.b.b.a.e.d.m
 *  c.b.b.a.e.d.n
 *  c.b.b.a.f.b.k6
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ExecutorService
 */
package c.b.d.f;

import android.os.Bundle;
import c.b.b.a.e.d.c;
import c.b.b.a.e.d.f0;
import c.b.b.a.e.d.h;
import c.b.b.a.e.d.i;
import c.b.b.a.e.d.j;
import c.b.b.a.e.d.k;
import c.b.b.a.e.d.m;
import c.b.b.a.e.d.n;
import c.b.b.a.e.d.x9;
import c.b.b.a.f.b.k6;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class b
implements k6 {
    public final /* synthetic */ f0 a;

    public b(f0 f02) {
        this.a = f02;
    }

    public final List<Bundle> a(String string, String string2) {
        return this.a.a(string, string2);
    }

    public final Map<String, Object> a(String string, String string2, boolean bl) {
        return this.a.a(string, string2, bl);
    }

    public final void a(Bundle bundle) {
        f0 f02 = this.a;
        if (f02 != null) {
            c.b.b.a.e.d.b b6 = new c.b.b.a.e.d.b(f02, bundle);
            f02.c.execute((Runnable)b6);
            return;
        }
        throw null;
    }

    public final void a(String string) {
        f0 f02 = this.a;
        if (f02 != null) {
            h h6 = new h(f02, string);
            f02.c.execute((Runnable)h6);
            return;
        }
        throw null;
    }

    public final void a(String string, String string2, Bundle bundle) {
        f0 f02 = this.a;
        if (f02 != null) {
            c c8 = new c(f02, string, string2, bundle);
            f02.c.execute((Runnable)c8);
            return;
        }
        throw null;
    }

    public final int b(String string) {
        return this.a.a(string);
    }

    public final void b(String string, String string2, Bundle bundle) {
        this.a.a(string, string2, bundle, true, true, null);
    }

    public final void c(String string) {
        f0 f02 = this.a;
        if (f02 != null) {
            i i10 = new i(f02, string);
            f02.c.execute((Runnable)i10);
            return;
        }
        throw null;
    }

    public final String e() {
        f0 f02 = this.a;
        if (f02 != null) {
            x9 x92 = new x9();
            n n9 = new n(f02, x92);
            f02.c.execute((Runnable)n9);
            return x92.a(500L);
        }
        throw null;
    }

    public final String f() {
        f0 f02 = this.a;
        if (f02 != null) {
            x9 x92 = new x9();
            k k5 = new k(f02, x92);
            f02.c.execute((Runnable)k5);
            return x92.a(50L);
        }
        throw null;
    }

    public final String q() {
        f0 f02 = this.a;
        if (f02 != null) {
            x9 x92 = new x9();
            j j10 = new j(f02, x92);
            f02.c.execute((Runnable)j10);
            return x92.a(500L);
        }
        throw null;
    }

    public final long r() {
        return this.a.a();
    }

    public final String s() {
        f0 f02 = this.a;
        if (f02 != null) {
            x9 x92 = new x9();
            m m6 = new m(f02, x92);
            f02.c.execute((Runnable)m6);
            return x92.a(500L);
        }
        throw null;
    }
}

