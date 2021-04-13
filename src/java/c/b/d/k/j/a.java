/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.d.k.j.a$a
 *  c.b.d.k.j.c
 *  c.b.d.k.j.c$a
 *  c.b.d.k.j.d
 *  c.b.d.k.j.d$a
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.d.k.j;

import c.b.d.k.j.a;
import c.b.d.k.j.c;
import c.b.d.k.j.d;

public final class a
extends d {
    public final String a;
    public final c.a b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    public /* synthetic */ a(String string, c.a a8, String string2, String string3, long l6, long l10, String string4, a a10) {
        this.a = string;
        this.b = a8;
        this.c = string2;
        this.d = string3;
        this.e = l6;
        this.f = l10;
        this.g = string4;
    }

    public d.a b() {
        return new b(this, null);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            String string;
            String string2;
            d d6 = (d)object;
            String string3 = this.a;
            if ((string3 == null ? ((a)d6).a == null : string3.equals((Object)((a)d6).a)) && this.b.equals((Object)((a)d6).b) && ((string = this.c) == null ? ((a)d6).c == null : string.equals((Object)((a)d6).c)) && ((string2 = this.d) == null ? ((a)d6).d == null : string2.equals((Object)((a)d6).d))) {
                String string4;
                long l6 = this.e;
                a a8 = (a)d6;
                if (l6 == a8.e && this.f == a8.f && ((string4 = this.g) == null ? a8.g == null : string4.equals((Object)a8.g))) {
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
        int n10 = 1000003 * (1000003 * (n9 ^ 1000003) ^ this.b.hashCode());
        String string2 = this.c;
        int n11 = string2 == null ? 0 : string2.hashCode();
        int n12 = 1000003 * (n10 ^ n11);
        String string3 = this.d;
        int n13 = string3 == null ? 0 : string3.hashCode();
        int n14 = 1000003 * (n12 ^ n13);
        long l6 = this.e;
        int n15 = 1000003 * (n14 ^ (int)(l6 ^ l6 >>> 32));
        long l10 = this.f;
        int n16 = 1000003 * (n15 ^ (int)(l10 ^ l10 >>> 32));
        String string4 = this.g;
        int n17 = string4 == null ? 0 : string4.hashCode();
        return n16 ^ n17;
    }

    public String toString() {
        StringBuilder stringBuilder = c.a.b.a.a.a("PersistedInstallationEntry{firebaseInstallationId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", registrationStatus=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", authToken=");
        stringBuilder.append(this.c);
        stringBuilder.append(", refreshToken=");
        stringBuilder.append(this.d);
        stringBuilder.append(", expiresInSecs=");
        stringBuilder.append(this.e);
        stringBuilder.append(", tokenCreationEpochInSecs=");
        stringBuilder.append(this.f);
        stringBuilder.append(", fisError=");
        return c.a.b.a.a.a(stringBuilder, this.g, "}");
    }

    public static final class b
    extends d.a {
        public String a;
        public c.a b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        public b() {
        }

        public /* synthetic */ b(d d6, a a8) {
            a a10 = (a)d6;
            this.a = a10.a;
            this.b = a10.b;
            this.c = a10.c;
            this.d = a10.d;
            this.e = a10.e;
            this.f = a10.f;
            this.g = a10.g;
        }

        public d.a a(long l6) {
            this.e = l6;
            return this;
        }

        public d.a a(c.a a8) {
            if (a8 != null) {
                this.b = a8;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public d a() {
            String string = this.b == null ? " registrationStatus" : "";
            if (this.e == null) {
                string = c.a.b.a.a.a(string, " expiresInSecs");
            }
            if (this.f == null) {
                string = c.a.b.a.a.a(string, " tokenCreationEpochInSecs");
            }
            if (string.isEmpty()) {
                a a8 = new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
                return a8;
            }
            throw new IllegalStateException(c.a.b.a.a.a("Missing required properties:", string));
        }

        public d.a b(long l6) {
            this.f = l6;
            return this;
        }
    }

}

