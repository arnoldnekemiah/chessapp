/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  c.b.b.a.e.d.yb
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReference
 */
package c.b.b.a.e.d;

import android.os.Bundle;
import android.util.Log;
import c.b.b.a.e.d.yb;
import java.util.concurrent.atomic.AtomicReference;

public final class x9
extends yb {
    public final AtomicReference<Bundle> a = new AtomicReference();
    public boolean b;

    public static final <T> T a(Bundle bundle, Class<T> class_) {
        Object object;
        if (bundle != null && (object = bundle.get("r")) != null) {
            Object object2;
            try {
                object2 = class_.cast(object);
            }
            catch (ClassCastException classCastException) {
                Log.w((String)"AM", (String)String.format((String)"Unexpected object type. Expected, Received: %s, %s", (Object[])new Object[]{class_.getCanonicalName(), object.getClass().getCanonicalName()}), (Throwable)classCastException);
                throw classCastException;
            }
            return (T)object2;
        }
        return null;
    }

    public final String a(long l6) {
        return x9.a(this.b(l6), String.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle b(long l6) {
        AtomicReference<Bundle> atomicReference;
        AtomicReference<Bundle> atomicReference2 = atomicReference = this.a;
        synchronized (atomicReference2) {
            boolean bl = this.b;
            if (bl) return (Bundle)this.a.get();
            try {
                this.a.wait(l6);
                return (Bundle)this.a.get();
            }
            catch (InterruptedException interruptedException) {
                return null;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(Bundle bundle) {
        AtomicReference<Bundle> atomicReference;
        AtomicReference<Bundle> atomicReference2 = atomicReference = this.a;
        synchronized (atomicReference2) {
            try {
                this.a.set((Object)bundle);
                this.b = true;
                return;
            }
            finally {
                this.a.notify();
            }
        }
    }
}

