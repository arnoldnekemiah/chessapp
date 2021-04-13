/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  c.b.b.a.e.a.c3
 *  c.b.b.a.e.a.gc
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Parcel;
import c.b.b.a.e.a.c3;
import c.b.b.a.e.a.gc;

public abstract class e3
extends gc
implements c3 {
    public e3() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                return false;
            }
            this.onUnconfirmedClickCancelled();
        } else {
            this.onUnconfirmedClickReceived(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}

