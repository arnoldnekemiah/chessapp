/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 *  java.util.Map$Entry
 */
package c.b.d.g;

import c.b.d.h.a;
import c.b.d.h.b;
import java.util.Map;

public final class r
implements Runnable {
    public final Map.Entry a;
    public final a b;

    public r(Map.Entry entry, a a10) {
        this.a = entry;
        this.b = a10;
    }

    public void run() {
        Map.Entry entry = this.a;
        a a10 = this.b;
        ((b)entry.getKey()).a(a10);
    }
}

