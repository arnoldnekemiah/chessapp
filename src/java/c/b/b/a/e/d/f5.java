/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package c.b.b.a.e.d;

public final class f5 {
    public final Object a;
    public final int b;

    public f5(Object object, int n2) {
        this.a = object;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof f5)) {
            return false;
        }
        f5 f52 = (f5)object;
        return this.a == f52.a && this.b == f52.b;
    }

    public final int hashCode() {
        return 65535 * System.identityHashCode((Object)this.a) + this.b;
    }
}

