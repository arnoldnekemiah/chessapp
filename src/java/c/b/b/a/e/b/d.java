/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.b.a
 *  c.b.b.a.e.b.b
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package c.b.b.a.e.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.b.a;
import c.b.b.a.e.b.b;

public final class d
implements b,
IInterface {
    public final IBinder a;
    public final String b;

    public d(IBinder iBinder) {
        this.a = iBinder;
        this.b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    }

    public final String M() {
        Parcel parcel = this.a(1, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final Parcel Z0() {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken(this.b);
        return parcel;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Parcel a(int n10, Parcel parcel) {
        Throwable throwable2222;
        Parcel parcel2 = Parcel.obtain();
        this.a.transact(n10, parcel, parcel2, 0);
        parcel2.readException();
        parcel.recycle();
        return parcel2;
        {
            catch (Throwable throwable2222) {
            }
            catch (RuntimeException runtimeException) {}
            {
                parcel2.recycle();
                throw runtimeException;
            }
        }
        parcel.recycle();
        throw throwable2222;
    }

    public IBinder asBinder() {
        return this.a;
    }

    public final boolean c() {
        Parcel parcel = this.a(6, this.Z0());
        boolean bl = a.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final boolean c(boolean bl) {
        Parcel parcel = this.Z0();
        a.a((Parcel)parcel);
        Parcel parcel2 = this.a(2, parcel);
        boolean bl2 = parcel2.readInt() != 0;
        parcel2.recycle();
        return bl2;
    }
}

