/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c.b.b.a.f.b;

import android.content.ComponentName;
import c.b.b.a.f.b.x7;
import c.b.b.a.f.b.y7;

public final class s7
implements Runnable {
    public final /* synthetic */ ComponentName a;
    public final /* synthetic */ x7 b;

    public s7(x7 x72, ComponentName componentName) {
        this.b = x72;
        this.a = componentName;
    }

    public final void run() {
        y7.a(this.b.c, this.a);
    }
}

