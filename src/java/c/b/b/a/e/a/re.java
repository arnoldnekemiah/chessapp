/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.he
 *  c.b.b.a.e.a.hf
 *  c.b.b.a.e.a.j2
 *  c.b.b.a.e.a.k2
 *  c.b.b.a.e.a.k4
 *  c.b.b.a.e.a.ne
 *  c.b.b.a.e.a.p2
 *  c.b.b.a.e.a.q2
 *  c.b.b.a.e.a.se
 *  c.b.b.a.e.a.v2
 *  c.b.b.a.e.a.w2
 *  com.google.android.gms.ads.formats.AdManagerAdViewOptions
 *  com.google.android.gms.ads.formats.PublisherAdViewOptions
 *  com.google.android.gms.internal.ads.zzaeh
 *  com.google.android.gms.internal.ads.zzajt
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.he;
import c.b.b.a.e.a.hf;
import c.b.b.a.e.a.i2;
import c.b.b.a.e.a.j2;
import c.b.b.a.e.a.j4;
import c.b.b.a.e.a.je;
import c.b.b.a.e.a.k2;
import c.b.b.a.e.a.k4;
import c.b.b.a.e.a.kf;
import c.b.b.a.e.a.n2;
import c.b.b.a.e.a.ne;
import c.b.b.a.e.a.o2;
import c.b.b.a.e.a.p2;
import c.b.b.a.e.a.q2;
import c.b.b.a.e.a.se;
import c.b.b.a.e.a.t2;
import c.b.b.a.e.a.u2;
import c.b.b.a.e.a.v2;
import c.b.b.a.e.a.w2;
import c.b.b.a.e.a.z2;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaeh;
import com.google.android.gms.internal.ads.zzajt;
import com.google.android.gms.internal.ads.zzvs;

public abstract class re
extends gc
implements se {
    public re() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(int var1_1, Parcel var2_2, Parcel var3_3, int var4_4) {
        switch (var1_1) {
            default: {
                return false;
            }
            case 15: {
                this.a((AdManagerAdViewOptions)fc.a((Parcel)var2_2, (Parcelable.Creator)AdManagerAdViewOptions.CREATOR));
                ** GOTO lbl57
            }
            case 14: {
                this.a(j4.a(var2_2.readStrongBinder()));
                ** GOTO lbl57
            }
            case 13: {
                this.a((zzajt)fc.a((Parcel)var2_2, (Parcelable.Creator)zzajt.CREATOR));
                ** GOTO lbl57
            }
            case 10: {
                this.a(z2.a(var2_2.readStrongBinder()));
                ** GOTO lbl57
            }
            case 9: {
                this.a((PublisherAdViewOptions)fc.a((Parcel)var2_2, (Parcelable.Creator)PublisherAdViewOptions.CREATOR));
                ** GOTO lbl57
            }
            case 8: {
                this.a(u2.a(var2_2.readStrongBinder()), (zzvs)fc.a((Parcel)var2_2, (Parcelable.Creator)zzvs.CREATOR));
                ** GOTO lbl57
            }
            case 7: {
                var9_5 = var2_2.readStrongBinder();
                if (var9_5 == null) {
                    var10_6 = null;
                } else {
                    var11_10 = var9_5.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (var11_10 instanceof hf) {
                        var10_7 = (hf)var11_10;
                    } else {
                        var10_8 = new kf(var9_5);
                    }
                }
                this.b((hf)var10_9);
                ** GOTO lbl57
            }
            case 6: {
                this.a((zzaeh)fc.a((Parcel)var2_2, (Parcelable.Creator)zzaeh.CREATOR));
                ** GOTO lbl57
            }
            case 5: {
                this.a(var2_2.readString(), t2.a(var2_2.readStrongBinder()), o2.a(var2_2.readStrongBinder()));
                ** GOTO lbl57
            }
            case 4: {
                this.a(n2.a(var2_2.readStrongBinder()));
                ** GOTO lbl57
            }
            case 3: {
                this.a(i2.a(var2_2.readStrongBinder()));
                ** GOTO lbl57
            }
            case 2: {
                var6_11 = var2_2.readStrongBinder();
                if (var6_11 == null) {
                    var7_12 = null;
                } else {
                    var8_16 = var6_11.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (var8_16 instanceof he) {
                        var7_13 = (he)var8_16;
                    } else {
                        var7_14 = new je(var6_11);
                    }
                }
                this.a((he)var7_15);
lbl57: // 12 sources:
                var3_3.writeNoException();
                return true;
            }
            case 1: 
        }
        var5_17 = this.X();
        var3_3.writeNoException();
        fc.a((Parcel)var3_3, (IInterface)var5_17);
        return true;
    }
}

