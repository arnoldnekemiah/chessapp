/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.h1
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.a.b.a.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.h1;
import c.b.b.a.e.a.p5;

public final class j1
extends ec
implements h1 {
    public j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final c.b.b.a.c.a b0() {
        return a.a(this.a(4, this.Z0()));
    }

    public final float getAspectRatio() {
        Parcel parcel = this.a(2, this.Z0());
        float f10 = parcel.readFloat();
        parcel.recycle();
        return f10;
    }

    public final float getCurrentTime() {
        Parcel parcel = this.a(6, this.Z0());
        float f10 = parcel.readFloat();
        parcel.recycle();
        return f10;
    }

    public final float getDuration() {
        Parcel parcel = this.a(5, this.Z0());
        float f10 = parcel.readFloat();
        parcel.recycle();
        return f10;
    }

    public final gg getVideoController() {
        Parcel parcel = this.a(7, this.Z0());
        gg gg2 = p5.a(parcel.readStrongBinder());
        parcel.recycle();
        return gg2;
    }

    public final boolean hasVideoContent() {
        Parcel parcel = this.a(8, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final void t(c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(3, parcel);
    }
}

