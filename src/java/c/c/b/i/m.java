/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.ArrayList
 */
package c.c.b.i;

import c.c.b.i.h;
import c.c.b.i.n;
import java.util.ArrayList;

public class m {
    public n a = new n();
    public int b;
    public int c;
    public int d = 1;
    public boolean e = true;
    public int f = 0;
    public long g = 0L;

    public final int a(boolean bl, long l10) {
        int n10 = bl ? this.b : this.c;
        if (bl == this.e) {
            n10 -= this.f;
            long l11 = this.g;
            if (l11 != 0L) {
                n10 = (int)((long)n10 - (l10 - l11));
            }
        }
        return n10;
    }

    public final h<Integer, Integer> a(boolean bl) {
        n n10 = this.a;
        ArrayList<n.a> arrayList = bl ? n10.a : n10.b;
        int n11 = arrayList.size();
        int n12 = 1;
        int n13 = n11 - n12;
        int n14 = this.d;
        if (!this.e && bl) {
            ++n14;
        }
        int n15 = 0;
        while (((n.a)arrayList.get((int)n15)).b > 0) {
            if ((n12 += ((n.a)arrayList.get((int)n15)).b) > n14) {
                return new h<Integer, Integer>(n15, n12 - n14);
            }
            if (n15 >= n13) continue;
            ++n15;
        }
        return new h<Integer, Integer>(n15, 0);
    }

    public final void a(long l10) {
        if (this.a()) {
            int n10 = (int)(l10 - this.g);
            this.g = 0L;
            if (n10 > 0) {
                this.f = n10 + this.f;
            }
        }
    }

    public final boolean a() {
        return this.g != 0L;
    }

    public final int b(boolean bl) {
        n n10 = this.a;
        ArrayList<n.a> arrayList = bl ? n10.a : n10.b;
        return ((n.a)arrayList.get((int)((Integer)this.a((boolean)bl).a).intValue())).c;
    }

    public final int c(boolean bl) {
        n n10 = this.a;
        ArrayList<n.a> arrayList = bl ? n10.a : n10.b;
        return ((n.a)arrayList.get((int)0)).a;
    }
}

