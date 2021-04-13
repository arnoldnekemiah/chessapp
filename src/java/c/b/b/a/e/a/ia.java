/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.fa
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.fa;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import com.google.android.gms.internal.ads.zzvg;

public abstract class ia
extends gc
implements fa {
    public ia() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    return false;
                }
                this.f((zzvg)fc.a((Parcel)parcel, (Parcelable.Creator)zzvg.CREATOR));
            } else {
                this.e(parcel.readInt());
            }
        } else {
            this.f0();
        }
        parcel2.writeNoException();
        return true;
    }
}

