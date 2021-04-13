/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.of
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.z3
 *  com.google.android.gms.internal.ads.zzaao
 *  java.lang.String
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.c4;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.of;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.y4;
import c.b.b.a.e.a.z3;
import com.google.android.gms.internal.ads.zzaao;
import java.util.List;

public abstract class nf
extends gc
implements of {
    public nf() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        block17 : {
            switch (n10) {
                default: {
                    return false;
                }
                case 15: {
                    this.p0();
                    break;
                }
                case 14: {
                    this.a((zzaao)fc.a((Parcel)parcel, (Parcelable.Creator)zzaao.CREATOR));
                    break;
                }
                case 13: {
                    List list = this.Y0();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(list);
                    break block17;
                }
                case 12: {
                    this.a(c4.a(parcel.readStrongBinder()));
                    break;
                }
                case 11: {
                    this.a(y4.a(parcel.readStrongBinder()));
                    break;
                }
                case 10: {
                    this.k(parcel.readString());
                    break;
                }
                case 9: {
                    String string = this.U0();
                    parcel2.writeNoException();
                    parcel2.writeString(string);
                    break block17;
                }
                case 8: {
                    boolean bl = this.q0();
                    parcel2.writeNoException();
                    fc.a((Parcel)parcel2, (boolean)bl);
                    break block17;
                }
                case 7: {
                    float f10 = this.I();
                    parcel2.writeNoException();
                    parcel2.writeFloat(f10);
                    break block17;
                }
                case 6: {
                    this.b(parcel.readString(), a.a.a(parcel.readStrongBinder()));
                    break;
                }
                case 5: {
                    this.a(a.a.a(parcel.readStrongBinder()), parcel.readString());
                    break;
                }
                case 4: {
                    this.e(fc.a((Parcel)parcel));
                    break;
                }
                case 3: {
                    this.f(parcel.readString());
                    break;
                }
                case 2: {
                    this.a(parcel.readFloat());
                    break;
                }
                case 1: {
                    this.G();
                }
            }
            parcel2.writeNoException();
        }
        return true;
    }
}

