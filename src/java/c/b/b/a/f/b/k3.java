/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.j3;
import java.util.List;
import java.util.Map;

public final class k3
implements Runnable {
    public final j3 a;
    public final int b;
    public final Throwable c;
    public final byte[] d;
    public final String e;
    public final Map<String, List<String>> f;

    public /* synthetic */ k3(String string, j3 j32, int n2, Throwable throwable, byte[] arrby, Map map) {
        a.a(j32);
        this.a = j32;
        this.b = n2;
        this.c = throwable;
        this.d = arrby;
        this.e = string;
        this.f = map;
    }

    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}

