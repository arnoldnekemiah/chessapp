/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.e5
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.g5
 *  c.b.b.a.e.a.s9
 *  c.b.b.a.e.a.w9
 *  com.google.android.gms.ads.mediation.Adapter
 *  com.google.android.gms.internal.ads.zzavj
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.e5;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.g5;
import c.b.b.a.e.a.s9;
import c.b.b.a.e.a.w9;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzvg;

public final class v5
extends e5 {
    public final Adapter a;
    public final s9 b;

    public v5(Adapter adapter, s9 s92) {
        this.a = adapter;
        this.b = s92;
    }

    public final void D() {
    }

    public final void P() {
        s9 s92 = this.b;
        if (s92 != null) {
            s92.p(new b<Adapter>(this.a));
        }
    }

    public final void a(int n7, String string) {
    }

    public final void a(f2 f22, String string) {
    }

    public final void a(g5 g52) {
    }

    public final void a(w9 w92) {
        s9 s92 = this.b;
        if (s92 != null) {
            s92.a(new b<Adapter>(this.a), new zzavj(w92.getType(), w92.getAmount()));
        }
    }

    public final void a(zzavj zzavj2) {
    }

    public final void b(zzvg zzvg2) {
    }

    public final void c(String string) {
    }

    public final void d(int n7) {
    }

    public final void i(zzvg zzvg2) {
    }

    public final void m(String string) {
    }

    public final void onAdClicked() {
        s9 s92 = this.b;
        if (s92 != null) {
            s92.j(new b<Adapter>(this.a));
        }
    }

    public final void onAdClosed() {
        s9 s92 = this.b;
        if (s92 != null) {
            s92.A(new b<Adapter>(this.a));
        }
    }

    public final void onAdFailedToLoad(int n7) {
        s9 s92 = this.b;
        if (s92 != null) {
            s92.a(new b<Adapter>(this.a), n7);
        }
    }

    public final void onAdImpression() {
    }

    public final void onAdLeftApplication() {
    }

    public final void onAdLoaded() {
        s9 s92 = this.b;
        if (s92 != null) {
            s92.m(new b<Adapter>(this.a));
        }
    }

    public final void onAdOpened() {
        s9 s92 = this.b;
        if (s92 != null) {
            s92.G(new b<Adapter>(this.a));
        }
    }

    public final void onAppEvent(String string, String string2) {
    }

    public final void onVideoPause() {
    }

    public final void onVideoPlay() {
    }

    public final void z0() {
        s9 s92 = this.b;
        if (s92 != null) {
            s92.l(new b<Adapter>(this.a));
        }
    }

    public final void zzb(Bundle bundle) {
    }
}

