/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.g8
 *  c.b.b.a.e.d.i8
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.e8;
import c.b.b.a.e.d.f8;
import c.b.b.a.e.d.g8;
import c.b.b.a.e.d.h8;
import c.b.b.a.e.d.i8;
import c.b.b.a.e.d.m4;

public final class j8 {
    public static final f8 a;

    public static {
        Object object = e8.g && e8.f && !m4.a() ? new i8() : new g8();
        a = object;
    }

    public static /* synthetic */ int a(int n2) {
        if (n2 > -12) {
            n2 = -1;
        }
        return n2;
    }

    public static /* synthetic */ int a(int n2, int n6) {
        if (n2 <= -12 && n6 <= -65) {
            return n2 ^ n6 << 8;
        }
        return -1;
    }

    public static int a(int n2, int n6, int n10) {
        if (n2 <= -12 && n6 <= -65 && n10 <= -65) {
            return n2 ^ n6 << 8 ^ n10 << 16;
        }
        return -1;
    }

    public static int a(CharSequence charSequence) {
        IllegalArgumentException illegalArgumentException;
        int n2;
        int n6 = charSequence.length();
        int n10 = 0;
        for (n2 = 0; n2 < n6 && charSequence.charAt(n2) < ''; ++n2) {
        }
        int n11 = n6;
        while (n2 < n6) {
            char c2 = charSequence.charAt(n2);
            if (c2 < '\u0800') {
                n11 += 127 - c2 >>> 31;
                ++n2;
                continue;
            }
            int n12 = charSequence.length();
            while (n2 < n12) {
                char c3 = charSequence.charAt(n2);
                if (c3 < '\u0800') {
                    n10 += 127 - c3 >>> 31;
                } else {
                    n10 += 2;
                    if (c3 >= '\ud800' && c3 <= '\udfff') {
                        if (Character.codePointAt((CharSequence)charSequence, (int)n2) >= 65536) {
                            ++n2;
                        } else {
                            throw new h8(n2, n12);
                        }
                    }
                }
                ++n2;
            }
            n11 += n10;
            break;
        }
        if (n11 >= n6) {
            return n11;
        }
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("UTF-8 length does not fit in int: ");
        stringBuilder.append(0x100000000L + (long)n11);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public static boolean a(byte[] arrby, int n2, int n6) {
        int n10 = a.a(0, arrby, n2, n6);
        boolean bl = false;
        if (n10 == 0) {
            bl = true;
        }
        return bl;
    }

    public static /* synthetic */ int b(byte[] arrby, int n2, int n6) {
        int n10 = arrby[n2 - 1];
        int n11 = n6 - n2;
        int n12 = -1;
        if (n11 != 0) {
            if (n11 != 1) {
                if (n11 == 2) {
                    return j8.a(n10, (int)arrby[n2], (int)arrby[n2 + 1]);
                }
                throw new AssertionError();
            }
            byte by = arrby[n2];
            if (n10 <= -12 && by <= -65) {
                n12 = n10 ^ by << 8;
            }
            return n12;
        }
        if (n10 > -12) {
            n10 = -1;
        }
        return n10;
    }
}

