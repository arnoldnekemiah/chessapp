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
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.e9
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.g9
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.j9
 *  com.google.android.gms.internal.ads.zzava
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
import c.b.b.a.e.a.bf;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.d9;
import c.b.b.a.e.a.dd;
import c.b.b.a.e.a.e9;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.g9;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.i9;
import c.b.b.a.e.a.j9;
import c.b.b.a.e.a.l9;
import com.google.android.gms.internal.ads.zzava;

public abstract class f9
extends gc
implements g9 {
    public f9() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static g9 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        if (iInterface instanceof g9) {
            return (g9)iInterface;
        }
        return new i9(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        block23 : {
            block19 : {
                block20 : {
                    IInterface iInterface;
                    block21 : {
                        block22 : {
                            boolean bl;
                            if (n10 == 1) break block19;
                            if (n10 == 2) break block20;
                            if (n10 == 3) break block21;
                            if (n10 == 34) break block22;
                            switch (n10) {
                                default: {
                                    return false;
                                }
                                case 21: {
                                    cg cg2 = this.j();
                                    parcel2.writeNoException();
                                    fc.a((Parcel)parcel2, (IInterface)cg2);
                                    return true;
                                }
                                case 20: {
                                    bl = this.e0();
                                    break;
                                }
                                case 19: {
                                    this.setCustomData(parcel.readString());
                                    break block23;
                                }
                                case 18: {
                                    this.z(a.a.a(parcel.readStrongBinder()));
                                    break block23;
                                }
                                case 17: {
                                    this.l(parcel.readString());
                                    break block23;
                                }
                                case 16: {
                                    IInterface iInterface2;
                                    IBinder iBinder = parcel.readStrongBinder();
                                    Object object = iBinder == null ? null : ((iInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener")) instanceof e9 ? (e9)iInterface2 : new d9(iBinder));
                                    this.a(object);
                                    break block23;
                                }
                                case 15: {
                                    Bundle bundle = this.getAdMetadata();
                                    parcel2.writeNoException();
                                    fc.b((Parcel)parcel2, (Parcelable)bundle);
                                    return true;
                                }
                                case 14: {
                                    this.a(dd.a(parcel.readStrongBinder()));
                                    break block23;
                                }
                                case 13: {
                                    this.setUserId(parcel.readString());
                                    break block23;
                                }
                                case 12: {
                                    String string = this.getMediationAdapterClassName();
                                    parcel2.writeNoException();
                                    parcel2.writeString(string);
                                    return true;
                                }
                                case 11: {
                                    this.D(a.a.a(parcel.readStrongBinder()));
                                    break block23;
                                }
                                case 10: {
                                    this.q(a.a.a(parcel.readStrongBinder()));
                                    break block23;
                                }
                                case 9: {
                                    this.F(a.a.a(parcel.readStrongBinder()));
                                    break block23;
                                }
                                case 8: {
                                    this.destroy();
                                    break block23;
                                }
                                case 7: {
                                    this.resume();
                                    break block23;
                                }
                                case 6: {
                                    this.pause();
                                    break block23;
                                }
                                case 5: {
                                    bl = this.isLoaded();
                                }
                            }
                            parcel2.writeNoException();
                            fc.a((Parcel)parcel2, (boolean)bl);
                            return true;
                        }
                        this.setImmersiveMode(fc.a((Parcel)parcel));
                        break block23;
                    }
                    IBinder iBinder = parcel.readStrongBinder();
                    Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener")) instanceof j9 ? (j9)iInterface : new l9(iBinder));
                    this.a(object);
                    break block23;
                }
                this.show();
                break block23;
            }
            this.a((zzava)fc.a((Parcel)parcel, (Parcelable.Creator)zzava.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

