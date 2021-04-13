/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.de
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.ya
 *  c.b.b.a.e.a.yg
 *  com.google.android.gms.ads.query.QueryInfo
 *  com.google.android.gms.ads.query.QueryInfoGenerationCallback
 *  java.lang.Object
 *  java.lang.String
 *  java.util.WeakHashMap
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.de;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.s8;
import c.b.b.a.e.a.ya;
import c.b.b.a.e.a.yg;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.WeakHashMap;

public abstract class xa
extends gc
implements ya {
    public xa() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    return false;
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle)fc.a((Parcel)parcel, (Parcelable.Creator)Bundle.CREATOR);
                s8 s82 = (s8)this;
                QueryInfo queryInfo = new QueryInfo(new yg(string, bundle));
                de.i.h.put((Object)queryInfo, (Object)string2);
                s82.a.onSuccess(queryInfo);
            } else {
                String string = parcel.readString();
                ((s8)this).a.onFailure(string);
            }
        } else {
            String string = parcel.readString();
            String string3 = parcel.readString();
            s8 s83 = (s8)this;
            QueryInfo queryInfo = new QueryInfo(new yg(string, null));
            de.i.h.put((Object)queryInfo, (Object)string3);
            s83.a.onSuccess(queryInfo);
        }
        parcel2.writeNoException();
        return true;
    }
}

