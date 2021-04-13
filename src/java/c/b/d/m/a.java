/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.d.m.e
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.d.m;

import c.b.d.m.e;

public final class a
extends e {
    public final String a;
    public final String b;

    public a(String string, String string2) {
        if (string != null) {
            this.a = string;
            if (string2 != null) {
                this.b = string2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof e) {
            e e10 = (e)object;
            String string = this.a;
            a a8 = (a)e10;
            return string.equals((Object)a8.a) && this.b.equals((Object)a8.b);
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (1000003 ^ this.a.hashCode()) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = c.a.b.a.a.a("LibraryVersion{libraryName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", version=");
        return c.a.b.a.a.a(stringBuilder, this.b, "}");
    }
}

