/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 */
package c.b.d.g;

import c.b.d.g.l;

public class n {
    public final Class<?> a;
    public final boolean b;

    public /* synthetic */ n(Class class_, boolean bl, l l10) {
        this.a = class_;
        this.b = bl;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof n;
        boolean bl2 = false;
        if (bl) {
            n n10 = (n)object;
            boolean bl3 = n10.a.equals(this.a);
            bl2 = false;
            if (bl3) {
                boolean bl4 = n10.b;
                boolean bl5 = this.b;
                bl2 = false;
                if (bl4 == bl5) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public int hashCode() {
        return 1000003 * (1000003 ^ this.a.hashCode()) ^ Boolean.valueOf((boolean)this.b).hashCode();
    }
}

