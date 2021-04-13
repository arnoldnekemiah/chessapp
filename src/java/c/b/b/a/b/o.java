/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.RemoteException
 *  android.util.Log
 *  c.b.b.a.c.a
 *  c.b.b.a.e.c.a
 *  c.b.b.a.e.c.c
 *  java.io.UnsupportedEncodingException
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 */
package c.b.b.a.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c.b.b.a.b.h.s;
import c.b.b.a.b.h.t;
import c.b.b.a.c.b;
import c.b.b.a.e.c.a;
import c.b.b.a.e.c.c;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class o
extends a
implements s {
    public int a;

    public o(byte[] arrby) {
        super("com.google.android.gms.common.internal.ICertData");
        boolean bl = arrby.length == 25;
        a.c.a.a.a(bl);
        this.a = Arrays.hashCode((byte[])arrby);
    }

    public static s a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (iInterface instanceof s) {
            return (s)iInterface;
        }
        return new t(iBinder);
    }

    public static byte[] q(String string) {
        try {
            byte[] arrby = string.getBytes("ISO-8859-1");
            return arrby;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new AssertionError((Object)unsupportedEncodingException);
        }
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                return false;
            }
            int n12 = this.c();
            parcel2.writeNoException();
            parcel2.writeInt(n12);
            return true;
        }
        c.b.b.a.c.a a5 = this.b();
        parcel2.writeNoException();
        c.a((Parcel)parcel2, (IInterface)a5);
        return true;
    }

    public abstract byte[] a();

    @Override
    public final c.b.b.a.c.a b() {
        return new b<byte[]>(this.a());
    }

    @Override
    public final int c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object != null) {
            c.b.b.a.c.a a5;
            block7 : {
                s s3;
                block6 : {
                    if (!(object instanceof s)) {
                        return false;
                    }
                    s3 = (s)object;
                    if (s3.c() == this.a) break block6;
                    return false;
                }
                a5 = s3.b();
                if (a5 != null) break block7;
                return false;
            }
            try {
                byte[] arrby = (byte[])b.K(a5);
                boolean bl = Arrays.equals((byte[])this.a(), (byte[])arrby);
                return bl;
            }
            catch (RemoteException remoteException) {
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)remoteException);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }
}

