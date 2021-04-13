/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  c.b.b.a.b.h.n
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package c.b.b.a.b.h;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import c.b.b.a.b.h.n;
import java.util.Arrays;

public abstract class c {
    public static final Object a = new Object();
    public static c b;

    public static int a() {
        return 129;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c a(Context context) {
        Object object;
        Object object2 = object = a;
        synchronized (object2) {
            if (b == null) {
                b = new n(context.getApplicationContext());
            }
            return b;
        }
    }

    public abstract boolean a(a var1, ServiceConnection var2, String var3);

    public abstract void b(a var1, ServiceConnection var2, String var3);

    public static final class a {
        public static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
        public final String a;
        public final String b;
        public final ComponentName c;
        public final int d;
        public final boolean e;

        public a(String string, String string2, int n2, boolean bl) {
            a.c.a.a.c(string);
            this.a = string;
            a.c.a.a.c(string2);
            this.b = string2;
            this.c = null;
            this.d = n2;
            this.e = bl;
        }

        public final boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            a a2 = (a)object;
            return a.c.a.a.b((Object)this.a, (Object)a2.a) && a.c.a.a.b((Object)this.b, (Object)a2.b) && a.c.a.a.b((Object)this.c, (Object)a2.c) && this.d == a2.d && this.e == a2.e;
        }

        public final int hashCode() {
            Object[] arrobject = new Object[]{this.a, this.b, this.c, this.d, this.e};
            return Arrays.hashCode((Object[])arrobject);
        }

        public final String toString() {
            String string = this.a;
            if (string == null) {
                a.c.a.a.a(this.c);
                string = this.c.flattenToString();
            }
            return string;
        }
    }

}

