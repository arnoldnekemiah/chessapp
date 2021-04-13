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
 *  c.b.b.a.e.a.bg
 *  c.b.b.a.e.a.ca
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.fa
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.ka
 *  c.b.b.a.e.a.w9
 *  c.b.b.a.e.a.x9
 *  c.b.b.a.e.a.xf
 *  com.google.android.gms.internal.ads.zzawh
 *  com.google.android.gms.internal.ads.zzvl
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.ag;
import c.b.b.a.e.a.bg;
import c.b.b.a.e.a.ca;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.ea;
import c.b.b.a.e.a.fa;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.ha;
import c.b.b.a.e.a.ja;
import c.b.b.a.e.a.ka;
import c.b.b.a.e.a.m;
import c.b.b.a.e.a.w9;
import c.b.b.a.e.a.x9;
import c.b.b.a.e.a.xf;
import c.b.b.a.e.a.z9;
import com.google.android.gms.internal.ads.zzawh;
import com.google.android.gms.internal.ads.zzvl;

public abstract class aa
extends gc
implements x9 {
    public aa() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static x9 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (iInterface instanceof x9) {
            return (x9)iInterface;
        }
        return new z9(iBinder);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(int var1_1, Parcel var2_2, Parcel var3_3, int var4_4) {
        block33 : {
            switch (var1_1) {
                default: {
                    return false;
                }
                case 15: {
                    this.setImmersiveMode(fc.a((Parcel)var2_2));
                    break block33;
                }
                case 14: {
                    var19_5 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
                    var20_6 = var2_2.readStrongBinder();
                    if (var20_6 == null) {
                        var21_7 = null;
                    } else {
                        var22_11 = var20_6.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                        if (var22_11 instanceof fa) {
                            var21_8 = (fa)var22_11;
                        } else {
                            var21_9 = new ha(var20_6);
                        }
                    }
                    this.a(var19_5, (fa)var21_10);
                    break block33;
                }
                case 13: {
                    this.a(ag.a(var2_2.readStrongBinder()));
                    break block33;
                }
                case 12: {
                    var18_12 = this.j();
                    ** GOTO lbl28
                }
                case 11: {
                    var18_12 = this.R0();
lbl28: // 2 sources:
                    var3_3.writeNoException();
                    fc.a((Parcel)var3_3, (IInterface)var18_12);
                    return true;
                }
                case 10: {
                    this.a(a.a.a(var2_2.readStrongBinder()), fc.a((Parcel)var2_2));
                    break block33;
                }
                case 9: {
                    var17_13 = this.getAdMetadata();
                    var3_3.writeNoException();
                    fc.b((Parcel)var3_3, (Parcelable)var17_13);
                    return true;
                }
                case 8: {
                    this.a(m.a(var2_2.readStrongBinder()));
                    break block33;
                }
                case 7: {
                    this.a((zzawh)fc.a((Parcel)var2_2, (Parcelable.Creator)zzawh.CREATOR));
                    break block33;
                }
                case 6: {
                    var14_14 = var2_2.readStrongBinder();
                    if (var14_14 == null) {
                        var15_15 = null;
                    } else {
                        var16_19 = var14_14.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                        if (var16_19 instanceof ka) {
                            var15_16 = (ka)var16_19;
                        } else {
                            var15_17 = new ja(var14_14);
                        }
                    }
                    this.a((ka)var15_18);
                    break block33;
                }
                case 5: {
                    this.d(a.a.a(var2_2.readStrongBinder()));
                    break block33;
                }
                case 4: {
                    var13_20 = this.getMediationAdapterClassName();
                    var3_3.writeNoException();
                    var3_3.writeString(var13_20);
                    return true;
                }
                case 3: {
                    var12_21 = this.isLoaded();
                    var3_3.writeNoException();
                    fc.a((Parcel)var3_3, (boolean)var12_21);
                    return true;
                }
                case 2: {
                    var9_22 = var2_2.readStrongBinder();
                    if (var9_22 == null) {
                        var10_23 = null;
                    } else {
                        var11_27 = var9_22.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                        if (var11_27 instanceof ca) {
                            var10_24 = (ca)var11_27;
                        } else {
                            var10_25 = new ea(var9_22);
                        }
                    }
                    this.a((ca)var10_26);
                    break block33;
                }
                case 1: 
            }
            var5_28 = (zzvl)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvl.CREATOR);
            var6_29 = var2_2.readStrongBinder();
            if (var6_29 == null) {
                var7_30 = null;
            } else {
                var8_34 = var6_29.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                if (var8_34 instanceof fa) {
                    var7_31 = (fa)var8_34;
                } else {
                    var7_32 = new ha(var6_29);
                }
            }
            this.b(var5_28, (fa)var7_33);
        }
        var3_3.writeNoException();
        return true;
    }
}

