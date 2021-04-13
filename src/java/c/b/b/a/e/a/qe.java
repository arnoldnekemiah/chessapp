/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.ne
 *  com.google.android.gms.internal.ads.zzvl
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.ne;
import com.google.android.gms.internal.ads.zzvl;

public abstract class qe
extends gc
implements ne {
    public qe() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        block5 : {
            block1 : {
                String string;
                block6 : {
                    block2 : {
                        block3 : {
                            block4 : {
                                if (n10 == 1) break block1;
                                if (n10 == 2) break block2;
                                if (n10 == 3) break block3;
                                if (n10 == 4) break block4;
                                if (n10 != 5) {
                                    return false;
                                }
                                this.a((zzvl)fc.a((Parcel)parcel, (Parcelable.Creator)zzvl.CREATOR), parcel.readInt());
                                break block5;
                            }
                            string = this.A();
                            break block6;
                        }
                        boolean bl = this.w();
                        parcel2.writeNoException();
                        fc.a((Parcel)parcel2, (boolean)bl);
                        return true;
                    }
                    string = this.getMediationAdapterClassName();
                }
                parcel2.writeNoException();
                parcel2.writeString(string);
                return true;
            }
            this.a((zzvl)fc.a((Parcel)parcel, (Parcelable.Creator)zzvl.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

