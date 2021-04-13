/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.e.d.o1;
import c.b.b.a.e.d.w1;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import java.util.ArrayList;
import java.util.List;

public final class z8 {
    public w1 a;
    public List<Long> b;
    public List<o1> c;
    public long d;
    public final /* synthetic */ a9 e;

    public /* synthetic */ z8(a9 a92) {
        this.e = a92;
    }

    public final boolean a(long l10, o1 o12) {
        a.a(o12);
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (this.c.size() > 0 && ((o1)this.c.get((int)0)).zzg / 1000L / 60L / 60L != o12.zzg / 1000L / 60L / 60L) {
            return false;
        }
        long l11 = this.d + (long)o12.c();
        if (l11 >= (long)Math.max((int)0, (int)((Integer)u2.i.a(null)).intValue())) {
            return false;
        }
        this.d = l11;
        this.c.add((Object)o12);
        this.b.add((Object)l10);
        int n10 = this.c.size();
        return n10 < Math.max((int)1, (int)((Integer)u2.j.a(null)).intValue());
    }
}

