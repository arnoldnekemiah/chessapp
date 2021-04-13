/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.os.Handler
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package c.b.b.a.e.d;

import android.database.ContentObserver;
import android.os.Handler;
import c.b.b.a.e.d.t2;
import java.util.concurrent.atomic.AtomicBoolean;

public final class s2
extends ContentObserver {
    public s2() {
        super(null);
    }

    public final void onChange(boolean bl) {
        t2.e.set(true);
    }
}

