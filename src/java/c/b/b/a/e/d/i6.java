/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.d8;
import c.b.b.a.e.d.e8;
import c.b.b.a.e.d.j6;
import c.b.b.a.e.d.z5;
import java.util.Collection;

public final class i6
extends j6 {
    @Override
    public final void a(Object object, long l10) {
        ((z5)e8.h(object, l10)).b();
    }

    @Override
    public final <E> void a(Object object, Object object2, long l10) {
        z5 z52 = (z5)e8.h(object, l10);
        z5 z53 = (z5)e8.h(object2, l10);
        int n10 = z52.size();
        int n11 = z53.size();
        if (n10 > 0 && n11 > 0) {
            if (!z52.a()) {
                z52 = z52.a(n11 + n10);
            }
            z52.addAll((Collection)z53);
        }
        if (n10 > 0) {
            z53 = z52;
        }
        e8.e.a(object, l10, z53);
    }
}

