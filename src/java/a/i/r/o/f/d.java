/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.q.m.b
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.Executor
 */
package a.i.r.o.f;

import a.i.h;
import a.i.r.q.m.b;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class d<T> {
    public static final String f = h.a("ConstraintTracker");
    public final a.i.r.q.m.a a;
    public final Context b;
    public final Object c = new Object();
    public final Set<a.i.r.o.a<T>> d = new LinkedHashSet();
    public T e;

    public d(Context context, a.i.r.q.m.a a2) {
        this.b = context.getApplicationContext();
        this.a = a2;
    }

    public abstract T a();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(a.i.r.o.a<T> a2) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            if (this.d.add(a2)) {
                if (this.d.size() == 1) {
                    this.e = this.a();
                    h h2 = h.a();
                    String string = f;
                    Object[] arrobject = new Object[]{this.getClass().getSimpleName(), this.e};
                    h2.a(string, String.format((String)"%s: initial state = %s", (Object[])arrobject), new Throwable[0]);
                    this.b();
                }
                a2.a(this.e);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(T t2) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            if (!(this.e == t2 || this.e != null && this.e.equals(t2))) {
                this.e = t2;
                ArrayList arrayList = new ArrayList(this.d);
                ((b)this.a).c.execute(new Runnable((List)arrayList){
                    public final /* synthetic */ List a;
                    {
                        this.a = list;
                    }

                    public void run() {
                        Iterator iterator = this.a.iterator();
                        while (iterator.hasNext()) {
                            ((a.i.r.o.a)iterator.next()).a(d.this.e);
                        }
                    }
                });
                return;
            }
            return;
        }
    }

    public abstract void b();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(a.i.r.o.a<T> a2) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            if (this.d.remove(a2) && this.d.isEmpty()) {
                this.c();
            }
            return;
        }
    }

    public abstract void c();

}

