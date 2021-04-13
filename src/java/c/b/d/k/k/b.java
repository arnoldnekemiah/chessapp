/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.d.k.k.b$a
 *  c.b.d.k.k.e
 *  c.b.d.k.k.e$a
 *  c.b.d.k.k.e$b
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.d.k.k;

import c.b.d.k.k.b;
import c.b.d.k.k.e;

public final class b
extends e {
    public final String a;
    public final long b;
    public final e.b c;

    public /* synthetic */ b(String string, long l6, e.b b6, a a8) {
        this.a = string;
        this.b = l6;
        this.c = b6;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof e) {
            e e10 = (e)object;
            String string = this.a;
            if ((string == null ? ((b)e10).a == null : string.equals((Object)((b)e10).a)) && this.b == ((b)e10).b) {
                e.b b6 = this.c;
                b b8 = (b)e10;
                if (b6 == null ? b8.c == null : b6.equals((Object)b8.c)) {
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
        long l6 = this.b;
        int n11 = 1000003 * (n10 ^ (int)(l6 ^ l6 >>> 32));
        e.b b6 = this.c;
        int n12 = b6 == null ? 0 : b6.hashCode();
        return n11 ^ n12;
    }

    public String toString() {
        StringBuilder stringBuilder = c.a.b.a.a.a("TokenResult{token=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tokenExpirationTimestamp=");
        stringBuilder.append(this.b);
        stringBuilder.append(", responseCode=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends e.a {
        public String a;
        public Long b;
        public e.b c;

        public e.a a(long l6) {
            this.b = l6;
            return this;
        }

        public e a() {
            String string = this.b == null ? " tokenExpirationTimestamp" : "";
            if (string.isEmpty()) {
                b b6 = new b(this.a, this.b, this.c, null);
                return b6;
            }
            throw new IllegalStateException(c.a.b.a.a.a("Missing required properties:", string));
        }
    }

}

