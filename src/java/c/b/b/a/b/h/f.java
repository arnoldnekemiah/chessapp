/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  com.google.android.gms.common.internal.GetServiceRequest
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.b.h;

import android.os.IBinder;
import android.os.Parcel;
import c.b.b.a.b.h.e;
import c.b.b.a.b.h.g;
import com.google.android.gms.common.internal.GetServiceRequest;

public final class f
implements g {
    public final IBinder a;

    public f(IBinder iBinder) {
        this.a = iBinder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(e e6, GetServiceRequest getServiceRequest) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder iBinder = e6 != null ? e6.asBinder() : null;
            parcel.writeStrongBinder(iBinder);
            if (getServiceRequest != null) {
                parcel.writeInt(1);
                getServiceRequest.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            this.a.transact(46, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }
}

