/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.s1
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.c.a;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.s1;
import c.b.b.a.e.a.u1;

public abstract class v1
extends gc
implements s1 {
    public v1() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static s1 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        if (iInterface instanceof s1) {
            return (s1)iInterface;
        }
        return new u1(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    return false;
                }
                this.c(a.a.a(parcel.readStrongBinder()));
            } else {
                this.F();
            }
        } else {
            this.f(a.a.a(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}

