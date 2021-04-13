/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.ge
 *  c.b.b.a.e.a.wc
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Parcel;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.ge;
import c.b.b.a.e.a.wc;

public final class vc
extends gc
implements ge {
    public final wc a;

    public vc(wc wc2) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.a = wc2;
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            this.onAdClicked();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public final void onAdClicked() {
        this.a.onAdClicked();
    }
}

