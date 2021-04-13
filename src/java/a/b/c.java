/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.b.b
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.reflect.Array
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Set
 */
package a.b;

import a.b.b;
import a.b.d;
import a.b.e;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c<E>
implements Collection<E>,
Set<E> {
    public static final int[] e = new int[0];
    public static final Object[] f = new Object[0];
    public static Object[] g;
    public static int h;
    public static Object[] i;
    public static int j;
    public int[] a;
    public Object[] b;
    public int c;
    public e<E, E> d;

    public c() {
        this(0);
    }

    public c(int n2) {
        if (n2 == 0) {
            this.a = e;
            this.b = f;
        } else {
            this.c(n2);
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
            Class<c> class_ = c.class;
            synchronized (c.class) {
                if (j < 10) {
                    arrobject[0] = i;
                    arrobject[1] = arrn;
                    for (int i2 = n2 - 1; i2 >= 2; --i2) {
                        arrobject[i2] = null;
                    }
                    i = arrobject;
                    j = 1 + j;
                }
                // ** MonitorExit[var7_3] (shouldn't be in output)
                return;
            }
        }
        if (arrn.length != 4) {
            return;
        }
        Class<c> class_ = c.class;
        synchronized (c.class) {
            if (h < 10) {
                arrobject[0] = g;
                arrobject[1] = arrn;
                for (int i3 = n2 - 1; i3 >= 2; --i3) {
                    arrobject[i3] = null;
                }
                g = arrobject;
                h = 1 + h;
            }
            // ** MonitorExit[var7_4] (shouldn't be in output)
            return;
        }
    }

    public final int a(Object object, int n2) {
        int n3;
        int n4 = this.c;
        if (n4 == 0) {
            return -1;
        }
        int n5 = d.a(this.a, n4, n2);
        if (n5 < 0) {
            return n5;
        }
        if (object.equals(this.b[n5])) {
            return n5;
        }
        for (n3 = n5 + 1; n3 < n4 && this.a[n3] == n2; ++n3) {
            if (!object.equals(this.b[n3])) continue;
            return n3;
        }
        for (int i2 = n5 - 1; i2 >= 0 && this.a[i2] == n2; --i2) {
            if (!object.equals(this.b[i2])) continue;
            return i2;
        }
        return ~n3;
    }

    public boolean add(E e2) {
        int n2;
        int n3;
        int n4;
        if (e2 == null) {
            n3 = this.c();
            n2 = 0;
        } else {
            int n5 = e2.hashCode();
            int n6 = this.a(e2, n5);
            n2 = n5;
            n3 = n6;
        }
        if (n3 >= 0) {
            return false;
        }
        int n7 = ~n3;
        int n8 = this.c;
        if (n8 >= this.a.length) {
            int n9 = 4;
            if (n8 >= 8) {
                n9 = n8 + (n8 >> 1);
            } else if (n8 >= n9) {
                n9 = 8;
            }
            int[] arrn = this.a;
            Object[] arrobject = this.b;
            this.c(n9);
            int[] arrn2 = this.a;
            if (arrn2.length > 0) {
                System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)arrn.length);
                System.arraycopy((Object)arrobject, (int)0, (Object)this.b, (int)0, (int)arrobject.length);
            }
            c.a(arrn, arrobject, this.c);
        }
        if (n7 < (n4 = this.c)) {
            int[] arrn = this.a;
            int n10 = n7 + 1;
            System.arraycopy((Object)arrn, (int)n7, (Object)arrn, (int)n10, (int)(n4 - n7));
            Object[] arrobject = this.b;
            System.arraycopy((Object)arrobject, (int)n7, (Object)arrobject, (int)n10, (int)(this.c - n7));
        }
        this.a[n7] = n2;
        this.b[n7] = e2;
        this.c = 1 + this.c;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int n2 = this.c + collection.size();
        int[] arrn = this.a;
        int n3 = arrn.length;
        boolean bl = false;
        if (n3 < n2) {
            Object[] arrobject = this.b;
            this.c(n2);
            int n4 = this.c;
            if (n4 > 0) {
                System.arraycopy((Object)arrn, (int)0, (Object)this.a, (int)0, (int)n4);
                System.arraycopy((Object)arrobject, (int)0, (Object)this.b, (int)0, (int)this.c);
            }
            c.a(arrn, arrobject, this.c);
        }
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            bl |= this.add(iterator.next());
        }
        return bl;
    }

    public final int c() {
        int n2;
        int n3 = this.c;
        if (n3 == 0) {
            return -1;
        }
        int n4 = d.a(this.a, n3, 0);
        if (n4 < 0) {
            return n4;
        }
        if (this.b[n4] == null) {
            return n4;
        }
        for (n2 = n4 + 1; n2 < n3 && this.a[n2] == 0; ++n2) {
            if (this.b[n2] != null) continue;
            return n2;
        }
        for (int i2 = n4 - 1; i2 >= 0 && this.a[i2] == 0; --i2) {
            if (this.b[i2] != null) continue;
            return i2;
        }
        return ~n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c(int n2) {
        if (n2 == 8) {
            Class<c> class_ = c.class;
            // MONITORENTER : a.b.c.class
            if (i != null) {
                Object[] arrobject = i;
                this.b = arrobject;
                i = (Object[])arrobject[0];
                this.a = (int[])arrobject[1];
                arrobject[1] = null;
                arrobject[0] = null;
                --j;
                // MONITOREXIT : class_
                return;
            }
            // MONITOREXIT : class_
        } else if (n2 == 4) {
            Class<c> class_ = c.class;
            // MONITORENTER : a.b.c.class
            if (g != null) {
                Object[] arrobject = g;
                this.b = arrobject;
                g = (Object[])arrobject[0];
                this.a = (int[])arrobject[1];
                arrobject[1] = null;
                arrobject[0] = null;
                --h;
                // MONITOREXIT : class_
                return;
            }
            // MONITOREXIT : class_
        }
        this.a = new int[n2];
        this.b = new Object[n2];
    }

    public void clear() {
        int n2 = this.c;
        if (n2 != 0) {
            c.a(this.a, this.b, n2);
            this.a = e;
            this.b = f;
            this.c = 0;
        }
    }

    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (this.contains(iterator.next())) continue;
            return false;
        }
        return true;
    }

    public E d(int n2) {
        Object[] arrobject = this.b;
        Object object = arrobject[n2];
        int n3 = this.c;
        if (n3 <= 1) {
            c.a(this.a, arrobject, n3);
            this.a = e;
            this.b = f;
            this.c = 0;
            return (E)object;
        }
        int[] arrn = this.a;
        int n4 = arrn.length;
        int n5 = 8;
        if (n4 > n5 && n3 < arrn.length / 3) {
            int n6;
            if (n3 > n5) {
                n5 = n3 + (n3 >> 1);
            }
            int[] arrn2 = this.a;
            Object[] arrobject2 = this.b;
            this.c(n5);
            --this.c;
            if (n2 > 0) {
                System.arraycopy((Object)arrn2, (int)0, (Object)this.a, (int)0, (int)n2);
                System.arraycopy((Object)arrobject2, (int)0, (Object)this.b, (int)0, (int)n2);
            }
            if (n2 < (n6 = this.c)) {
                int n7 = n2 + 1;
                System.arraycopy((Object)arrn2, (int)n7, (Object)this.a, (int)n2, (int)(n6 - n2));
                System.arraycopy((Object)arrobject2, (int)n7, (Object)this.b, (int)n2, (int)(this.c - n2));
                return (E)object;
            }
        } else {
            int n8;
            this.c = n8 = this.c - 1;
            if (n2 < n8) {
                int[] arrn3 = this.a;
                int n9 = n2 + 1;
                System.arraycopy((Object)arrn3, (int)n9, (Object)arrn3, (int)n2, (int)(n8 - n2));
                Object[] arrobject3 = this.b;
                System.arraycopy((Object)arrobject3, (int)n9, (Object)arrobject3, (int)n2, (int)(this.c - n2));
            }
            this.b[this.c] = null;
        }
        return (E)object;
    }

    /*
     * Exception decompiling
     */
    public boolean equals(Object var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl40.1 : ICONST_0 : trying to set 0 previously set to 1
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

    public int hashCode() {
        int[] arrn = this.a;
        int n2 = this.c;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 += arrn[i2];
        }
        return n3;
    }

    public int indexOf(Object object) {
        if (object == null) {
            return this.c();
        }
        return this.a(object, object.hashCode());
    }

    public boolean isEmpty() {
        return this.c <= 0;
    }

    public Iterator<E> iterator() {
        if (this.d == null) {
            this.d = new b(this);
        }
        e<E, E> e2 = this.d;
        if (e2.b == null) {
            e2.b = new e.c(e2);
        }
        return e2.b.iterator();
    }

    public boolean remove(Object object) {
        int n2 = this.indexOf(object);
        if (n2 >= 0) {
            this.d(n2);
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<?> collection) {
        Iterator iterator = collection.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            bl |= this.remove(iterator.next());
        }
        return bl;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean bl = false;
        for (int i2 = this.c - 1; i2 >= 0; --i2) {
            if (collection.contains(this.b[i2])) continue;
            this.d(i2);
            bl = true;
        }
        return bl;
    }

    public int size() {
        return this.c;
    }

    public Object[] toArray() {
        int n2 = this.c;
        Object[] arrobject = new Object[n2];
        System.arraycopy((Object)this.b, (int)0, (Object)arrobject, (int)0, (int)n2);
        return arrobject;
    }

    public <T> T[] toArray(T[] arrobject) {
        if (arrobject.length < this.c) {
            arrobject = (Object[])Array.newInstance((Class)arrobject.getClass().getComponentType(), (int)this.c);
        }
        System.arraycopy((Object)this.b, (int)0, arrobject, (int)0, (int)this.c);
        int n2 = arrobject.length;
        int n3 = this.c;
        if (n2 > n3) {
            arrobject[n3] = null;
        }
        return arrobject;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(14 * this.c);
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.c; ++i2) {
            Object object;
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            if ((object = this.b[i2]) != this) {
                stringBuilder.append(object);
                continue;
            }
            stringBuilder.append("(this Set)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

