/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.db
 *  c.b.b.a.e.a.ee
 *  c.b.b.a.e.a.gf
 *  c.b.b.a.e.a.jb
 *  c.b.b.a.e.a.kb
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.za
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package c.b.b.a.e.a;

import android.content.Context;
import android.os.RemoteException;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.db;
import c.b.b.a.e.a.ee;
import c.b.b.a.e.a.gf;
import c.b.b.a.e.a.jb;
import c.b.b.a.e.a.kb;
import c.b.b.a.e.a.rd;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.za;

public final class sd
extends ee<za> {
    public final /* synthetic */ Context b;
    public final /* synthetic */ v4 c;

    public sd(Context context, v4 v42) {
        this.b = context;
        this.c = v42;
    }

    public final /* synthetic */ Object a(gf gf2) {
        return gf2.c(new b<Context>(this.b), this.c, 204204000);
    }

    public final /* synthetic */ Object b() {
        b<Context> b7 = new b<Context>(this.b);
        try {
            za za2 = ((db)a.c.a.a.a(this.b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", rd.a)).b(b7, this.c, 204204000);
            return za2;
        }
        catch (RemoteException | jb | NullPointerException throwable) {
            return null;
        }
    }
}

