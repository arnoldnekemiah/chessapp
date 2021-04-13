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
 *  c.b.b.a.e.a.a7
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.o6
 *  c.b.b.a.e.a.r6
 *  c.b.b.a.e.a.s6
 *  c.b.b.a.e.a.v6
 *  c.b.b.a.e.a.w6
 *  com.google.android.gms.internal.ads.zzapy
 *  com.google.android.gms.internal.ads.zzvl
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.a7;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.c7;
import c.b.b.a.e.a.e5;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.o6;
import c.b.b.a.e.a.q6;
import c.b.b.a.e.a.r6;
import c.b.b.a.e.a.s6;
import c.b.b.a.e.a.t6;
import c.b.b.a.e.a.u6;
import c.b.b.a.e.a.v6;
import c.b.b.a.e.a.w6;
import c.b.b.a.e.a.x6;
import c.b.b.a.e.a.y6;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvs;

public abstract class z6
extends gc
implements w6 {
    public z6() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static w6 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (iInterface instanceof w6) {
            return (w6)iInterface;
        }
        return new y6(iBinder);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(int var1_1, Parcel var2_2, Parcel var3_3, int var4_4) {
        block25 : {
            block20 : {
                block26 : {
                    block21 : {
                        block22 : {
                            block23 : {
                                block24 : {
                                    if (var1_1 == 1) break block20;
                                    if (var1_1 == 2) break block21;
                                    if (var1_1 == 3) break block22;
                                    if (var1_1 == 5) {
                                        var15_46 = this.getVideoController();
                                        var3_3.writeNoException();
                                        fc.a((Parcel)var3_3, (IInterface)var15_46);
                                        return true;
                                    }
                                    if (var1_1 == 10) break block23;
                                    if (var1_1 == 11) break block24;
                                    switch (var1_1) {
                                        default: {
                                            return false;
                                        }
                                        case 20: {
                                            var49_5 = var2_2.readString();
                                            var50_6 = var2_2.readString();
                                            var51_7 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                                            var52_8 = a.a.a(var2_2.readStrongBinder());
                                            var53_9 = var2_2.readStrongBinder();
                                            var54_10 /* !! */  = null;
                                            if (var53_9 != null) {
                                                var55_12 = var53_9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                                var54_10 /* !! */  = var55_12 instanceof v6 != false ? (v6)var55_12 : new x6(var53_9);
                                            }
                                            var56_11 = var54_10 /* !! */ ;
                                            this.a(var49_5, var50_6, var51_7, var52_8, var56_11, e5.a(var2_2.readStrongBinder()));
                                            break block25;
                                        }
                                        case 19: {
                                            this.b(var2_2.readString());
                                            break block25;
                                        }
                                        case 18: {
                                            var41_13 = var2_2.readString();
                                            var42_14 = var2_2.readString();
                                            var43_15 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                                            var44_16 = a.a.a(var2_2.readStrongBinder());
                                            var45_17 = var2_2.readStrongBinder();
                                            var46_18 /* !! */  = null;
                                            if (var45_17 != null) {
                                                var47_20 = var45_17.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                                var46_18 /* !! */  = var47_20 instanceof s6 != false ? (s6)var47_20 : new u6(var45_17);
                                            }
                                            var48_19 = var46_18 /* !! */ ;
                                            this.a(var41_13, var42_14, var43_15, var44_16, var48_19, e5.a(var2_2.readStrongBinder()));
                                            break block25;
                                        }
                                        case 17: {
                                            var32_21 = this.w(a.a.a(var2_2.readStrongBinder()));
                                            ** GOTO lbl61
                                        }
                                        case 16: {
                                            var33_22 = var2_2.readString();
                                            var34_23 = var2_2.readString();
                                            var35_24 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                                            var36_25 = a.a.a(var2_2.readStrongBinder());
                                            var37_26 = var2_2.readStrongBinder();
                                            var38_27 /* !! */  = null;
                                            if (var37_26 != null) {
                                                var39_29 = var37_26.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                                var38_27 /* !! */  = var39_29 instanceof v6 != false ? (v6)var39_29 : new x6(var37_26);
                                            }
                                            var40_28 = var38_27 /* !! */ ;
                                            this.b(var33_22, var34_23, var35_24, var36_25, var40_28, e5.a(var2_2.readStrongBinder()));
                                            break block25;
                                        }
                                        case 15: {
                                            var32_21 = this.o(a.a.a(var2_2.readStrongBinder()));
lbl61: // 2 sources:
                                            var3_3.writeNoException();
                                            fc.a((Parcel)var3_3, (boolean)var32_21);
                                            return true;
                                        }
                                        case 14: {
                                            var24_30 = var2_2.readString();
                                            var25_31 = var2_2.readString();
                                            var26_32 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                                            var27_33 = a.a.a(var2_2.readStrongBinder());
                                            var28_34 = var2_2.readStrongBinder();
                                            var29_35 /* !! */  = null;
                                            if (var28_34 != null) {
                                                var30_37 = var28_34.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                                var29_35 /* !! */  = var30_37 instanceof r6 != false ? (r6)var30_37 : new t6(var28_34);
                                            }
                                            var31_36 = var29_35 /* !! */ ;
                                            this.a(var24_30, var25_31, var26_32, var27_33, var31_36, e5.a(var2_2.readStrongBinder()));
                                            break block25;
                                        }
                                        case 13: 
                                    }
                                    var16_38 = var2_2.readString();
                                    var17_39 = var2_2.readString();
                                    var18_40 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                                    var19_41 = a.a.a(var2_2.readStrongBinder());
                                    var20_42 = var2_2.readStrongBinder();
                                    var21_43 /* !! */  = null;
                                    if (var20_42 != null) {
                                        var22_45 = var20_42.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                        var21_43 /* !! */  = var22_45 instanceof o6 != false ? (o6)var22_45 : new q6(var20_42);
                                    }
                                    var23_44 = var21_43 /* !! */ ;
                                    this.a(var16_38, var17_39, var18_40, var19_41, var23_44, e5.a(var2_2.readStrongBinder()), (zzvs)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvs.CREATOR));
                                    break block25;
                                }
                                this.a(var2_2.createStringArray(), (Bundle[])var2_2.createTypedArray(Bundle.CREATOR));
                                break block25;
                            }
                            this.k(a.a.a(var2_2.readStrongBinder()));
                            break block25;
                        }
                        var14_47 = this.B();
                        break block26;
                    }
                    var14_47 = this.x();
                }
                var3_3.writeNoException();
                fc.b((Parcel)var3_3, (Parcelable)var14_47);
                return true;
            }
            var5_48 = a.a.a(var2_2.readStrongBinder());
            var6_49 = var2_2.readString();
            var7_50 = (Bundle)fc.a((Parcel)var2_2, (Parcelable.Creator)Bundle.CREATOR);
            var8_51 = (Bundle)fc.a((Parcel)var2_2, (Parcelable.Creator)Bundle.CREATOR);
            var9_52 = (zzvs)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvs.CREATOR);
            var10_53 = var2_2.readStrongBinder();
            if (var10_53 == null) {
                var11_54 = null;
            } else {
                var12_55 = var10_53.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (var12_55 instanceof a7) {
                    var13_56 = (a7)var12_55;
                } else {
                    var13_57 = new c7(var10_53);
                }
                var11_54 = var13_58;
            }
            this.a(var5_48, var6_49, var7_50, var8_51, var9_52, var11_54);
        }
        var3_3.writeNoException();
        return true;
    }
}

