/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.b.a
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ConcurrentModificationException
 */
package a.b;

import a.b.a;
import a.b.d;
import java.util.ConcurrentModificationException;

public class f<K, V> {
    public static Object[] d;
    public static int e;
    public static Object[] f;
    public static int g;
    public int[] a;
    public Object[] b;
    public int c;

    public f() {
        this.a = d.a;
        this.b = d.b;
        this.c = 0;
    }

    public f(int n2) {
        if (n2 == 0) {
            this.a = d.a;
            this.b = d.b;
        } else {
            this.a(n2);
        }
        this.c = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(int[] arrn, Object[] arrobject, int n2) {
        if (arrn.length == 8) {
            Class<a> class_ = a.class;
            synchronized (a.class) {
                if (g < 10) {
                    arrobject[0] = f;
                    arrobject[1] = arrn;
                    for (int i2 = (n2 << 1) - 1; i2 >= 2; --i2) {
                        arrobject[i2] = null;
                    }
                    f = arrobject;
                    g = 1 + g;
                }
                // ** MonitorExit[var7_3] (shouldn't be in output)
                return;
            }
        }
        if (arrn.length != 4) {
            return;
        }
        Class<a> class_ = a.class;
        synchronized (a.class) {
            if (e < 10) {
                arrobject[0] = d;
                arrobject[1] = arrn;
                for (int i3 = (n2 << 1) - 1; i3 >= 2; --i3) {
                    arrobject[i3] = null;
                }
                d = arrobject;
                e = 1 + e;
            }
            // ** MonitorExit[var7_4] (shouldn't be in output)
            return;
        }
    }

    public int a() {
        int n2;
        int n3;
        int n4;
        block6 : {
            n4 = this.c;
            if (n4 == 0) {
                return -1;
            }
            int[] arrn = this.a;
            try {
                n3 = d.a(arrn, n4, 0);
                if (n3 >= 0) break block6;
                return n3;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                ConcurrentModificationException concurrentModificationException;
                concurrentModificationException = new ConcurrentModificationException();
                throw concurrentModificationException;
            }
        }
        if (this.b[n3 << 1] == null) {
            return n3;
        }
        for (n2 = n3 + 1; n2 < n4 && this.a[n2] == 0; ++n2) {
            if (this.b[n2 << 1] != null) continue;
            return n2;
        }
        for (int i2 = n3 - 1; i2 >= 0 && this.a[i2] == 0; --i2) {
            if (this.b[i2 << 1] != null) continue;
            return i2;
        }
        return ~n2;
    }

    public int a(Object object) {
        if (object == null) {
            return this.a();
        }
        return this.a(object, object.hashCode());
    }

    public int a(Object object, int n2) {
        int n3;
        int n4;
        int n5;
        block6 : {
            n3 = this.c;
            if (n3 == 0) {
                return -1;
            }
            int[] arrn = this.a;
            try {
                n5 = d.a(arrn, n3, n2);
                if (n5 >= 0) break block6;
                return n5;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                ConcurrentModificationException concurrentModificationException;
                concurrentModificationException = new ConcurrentModificationException();
                throw concurrentModificationException;
            }
        }
        if (object.equals(this.b[n5 << 1])) {
            return n5;
        }
        for (n4 = n5 + 1; n4 < n3 && this.a[n4] == n2; ++n4) {
            if (!object.equals(this.b[n4 << 1])) continue;
            return n4;
        }
        for (int i2 = n5 - 1; i2 >= 0 && this.a[i2] == n2; --i2) {
            if (!object.equals(this.b[i2 << 1])) continue;
            return i2;
        }
        return ~n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(int n2) {
        if (n2 == 8) {
            Class<a> class_ = a.class;
            // MONITORENTER : a.b.a.class
            if (f != null) {
                Object[] arrobject = f;
                this.b = arrobject;
                f = (Object[])arrobject[0];
                this.a = (int[])arrobject[1];
                arrobject[1] = null;
                arrobject[0] = null;
                --g;
                // MONITOREXIT : class_
                return;
            }
            // MONITOREXIT : class_
        } else if (n2 == 4) {
            Class<a> class_ = a.class;
            // MONITORENTER : a.b.a.class
            if (d != null) {
                Object[] arrobject = d;
                this.b = arrobject;
                d = (Object[])arrobject[0];
                this.a = (int[])arrobject[1];
                arrobject[1] = null;
                arrobject[0] = null;
                --e;
                // MONITOREXIT : class_
                return;
            }
            // MONITOREXIT : class_
        }
        this.a = new int[n2];
        this.b = new Object[n2 << 1];
    }

    public int b(Object object) {
        int n2 = 2 * this.c;
        Object[] arrobject = this.b;
        if (object == null) {
            for (int i2 = 1; i2 < n2; i2 += 2) {
                if (arrobject[i2] != null) continue;
                return i2 >> 1;
            }
        } else {
            for (int i3 = 1; i3 < n2; i3 += 2) {
                if (!object.equals(arrobject[i3])) continue;
                return i3 >> 1;
            }
        }
        return -1;
    }

    public K b(int n2) {
        return (K)this.b[n2 << 1];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public V c(int n2) {
        int n3;
        Object[] arrobject = this.b;
        int n4 = n2 << 1;
        Object object = arrobject[n4 + 1];
        int n5 = this.c;
        if (n5 <= 1) {
            f.a(this.a, arrobject, n5);
            this.a = d.a;
            this.b = d.b;
            n3 = 0;
        } else {
            int n6 = n5 - 1;
            int[] arrn = this.a;
            int n7 = arrn.length;
            int n8 = 8;
            if (n7 > n8 && n5 < arrn.length / 3) {
                if (n5 > n8) {
                    n8 = n5 + (n5 >> 1);
                }
                int[] arrn2 = this.a;
                Object[] arrobject2 = this.b;
                this.a(n8);
                if (n5 != this.c) throw new ConcurrentModificationException();
                if (n2 > 0) {
                    System.arraycopy((Object)arrn2, (int)0, (Object)this.a, (int)0, (int)n2);
                    System.arraycopy((Object)arrobject2, (int)0, (Object)this.b, (int)0, (int)n4);
                }
                if (n2 < n6) {
                    int n9 = n2 + 1;
                    int[] arrn3 = this.a;
                    int n10 = n6 - n2;
                    System.arraycopy((Object)arrn2, (int)n9, (Object)arrn3, (int)n2, (int)n10);
                    System.arraycopy((Object)arrobject2, (int)(n9 << 1), (Object)this.b, (int)n4, (int)(n10 << 1));
                }
            } else {
                if (n2 < n6) {
                    int[] arrn4 = this.a;
                    int n11 = n2 + 1;
                    int n12 = n6 - n2;
                    System.arraycopy((Object)arrn4, (int)n11, (Object)arrn4, (int)n2, (int)n12);
                    Object[] arrobject3 = this.b;
                    System.arraycopy((Object)arrobject3, (int)(n11 << 1), (Object)arrobject3, (int)n4, (int)(n12 << 1));
                }
                Object[] arrobject4 = this.b;
                int n13 = n6 << 1;
                arrobject4[n13] = null;
                arrobject4[n13 + 1] = null;
            }
            n3 = n6;
        }
        if (n5 != this.c) throw new ConcurrentModificationException();
        this.c = n3;
        return (V)object;
    }

    public void clear() {
        int n2 = this.c;
        if (n2 > 0) {
            int[] arrn = this.a;
            Object[] arrobject = this.b;
            this.a = d.a;
            this.b = d.b;
            this.c = 0;
            f.a(arrn, arrobject, n2);
        }
        if (this.c <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object object) {
        return this.a(object) >= 0;
    }

    public boolean containsValue(Object object) {
        return this.b(object) >= 0;
    }

    public V d(int n2) {
        return (V)this.b[1 + (n2 << 1)];
    }

    /*
     * Exception decompiling
     */
    public boolean equals(Object var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl114.1 : ICONST_0 : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public V get(Object object) {
        int n2 = this.a(object);
        if (n2 >= 0) {
            return (V)this.b[1 + (n2 << 1)];
        }
        return null;
    }

    public int hashCode() {
        int[] arrn = this.a;
        Object[] arrobject = this.b;
        int n2 = this.c;
        int n3 = 1;
        int n4 = 0;
        int n5 = 0;
        while (n4 < n2) {
            Object object = arrobject[n3];
            int n6 = arrn[n4];
            int n7 = object == null ? 0 : object.hashCode();
            n5 += n7 ^ n6;
            ++n4;
            n3 += 2;
        }
        return n5;
    }

    public boolean isEmpty() {
        return this.c <= 0;
    }

    public V put(K k2, V v2) {
        int[] arrn;
        int n2;
        int n3;
        int n4;
        int n5 = this.c;
        if (k2 == null) {
            n2 = this.a();
            n4 = 0;
        } else {
            int n6 = k2.hashCode();
            int n7 = this.a(k2, n6);
            n4 = n6;
            n2 = n7;
        }
        if (n2 >= 0) {
            int n8 = 1 + (n2 << 1);
            Object[] arrobject = this.b;
            Object object = arrobject[n8];
            arrobject[n8] = v2;
            return (V)object;
        }
        int n9 = ~n2;
        if (n5 >= this.a.length) {
            int n10 = 4;
            if (n5 >= 8) {
                n10 = n5 + (n5 >> 1);
            } else if (n5 >= n10) {
                n10 = 8;
            }
            int[] arrn2 = this.a;
            Object[] arrobject = this.b;
            this.a(n10);
            if (n5 == this.c) {
                int[] arrn3 = this.a;
                if (arrn3.length > 0) {
                    System.arraycopy((Object)arrn2, (int)0, (Object)arrn3, (int)0, (int)arrn2.length);
                    System.arraycopy((Object)arrobject, (int)0, (Object)this.b, (int)0, (int)arrobject.length);
                }
                f.a(arrn2, arrobject, n5);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (n9 < n5) {
            int[] arrn4 = this.a;
            int n11 = n9 + 1;
            System.arraycopy((Object)arrn4, (int)n9, (Object)arrn4, (int)n11, (int)(n5 - n9));
            Object[] arrobject = this.b;
            System.arraycopy((Object)arrobject, (int)(n9 << 1), (Object)arrobject, (int)(n11 << 1), (int)(this.c - n9 << 1));
        }
        if (n5 == (n3 = this.c) && n9 < (arrn = this.a).length) {
            arrn[n9] = n4;
            Object[] arrobject = this.b;
            int n12 = n9 << 1;
            arrobject[n12] = k2;
            arrobject[n12 + 1] = v2;
            this.c = n3 + 1;
            return null;
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object object) {
        int n2 = this.a(object);
        if (n2 >= 0) {
            return this.c(n2);
        }
        return null;
    }

    public int size() {
        return this.c;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(28 * this.c);
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.c; ++i2) {
            K k2;
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            if ((k2 = this.b(i2)) != this) {
                stringBuilder.append(k2);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            V v2 = this.d(i2);
            if (v2 != this) {
                stringBuilder.append(v2);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

