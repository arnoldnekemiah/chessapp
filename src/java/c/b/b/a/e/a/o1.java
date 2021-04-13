/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.h1
 *  c.b.b.a.e.a.p1
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.c.a;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.h1;
import c.b.b.a.e.a.j1;
import c.b.b.a.e.a.p1;
import c.b.b.a.e.a.r1;

public abstract class o1
extends gc
implements p1 {
    public o1() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static p1 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        if (iInterface instanceof p1) {
            return (p1)iInterface;
        }
        return new r1(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        block11 : {
            switch (n10) {
                default: {
                    return false;
                }
                case 9: {
                    this.i(a.a.a(parcel.readStrongBinder()));
                    break;
                }
                case 8: {
                    IInterface iInterface;
                    IBinder iBinder = parcel.readStrongBinder();
                    Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent")) instanceof h1 ? (h1)iInterface : new j1(iBinder));
                    this.a(object);
                    break;
                }
                case 7: {
                    this.B(a.a.a(parcel.readStrongBinder()));
                    break;
                }
                case 6: {
                    this.c(a.a.a(parcel.readStrongBinder()));
                    break;
                }
                case 5: {
                    this.b(a.a.a(parcel.readStrongBinder()), parcel.readInt());
                    break;
                }
                case 4: {
                    this.destroy();
                    break;
                }
                case 3: {
                    this.f(a.a.a(parcel.readStrongBinder()));
                    break;
                }
                case 2: {
                    a a6 = this.h(parcel.readString());
                    parcel2.writeNoException();
                    fc.a((Parcel)parcel2, (IInterface)a6);
                    break block11;
                }
                case 1: {
                    this.a(parcel.readString(), a.a.a(parcel.readStrongBinder()));
                }
            }
            parcel2.writeNoException();
        }
        return true;
    }
}

