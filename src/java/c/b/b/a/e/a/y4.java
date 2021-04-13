/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.a5
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.w6
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.a5;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.w6;
import c.b.b.a.e.a.x4;

public abstract class y4
extends gc
implements v4 {
    public y4() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static v4 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (iInterface instanceof v4) {
            return (v4)iInterface;
        }
        return new x4(iBinder);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        a5 a52;
        if (n10 != 1) {
            if (n10 == 2) {
                boolean bl = this.d(parcel.readString());
                parcel2.writeNoException();
                fc.a((Parcel)parcel2, (boolean)bl);
                return true;
            }
            if (n10 != 3) {
                return false;
            }
            a52 = this.p(parcel.readString());
        } else {
            a52 = this.n(parcel.readString());
        }
        parcel2.writeNoException();
        fc.a((Parcel)parcel2, (IInterface)a52);
        return true;
    }
}

