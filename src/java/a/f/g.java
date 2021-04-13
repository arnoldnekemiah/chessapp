/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.g.a.f.a
 *  a.g.a.f.b
 *  a.g.a.f.e
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteStatement
 *  android.os.Looper
 *  android.util.Log
 *  androidx.work.impl.WorkDatabase_Impl
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.ThreadLocal
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.locks.ReentrantReadWriteLock
 */
package a.f;

import a.f.e;
import a.g.a.c;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Looper;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class g {
    @Deprecated
    public volatile a.g.a.b a;
    public Executor b;
    public a.g.a.c c;
    public final e d;
    public boolean e;
    public boolean f;
    @Deprecated
    public List<b> g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> i = new ThreadLocal();

    public g() {
        new ConcurrentHashMap();
        this.d = new e((g)((WorkDatabase_Impl)this), (Map<String, String>)new HashMap(0), (Map<String, Set<String>>)new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    public a.g.a.f.e a(String string) {
        this.a();
        this.b();
        return new a.g.a.f.e(((a.g.a.f.a)((a.g.a.f.b)this.c).a()).a.compileStatement(string));
    }

    public void a() {
        if (this.e) {
            return;
        }
        boolean bl = Looper.getMainLooper().getThread() == Thread.currentThread();
        if (!bl) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public void b() {
        if (!this.e()) {
            if (this.i.get() == null) {
                return;
            }
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        this.a();
        a.g.a.b b2 = ((a.g.a.f.b)this.c).a();
        this.d.b(b2);
        ((a.g.a.f.a)b2).a.beginTransaction();
    }

    @Deprecated
    public void d() {
        ((a.g.a.f.a)((a.g.a.f.b)this.c).a()).a.endTransaction();
        if (!this.e()) {
            e e2 = this.d;
            if (e2.e.compareAndSet(false, true)) {
                e2.d.b.execute(e2.j);
            }
        }
    }

    public boolean e() {
        return ((a.g.a.f.a)((a.g.a.f.b)this.c).a()).a.inTransaction();
    }

    public boolean f() {
        a.g.a.b b2 = this.a;
        return b2 != null && ((a.g.a.f.a)b2).a.isOpen();
    }

    @Deprecated
    public void g() {
        ((a.g.a.f.a)((a.g.a.f.b)this.c).a()).a.setTransactionSuccessful();
    }

    public static class a<T extends g> {
        public final Class<T> a;
        public final String b;
        public final Context c;
        public ArrayList<b> d;
        public Executor e;
        public Executor f;
        public c.b g;
        public boolean h;
        public c i;
        public boolean j;
        public boolean k;
        public final d l;
        public Set<Integer> m;

        public a(Context context, Class<T> class_, String string) {
            this.c = context;
            this.a = class_;
            this.b = string;
            this.i = c.a;
            this.j = true;
            this.l = new d();
        }

        public /* varargs */ a<T> a(a.f.k.a ... arra) {
            if (this.m == null) {
                this.m = new HashSet();
            }
            int n2 = arra.length;
            int n3 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                a.f.k.a a2 = arra[i2];
                this.m.add((Object)a2.a);
                this.m.add((Object)a2.b);
            }
            d d2 = this.l;
            if (d2 != null) {
                int n5 = arra.length;
                while (n3 < n5) {
                    a.f.k.a a4;
                    a.f.k.a a5 = arra[n3];
                    int n7 = a5.a;
                    int n8 = a5.b;
                    a.b.g<a.f.k.a> g2 = d2.a.a(n7);
                    if (g2 == null) {
                        g2 = new a.b.g();
                        d2.a.b(n7, g2);
                    }
                    if ((a4 = g2.a(n8)) != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Overriding migration ");
                        stringBuilder.append((Object)a4);
                        stringBuilder.append(" with ");
                        stringBuilder.append((Object)a5);
                        Log.w((String)"ROOM", (String)stringBuilder.toString());
                    }
                    g2.a(n8, a5);
                    ++n3;
                }
                return this;
            }
            throw null;
        }
    }

    public static abstract class b {
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a;
        public static final /* enum */ c b;
        public static final /* enum */ c c;
        public static final /* synthetic */ c[] d;

        public static {
            c c2;
            a = new c();
            b = new c();
            c = c2 = new c();
            c[] arrc = new c[]{a, b, c2};
            d = arrc;
        }

        public static c valueOf(String string) {
            return (c)Enum.valueOf(c.class, (String)string);
        }

        public static c[] values() {
            return (c[])d.clone();
        }
    }

    public static class d {
        public a.b.g<a.b.g<a.f.k.a>> a = new a.b.g();
    }

}

