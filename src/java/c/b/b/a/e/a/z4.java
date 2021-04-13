/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.a5
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.i5
 *  c.b.b.a.e.a.j5
 *  c.b.b.a.e.a.o5
 *  c.b.b.a.e.a.s9
 *  c.b.b.a.e.a.y3
 *  com.google.android.gms.internal.ads.zzaeh
 *  com.google.android.gms.internal.ads.zzajr
 *  com.google.android.gms.internal.ads.zzapy
 *  com.google.android.gms.internal.ads.zzvl
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.a5;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.d5;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.i5;
import c.b.b.a.e.a.j5;
import c.b.b.a.e.a.o5;
import c.b.b.a.e.a.r9;
import c.b.b.a.e.a.s9;
import c.b.b.a.e.a.x3;
import c.b.b.a.e.a.y3;
import com.google.android.gms.internal.ads.zzaeh;
import com.google.android.gms.internal.ads.zzajr;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvs;
import java.util.ArrayList;
import java.util.List;

public abstract class z4
extends gc
implements a5 {
    public z4() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(int var1_1, Parcel var2_2, Parcel var3_3, int var4_4) {
        block51 : {
            switch (var1_1) {
                default: {
                    return false;
                }
                case 34: {
                    var46_5 = this.B();
                    ** GOTO lbl78
                }
                case 33: {
                    var46_5 = this.x();
                    ** GOTO lbl78
                }
                case 32: {
                    var53_6 = a.a.a(var2_2.readStrongBinder());
                    var54_7 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                    var55_8 = var2_2.readString();
                    var56_9 = var2_2.readStrongBinder();
                    if (var56_9 == null) {
                        var57_10 = null;
                    } else {
                        var58_14 = var56_9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                        if (var58_14 instanceof b5) {
                            var57_11 = (b5)var58_14;
                        } else {
                            var57_12 = new d5(var56_9);
                        }
                    }
                    this.b(var53_6, var54_7, var55_8, (b5)var57_13);
                    break block51;
                }
                case 31: {
                    this.a(a.a.a(var2_2.readStrongBinder()), x3.a(var2_2.readStrongBinder()), (List)var2_2.createTypedArrayList(zzajr.CREATOR));
                    break block51;
                }
                case 30: {
                    this.u(a.a.a(var2_2.readStrongBinder()));
                    break block51;
                }
                case 28: {
                    var47_15 = a.a.a(var2_2.readStrongBinder());
                    var48_16 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                    var49_17 = var2_2.readString();
                    var50_18 = var2_2.readStrongBinder();
                    if (var50_18 == null) {
                        var51_19 = null;
                    } else {
                        var52_23 = var50_18.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                        if (var52_23 instanceof b5) {
                            var51_20 = (b5)var52_23;
                        } else {
                            var51_21 = new d5(var50_18);
                        }
                    }
                    this.a(var47_15, var48_16, var49_17, (b5)var51_22);
                    break block51;
                }
                case 27: {
                    var13_24 = this.F0();
                    ** GOTO lbl170
                }
                case 26: {
                    var13_24 = this.getVideoController();
                    ** GOTO lbl170
                }
                case 25: {
                    this.setImmersiveMode(fc.a((Parcel)var2_2));
                    break block51;
                }
                case 24: {
                    var13_24 = this.Y();
                    ** GOTO lbl170
                }
                case 23: {
                    this.a(a.a.a(var2_2.readStrongBinder()), r9.a(var2_2.readStrongBinder()), (List)var2_2.createStringArrayList());
                    break block51;
                }
                case 22: {
                    var37_25 = this.l0();
                    ** GOTO lbl102
                }
                case 21: {
                    this.h(a.a.a(var2_2.readStrongBinder()));
                    break block51;
                }
                case 20: {
                    this.a((zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR), var2_2.readString(), var2_2.readString());
                    break block51;
                }
                case 19: {
                    var46_5 = this.W0();
                    ** GOTO lbl78
                }
                case 18: {
                    var46_5 = this.getInterstitialAdapterInfo();
                    ** GOTO lbl78
                }
                case 17: {
                    var46_5 = this.zzux();
lbl78: // 5 sources:
                    var3_3.writeNoException();
                    fc.b((Parcel)var3_3, (Parcelable)var46_5);
                    return true;
                }
                case 16: {
                    var13_24 = this.E();
                    ** GOTO lbl170
                }
                case 15: {
                    var13_24 = this.s0();
                    ** GOTO lbl170
                }
                case 14: {
                    var38_26 = a.a.a(var2_2.readStrongBinder());
                    var39_27 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                    var40_28 = var2_2.readString();
                    var41_29 = var2_2.readString();
                    var42_30 = var2_2.readStrongBinder();
                    var43_31 /* !! */  = null;
                    if (var42_30 != null) {
                        var44_33 = var42_30.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                        var43_31 /* !! */  = var44_33 instanceof b5 != false ? (b5)var44_33 : new d5(var42_30);
                    }
                    var45_32 = var43_31 /* !! */ ;
                    this.a(var38_26, var39_27, var40_28, var41_29, var45_32, (zzaeh)fc.a((Parcel)var2_2, (Parcelable.Creator)zzaeh.CREATOR), (List)var2_2.createStringArrayList());
                    break block51;
                }
                case 13: {
                    var37_25 = this.isInitialized();
lbl102: // 2 sources:
                    var3_3.writeNoException();
                    fc.a((Parcel)var3_3, (boolean)var37_25);
                    return true;
                }
                case 12: {
                    this.showVideo();
                    break block51;
                }
                case 11: {
                    this.a((zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR), var2_2.readString());
                    break block51;
                }
                case 10: {
                    this.a(a.a.a(var2_2.readStrongBinder()), (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR), var2_2.readString(), r9.a(var2_2.readStrongBinder()), var2_2.readString());
                    break block51;
                }
                case 9: {
                    this.resume();
                    break block51;
                }
                case 8: {
                    this.pause();
                    break block51;
                }
                case 7: {
                    var29_34 = a.a.a(var2_2.readStrongBinder());
                    var30_35 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                    var31_36 = var2_2.readString();
                    var32_37 = var2_2.readString();
                    var33_38 = var2_2.readStrongBinder();
                    var34_39 /* !! */  = null;
                    if (var33_38 != null) {
                        var35_41 = var33_38.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                        var34_39 /* !! */  = var35_41 instanceof b5 != false ? (b5)var35_41 : new d5(var33_38);
                    }
                    var36_40 = var34_39 /* !! */ ;
                    this.a(var29_34, var30_35, var31_36, var32_37, var36_40);
                    break block51;
                }
                case 6: {
                    var20_42 = a.a.a(var2_2.readStrongBinder());
                    var21_43 = (zzvs)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvs.CREATOR);
                    var22_44 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                    var23_45 = var2_2.readString();
                    var24_46 = var2_2.readString();
                    var25_47 = var2_2.readStrongBinder();
                    var26_48 /* !! */  = null;
                    if (var25_47 != null) {
                        var27_50 = var25_47.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                        var26_48 /* !! */  = var27_50 instanceof b5 != false ? (b5)var27_50 : new d5(var25_47);
                    }
                    var28_49 = var26_48 /* !! */ ;
                    this.a(var20_42, var21_43, var22_44, var23_45, var24_46, var28_49);
                    break block51;
                }
                case 5: {
                    this.destroy();
                    break block51;
                }
                case 4: {
                    this.showInterstitial();
                    break block51;
                }
                case 3: {
                    var14_51 = a.a.a(var2_2.readStrongBinder());
                    var15_52 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                    var16_53 = var2_2.readString();
                    var17_54 = var2_2.readStrongBinder();
                    if (var17_54 == null) {
                        var18_55 = null;
                    } else {
                        var19_59 = var17_54.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                        if (var19_59 instanceof b5) {
                            var18_56 = (b5)var19_59;
                        } else {
                            var18_57 = new d5(var17_54);
                        }
                    }
                    this.c(var14_51, var15_52, var16_53, (b5)var18_58);
                    break block51;
                }
                case 2: {
                    var13_24 = this.K();
lbl170: // 6 sources:
                    var3_3.writeNoException();
                    fc.a((Parcel)var3_3, (IInterface)var13_24);
                    return true;
                }
                case 1: 
            }
            var5_60 = a.a.a(var2_2.readStrongBinder());
            var6_61 = (zzvs)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvs.CREATOR);
            var7_62 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
            var8_63 = var2_2.readString();
            var9_64 = var2_2.readStrongBinder();
            var10_65 /* !! */  = null;
            if (var9_64 != null) {
                var11_67 = var9_64.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                var10_65 /* !! */  = var11_67 instanceof b5 != false ? (b5)var11_67 : new d5(var9_64);
            }
            var12_66 = var10_65 /* !! */ ;
            this.a(var5_60, var6_61, var7_62, var8_63, var12_66);
        }
        var3_3.writeNoException();
        return true;
    }
}

