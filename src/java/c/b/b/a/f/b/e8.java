/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.Context;
import android.content.Intent;
import c.b.b.a.f.b.d8;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;

public final class e8<T extends Context> {
    public final T a;

    public e8(T t9) {
        a.a(t9);
        this.a = t9;
    }

    public final h3 a() {
        return i4.a(this.a, null, null).a();
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            this.a().f.a("onUnbind called with null intent");
            return true;
        }
        String string = intent.getAction();
        this.a().n.a("onUnbind called for intent. action", string);
        return true;
    }

    public final void b(Intent intent) {
        if (intent == null) {
            this.a().f.a("onRebind called with null intent");
            return;
        }
        String string = intent.getAction();
        this.a().n.a("onRebind called. action", string);
    }
}

