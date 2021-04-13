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
 *  c.b.b.a.e.a.bf
 *  c.b.b.a.e.a.bg
 *  c.b.b.a.e.a.cf
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.ge
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.he
 *  c.b.b.a.e.a.hf
 *  c.b.b.a.e.a.i8
 *  c.b.b.a.e.a.j9
 *  c.b.b.a.e.a.jf
 *  c.b.b.a.e.a.l0
 *  c.b.b.a.e.a.l8
 *  c.b.b.a.e.a.me
 *  c.b.b.a.e.a.pc
 *  c.b.b.a.e.a.ve
 *  com.google.android.gms.internal.ads.zzaau
 *  com.google.android.gms.internal.ads.zzvl
 *  com.google.android.gms.internal.ads.zzvs
 *  com.google.android.gms.internal.ads.zzvx
 *  com.google.android.gms.internal.ads.zzzi
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.bf;
import c.b.b.a.e.a.bg;
import c.b.b.a.e.a.cf;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.df;
import c.b.b.a.e.a.dg;
import c.b.b.a.e.a.ef;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.ge;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.he;
import c.b.b.a.e.a.hf;
import c.b.b.a.e.a.i8;
import c.b.b.a.e.a.ie;
import c.b.b.a.e.a.j9;
import c.b.b.a.e.a.je;
import c.b.b.a.e.a.jf;
import c.b.b.a.e.a.k8;
import c.b.b.a.e.a.kf;
import c.b.b.a.e.a.l0;
import c.b.b.a.e.a.l8;
import c.b.b.a.e.a.lf;
import c.b.b.a.e.a.m0;
import c.b.b.a.e.a.me;
import c.b.b.a.e.a.n8;
import c.b.b.a.e.a.o9;
import c.b.b.a.e.a.oc;
import c.b.b.a.e.a.oe;
import c.b.b.a.e.a.pc;
import c.b.b.a.e.a.ve;
import c.b.b.a.e.a.xe;
import com.google.android.gms.internal.ads.zzaau;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvs;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzzi;

public abstract class ye
extends gc
implements ve {
    public ye() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static ve a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (iInterface instanceof ve) {
            return (ve)iInterface;
        }
        return new xe(iBinder);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(int var1_1, Parcel var2_2, Parcel var3_3, int var4_4) {
        block75 : {
            switch (var1_1) {
                default: {
                    return false;
                }
                case 45: {
                    var32_5 = var2_2.readStrongBinder();
                    if (var32_5 == null) {
                        var33_6 = null;
                    } else {
                        var34_10 = var32_5.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                        if (var34_10 instanceof jf) {
                            var33_7 = (jf)var34_10;
                        } else {
                            var33_8 = new lf(var32_5);
                        }
                    }
                    this.a((jf)var33_9);
                    ** GOTO lbl204
                }
                case 44: {
                    this.d(a.a.a(var2_2.readStrongBinder()));
                    ** GOTO lbl204
                }
                case 43: {
                    var28_11 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                    var29_12 = var2_2.readStrongBinder();
                    if (var29_12 == null) {
                        var30_13 = null;
                    } else {
                        var31_17 = var29_12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                        if (var31_17 instanceof me) {
                            var30_14 = (me)var31_17;
                        } else {
                            var30_15 = new oe(var29_12);
                        }
                    }
                    this.a(var28_11, (me)var30_16);
                    ** GOTO lbl204
                }
                case 42: {
                    var25_18 = var2_2.readStrongBinder();
                    if (var25_18 == null) {
                        var26_19 = null;
                    } else {
                        var27_23 = var25_18.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                        if (var27_23 instanceof bg) {
                            var26_20 = (bg)var27_23;
                        } else {
                            var26_21 = new dg(var25_18);
                        }
                    }
                    this.a((bg)var26_22);
                    ** GOTO lbl204
                }
                case 41: {
                    var5_24 = this.j();
                    break block75;
                }
                case 40: {
                    this.a(oc.a(var2_2.readStrongBinder()));
                    ** GOTO lbl204
                }
                case 39: {
                    this.a((zzvx)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvx.CREATOR));
                    ** GOTO lbl204
                }
                case 38: {
                    this.g(var2_2.readString());
                    ** GOTO lbl204
                }
                case 37: {
                    var14_25 = this.getAdMetadata();
                    ** GOTO lbl150
                }
                case 36: {
                    var22_26 = var2_2.readStrongBinder();
                    if (var22_26 == null) {
                        var23_27 = null;
                    } else {
                        var24_31 = var22_26.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                        if (var24_31 instanceof bf) {
                            var23_28 = (bf)var24_31;
                        } else {
                            var23_29 = new df(var22_26);
                        }
                    }
                    this.a((bf)var23_30);
                    ** GOTO lbl204
                }
                case 35: {
                    var15_32 = this.A();
                    ** GOTO lbl136
                }
                case 34: {
                    this.setImmersiveMode(fc.a((Parcel)var2_2));
                    ** GOTO lbl204
                }
                case 33: {
                    var5_24 = this.N();
                    break block75;
                }
                case 32: {
                    var5_24 = this.x0();
                    break block75;
                }
                case 31: {
                    var15_32 = this.i0();
                    ** GOTO lbl136
                }
                case 30: {
                    this.a((zzzi)fc.a((Parcel)var2_2, (Parcelable.Creator)zzzi.CREATOR));
                    ** GOTO lbl204
                }
                case 29: {
                    this.a((zzaau)fc.a((Parcel)var2_2, (Parcelable.Creator)zzaau.CREATOR));
                    ** GOTO lbl204
                }
                case 26: {
                    var5_24 = this.getVideoController();
                    break block75;
                }
                case 25: {
                    this.setUserId(var2_2.readString());
                    ** GOTO lbl204
                }
                case 24: {
                    this.a(o9.a(var2_2.readStrongBinder()));
                    ** GOTO lbl204
                }
                case 23: {
                    var6_33 = this.w();
                    ** GOTO lbl199
                }
                case 22: {
                    this.d(fc.a((Parcel)var2_2));
                    ** GOTO lbl204
                }
                case 21: {
                    var19_34 = var2_2.readStrongBinder();
                    if (var19_34 == null) {
                        var20_35 = null;
                    } else {
                        var21_39 = var19_34.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                        if (var21_39 instanceof hf) {
                            var20_36 = (hf)var21_39;
                        } else {
                            var20_37 = new kf(var19_34);
                        }
                    }
                    this.a((hf)var20_38);
                    ** GOTO lbl204
                }
                case 20: {
                    var16_40 = var2_2.readStrongBinder();
                    if (var16_40 == null) {
                        var17_41 = null;
                    } else {
                        var18_45 = var16_40.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                        if (var18_45 instanceof ge) {
                            var17_42 = (ge)var18_45;
                        } else {
                            var17_43 = new ie(var16_40);
                        }
                    }
                    this.a((ge)var17_44);
                    ** GOTO lbl204
                }
                case 19: {
                    this.a(m0.a(var2_2.readStrongBinder()));
                    ** GOTO lbl204
                }
                case 18: {
                    var15_32 = this.getMediationAdapterClassName();
lbl136: // 3 sources:
                    var3_3.writeNoException();
                    var3_3.writeString(var15_32);
                    return true;
                }
                case 15: {
                    this.a(n8.a(var2_2.readStrongBinder()), var2_2.readString());
                    ** GOTO lbl204
                }
                case 14: {
                    this.a(k8.a(var2_2.readStrongBinder()));
                    ** GOTO lbl204
                }
                case 13: {
                    this.a((zzvs)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvs.CREATOR));
                    ** GOTO lbl204
                }
                case 12: {
                    var14_25 = this.X0();
lbl150: // 2 sources:
                    var3_3.writeNoException();
                    fc.b((Parcel)var3_3, (Parcelable)var14_25);
                    return true;
                }
                case 11: {
                    this.n0();
                    ** GOTO lbl204
                }
                case 10: {
                    this.a0();
                    ** GOTO lbl204
                }
                case 9: {
                    this.showInterstitial();
                    ** GOTO lbl204
                }
                case 8: {
                    var11_46 = var2_2.readStrongBinder();
                    if (var11_46 == null) {
                        var12_47 = null;
                    } else {
                        var13_51 = var11_46.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                        if (var13_51 instanceof cf) {
                            var12_48 = (cf)var13_51;
                        } else {
                            var12_49 = new ef(var11_46);
                        }
                    }
                    this.a((cf)var12_50);
                    ** GOTO lbl204
                }
                case 7: {
                    var8_52 = var2_2.readStrongBinder();
                    if (var8_52 == null) {
                        var9_53 = null;
                    } else {
                        var10_57 = var8_52.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                        if (var10_57 instanceof he) {
                            var9_54 = (he)var10_57;
                        } else {
                            var9_55 = new je(var8_52);
                        }
                    }
                    this.b((he)var9_56);
                    ** GOTO lbl204
                }
                case 6: {
                    this.resume();
                    ** GOTO lbl204
                }
                case 5: {
                    this.pause();
                    ** GOTO lbl204
                }
                case 4: {
                    var7_58 = this.b((zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR));
                    var3_3.writeNoException();
                    var3_3.writeInt(var7_58);
                    return true;
                }
                case 3: {
                    var6_33 = this.U();
lbl199: // 2 sources:
                    var3_3.writeNoException();
                    fc.a((Parcel)var3_3, (boolean)var6_33);
                    return true;
                }
                case 2: {
                    this.destroy();
lbl204: // 28 sources:
                    var3_3.writeNoException();
                    return true;
                }
                case 1: 
            }
            var5_24 = this.S0();
        }
        var3_3.writeNoException();
        fc.a((Parcel)var3_3, (IInterface)var5_24);
        return true;
    }
}

