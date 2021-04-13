/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.d.m.d
 *  c.b.d.m.e
 *  c.b.d.m.f
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.Set
 */
package c.b.d.m;

import c.b.d.m.a;
import c.b.d.m.d;
import c.b.d.m.e;
import c.b.d.m.f;
import java.util.Iterator;
import java.util.Set;

public class c
implements f {
    public final String a;
    public final d b;

    public c(Set<e> set, d d6) {
        this.a = c.a(set);
        this.b = d6;
    }

    public static String a(Set<e> set) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            a a8 = (a)((e)iterator.next());
            stringBuilder.append(a8.a);
            stringBuilder.append('/');
            stringBuilder.append(a8.b);
            if (!iterator.hasNext()) continue;
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }

    public String a() {
        if (this.b.a().isEmpty()) {
            return this.a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(' ');
        stringBuilder.append(c.a((Set<e>)this.b.a()));
        return stringBuilder.toString();
    }
}

