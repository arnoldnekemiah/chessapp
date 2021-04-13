/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.e1
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.l1
 *  c.b.b.a.e.a.o5
 *  java.lang.String
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.e1;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.l1;
import c.b.b.a.e.a.o5;
import java.util.List;

public abstract class n5
extends gc
implements o5 {
    public n5() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(int var1_1, Parcel var2_2, Parcel var3_3, int var4_4) {
        block26 : {
            switch (var1_1) {
                default: {
                    return false;
                }
                case 25: {
                    var12_5 = this.J0();
                    ** GOTO lbl12
                }
                case 24: {
                    var12_5 = this.H();
                    ** GOTO lbl12
                }
                case 23: {
                    var12_5 = this.m0();
lbl12: // 3 sources:
                    var3_3.writeNoException();
                    var3_3.writeFloat(var12_5);
                    return true;
                }
                case 22: {
                    this.b(a.a.a(var2_2.readStrongBinder()));
                    ** GOTO lbl26
                }
                case 21: {
                    this.a(a.a.a(var2_2.readStrongBinder()), a.a.a(var2_2.readStrongBinder()), a.a.a(var2_2.readStrongBinder()));
                    ** GOTO lbl26
                }
                case 20: {
                    this.a(a.a.a(var2_2.readStrongBinder()));
                    ** GOTO lbl26
                }
                case 19: {
                    this.recordImpression();
lbl26: // 4 sources:
                    var3_3.writeNoException();
                    return true;
                }
                case 18: {
                    var11_6 = this.t();
                    ** GOTO lbl33
                }
                case 17: {
                    var11_6 = this.s();
lbl33: // 2 sources:
                    var3_3.writeNoException();
                    fc.a((Parcel)var3_3, (boolean)var11_6);
                    return true;
                }
                case 16: {
                    var10_7 = this.f();
                    var3_3.writeNoException();
                    fc.b((Parcel)var3_3, (Parcelable)var10_7);
                    return true;
                }
                case 15: {
                    var7_8 = this.l();
                    ** GOTO lbl75
                }
                case 14: {
                    var7_8 = this.u();
                    ** GOTO lbl75
                }
                case 13: {
                    var7_8 = this.r();
                    ** GOTO lbl75
                }
                case 12: {
                    var7_8 = this.g();
                    ** GOTO lbl75
                }
                case 11: {
                    var7_8 = this.getVideoController();
                    ** GOTO lbl75
                }
                case 10: {
                    var5_9 = this.q();
                    break block26;
                }
                case 9: {
                    var5_9 = this.o();
                    break block26;
                }
                case 8: {
                    var8_10 = this.k();
                    var3_3.writeNoException();
                    var3_3.writeDouble(var8_10);
                    return true;
                }
                case 7: {
                    var5_9 = this.n();
                    break block26;
                }
                case 6: {
                    var5_9 = this.d();
                    break block26;
                }
                case 5: {
                    var7_8 = this.m();
lbl75: // 6 sources:
                    var3_3.writeNoException();
                    fc.a((Parcel)var3_3, (IInterface)var7_8);
                    return true;
                }
                case 4: {
                    var5_9 = this.h();
                    break block26;
                }
                case 3: {
                    var6_11 = this.i();
                    var3_3.writeNoException();
                    var3_3.writeList(var6_11);
                    return true;
                }
                case 2: 
            }
            var5_9 = this.e();
        }
        var3_3.writeNoException();
        var3_3.writeString(var5_9);
        return true;
    }
}

