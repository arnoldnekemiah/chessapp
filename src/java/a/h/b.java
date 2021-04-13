/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.util.SparseIntArray
 *  java.lang.Class
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Method
 */
package a.h;

import a.h.a;
import android.os.Parcel;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

public class b
extends a {
    public final SparseIntArray d = new SparseIntArray();
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i = -1;
    public int j = 0;
    public int k = -1;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a.b.a<String, Method>(), new a.b.a<String, Method>(), new a.b.a<String, Class>());
    }

    public b(Parcel parcel, int n4, int n10, String string, a.b.a<String, Method> a5, a.b.a<String, Method> a6, a.b.a<String, Class> a7) {
        super(a5, a6, a7);
        this.e = parcel;
        this.f = n4;
        this.g = n10;
        this.j = n4;
        this.h = string;
    }

    @Override
    public void a() {
        int n4 = this.i;
        if (n4 >= 0) {
            int n10 = this.d.get(n4);
            int n11 = this.e.dataPosition();
            int n12 = n11 - n10;
            this.e.setDataPosition(n10);
            this.e.writeInt(n12);
            this.e.setDataPosition(n11);
        }
    }

    @Override
    public boolean a(int n4) {
        while (this.j < this.g) {
            int n10 = this.k;
            if (n10 == n4) {
                return true;
            }
            if (String.valueOf((int)n10).compareTo(String.valueOf((int)n4)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int n11 = this.e.readInt();
            this.k = this.e.readInt();
            this.j = n11 + this.j;
        }
        return this.k == n4;
    }

    @Override
    public a b() {
        Parcel parcel = this.e;
        int n4 = parcel.dataPosition();
        int n10 = this.j;
        if (n10 == this.f) {
            n10 = this.g;
        }
        b b2 = new b(parcel, n4, n10, c.a.b.a.a.a(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
        return b2;
    }

    @Override
    public void b(int n4) {
        this.a();
        this.i = n4;
        this.d.put(n4, this.e.dataPosition());
        this.e.writeInt(0);
        this.e.writeInt(n4);
    }
}

