/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.q2
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.h2;
import c.b.b.a.e.a.q2;
import c.b.b.a.e.a.s2;

public abstract class t2
extends gc
implements q2 {
    public t2() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static q2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        if (iInterface instanceof q2) {
            return (q2)iInterface;
        }
        return new s2(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            IInterface iInterface;
            IBinder iBinder = parcel.readStrongBinder();
            Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd")) instanceof f2 ? (f2)iInterface : new h2(iBinder));
            this.a(object);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

