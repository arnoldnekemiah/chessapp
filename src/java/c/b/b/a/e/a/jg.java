/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.hg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.hg;

public final class jg
extends ec
implements hg {
    public jg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void D() {
        this.b(4, this.Z0());
    }

    public final void b(boolean bl) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (boolean)bl);
        this.b(5, parcel);
    }

    public final void onVideoPause() {
        this.b(3, this.Z0());
    }

    public final void onVideoPlay() {
        this.b(2, this.Z0());
    }

    public final void onVideoStart() {
        this.b(1, this.Z0());
    }
}

