/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NavigableSet
 *  java.util.TreeMap
 */
package a.f;

import a.g.a.d;
import a.g.a.e;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class i
implements e,
d {
    public static final TreeMap<Integer, i> i = new TreeMap();
    public volatile String a;
    public final long[] b;
    public final double[] c;
    public final String[] d;
    public final byte[][] e;
    public final int[] f;
    public final int g;
    public int h;

    public i(int n4) {
        this.g = n4;
        int n10 = n4 + 1;
        this.f = new int[n10];
        this.b = new long[n10];
        this.c = new double[n10];
        this.d = new String[n10];
        this.e = new byte[n10][];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static i a(String string, int n4) {
        TreeMap<Integer, i> treeMap;
        TreeMap<Integer, i> treeMap2 = treeMap = i;
        synchronized (treeMap2) {
            Map.Entry entry = i.ceilingEntry((Object)n4);
            if (entry != null) {
                i.remove(entry.getKey());
                i i10 = (i)entry.getValue();
                i10.a = string;
                i10.h = n4;
                return i10;
            }
        }
        i i11 = new i(n4);
        i11.a = string;
        i11.h = n4;
        return i11;
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public void a(d d6) {
        for (int i10 = 1; i10 <= this.h; ++i10) {
            int n4 = this.f[i10];
            if (n4 != 1) {
                if (n4 != 2) {
                    if (n4 != 3) {
                        if (n4 != 4) {
                            if (n4 != 5) continue;
                            d6.bindBlob(i10, this.e[i10]);
                            continue;
                        }
                        d6.bindString(i10, this.d[i10]);
                        continue;
                    }
                    d6.bindDouble(i10, this.c[i10]);
                    continue;
                }
                d6.bindLong(i10, this.b[i10]);
                continue;
            }
            d6.bindNull(i10);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        TreeMap<Integer, i> treeMap;
        TreeMap<Integer, i> treeMap2 = treeMap = i;
        synchronized (treeMap2) {
            i.put((Object)this.g, (Object)this);
            if (i.size() <= 15) return;
            int n4 = -10 + i.size();
            Iterator iterator = i.descendingKeySet().iterator();
            do {
                int n10 = n4 - 1;
                if (n4 <= 0) return;
                iterator.next();
                iterator.remove();
                n4 = n10;
                continue;
                break;
            } while (true);
        }
    }

    @Override
    public void bindBlob(int n4, byte[] arrby) {
        this.f[n4] = 5;
        this.e[n4] = arrby;
    }

    @Override
    public void bindDouble(int n4, double d6) {
        this.f[n4] = 3;
        this.c[n4] = d6;
    }

    @Override
    public void bindLong(int n4, long l8) {
        this.f[n4] = 2;
        this.b[n4] = l8;
    }

    @Override
    public void bindNull(int n4) {
        this.f[n4] = 1;
    }

    @Override
    public void bindString(int n4, String string) {
        this.f[n4] = 4;
        this.d[n4] = string;
    }

    public void close() {
    }
}

