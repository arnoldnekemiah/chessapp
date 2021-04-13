/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.me
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.me;
import com.google.android.gms.internal.ads.zzvg;

public abstract class le
extends gc
implements me {
    public le() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                return false;
            }
            this.d((zzvg)fc.a((Parcel)parcel, (Parcelable.Creator)zzvg.CREATOR));
        } else {
            this.onAdLoaded();
        }
        parcel2.writeNoException();
        return true;
    }
}

