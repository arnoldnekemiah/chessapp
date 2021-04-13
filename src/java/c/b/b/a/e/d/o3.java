/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  c.b.b.a.e.d.k3
 *  c.b.b.a.e.d.l3
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  javax.annotation.Nullable
 */
package c.b.b.a.e.d;

import android.content.Context;
import android.net.Uri;
import c.b.b.a.e.d.k3;
import c.b.b.a.e.d.l3;
import c.b.b.a.e.d.q3;
import c.b.b.a.e.d.u3;
import javax.annotation.Nullable;

public final class o3 {
    public final String a = null;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    @Nullable
    public final u3<Context, Boolean> i;

    public o3(Uri uri) {
        this.b = uri;
        this.c = "";
        this.d = "";
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = null;
    }

    public final q3<Long> a(String string, long l2) {
        return new k3(this, string, Long.valueOf((long)l2));
    }

    public final q3<Boolean> a(String string, boolean bl) {
        return new l3(this, string, Boolean.valueOf((boolean)bl));
    }
}

