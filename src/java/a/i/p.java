/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.j
 *  a.i.j$a
 *  android.os.Build
 *  android.os.Build$VERSION
 *  androidx.work.ListenableWorker
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Set
 *  java.util.UUID
 */
package a.i;

import a.i.c;
import a.i.j;
import a.i.r.p.j;
import android.os.Build;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class p {
    public UUID a;
    public j b;
    public Set<String> c;

    public p(UUID uUID, j j2, Set<String> set) {
        this.a = uUID;
        this.b = j2;
        this.c = set;
    }

    public String a() {
        return this.a.toString();
    }

    public static abstract class a<B extends a, W extends p> {
        public boolean a = false;
        public UUID b = UUID.randomUUID();
        public j c;
        public Set<String> d = new HashSet();

        public a(Class<? extends ListenableWorker> class_) {
            this.c = new j(this.b.toString(), class_.getName());
            String string = class_.getName();
            this.d.add((Object)string);
            (j.a)this;
        }

        public final W a() {
            j j2;
            j.a a2 = (j.a)this;
            if (a2.a && Build.VERSION.SDK_INT >= 23 && a2.c.j.c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            a.i.j j3 = new a.i.j(a2);
            this.b = UUID.randomUUID();
            this.c = j2 = new j(this.c);
            j2.a = this.b.toString();
            return (W)j3;
        }
    }

}

