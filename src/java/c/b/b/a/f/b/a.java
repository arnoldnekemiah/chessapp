/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.z1;
import java.util.Map;

public final class a
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ z1 c;

    public a(z1 z12, String string, long l2) {
        this.c = z12;
        this.a = string;
        this.b = l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void run() {
        Map<String, Integer> map;
        Integer n2;
        Integer n10;
        z1 z12 = this.c;
        String string = this.a;
        long l2 = this.b;
        z12.g();
        a.c.a.a.c(string);
        if (z12.c.isEmpty()) {
            z12.d = l2;
        }
        if ((n10 = (Integer)z12.c.get((Object)string)) != null) {
            map = z12.c;
            n2 = 1 + n10;
        } else {
            if (z12.c.size() >= 100) {
                z12.a.a().i.a("Too many ads visible");
                return;
            }
            z12.c.put((Object)string, (Object)1);
            map = z12.b;
            n2 = l2;
        }
        map.put((Object)string, (Object)n2);
    }
}

