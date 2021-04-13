/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Set
 *  java.util.TreeSet
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f9;
import c.b.b.a.f.b.g7;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.q3;
import c.b.b.a.f.b.u3;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public final class k5
implements Runnable {
    public final j6 a;
    public final Bundle b;

    public k5(j6 j62, Bundle bundle) {
        this.a = j62;
        this.b = bundle;
    }

    public final void run() {
        j6 j62 = this.a;
        Bundle bundle = this.b;
        if (bundle == null) {
            j62.a.m().B.a(new Bundle());
            return;
        }
        Bundle bundle2 = j62.a.m().B.a();
        for (String string : bundle.keySet()) {
            Object object = bundle.get(string);
            if (!(object == null || object instanceof String || object instanceof Long || object instanceof Double)) {
                if (j62.a.p().a(object)) {
                    j62.a.p().a(j62.p, null, 27, null, null, 0);
                }
                j62.a.a().k.a("Invalid default event parameter type. Name, value", string, object);
                continue;
            }
            if (g9.h(string)) {
                j62.a.a().k.a("Invalid default event parameter name. Name", string);
                continue;
            }
            if (object == null) {
                bundle2.remove(string);
                continue;
            }
            g9 g92 = j62.a.p();
            if (!g92.a("param", string, 100, object)) continue;
            j62.a.p().a(bundle2, string, object);
        }
        j62.a.p();
        int n2 = j62.a.g.h();
        if (bundle2.size() > n2) {
            Iterator iterator = new TreeSet((Collection)bundle2.keySet()).iterator();
            int n10 = 0;
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                if (++n10 <= n2) continue;
                bundle2.remove(string);
            }
            j62.a.p().a(j62.p, null, 26, null, null, 0);
            j62.a.a().k.a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        j62.a.m().B.a(bundle2);
        y7 y72 = j62.a.v();
        y72.g();
        y72.h();
        y72.a(new g7(y72, y72.a(false), bundle2));
    }
}

