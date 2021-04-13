/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.b.o
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
package c.b.b.a.b;

import c.b.b.a.b.o;
import java.lang.ref.WeakReference;

public abstract class q
extends o {
    public static final WeakReference<byte[]> c = new WeakReference(null);
    public WeakReference<byte[]> b = c;

    public q(byte[] arrby) {
        super(arrby);
    }

    public abstract byte[] Z0();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] a() {
        q q6 = this;
        synchronized (q6) {
            byte[] arrby = (byte[])this.b.get();
            if (arrby == null) {
                arrby = this.Z0();
                this.b = new WeakReference((Object)arrby);
            }
            return arrby;
        }
    }
}

