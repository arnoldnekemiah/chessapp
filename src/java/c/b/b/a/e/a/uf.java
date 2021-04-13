/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.rf
 *  com.google.android.gms.ads.MuteThisAdListener
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Parcel;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.rf;
import com.google.android.gms.ads.MuteThisAdListener;

public final class uf
extends gc
implements rf {
    public final MuteThisAdListener a;

    public uf(MuteThisAdListener muteThisAdListener) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        this.a = muteThisAdListener;
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            this.a.onAdMuted();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

