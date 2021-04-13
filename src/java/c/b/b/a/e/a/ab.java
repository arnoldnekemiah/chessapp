/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.p8
 *  c.b.b.a.e.a.ya
 *  c.b.b.a.e.a.za
 *  com.google.android.gms.internal.ads.zzasq
 *  com.google.android.gms.internal.ads.zzaye
 *  java.lang.String
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.p8;
import c.b.b.a.e.a.ya;
import c.b.b.a.e.a.za;
import com.google.android.gms.internal.ads.zzasq;
import com.google.android.gms.internal.ads.zzaye;
import java.util.List;

public final class ab
extends ec
implements za {
    public ab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final void a(a a5, zzaye zzaye2, ya ya2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a5);
        fc.a((Parcel)parcel, (Parcelable)zzaye2);
        fc.a((Parcel)parcel, (IInterface)ya2);
        this.b(1, parcel);
    }

    public final void a(zzasq zzasq2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzasq2);
        this.b(7, parcel);
    }

    public final void a(List<Uri> list, a a5, p8 p82) {
        Parcel parcel = this.Z0();
        parcel.writeTypedList(list);
        fc.a((Parcel)parcel, (IInterface)a5);
        fc.a((Parcel)parcel, (IInterface)p82);
        this.b(6, parcel);
    }

    public final void b(List<Uri> list, a a5, p8 p82) {
        Parcel parcel = this.Z0();
        parcel.writeTypedList(list);
        fc.a((Parcel)parcel, (IInterface)a5);
        fc.a((Parcel)parcel, (IInterface)p82);
        this.b(5, parcel);
    }

    public final void v(a a5) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a5);
        this.b(2, parcel);
    }
}

