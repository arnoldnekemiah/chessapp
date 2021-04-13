/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  c.b.d.i.c
 *  c.b.d.i.c$a
 *  c.b.d.i.d
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package c.b.d.i;

import android.content.Context;
import c.b.d.i.c;
import c.b.d.i.d;

public class b
implements c {
    public d a;

    public b(Context context) {
        this.a = d.a((Context)context);
    }

    public c.a a(String string) {
        long l6 = System.currentTimeMillis();
        boolean bl = this.a.a(string, l6);
        boolean bl2 = this.a.a(l6);
        if (bl && bl2) {
            return c.a.e;
        }
        if (bl2) {
            return c.a.d;
        }
        if (bl) {
            return c.a.c;
        }
        return c.a.b;
    }
}

