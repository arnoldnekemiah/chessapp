/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import c.b.b.a.f.b.j6;

public final class p5
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ j6 i;

    public p5(j6 j62, String string, String string2, long l2, Bundle bundle, boolean bl, boolean bl2, boolean bl3, String string3) {
        this.i = j62;
        this.a = string;
        this.b = string2;
        this.c = l2;
        this.d = bundle;
        this.e = bl;
        this.f = bl2;
        this.g = bl3;
        this.h = string3;
    }

    public final void run() {
        this.i.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}

