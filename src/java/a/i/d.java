/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.HashSet
 *  java.util.Set
 */
package a.i;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

public final class d {
    public final Set<a> a = new HashSet();

    public int a() {
        return this.a.size();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && d.class == object.getClass()) {
            d d2 = (d)object;
            return this.a.equals(d2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public static final class a {
        public final Uri a;
        public final boolean b;

        public a(Uri uri, boolean bl) {
            this.a = uri;
            this.b = bl;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (a.class != object.getClass()) {
                    return false;
                }
                a a2 = (a)object;
                return this.b == a2.b && this.a.equals((Object)a2.a);
            }
            return false;
        }

        public int hashCode() {
            return 31 * this.a.hashCode() + this.b;
        }
    }

}

