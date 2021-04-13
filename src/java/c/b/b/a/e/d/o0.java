/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.ClassLoader
 *  java.lang.Object
 */
package c.b.b.a.e.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class o0 {
    public static final ClassLoader a = o0.class.getClassLoader();

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (T)((Parcelable)creator.createFromParcel(parcel));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(Parcel parcel, IInterface iInterface) {
        IBinder iBinder = iInterface == null ? null : iInterface.asBinder();
        parcel.writeStrongBinder(iBinder);
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void a(Parcel parcel, boolean bl) {
        parcel.writeInt((int)bl);
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}

