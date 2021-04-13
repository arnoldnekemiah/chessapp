/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.c5
 *  c.b.b.a.e.d.c6
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Arrays
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.a5;
import c.b.b.a.e.d.c5;
import c.b.b.a.e.d.c6;
import c.b.b.a.e.d.d5;
import c.b.b.a.e.d.x4;
import java.util.Arrays;

public final class t7 {
    public static final t7 f = new t7(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public t7() {
        this(0, new int[8], new Object[8], true);
    }

    public t7(int n2, int[] arrn, Object[] arrobject, boolean bl) {
        this.a = n2;
        this.b = arrn;
        this.c = arrobject;
        this.e = bl;
    }

    public static t7 b() {
        return new t7(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int n2;
        block1 : {
            n2 = this.d;
            if (n2 != -1) break block1;
            int n6 = 0;
            for (int i2 = 0; i2 < this.a; ++i2) {
                int n10;
                int n11;
                block8 : {
                    int n12;
                    block2 : {
                        int n13;
                        block7 : {
                            block3 : {
                                block4 : {
                                    block5 : {
                                        block6 : {
                                            int n14 = this.b[i2];
                                            n12 = n14 >>> 3;
                                            int n15 = n14 & 7;
                                            if (n15 == 0) break block2;
                                            if (n15 == 1) break block3;
                                            if (n15 == 2) break block4;
                                            if (n15 == 3) break block5;
                                            if (n15 != 5) break block6;
                                            ((Integer)this.c[i2]).intValue();
                                            n13 = 4 + c5.f((int)(n12 << 3));
                                            break block7;
                                        }
                                        throw new IllegalStateException((Throwable)c6.c());
                                    }
                                    int n16 = c5.d((int)n12);
                                    n11 = n16 + n16;
                                    n10 = ((t7)this.c[i2]).a();
                                    break block8;
                                }
                                x4 x42 = (x4)this.c[i2];
                                int n17 = c5.f((int)(n12 << 3));
                                int n18 = x42.c();
                                n6 += n17 + (n18 + c5.f((int)n18));
                                continue;
                            }
                            ((Long)this.c[i2]).longValue();
                            n13 = 8 + c5.f((int)(n12 << 3));
                        }
                        n6 = n13 + n6;
                        continue;
                    }
                    long l2 = (Long)this.c[i2];
                    n11 = c5.f((int)(n12 << 3));
                    n10 = c5.c((long)l2);
                }
                n6 += n10 + n11;
            }
            this.d = n6;
            return n6;
        }
        return n2;
    }

    public final void a(int n2, Object object) {
        if (this.e) {
            int n6 = this.a;
            int[] arrn = this.b;
            if (n6 == arrn.length) {
                int n10 = n6 < 4 ? 8 : n6 >> 1;
                int n11 = n6 + n10;
                this.b = Arrays.copyOf((int[])arrn, (int)n11);
                this.c = Arrays.copyOf((Object[])this.c, (int)n11);
            }
            int[] arrn2 = this.b;
            int n12 = this.a;
            arrn2[n12] = n2;
            this.c[n12] = object;
            this.a = n12 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void a(d5 d52) {
        if (this.a != 0) {
            for (int i2 = 0; i2 < this.a; ++i2) {
                int n2 = this.b[i2];
                Object object = this.c[i2];
                int n6 = n2 >>> 3;
                int n10 = n2 & 7;
                if (n10 != 0) {
                    if (n10 != 1) {
                        if (n10 != 2) {
                            if (n10 != 3) {
                                if (n10 == 5) {
                                    d52.b(n6, (Integer)object);
                                    continue;
                                }
                                throw new RuntimeException((Throwable)c6.c());
                            }
                            a5 a52 = (a5)d52.a;
                            int n11 = n6 << 3;
                            a52.b(n11 | 3);
                            ((t7)object).a(d52);
                            ((a5)d52.a).b(n11 | 4);
                            continue;
                        }
                        x4 x42 = (x4)object;
                        d52.a.a(n6, x42);
                        continue;
                    }
                    d52.d(n6, (Long)object);
                    continue;
                }
                d52.a(n6, (Long)object);
            }
        }
    }

    public final boolean equals(Object object) {
        block7 : {
            if (this == object) {
                return true;
            }
            if (object == null) {
                return false;
            }
            if (!(object instanceof t7)) {
                return false;
            }
            t7 t72 = (t7)object;
            int n2 = this.a;
            if (n2 == t72.a) {
                int[] arrn = this.b;
                int[] arrn2 = t72.b;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (arrn[i2] == arrn2[i2]) continue;
                    return false;
                }
                Object[] arrobject = this.c;
                Object[] arrobject2 = t72.c;
                int n6 = this.a;
                for (int i10 = 0; i10 < n6; ++i10) {
                    if (arrobject[i10].equals(arrobject2[i10])) {
                        continue;
                    }
                    break block7;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a;
        int n6 = 31 * (n2 + 527);
        int[] arrn = this.b;
        int n10 = 0;
        int n11 = 17;
        int n12 = 17;
        for (int i2 = 0; i2 < n2; ++i2) {
            n12 = n12 * 31 + arrn[i2];
        }
        int n13 = 31 * (n6 + n12);
        Object[] arrobject = this.c;
        int n14 = this.a;
        while (n10 < n14) {
            n11 = n11 * 31 + arrobject[n10].hashCode();
            ++n10;
        }
        return n13 + n11;
    }
}

