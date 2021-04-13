/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 */
package c.c.b.i;

import a.c.a.a;
import c.c.b.i.f;
import c.c.b.i.j;
import c.c.b.i.o;
import java.util.ArrayList;

public class g {
    public static g e = new g();
    public f[] a = new f[2048];
    public int b = 0;
    public Object[] c = new Object[200];
    public int d = 0;

    public static final int a(j j10, int n10, int n11, int n12) {
        while (n11 > 0) {
            int n13 = j10.a[n10 += n12];
            if (n13 != 0) {
                return n13;
            }
            --n11;
        }
        return 0;
    }

    public static final boolean a(j j10, int n10) {
        int n11;
        int n12;
        int n13;
        boolean bl;
        int n14;
        int n15;
        block30 : {
            block31 : {
                int n16;
                int n17;
                block28 : {
                    block29 : {
                        n11 = j.f(n10);
                        n14 = n10 >> 3;
                        bl = j10.b;
                        n13 = bl ? 8 : 2;
                        n15 = bl ? 9 : 3;
                        n16 = bl ? 10 : 4;
                        n17 = bl ? 11 : 5;
                        if (n14 <= 0) break block28;
                        int n18 = g.a(j10, n10, n14, -8);
                        if (n18 == n13) break block29;
                        if (n18 == n15) {
                            return true;
                        }
                        int n19 = g.a(j10, n10, Math.min((int)n11, (int)n14), -9);
                        if (n19 == n13) break block29;
                        if (n19 == n16) {
                            return true;
                        }
                        int n20 = g.a(j10, n10, Math.min((int)(7 - n11), (int)n14), -7);
                        if (n20 == n13) break block29;
                        if (n20 == n16) {
                            return true;
                        }
                        if (n11 > 1 && g.a(j10, n10, 1, -10) == n17) {
                            return true;
                        }
                        if (n11 > 0 && n14 > 1 && g.a(j10, n10, 1, -17) == n17) {
                            return true;
                        }
                        if (n11 < 7 && n14 > 1 && g.a(j10, n10, 1, -15) == n17) {
                            return true;
                        }
                        if (n11 < 6 && g.a(j10, n10, 1, -6) == n17) {
                            return true;
                        }
                        if (bl) break block28;
                        if (n11 < 7 && n14 > 1 && g.a(j10, n10, 1, -7) == 6) {
                            return true;
                        }
                        if (n11 <= 0 || n14 <= 1 || g.a(j10, n10, 1, -9) != 6) break block28;
                    }
                    return true;
                }
                if (n14 >= 7) break block30;
                int n21 = 7 - n14;
                int n22 = g.a(j10, n10, n21, 8);
                if (n22 == n13) break block31;
                if (n22 == n15) {
                    return true;
                }
                int n23 = g.a(j10, n10, Math.min((int)(7 - n11), (int)n21), 9);
                if (n23 == n13) break block31;
                if (n23 == n16) {
                    return true;
                }
                int n24 = g.a(j10, n10, Math.min((int)n11, (int)n21), 7);
                if (n24 == n13) break block31;
                if (n24 == n16) {
                    return true;
                }
                if (n11 < 6 && g.a(j10, n10, 1, 10) == n17) {
                    return true;
                }
                if (n11 < 7 && n14 < 6 && g.a(j10, n10, 1, 17) == n17) {
                    return true;
                }
                if (n11 > 0 && n14 < 6 && g.a(j10, n10, 1, 15) == n17) {
                    return true;
                }
                if (n11 > 1 && g.a(j10, n10, 1, 6) == n17) {
                    return true;
                }
                if (!bl) break block30;
                if (n11 < 7 && n14 < 6 && g.a(j10, n10, 1, 9) == 12) {
                    return true;
                }
                if (n11 <= 0 || n14 >= 6 || g.a(j10, n10, 1, 7) != 12) break block30;
            }
            return true;
        }
        if ((n12 = g.a(j10, n10, 7 - n11, 1)) != n13) {
            if (n12 == n15) {
                return true;
            }
            int n25 = g.a(j10, n10, n11, -1);
            if (n25 != n13) {
                if (n25 == n15) {
                    return true;
                }
                int n26 = j10.a(bl ^ true);
                if (n26 >= 0) {
                    int n27 = n26 & 7;
                    int n28 = n26 >> 3;
                    if (Math.abs((int)(n11 - n27)) <= 1 && Math.abs((int)(n14 - n28)) <= 1) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final boolean b(j j10) {
        int n10 = j10.a(j10.b);
        if (n10 < 0) {
            return false;
        }
        return g.a(j10, n10);
    }

    public final f a(int n10, int n11, int n12) {
        int n13 = this.b;
        if (n13 > 0) {
            int n14;
            f[] arrf = this.a;
            this.b = n14 = n13 - 1;
            f f10 = arrf[n14];
            f10.a = n10;
            f10.b = n11;
            f10.c = n12;
            return f10;
        }
        return new f(n10, n11, n12);
    }

    public final ArrayList<f> a() {
        int n10 = this.d;
        if (n10 > 0) {
            int n11;
            Object[] arrobject = this.c;
            this.d = n11 = n10 - 1;
            return (ArrayList)arrobject[n11];
        }
        return new ArrayList(60);
    }

    public final ArrayList<f> a(j j10) {
        int n10;
        ArrayList<f> arrayList = this.a();
        boolean bl = j10.b;
        block0 : for (int i10 = 0; i10 < (n10 = 8); ++i10) {
            for (int i11 = 0; i11 < n10; ++i11) {
                block30 : {
                    int n11;
                    int n12;
                    block38 : {
                        block37 : {
                            int n13;
                            int n14;
                            block34 : {
                                int n15;
                                block36 : {
                                    block35 : {
                                        int n16;
                                        int n17;
                                        block32 : {
                                            int n18;
                                            block33 : {
                                                block31 : {
                                                    int n19;
                                                    n12 = i10 + i11 * 8;
                                                    int n20 = j10.a[n12];
                                                    if (n20 == 0 || a.f(n20) != bl) break block30;
                                                    if (n20 != 3 && n20 != 9 && n20 != 2 && n20 != n10) {
                                                        n16 = n20;
                                                        n19 = 2;
                                                    } else {
                                                        int n21;
                                                        int n22 = 7 - i10;
                                                        ArrayList<f> arrayList2 = arrayList;
                                                        n19 = 2;
                                                        n16 = n20;
                                                        if (this.a(arrayList2, j10, n12, n22, 1) || this.a(arrayList, j10, n12, n21 = 7 - i11, 8) || this.a(arrayList, j10, n12, i10, -1) || this.a(arrayList, j10, n12, i11, -8)) break block0;
                                                    }
                                                    if (n16 == 4 || n16 == 10 || n16 == n19 || n16 == 8) {
                                                        int n23;
                                                        int n24;
                                                        int n25;
                                                        int n26 = 7 - i10;
                                                        int n27 = 7 - i11;
                                                        int n28 = Math.min((int)n26, (int)n27);
                                                        if (this.a(arrayList, j10, n12, n28, 9) || this.a(arrayList, j10, n12, n23 = Math.min((int)i10, (int)n27), 7) || this.a(arrayList, j10, n12, n25 = Math.min((int)i10, (int)i11), -9) || this.a(arrayList, j10, n12, n24 = Math.min((int)n26, (int)i11), -7)) break block0;
                                                    }
                                                    n17 = 6;
                                                    if (n16 == 5 || n16 == 11) {
                                                        int n29;
                                                        if (i10 < n17) {
                                                            n29 = 7;
                                                            if (i11 < n29) {
                                                                if (this.a(arrayList, j10, n12, 1, 10)) break block0;
                                                            }
                                                        } else {
                                                            n29 = 7;
                                                        }
                                                        if (i10 < n29 && i11 < n17 && this.a(arrayList, j10, n12, 1, 17) || i10 > 0 && i11 < n17 && this.a(arrayList, j10, n12, 1, 15)) break block0;
                                                        int n30 = 1;
                                                        if (i10 > n30) {
                                                            if (i11 < 7 && this.a(arrayList, j10, n12, 1, 6)) break block0;
                                                            n30 = 1;
                                                        }
                                                        if (i10 > n30 && i11 > 0 && this.a(arrayList, j10, n12, 1, -10) || i10 > 0 && i11 > 1 && this.a(arrayList, j10, n12, 1, -17) || i10 < 7 && i11 > 1 && this.a(arrayList, j10, n12, 1, -15) || i10 < n17 && i11 > 0 && this.a(arrayList, j10, n12, 1, -6)) break block0;
                                                    }
                                                    if (n16 == 1) break block31;
                                                    n18 = 7;
                                                    if (n16 != n18) break block32;
                                                    break block33;
                                                }
                                                n18 = 7;
                                            }
                                            if (i10 < n18) {
                                                if (this.a(arrayList, j10, n12, 1, 1)) break block0;
                                                n18 = 7;
                                            }
                                            if (i10 < n18 && i11 < n18 && this.a(arrayList, j10, n12, 1, 9) || i11 < 7 && this.a(arrayList, j10, n12, 1, 8) || i10 > 0 && i11 < 7 && this.a(arrayList, j10, n12, 1, 7) || i10 > 0 && this.a(arrayList, j10, n12, 1, -1) || i10 > 0 && i11 > 0 && this.a(arrayList, j10, n12, 1, -9) || i11 > 0 && this.a(arrayList, j10, n12, 1, -8) || i10 < 7 && i11 > 0 && this.a(arrayList, j10, n12, 1, -7)) break block0;
                                            int n31 = bl ? 4 : 60;
                                            if (n12 == n31) {
                                                int n32;
                                                int[] arrn;
                                                int n33;
                                                int[] arrn2;
                                                int n34;
                                                int n35;
                                                int n36 = bl ? 0 : 2;
                                                int n37 = bl ? 1 : 3;
                                                int n38 = bl ? 3 : 9;
                                                if ((j10.c & 1 << n37) != 0 && (arrn = j10.a)[n32 = n31 + 1] == 0 && arrn[n33 = n31 + 2] == 0 && arrn[n31 + 3] == n38 && !g.a(j10, n31) && !g.a(j10, n32)) {
                                                    arrayList.add((Object)this.a(n31, n33, 0));
                                                }
                                                if ((j10.c & 1 << n36) != 0 && (arrn2 = j10.a)[n34 = n31 - 1] == 0 && arrn2[n35 = n31 - 2] == 0 && arrn2[n31 - 3] == 0 && arrn2[n31 - 4] == n38 && !g.a(j10, n31) && !g.a(j10, n34)) {
                                                    arrayList.add((Object)this.a(n31, n35, 0));
                                                }
                                            }
                                        }
                                        if (n16 != n17 && n16 != 12) break block30;
                                        int n39 = bl ? 8 : -8;
                                        n14 = n12 + n39;
                                        if (j10.a[n14] == 0) {
                                            int n40;
                                            this.a(arrayList, n12, n14);
                                            if (bl) {
                                                n17 = 1;
                                            }
                                            if (i11 == n17 && j10.a[n40 = n12 + n39 * 2] == 0) {
                                                this.a(arrayList, n12, n40);
                                            }
                                        }
                                        if (i10 <= 0) break block34;
                                        n15 = n14 - 1;
                                        int n41 = j10.a[n15];
                                        if (n41 == 0) break block35;
                                        if (a.f(n41) == bl) break block34;
                                        int n42 = bl ? 7 : 1;
                                        if (n41 == n42) {
                                            this.a(arrayList);
                                            arrayList = this.a();
                                            arrayList.add((Object)this.a(n12, n15, 0));
                                            break block0;
                                        }
                                        break block36;
                                    }
                                    if (n15 != j10.d) break block34;
                                }
                                this.a(arrayList, n12, n15);
                            }
                            if (i10 >= (n13 = 7)) break block30;
                            n11 = n14 + 1;
                            int n43 = j10.a[n11];
                            if (n43 == 0) break block37;
                            if (a.f(n43) == bl) break block30;
                            if (!bl) {
                                n13 = 1;
                            }
                            if (n43 == n13) {
                                this.a(arrayList);
                                arrayList = this.a();
                                arrayList.add((Object)this.a(n12, n11, 0));
                                break block0;
                            }
                            break block38;
                        }
                        if (n11 != j10.d) break block30;
                    }
                    this.a(arrayList, n12, n11);
                }
                n10 = 8;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        o o10 = new o();
        int n44 = arrayList.size();
        for (int i12 = 0; i12 < n44; ++i12) {
            f f10 = (f)arrayList.get(i12);
            j10.a(f10, o10);
            j10.b(true ^ j10.b);
            if (!g.b(j10)) {
                arrayList3.add((Object)f10);
            }
            j10.b(true ^ j10.b);
            j10.b(f10, o10);
        }
        return arrayList3;
    }

    public final void a(ArrayList<f> arrayList) {
        if (this.b + arrayList.size() <= this.a.length) {
            int n10 = arrayList.size();
            for (int i10 = 0; i10 < n10; ++i10) {
                f[] arrf = this.a;
                int n11 = this.b;
                this.b = n11 + 1;
                arrf[n11] = (f)arrayList.get(i10);
            }
        }
        arrayList.clear();
        int n12 = this.d;
        Object[] arrobject = this.c;
        if (n12 < arrobject.length) {
            this.d = n12 + 1;
            arrobject[n12] = arrayList;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(ArrayList<f> arrayList, int n10, int n11) {
        int n12;
        if (n11 >= 56) {
            arrayList.add((Object)this.a(n10, n11, 2));
            arrayList.add((Object)this.a(n10, n11, 5));
            arrayList.add((Object)this.a(n10, n11, 3));
            n12 = 4;
        } else if (n11 < 8) {
            arrayList.add((Object)this.a(n10, n11, 8));
            arrayList.add((Object)this.a(n10, n11, 11));
            arrayList.add((Object)this.a(n10, n11, 9));
            n12 = 10;
        } else {
            n12 = 0;
        }
        arrayList.add((Object)this.a(n10, n11, n12));
    }

    public final boolean a(ArrayList<f> arrayList, j j10, int n10, int n11, int n12) {
        boolean bl = j10.b;
        int n13 = bl ? 7 : 1;
        int n14 = n10;
        while (n11 > 0) {
            int n15 = j10.a[n14 += n12];
            if (n15 == 0) {
                arrayList.add((Object)this.a(n10, n14, 0));
                --n11;
                continue;
            }
            if (a.f(n15) == bl) break;
            if (n15 == n13) {
                this.a(arrayList);
                this.a().add((Object)this.a(n10, n14, 0));
                return true;
            }
            arrayList.add((Object)this.a(n10, n14, 0));
            break;
        }
        return false;
    }
}

