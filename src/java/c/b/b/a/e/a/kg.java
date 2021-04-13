/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.hg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Parcel;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.hg;

public abstract class kg
extends gc
implements hg {
    public kg() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    if (n10 != 4) {
                        if (n10 != 5) {
                            return false;
                        }
                        this.b(fc.a((Parcel)parcel));
                    } else {
                        this.D();
                    }
                } else {
                    this.onVideoPause();
                }
            } else {
                this.onVideoPlay();
            }
        } else {
            this.onVideoStart();
        }
        parcel2.writeNoException();
        return true;
    }
}

