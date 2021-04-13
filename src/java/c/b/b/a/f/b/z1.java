/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.b.a
 *  android.os.Bundle
 *  c.b.b.a.f.b.a
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.q6
 *  c.b.b.a.f.b.x
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Map
 *  java.util.Set
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import c.b.b.a.f.b.a;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.q6;
import c.b.b.a.f.b.x;
import c.b.b.a.f.b.y2;
import c.b.b.a.f.b.y6;
import java.util.Map;
import java.util.Set;

public final class z1
extends y2 {
    public final Map<String, Long> b = new a.b.a();
    public final Map<String, Integer> c = new a.b.a();
    public long d;

    public z1(i4 i42) {
        super(i42);
    }

    public final void a(long l6) {
        q6 q62 = this.a.u().a(false);
        for (String string : this.b.keySet()) {
            this.a(string, l6 - (Long)this.b.get((Object)string), q62);
        }
        if (!this.b.isEmpty()) {
            this.a(l6 - this.d, q62);
        }
        this.b(l6);
    }

    public final void a(long l6, q6 q62) {
        if (q62 == null) {
            this.a.a().n.a("Not logging ad exposure. No active activity");
            return;
        }
        if (l6 < 1000L) {
            this.a.a().n.a("Not logging ad exposure. Less than 1000 ms. exposure", (Object)l6);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", l6);
        y6.a(q62, bundle, true);
        this.a.o().b("am", "_xa", bundle);
    }

    public final void a(String string, long l6) {
        if (string != null && string.length() != 0) {
            this.a.d().a((Runnable)new a(this, string, l6));
            return;
        }
        this.a.a().f.a("Ad unit id must be a non-empty string");
    }

    public final void a(String string, long l6, q6 q62) {
        if (q62 == null) {
            this.a.a().n.a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (l6 < 1000L) {
            this.a.a().n.a("Not logging ad unit exposure. Less than 1000 ms. exposure", (Object)l6);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", string);
        bundle.putLong("_xt", l6);
        y6.a(q62, bundle, true);
        this.a.o().b("am", "_xu", bundle);
    }

    public final void b(long l6) {
        for (String string : this.b.keySet()) {
            this.b.put((Object)string, (Object)l6);
        }
        if (!this.b.isEmpty()) {
            this.d = l6;
        }
    }

    public final void b(String string, long l6) {
        if (string != null && string.length() != 0) {
            this.a.d().a((Runnable)new x(this, string, l6));
            return;
        }
        this.a.a().f.a("Ad unit id must be a non-empty string");
    }
}

