/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.q4
 *  c.b.b.a.e.d.s4
 *  c.b.b.a.e.d.v4
 *  c.b.b.a.e.d.w4
 *  java.io.Serializable
 *  java.lang.Byte
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.charset.Charset
 *  java.util.Iterator
 *  java.util.Locale
 */
package c.b.b.a.e.d;

import a.c.a.a;
import c.b.b.a.e.d.a6;
import c.b.b.a.e.d.m4;
import c.b.b.a.e.d.q4;
import c.b.b.a.e.d.s4;
import c.b.b.a.e.d.u4;
import c.b.b.a.e.d.v4;
import c.b.b.a.e.d.w4;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class x4
implements Iterable<Byte>,
Serializable {
    public static final x4 b = new v4(a6.b);
    public static final u4 c;
    public int a = 0;

    public static {
        Object object = m4.a() ? new w4() : new s4();
        c = object;
    }

    public static int a(int n2, int n6, int n10) {
        int n11 = n6 - n2;
        if ((n11 | (n2 | n6) | n10 - n6) < 0) {
            if (n2 >= 0) {
                if (n6 < n2) {
                    StringBuilder stringBuilder = new StringBuilder(66);
                    stringBuilder.append("Beginning index larger than ending index: ");
                    stringBuilder.append(n2);
                    stringBuilder.append(", ");
                    stringBuilder.append(n6);
                    throw new IndexOutOfBoundsException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("End index: ");
                stringBuilder.append(n6);
                stringBuilder.append(" >= ");
                stringBuilder.append(n10);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(n2);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        return n11;
    }

    public static x4 a(String string) {
        return new v4(string.getBytes(a6.a));
    }

    public static x4 a(byte[] arrby, int n2, int n6) {
        x4.a(n2, n2 + n6, arrby.length);
        return new v4(c.a(arrby, n2, n6));
    }

    public abstract x4 a(int var1, int var2);

    public final String a(Charset charset) {
        if (this.c() == 0) {
            return "";
        }
        v4 v42 = (v4)this;
        return new String(v42.d, 0, v42.c(), charset);
    }

    public abstract byte c(int var1);

    public abstract int c();

    public abstract byte d(int var1);

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n2 = this.a;
        if (n2 == 0) {
            int n6 = this.c();
            n2 = a6.a((int)n6, (byte[])((v4)this).d, (int)0, (int)n6);
            if (n2 == 0) {
                n2 = 1;
            }
            this.a = n2;
        }
        return n2;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] arrobject = new Object[3];
        arrobject[0] = Integer.toHexString((int)System.identityHashCode((Object)this));
        arrobject[1] = this.c();
        String string = this.c() <= 50 ? a.a(this) : String.valueOf((Object)a.a(this.a(0, 47))).concat("...");
        arrobject[2] = string;
        return String.format((Locale)locale, (String)"<ByteString@%s size=%d contents=\"%s\">", (Object[])arrobject);
    }
}

