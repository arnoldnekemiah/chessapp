/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.he
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.he;
import com.google.android.gms.internal.ads.zzvg;

public abstract class ke
extends gc
implements he {
    public ke() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        switch (n10) {
            default: {
                return false;
            }
            case 8: {
                this.b((zzvg)fc.a((Parcel)parcel, (Parcelable.Creator)zzvg.CREATOR));
                break;
            }
            case 7: {
                this.onAdImpression();
                break;
            }
            case 6: {
                this.onAdClicked();
                break;
            }
            case 5: {
                this.onAdOpened();
                break;
            }
            case 4: {
                this.onAdLoaded();
                break;
            }
            case 3: {
                this.onAdLeftApplication();
                break;
            }
            case 2: {
                this.onAdFailedToLoad(parcel.readInt());
                break;
            }
            case 1: {
                this.onAdClosed();
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

