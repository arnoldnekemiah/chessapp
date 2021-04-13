/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.d.o0
 *  c.b.b.a.e.d.t
 *  c.b.b.a.f.b.x2
 *  com.google.android.gms.measurement.internal.zzaa
 *  com.google.android.gms.measurement.internal.zzas
 *  com.google.android.gms.measurement.internal.zzkg
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.String
 *  java.util.List
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.d.o0;
import c.b.b.a.e.d.t;
import c.b.b.a.f.b.x2;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkg;
import com.google.android.gms.measurement.internal.zzp;
import java.util.List;

public abstract class w2
extends t
implements x2 {
    public w2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(int var1_1, Parcel var2_2, Parcel var3_3, int var4_4) {
        block21 : {
            switch (var1_1) {
                default: {
                    return false;
                }
                case 20: {
                    this.a((zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR));
                    break block21;
                }
                case 19: {
                    this.a((Bundle)o0.a((Parcel)var2_2, (Parcelable.Creator)Bundle.CREATOR), (zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR));
                    break block21;
                }
                case 18: {
                    this.e((zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR));
                    break block21;
                }
                case 17: {
                    var8_5 = this.a(var2_2.readString(), var2_2.readString(), var2_2.readString());
                    ** GOTO lbl51
                }
                case 16: {
                    var8_5 = this.a(var2_2.readString(), var2_2.readString(), (zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR));
                    ** GOTO lbl51
                }
                case 15: {
                    var8_5 = this.a(var2_2.readString(), var2_2.readString(), var2_2.readString(), o0.a((Parcel)var2_2));
                    ** GOTO lbl51
                }
                case 14: {
                    var8_5 = this.a(var2_2.readString(), var2_2.readString(), o0.a((Parcel)var2_2), (zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR));
                    ** GOTO lbl51
                }
                case 13: {
                    this.a((zzaa)o0.a((Parcel)var2_2, (Parcelable.Creator)zzaa.CREATOR));
                    break block21;
                }
                case 12: {
                    this.a((zzaa)o0.a((Parcel)var2_2, (Parcelable.Creator)zzaa.CREATOR), (zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR));
                    break block21;
                }
                case 11: {
                    var10_6 = this.d((zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR));
                    var3_3.writeNoException();
                    var3_3.writeString(var10_6);
                    return true;
                }
                case 10: {
                    this.a(var2_2.readLong(), var2_2.readString(), var2_2.readString(), var2_2.readString());
                    break block21;
                }
                case 9: {
                    var9_7 = this.a((zzas)o0.a((Parcel)var2_2, (Parcelable.Creator)zzas.CREATOR), var2_2.readString());
                    var3_3.writeNoException();
                    var3_3.writeByteArray(var9_7);
                    return true;
                }
                case 7: {
                    var5_8 = (zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR);
                    var6_9 = var2_2.readInt();
                    var7_10 = false;
                    if (var6_9 != 0) {
                        var7_10 = true;
                    }
                    var8_5 = this.a(var5_8, var7_10);
lbl51: // 5 sources:
                    var3_3.writeNoException();
                    var3_3.writeTypedList(var8_5);
                    return true;
                }
                case 6: {
                    this.c((zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR));
                    break block21;
                }
                case 5: {
                    this.a((zzas)o0.a((Parcel)var2_2, (Parcelable.Creator)zzas.CREATOR), var2_2.readString(), var2_2.readString());
                    break block21;
                }
                case 4: {
                    this.b((zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR));
                    break block21;
                }
                case 2: {
                    this.a((zzkg)o0.a((Parcel)var2_2, (Parcelable.Creator)zzkg.CREATOR), (zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR));
                    break block21;
                }
                case 1: 
            }
            this.a((zzas)o0.a((Parcel)var2_2, (Parcelable.Creator)zzas.CREATOR), (zzp)o0.a((Parcel)var2_2, (Parcelable.Creator)zzp.CREATOR));
        }
        var3_3.writeNoException();
        return true;
    }
}

