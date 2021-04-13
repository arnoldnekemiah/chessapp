/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.d.k.k.a$a
 *  c.b.d.k.k.d
 *  c.b.d.k.k.d$a
 *  c.b.d.k.k.e
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.d.k.k;

import c.b.d.k.k.a;
import c.b.d.k.k.d;
import c.b.d.k.k.e;

public final class a
extends d {
    public final String a;
    public final String b;
    public final String c;
    public final e d;
    public final d.a e;

    public /* synthetic */ a(String string, String string2, String string3, e e10, d.a a8, a a10) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = e10;
        this.e = a8;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            e e10;
            String string;
            String string2;
            d d6 = (d)object;
            String string3 = this.a;
            if ((string3 == null ? ((a)d6).a == null : string3.equals((Object)((a)d6).a)) && ((string = this.b) == null ? ((a)d6).b == null : string.equals((Object)((a)d6).b)) && ((string2 = this.c) == null ? ((a)d6).c == null : string2.equals((Object)((a)d6).c)) && ((e10 = this.d) == null ? ((a)d6).d == null : e10.equals((Object)((a)d6).d))) {
                d.a a8 = this.e;
                a a10 = (a)d6;
                if (a8 == null ? a10.e == null : a8.equals((Object)a10.e)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String string = this.a;
        int n9 = string == null ? 0 : string.hashCode();
        int n10 = 1000003 * (n9 ^ 1000003);
        String string2 = this.b;
        int n11 = string2 == null ? 0 : string2.hashCode();
        int n12 = 1000003 * (n10 ^ n11);
        String string3 = this.c;
        int n13 = string3 == null ? 0 : string3.hashCode();
        int n14 = 1000003 * (n12 ^ n13);
        e e10 = this.d;
        int n15 = e10 == null ? 0 : e10.hashCode();
        int n16 = 1000003 * (n14 ^ n15);
        d.a a8 = this.e;
        int n17 = a8 == null ? 0 : a8.hashCode();
        return n16 ^ n17;
    }

    public String toString() {
        StringBuilder stringBuilder = c.a.b.a.a.a("InstallationResponse{uri=");
        stringBuilder.append(this.a);
        stringBuilder.append(", fid=");
        stringBuilder.append(this.b);
        stringBuilder.append(", refreshToken=");
        stringBuilder.append(this.c);
        stringBuilder.append(", authToken=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", responseCode=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

