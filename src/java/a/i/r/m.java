/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.f.i
 *  a.i.r.p.c
 *  a.i.r.p.l
 *  a.i.r.p.o
 *  a.i.r.q.l.c
 *  a.i.r.q.m.b
 *  android.content.Context
 *  android.database.Cursor
 *  androidx.work.ListenableWorker
 *  androidx.work.ListenableWorker$a
 *  androidx.work.ListenableWorker$a$a
 *  androidx.work.WorkerParameters
 *  androidx.work.WorkerParameters$a
 *  androidx.work.impl.WorkDatabase
 *  androidx.work.impl.background.systemalarm.RescheduleReceiver
 *  c.b.c.a.a.a
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.UUID
 *  java.util.concurrent.Executor
 */
package a.i.r;

import a.f.i;
import a.i.g;
import a.i.h;
import a.i.n;
import a.i.q;
import a.i.r.d;
import a.i.r.e;
import a.i.r.p.b;
import a.i.r.p.j;
import a.i.r.p.k;
import a.i.r.p.l;
import a.i.r.p.o;
import a.i.r.q.f;
import a.i.r.q.l.c;
import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

public class m
implements Runnable {
    public static final String s = h.a("WorkerWrapper");
    public Context a;
    public String b;
    public List<d> c;
    public WorkerParameters.a d;
    public j e;
    public ListenableWorker f;
    public ListenableWorker.a g = new ListenableWorker.a.a();
    public a.i.b h;
    public a.i.r.q.m.a i;
    public WorkDatabase j;
    public k k;
    public b l;
    public a.i.r.p.n m;
    public List<String> n;
    public String o;
    public c<Boolean> p = new c();
    public c.b.c.a.a.a<ListenableWorker.a> q = null;
    public volatile boolean r;

    public m(a a2) {
        WorkDatabase workDatabase;
        this.a = a2.a;
        this.i = a2.c;
        this.b = a2.f;
        this.c = a2.g;
        this.d = a2.h;
        this.f = a2.b;
        this.h = a2.d;
        this.j = workDatabase = a2.e;
        this.k = workDatabase.k();
        this.l = this.j.h();
        this.m = this.j.l();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a() {
        block8 : {
            block9 : {
                var1_1 = this.f();
                var2_2 = false;
                if (var1_1) break block8;
                this.j.c();
                var6_3 = this.k;
                var7_4 = this.b;
                var8_5 = (l)var6_3;
                var9_6 = var8_5.a(var7_4);
                if (var9_6 != null) break block9;
                this.a(false);
                var2_2 = true;
                ** GOTO lbl30
            }
            if (var9_6 != n.b) ** GOTO lbl26
            this.a(this.g);
            var11_7 = this.k;
            var12_8 = this.b;
            var13_9 = (l)var11_7;
            try {
                block10 : {
                    var2_2 = var13_9.a(var12_8).d();
                    break block10;
lbl26: // 1 sources:
                    var10_10 = var9_6.d();
                    var2_2 = false;
                    if (!var10_10) {
                        this.b();
                    }
                }
                this.j.g();
            }
            finally {
                this.j.d();
            }
        }
        if ((var3_12 = this.c) == null) return;
        if (var2_2) {
            var4_13 = var3_12.iterator();
            while (var4_13.hasNext()) {
                ((d)var4_13.next()).a(this.b);
            }
        }
        e.a(this.h, this.j, this.c);
    }

    /*
     * Exception decompiling
     */
    public final void a(ListenableWorker.a var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 10[WHILELOOP]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public final void a(String string) {
        LinkedList linkedList = new LinkedList();
        linkedList.add((Object)string);
        while (!linkedList.isEmpty()) {
            String string2 = (String)linkedList.remove();
            if (((l)this.k).a(string2) != n.f) {
                k k2 = this.k;
                n n2 = n.d;
                String[] arrstring = new String[]{string2};
                ((l)k2).a(n2, arrstring);
            }
            linkedList.addAll((Collection)((a.i.r.p.c)this.l).a(string2));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl) {
        this.j.c();
        k k2 = this.j.k();
        l l2 = (l)k2;
        List list = l2.a();
        ArrayList arrayList = (ArrayList)list;
        boolean bl2 = arrayList.isEmpty();
        if (bl2) {
            f.a(this.a, RescheduleReceiver.class, false);
        }
        this.j.g();
        this.p.c((Object)bl);
        return;
        finally {
            this.j.d();
        }
    }

    public final void b() {
        this.j.c();
        k k2 = this.k;
        n n2 = n.a;
        String[] arrstring = new String[]{this.b};
        l l2 = (l)k2;
        l2.a(n2, arrstring);
        k k3 = this.k;
        String string = this.b;
        long l3 = System.currentTimeMillis();
        l l4 = (l)k3;
        l4.b(string, l3);
        k k4 = this.k;
        String string2 = this.b;
        l l5 = (l)k4;
        try {
            l5.a(string2, -1L);
            this.j.g();
            return;
        }
        finally {
            this.j.d();
            this.a(true);
        }
    }

    public final void c() {
        this.j.c();
        k k2 = this.k;
        String string = this.b;
        long l2 = System.currentTimeMillis();
        l l3 = (l)k2;
        l3.b(string, l2);
        k k3 = this.k;
        n n2 = n.a;
        String[] arrstring = new String[]{this.b};
        l l4 = (l)k3;
        l4.a(n2, arrstring);
        k k4 = this.k;
        String string2 = this.b;
        l l5 = (l)k4;
        l5.f(string2);
        k k5 = this.k;
        String string3 = this.b;
        l l6 = (l)k5;
        try {
            l6.a(string3, -1L);
            this.j.g();
            return;
        }
        finally {
            this.j.d();
            this.a(false);
        }
    }

    public final void d() {
        k k2 = this.k;
        String string = this.b;
        n n2 = ((l)k2).a(string);
        if (n2 == n.b) {
            h h2 = h.a();
            String string2 = s;
            Object[] arrobject = new Object[]{this.b};
            h2.a(string2, String.format((String)"Status for %s is RUNNING;not doing any work and rescheduling for later execution", (Object[])arrobject), new Throwable[0]);
            this.a(true);
            return;
        }
        h h4 = h.a();
        String string3 = s;
        Object[] arrobject = new Object[]{this.b, n2};
        h4.a(string3, String.format((String)"Status for %s is %s; not doing any work", (Object[])arrobject), new Throwable[0]);
        this.a(false);
    }

    public void e() {
        this.j.c();
        this.a(this.b);
        a.i.e e2 = ((ListenableWorker.a.a)this.g).a;
        k k2 = this.k;
        String string = this.b;
        l l2 = (l)k2;
        try {
            l2.a(string, e2);
            this.j.g();
            return;
        }
        finally {
            this.j.d();
            this.a(false);
        }
    }

    public final boolean f() {
        if (this.r) {
            h h2 = h.a();
            String string = s;
            Object[] arrobject = new Object[]{this.o};
            h2.a(string, String.format((String)"Work interrupted for %s", (Object[])arrobject), new Throwable[0]);
            k k2 = this.k;
            String string2 = this.b;
            n n2 = ((l)k2).a(string2);
            if (n2 == null) {
                this.a(false);
                return true;
            }
            this.a(true ^ n2.d());
            return true;
        }
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void run() {
        int n2;
        block42 : {
            block41 : {
                i i2;
                Cursor cursor;
                block48 : {
                    block46 : {
                        ListenableWorker listenableWorker;
                        block47 : {
                            a.i.e e2;
                            block44 : {
                                g g2;
                                block45 : {
                                    block40 : {
                                        boolean bl;
                                        Iterator iterator;
                                        j j2;
                                        StringBuilder stringBuilder;
                                        block43 : {
                                            a.i.r.p.n n3 = this.m;
                                            String string = this.b;
                                            o o2 = (o)n3;
                                            if (o2 == null) throw null;
                                            n2 = 1;
                                            i i3 = i.a((String)"SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", (int)n2);
                                            if (string == null) {
                                                i3.bindNull(n2);
                                            } else {
                                                i3.bindString(n2, string);
                                            }
                                            o2.a.b();
                                            Cursor cursor2 = a.f.l.a.a(o2.a, (a.g.a.e)i3, false);
                                            ArrayList arrayList = new ArrayList(cursor2.getCount());
                                            while (cursor2.moveToNext()) {
                                                arrayList.add((Object)cursor2.getString(0));
                                            }
                                            this.n = arrayList;
                                            stringBuilder = new StringBuilder("Work [ id=");
                                            stringBuilder.append(this.b);
                                            stringBuilder.append(", tags={ ");
                                            iterator = arrayList.iterator();
                                            bl = true;
                                            break block43;
                                            finally {
                                                cursor2.close();
                                                i3.b();
                                            }
                                        }
                                        while (iterator.hasNext()) {
                                            String string = (String)iterator.next();
                                            if (bl) {
                                                bl = false;
                                            } else {
                                                stringBuilder.append(", ");
                                            }
                                            stringBuilder.append(string);
                                        }
                                        stringBuilder.append(" } ]");
                                        this.o = stringBuilder.toString();
                                        if (this.f()) {
                                            return;
                                        }
                                        this.j.c();
                                        k k2 = this.k;
                                        String string = this.b;
                                        l l2 = (l)k2;
                                        this.e = j2 = l2.d(string);
                                        if (j2 == null) {
                                            h h2 = h.a();
                                            String string2 = s;
                                            Object[] arrobject = new Object[n2];
                                            arrobject[0] = this.b;
                                            h2.b(string2, String.format((String)"Didn't find WorkSpec for id %s", (Object[])arrobject), new Throwable[0]);
                                            this.a(false);
                                            return;
                                        }
                                        if (j2.b != n.a) {
                                            this.d();
                                            this.j.g();
                                            h h4 = h.a();
                                            String string3 = s;
                                            Object[] arrobject = new Object[n2];
                                            arrobject[0] = this.e.c;
                                            h4.a(string3, String.format((String)"%s is not in ENQUEUED state. Nothing more to do.", (Object[])arrobject), new Throwable[0]);
                                            return;
                                        }
                                        if (j2.d() || this.e.c()) {
                                            long l3 = System.currentTimeMillis();
                                            boolean bl2 = this.e.n == 0L;
                                            if (!bl2 && l3 < this.e.a()) {
                                                h h5 = h.a();
                                                String string4 = s;
                                                Object[] arrobject = new Object[n2];
                                                arrobject[0] = this.e.c;
                                                h5.a(string4, String.format((String)"Delaying execution for %s because it is being executed before schedule.", (Object[])arrobject), new Throwable[0]);
                                                this.a((boolean)n2);
                                                return;
                                            }
                                        }
                                        this.j.g();
                                        if (!this.e.d()) break block40;
                                        e2 = this.e.e;
                                        break block44;
                                    }
                                    g2 = g.a(this.e.d);
                                    if (g2 != null) break block45;
                                    h h6 = h.a();
                                    String string = s;
                                    Object[] arrobject = new Object[n2];
                                    arrobject[0] = this.e.d;
                                    h6.b(string, String.format((String)"Could not create Input Merger %s", (Object[])arrobject), new Throwable[0]);
                                    break block46;
                                }
                                ArrayList arrayList = new ArrayList();
                                arrayList.add((Object)this.e.e);
                                k k3 = this.k;
                                String string = this.b;
                                l l4 = (l)k3;
                                if (l4 == null) throw null;
                                i2 = i.a((String)"SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", (int)n2);
                                if (string == null) {
                                    i2.bindNull(n2);
                                } else {
                                    i2.bindString(n2, string);
                                }
                                l4.a.b();
                                cursor = a.f.l.a.a(l4.a, (a.g.a.e)i2, false);
                                ArrayList arrayList2 = new ArrayList(cursor.getCount());
                                while (cursor.moveToNext()) {
                                    arrayList2.add((Object)a.i.e.b(cursor.getBlob(0)));
                                }
                                arrayList.addAll((Collection)arrayList2);
                                e2 = g2.a((List<a.i.e>)arrayList);
                            }
                            a.i.e e3 = e2;
                            UUID uUID = UUID.fromString((String)this.b);
                            List<String> list = this.n;
                            WorkerParameters.a a2 = this.d;
                            int n5 = this.e.k;
                            a.i.b b2 = this.h;
                            WorkerParameters workerParameters = new WorkerParameters(uUID, e3, list, a2, n5, b2.a, this.i, b2.c);
                            if (this.f == null) {
                                this.f = this.h.c.a(this.a, this.e.c, workerParameters);
                            }
                            if ((listenableWorker = this.f) != null) break block47;
                            h h7 = h.a();
                            String string = s;
                            Object[] arrobject = new Object[n2];
                            arrobject[0] = this.e.c;
                            h7.b(string, String.format((String)"Could not create Worker %s", (Object[])arrobject), new Throwable[0]);
                            break block46;
                        }
                        if (!listenableWorker.isUsed()) break block48;
                        h h8 = h.a();
                        String string = s;
                        Object[] arrobject = new Object[n2];
                        arrobject[0] = this.e.c;
                        h8.b(string, String.format((String)"Received an already-used Worker %s; WorkerFactory should return new instances", (Object[])arrobject), new Throwable[0]);
                    }
                    this.e();
                    return;
                }
                this.f.setUsed();
                this.j.c();
                k k4 = this.k;
                String string = this.b;
                l l5 = (l)k4;
                if (l5.a(string) != n.a) break block41;
                k k5 = this.k;
                n n7 = n.b;
                String[] arrstring = new String[n2];
                arrstring[0] = this.b;
                l l6 = (l)k5;
                l6.a(n7, arrstring);
                k k6 = this.k;
                String string5 = this.b;
                l l7 = (l)k6;
                try {
                    l7.e(string5);
                    break block42;
                }
                finally {
                    cursor.close();
                    i2.b();
                }
                catch (Throwable throwable) {
                    throw throwable;
                }
                finally {
                    this.j.d();
                }
            }
            n2 = 0;
        }
        this.j.g();
        if (n2 != 0) {
            if (this.f()) {
                return;
            }
            c c2 = new c();
            ((a.i.r.q.m.b)this.i).c.execute((Runnable)new a.i.r.k(this, c2));
            c2.a((Runnable)new a.i.r.l(this, c2, this.o), ((a.i.r.q.m.b)this.i).a);
            return;
        }
        this.d();
        return;
        finally {
            this.j.d();
        }
    }

    public static class a {
        public Context a;
        public ListenableWorker b;
        public a.i.r.q.m.a c;
        public a.i.b d;
        public WorkDatabase e;
        public String f;
        public List<d> g;
        public WorkerParameters.a h = new WorkerParameters.a();

        public a(Context context, a.i.b b2, a.i.r.q.m.a a2, WorkDatabase workDatabase, String string) {
            this.a = context.getApplicationContext();
            this.c = a2;
            this.d = b2;
            this.e = workDatabase;
            this.f = string;
        }
    }

}

