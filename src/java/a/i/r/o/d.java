/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package a.i.r.o;

import a.i.r.o.e.a;
import a.i.r.o.e.b;
import a.i.r.o.e.c;
import a.i.r.o.e.e;
import a.i.r.o.e.f;
import a.i.r.o.e.g;
import a.i.r.o.e.h;
import a.i.r.p.j;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d
implements c.a {
    public static final String d = a.i.h.a("WorkConstraintsTracker");
    public final a.i.r.o.c a;
    public final c<?>[] b;
    public final Object c;

    public d(Context context, a.i.r.q.m.a a5, a.i.r.o.c c2) {
        Context context2 = context.getApplicationContext();
        this.a = c2;
        c[] arrc = new c[]{new a(context2, a5), new b(context2, a5), new h(context2, a5), new a.i.r.o.e.d(context2, a5), new g(context2, a5), new f(context2, a5), new e(context2, a5)};
        this.b = arrc;
        this.c = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            c<?>[] arrc = this.b;
            int n4 = arrc.length;
            int n10 = 0;
            while (n10 < n4) {
                c<?> c2 = arrc[n10];
                if (!c2.a.isEmpty()) {
                    c2.a.clear();
                    c2.c.b(c2);
                }
                ++n10;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(List<String> list) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = list.iterator();
            do {
                if (!iterator.hasNext()) {
                    if (this.a == null) return;
                    this.a.a((List<String>)arrayList);
                    return;
                }
                String string = (String)iterator.next();
                if (!this.a(string)) continue;
                a.i.h.a().a(d, String.format((String)"Constraints met for %s", (Object[])new Object[]{string}), new Throwable[0]);
                arrayList.add((Object)string);
            } while (true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(String string) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            c<?>[] arrc = this.b;
            int n4 = arrc.length;
            int n10 = 0;
            while (n10 < n4) {
                c<?> c2 = arrc[n10];
                Object t4 = c2.b;
                boolean bl = t4 != null && c2.b(t4) && c2.a.contains((Object)string);
                if (bl) {
                    a.i.h h4 = a.i.h.a();
                    String string2 = d;
                    Object[] arrobject = new Object[]{string, c2.getClass().getSimpleName()};
                    h4.a(string2, String.format((String)"Work %s constrained by %s", (Object[])arrobject), new Throwable[0]);
                    return false;
                }
                ++n10;
            }
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(List<String> list) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            if (this.a != null) {
                this.a.b(list);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(List<j> list) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            int n4;
            c<?>[] arrc;
            c<?>[] arrc2 = this.b;
            int n10 = arrc2.length;
            int n11 = 0;
            int n12 = 0;
            do {
                if (n12 < n10) {
                    c<?> c2 = arrc2[n12];
                    if (c2.d != null) {
                        c2.d = null;
                        c2.a();
                    }
                } else {
                    arrc = this.b;
                    n4 = arrc.length;
                    break;
                }
                ++n12;
            } while (true);
            for (int i10 = 0; i10 < n4; ++i10) {
                arrc[i10].a(list);
            }
            c<?>[] arrc3 = this.b;
            int n13 = arrc3.length;
            while (n11 < n13) {
                c<?> c3 = arrc3[n11];
                if (c3.d != this) {
                    c3.d = this;
                    c3.a();
                }
                ++n11;
            }
            return;
        }
    }
}

