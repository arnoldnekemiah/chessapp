/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.z3
 *  com.google.android.gms.internal.ads.zzajh
 *  java.lang.String
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.z3;
import com.google.android.gms.internal.ads.zzajh;
import java.util.List;

public final class b4
extends ec
implements z3 {
    public b4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public final void a(List<zzajh> list) {
        Parcel parcel = this.Z0();
        parcel.writeTypedList(list);
        this.b(1, parcel);
    }
}

