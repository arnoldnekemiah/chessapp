/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.RemoteException
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.hg
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.hg;
import c.b.b.a.e.a.ig;
import c.b.b.a.e.a.jg;

public final class p5
extends gc
implements gg {
    public final Object a = new Object();
    public volatile hg b;

    public p5() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static gg a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (iInterface instanceof gg) {
            return (gg)iInterface;
        }
        return new ig(iBinder);
    }

    public final boolean B0() {
        throw new RemoteException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hg L0() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            return this.b;
        }
    }

    public final void M0() {
        throw new RemoteException();
    }

    public final boolean O0() {
        throw new RemoteException();
    }

    public final void W() {
        throw new RemoteException();
    }

    public final boolean Z() {
        throw new RemoteException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(hg hg2) {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            this.b = hg2;
            return;
        }
    }

    public final void a(boolean bl) {
        throw new RemoteException();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(int var1_1, Parcel var2_2, Parcel var3_3, int var4_4) {
        block19 : {
            switch (var1_1) {
                default: {
                    return false;
                }
                case 13: {
                    this.W();
                    break block19;
                }
                case 12: {
                    var5_5 = this.Z();
                    ** GOTO lbl48
                }
                case 11: {
                    var11_6 = this.L0();
                    var3_3.writeNoException();
                    fc.a((Parcel)var3_3, (IInterface)var11_6);
                    return true;
                }
                case 10: {
                    var5_5 = this.O0();
                    ** GOTO lbl48
                }
                case 9: {
                    var7_7 = this.getAspectRatio();
                    ** GOTO lbl38
                }
                case 8: {
                    var8_8 = var2_2.readStrongBinder();
                    if (var8_8 == null) {
                        var9_9 = null;
                    } else {
                        var10_13 = var8_8.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                        if (var10_13 instanceof hg) {
                            var9_10 = (hg)var10_13;
                        } else {
                            var9_11 = new jg(var8_8);
                        }
                    }
                    this.a((hg)var9_12);
                    break block19;
                }
                case 7: {
                    var7_7 = this.getCurrentTime();
                    ** GOTO lbl38
                }
                case 6: {
                    var7_7 = this.getDuration();
lbl38: // 3 sources:
                    var3_3.writeNoException();
                    var3_3.writeFloat(var7_7);
                    return true;
                }
                case 5: {
                    var6_14 = this.o0();
                    var3_3.writeNoException();
                    var3_3.writeInt(var6_14);
                    return true;
                }
                case 4: {
                    var5_5 = this.B0();
lbl48: // 3 sources:
                    var3_3.writeNoException();
                    fc.a((Parcel)var3_3, (boolean)var5_5);
                    return true;
                }
                case 3: {
                    this.a(fc.a((Parcel)var2_2));
                    break block19;
                }
                case 2: {
                    this.pause();
                    break block19;
                }
                case 1: 
            }
            this.M0();
        }
        var3_3.writeNoException();
        return true;
    }

    public final float getAspectRatio() {
        throw new RemoteException();
    }

    public final float getCurrentTime() {
        throw new RemoteException();
    }

    public final float getDuration() {
        throw new RemoteException();
    }

    public final int o0() {
        throw new RemoteException();
    }

    public final void pause() {
        throw new RemoteException();
    }
}

