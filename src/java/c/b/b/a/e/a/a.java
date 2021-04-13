/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  c.b.b.a.e.a.b
 *  c.b.b.a.e.a.d
 *  c.b.b.a.e.a.gb
 *  c.b.b.a.e.a.qe
 *  com.google.android.gms.internal.ads.zzvl
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Handler;
import c.b.b.a.e.a.b;
import c.b.b.a.e.a.d;
import c.b.b.a.e.a.gb;
import c.b.b.a.e.a.qe;
import c.b.b.a.e.a.zg;
import com.google.android.gms.internal.ads.zzvl;

public final class a
extends qe {
    public final /* synthetic */ zg a;

    public /* synthetic */ a(zg zg2, b b6) {
        this.a = zg2;
    }

    public final String A() {
        return null;
    }

    public final void a(zzvl zzvl2) {
        this.a(zzvl2, 1);
    }

    public final void a(zzvl zzvl2, int n7) {
        a.c.a.a.h("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        gb.a.post((Runnable)new d(this));
    }

    public final String getMediationAdapterClassName() {
        return null;
    }

    public final boolean w() {
        return false;
    }
}

