/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.d.g.d
 *  c.b.d.g.q
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package c.b.d.g;

import c.a.b.a.a;
import c.b.d.g.d;
import c.b.d.g.q;
import java.util.Arrays;
import java.util.List;

public class p
extends q {
    public p(List<d<?>> list) {
        StringBuilder stringBuilder = a.a("Dependency cycle detected: ");
        stringBuilder.append(Arrays.toString((Object[])list.toArray()));
        super(stringBuilder.toString());
    }
}

