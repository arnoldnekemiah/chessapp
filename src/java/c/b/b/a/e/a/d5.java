/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.g5
 *  c.b.b.a.e.a.w9
 *  com.google.android.gms.internal.ads.zzavj
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.g5;
import c.b.b.a.e.a.w9;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzvg;

public final class d5
extends ec
implements b5 {
    public d5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void D() {
        this.b(11, this.Z0());
    }

    public final void P() {
        this.b(13, this.Z0());
    }

    public final void a(int n10, String string) {
        Parcel parcel = this.Z0();
        parcel.writeInt(n10);
        parcel.writeString(string);
        this.b(22, parcel);
    }

    public final void a(f2 f22, String string) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)f22);
        parcel.writeString(string);
        this.b(10, parcel);
    }

    public final void a(g5 g52) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)g52);
        this.b(7, parcel);
    }

    public final void a(w9 w92) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)w92);
        this.b(16, parcel);
    }

    public final void a(zzavj zzavj2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzavj2);
        this.b(14, parcel);
    }

    public final void b(zzvg zzvg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvg2);
        this.b(23, parcel);
    }

    public final void c(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(12, parcel);
    }

    public final void d(int n10) {
        Parcel parcel = this.Z0();
        parcel.writeInt(n10);
        this.b(17, parcel);
    }

    public final void i(zzvg zzvg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvg2);
        this.b(24, parcel);
    }

    public final void m(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(21, parcel);
    }

    public final void onAdClicked() {
        this.b(1, this.Z0());
    }

    public final void onAdClosed() {
        this.b(2, this.Z0());
    }

    public final void onAdFailedToLoad(int n10) {
        Parcel parcel = this.Z0();
        parcel.writeInt(n10);
        this.b(3, parcel);
    }

    public final void onAdImpression() {
        this.b(8, this.Z0());
    }

    public final void onAdLeftApplication() {
        this.b(4, this.Z0());
    }

    public final void onAdLoaded() {
        this.b(6, this.Z0());
    }

    public final void onAdOpened() {
        this.b(5, this.Z0());
    }

    public final void onAppEvent(String string, String string2) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        parcel.writeString(string2);
        this.b(9, parcel);
    }

    public final void onVideoPause() {
        this.b(15, this.Z0());
    }

    public final void onVideoPlay() {
        this.b(20, this.Z0());
    }

    public final void z0() {
        this.b(18, this.Z0());
    }

    public final void zzb(Bundle bundle) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)bundle);
        this.b(19, parcel);
    }
}

