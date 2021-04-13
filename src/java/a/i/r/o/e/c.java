/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package a.i.r.o.e;

import a.i.r.o.d;
import a.i.r.p.j;
import java.util.ArrayList;
import java.util.List;

public abstract class c<T>
implements a.i.r.o.a<T> {
    public final List<String> a = new ArrayList();
    public T b;
    public a.i.r.o.f.d<T> c;
    public a d;

    public c(a.i.r.o.f.d<T> d6) {
        this.c = d6;
    }

    public final void a() {
        if (!this.a.isEmpty()) {
            if (this.d == null) {
                return;
            }
            T t4 = this.b;
            if (t4 != null && !this.b(t4)) {
                a a5 = this.d;
                List<String> list = this.a;
                ((d)a5).a(list);
                return;
            }
            a a6 = this.d;
            List<String> list = this.a;
            ((d)a6).b(list);
        }
    }

    @Override
    public void a(T t4) {
        this.b = t4;
        this.a();
    }

    @Override
    public void a(List<j> list) {
        this.a.clear();
        for (j j2 : list) {
            if (!this.a(j2)) continue;
            this.a.add((Object)j2.a);
        }
        if (this.a.isEmpty()) {
            this.c.b(this);
        } else {
            this.c.a(this);
        }
        this.a();
    }

    public abstract boolean a(j var1);

    public abstract boolean b(T var1);

}

