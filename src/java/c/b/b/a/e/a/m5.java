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
 *  c.b.b.a.e.a.j5
 *  c.b.b.a.e.a.l1
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
import c.b.b.a.e.a.j5;
import c.b.b.a.e.a.l1;
import java.util.List;

public abstract class m5
extends gc
implements j5 {
    public m5() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
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
                case 22: {
                    this.a(a.a.a(var2_2.readStrongBinder()), a.a.a(var2_2.readStrongBinder()), a.a.a(var2_2.readStrongBinder()));
                    ** GOTO lbl46
                }
                case 21: {
                    var7_5 = this.l();
                    ** GOTO lbl56
                }
                case 20: {
                    var7_5 = this.u();
                    ** GOTO lbl56
                }
                case 19: {
                    var7_5 = this.g();
                    ** GOTO lbl56
                }
                case 16: {
                    var7_5 = this.getVideoController();
                    ** GOTO lbl56
                }
                case 15: {
                    var7_5 = this.r();
                    ** GOTO lbl56
                }
                case 14: {
                    this.b(a.a.a(var2_2.readStrongBinder()));
                    ** GOTO lbl46
                }
                case 13: {
                    var9_6 = this.f();
                    var3_3.writeNoException();
                    fc.b((Parcel)var3_3, (Parcelable)var9_6);
                    return true;
                }
                case 12: {
                    var8_7 = this.t();
                    ** GOTO lbl35
                }
                case 11: {
                    var8_7 = this.s();
lbl35: // 2 sources:
                    var3_3.writeNoException();
                    fc.a((Parcel)var3_3, (boolean)var8_7);
                    return true;
                }
                case 10: {
                    this.e(a.a.a(var2_2.readStrongBinder()));
                    ** GOTO lbl46
                }
                case 9: {
                    this.a(a.a.a(var2_2.readStrongBinder()));
                    ** GOTO lbl46
                }
                case 8: {
                    this.recordImpression();
lbl46: // 5 sources:
                    var3_3.writeNoException();
                    return true;
                }
                case 7: {
                    var5_8 = this.n();
                    break block21;
                }
                case 6: {
                    var5_8 = this.d();
                    break block21;
                }
                case 5: {
                    var7_5 = this.C();
lbl56: // 6 sources:
                    var3_3.writeNoException();
                    fc.a((Parcel)var3_3, (IInterface)var7_5);
                    return true;
                }
                case 4: {
                    var5_8 = this.h();
                    break block21;
                }
                case 3: {
                    var6_9 = this.i();
                    var3_3.writeNoException();
                    var3_3.writeList(var6_9);
                    return true;
                }
                case 2: 
            }
            var5_8 = this.e();
        }
        var3_3.writeNoException();
        var3_3.writeString(var5_8);
        return true;
    }
}

