/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.nb
 *  c.b.b.a.e.d.v
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ExecutorService
 */
package c.b.b.a.e.a;

import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.nb;
import c.b.b.a.e.a.r4;
import c.b.b.a.e.d.c;
import c.b.b.a.e.d.e;
import c.b.b.a.e.d.f;
import c.b.b.a.e.d.f0;
import c.b.b.a.e.d.h;
import c.b.b.a.e.d.i;
import c.b.b.a.e.d.j;
import c.b.b.a.e.d.k;
import c.b.b.a.e.d.m;
import c.b.b.a.e.d.n;
import c.b.b.a.e.d.v;
import c.b.b.a.e.d.x9;
import c.b.b.a.f.a.a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public abstract class pb
extends gc
implements nb {
    public pb() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
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
                case 19: {
                    var64_5 = (Bundle)fc.a((Parcel)var2_2, (Parcelable.Creator)Bundle.CREATOR);
                    var65_6 = ((r4)this).a.a;
                    if (var65_6 == null) throw null;
                    var66_7 = new f(var65_6, var64_5);
                    var65_6.c.execute((Runnable)var66_7);
                    break block21;
                }
                case 18: {
                    var39_8 = ((r4)this).a.a.g;
                    ** GOTO lbl75
                }
                case 17: {
                    var61_9 = ((r4)this).a.a;
                    if (var61_9 == null) throw null;
                    var62_10 = new x9();
                    var63_11 = new n(var61_9, var62_10);
                    var61_9.c.execute((Runnable)var63_11);
                    var39_8 = var62_10.a(500L);
                    ** GOTO lbl75
                }
                case 16: {
                    var58_12 = ((r4)this).a.a;
                    if (var58_12 == null) throw null;
                    var59_13 = new x9();
                    var60_14 = new m(var58_12, var59_13);
                    var58_12.c.execute((Runnable)var60_14);
                    var39_8 = var59_13.a(500L);
                    ** GOTO lbl75
                }
                case 15: {
                    var51_15 = a.a.a(var2_2.readStrongBinder());
                    var52_16 = var2_2.readString();
                    var53_17 = var2_2.readString();
                    var54_18 = ((r4)this).a;
                    var55_19 = var51_15 != null ? (Activity)b.K(var51_15) : null;
                    var56_20 = var54_18.a;
                    if (var56_20 == null) throw null;
                    var57_21 = new e(var56_20, var55_19, var52_16, var53_17);
                    var56_20.c.execute((Runnable)var57_21);
                    break block21;
                }
                case 14: {
                    var48_22 = var2_2.readString();
                    var49_23 = ((r4)this).a.a;
                    if (var49_23 == null) throw null;
                    var50_24 = new i(var49_23, var48_22);
                    var49_23.c.execute((Runnable)var50_24);
                    break block21;
                }
                case 13: {
                    var45_25 = var2_2.readString();
                    var46_26 = ((r4)this).a.a;
                    if (var46_26 == null) throw null;
                    var47_27 = new h(var46_26, var45_25);
                    var46_26.c.execute((Runnable)var47_27);
                    break block21;
                }
                case 12: {
                    var43_28 = ((r4)this).a.a.a();
                    var3_3.writeNoException();
                    var3_3.writeLong(var43_28);
                    return true;
                }
                case 11: {
                    var40_29 = ((r4)this).a.a;
                    if (var40_29 == null) throw null;
                    var41_30 = new x9();
                    var42_31 = new j(var40_29, var41_30);
                    var40_29.c.execute((Runnable)var42_31);
                    var39_8 = var41_30.a(500L);
                    ** GOTO lbl75
                }
                case 10: {
                    var36_32 = ((r4)this).a.a;
                    if (var36_32 == null) throw null;
                    var37_33 = new x9();
                    var38_34 = new k(var36_32, var37_33);
                    var36_32.c.execute((Runnable)var38_34);
                    var39_8 = var37_33.a(50L);
lbl75: // 5 sources:
                    var3_3.writeNoException();
                    var3_3.writeString(var39_8);
                    return true;
                }
                case 9: {
                    var33_35 = var2_2.readString();
                    var34_36 = var2_2.readString();
                    var35_37 = ((r4)this).a.a.a(var33_35, var34_36);
                    var3_3.writeNoException();
                    var3_3.writeList(var35_37);
                    return true;
                }
                case 8: {
                    var28_38 = var2_2.readString();
                    var29_39 = var2_2.readString();
                    var30_40 = (Bundle)fc.a((Parcel)var2_2, (Parcelable.Creator)Bundle.CREATOR);
                    var31_41 = ((r4)this).a.a;
                    if (var31_41 == null) throw null;
                    var32_42 = new c(var31_41, var28_38, var29_39, var30_40);
                    var31_41.c.execute((Runnable)var32_42);
                    break block21;
                }
                case 7: {
                    var25_43 = (Bundle)fc.a((Parcel)var2_2, (Parcelable.Creator)Bundle.CREATOR);
                    var26_44 = ((r4)this).a.a;
                    if (var26_44 == null) throw null;
                    var27_45 = new c.b.b.a.e.d.b(var26_44, var25_43);
                    var26_44.c.execute((Runnable)var27_45);
                    break block21;
                }
                case 6: {
                    var23_46 = var2_2.readString();
                    var24_47 = ((r4)this).a.a.a(var23_46);
                    var3_3.writeNoException();
                    var3_3.writeInt(var24_47);
                    return true;
                }
                case 5: {
                    var19_48 = var2_2.readString();
                    var20_49 = var2_2.readString();
                    var21_50 = fc.a((Parcel)var2_2);
                    var22_51 = ((r4)this).a.a.a(var19_48, var20_49, var21_50);
                    var3_3.writeNoException();
                    var3_3.writeMap(var22_51);
                    return true;
                }
                case 4: {
                    var12_52 = var2_2.readString();
                    var13_53 = var2_2.readString();
                    var14_54 = a.a.a(var2_2.readStrongBinder());
                    var15_55 = ((r4)this).a;
                    var16_56 = var14_54 != null ? b.K(var14_54) : null;
                    var17_57 = var15_55.a;
                    if (var17_57 == null) throw null;
                    var18_58 = new v(var17_57, var12_52, var13_53, var16_56, true);
                    var17_57.c.execute((Runnable)var18_58);
                    break block21;
                }
                case 3: {
                    var9_59 = var2_2.readString();
                    var10_60 = var2_2.readString();
                    var11_61 = (Bundle)fc.a((Parcel)var2_2, (Parcelable.Creator)Bundle.CREATOR);
                    ((r4)this).a.a.a(var9_59, var10_60, var11_61, true, true, null);
                    break block21;
                }
                case 2: {
                    var7_62 = (Bundle)fc.a((Parcel)var2_2, (Parcelable.Creator)Bundle.CREATOR);
                    var8_63 = ((r4)this).a.a.a(var7_62, true);
                    var3_3.writeNoException();
                    fc.b((Parcel)var3_3, (Parcelable)var8_63);
                    return true;
                }
                case 1: 
            }
            var5_64 = (Bundle)fc.a((Parcel)var2_2, (Parcelable.Creator)Bundle.CREATOR);
            ((r4)this).a.a.a(var5_64, false);
        }
        var3_3.writeNoException();
        return true;
    }
}

