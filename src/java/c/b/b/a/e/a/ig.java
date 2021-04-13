/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.hg
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.hg;
import c.b.b.a.e.a.jg;

public final class ig
extends ec
implements gg {
    public ig(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final boolean B0() {
        Parcel parcel = this.a(4, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final hg L0() {
        IInterface iInterface;
        Parcel parcel = this.a(11, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks")) instanceof hg ? (hg)iInterface : new jg(iBinder));
        parcel.recycle();
        return object;
    }

    public final void M0() {
        this.b(1, this.Z0());
    }

    public final boolean O0() {
        Parcel parcel = this.a(10, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final void W() {
        this.b(13, this.Z0());
    }

    public final boolean Z() {
        Parcel parcel = this.a(12, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final void a(hg hg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)hg2);
        this.b(8, parcel);
    }

    public final void a(boolean bl) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (boolean)bl);
        this.b(3, parcel);
    }

    public final float getAspectRatio() {
        Parcel parcel = this.a(9, this.Z0());
        float f10 = parcel.readFloat();
        parcel.recycle();
        return f10;
    }

    public final float getCurrentTime() {
        Parcel parcel = this.a(7, this.Z0());
        float f10 = parcel.readFloat();
        parcel.recycle();
        return f10;
    }

    public final float getDuration() {
        Parcel parcel = this.a(6, this.Z0());
        float f10 = parcel.readFloat();
        parcel.recycle();
        return f10;
    }

    public final int o0() {
        Parcel parcel = this.a(5, this.Z0());
        int n10 = parcel.readInt();
        parcel.recycle();
        return n10;
    }

    public final void pause() {
        this.b(2, this.Z0());
    }
}

