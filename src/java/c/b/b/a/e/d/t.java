/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.String
 */
package c.b.b.a.e.d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class t
extends Binder
implements IInterface {
    public t(String string) {
        this.attachInterface((IInterface)this, string);
    }

    public boolean a(int n2, Parcel parcel, Parcel parcel2, int n6) {
        throw null;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n2, Parcel parcel, Parcel parcel2, int n6) {
        if (n2 > 16777215) {
            if (super.onTransact(n2, parcel, parcel2, n6)) {
                return true;
            }
        } else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.a(n2, parcel, parcel2, n6);
    }
}

