/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.he
 *  c.b.b.a.e.a.hf
 *  c.b.b.a.e.a.j2
 *  c.b.b.a.e.a.k2
 *  c.b.b.a.e.a.k4
 *  c.b.b.a.e.a.ne
 *  c.b.b.a.e.a.p2
 *  c.b.b.a.e.a.q2
 *  c.b.b.a.e.a.se
 *  c.b.b.a.e.a.v2
 *  c.b.b.a.e.a.w2
 *  com.google.android.gms.ads.formats.AdManagerAdViewOptions
 *  com.google.android.gms.ads.formats.PublisherAdViewOptions
 *  com.google.android.gms.internal.ads.zzaeh
 *  com.google.android.gms.internal.ads.zzajt
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.he;
import c.b.b.a.e.a.hf;
import c.b.b.a.e.a.j2;
import c.b.b.a.e.a.k2;
import c.b.b.a.e.a.k4;
import c.b.b.a.e.a.ne;
import c.b.b.a.e.a.p2;
import c.b.b.a.e.a.pe;
import c.b.b.a.e.a.q2;
import c.b.b.a.e.a.se;
import c.b.b.a.e.a.v2;
import c.b.b.a.e.a.w2;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaeh;
import com.google.android.gms.internal.ads.zzajt;
import com.google.android.gms.internal.ads.zzvs;

public final class ue
extends ec
implements se {
    public ue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final ne X() {
        IInterface iInterface;
        Parcel parcel = this.a(1, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader")) instanceof ne ? (ne)iInterface : new pe(iBinder));
        parcel.recycle();
        return object;
    }

    public final void a(he he2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)he2);
        this.b(2, parcel);
    }

    public final void a(j2 j22) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)j22);
        this.b(3, parcel);
    }

    public final void a(k2 k22) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)k22);
        this.b(4, parcel);
    }

    public final void a(k4 k42) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)k42);
        this.b(14, parcel);
    }

    public final void a(v2 v22, zzvs zzvs2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)v22);
        fc.a((Parcel)parcel, (Parcelable)zzvs2);
        this.b(8, parcel);
    }

    public final void a(w2 w22) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)w22);
        this.b(10, parcel);
    }

    public final void a(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)adManagerAdViewOptions);
        this.b(15, parcel);
    }

    public final void a(PublisherAdViewOptions publisherAdViewOptions) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)publisherAdViewOptions);
        this.b(9, parcel);
    }

    public final void a(zzaeh zzaeh2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzaeh2);
        this.b(6, parcel);
    }

    public final void a(zzajt zzajt2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzajt2);
        this.b(13, parcel);
    }

    public final void a(String string, q2 q22, p2 p22) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)q22);
        fc.a((Parcel)parcel, (IInterface)p22);
        this.b(5, parcel);
    }

    public final void b(hf hf2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)hf2);
        this.b(7, parcel);
    }
}

