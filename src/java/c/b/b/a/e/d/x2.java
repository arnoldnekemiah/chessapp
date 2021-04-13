/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.os.Handler
 *  c.b.b.a.e.d.y2
 */
package c.b.b.a.e.d;

import android.database.ContentObserver;
import android.os.Handler;
import c.b.b.a.e.d.y2;

public final class x2
extends ContentObserver {
    public final /* synthetic */ y2 a;

    public x2(y2 y22) {
        this.a = y22;
        super(null);
    }

    public final void onChange(boolean bl) {
        this.a.b();
    }
}

