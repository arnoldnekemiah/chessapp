/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  c.c.b.g.a
 *  c.c.b.g.c
 *  c.c.b.g.c$a
 *  c.c.b.g.d
 *  c.c.b.g.e$a
 *  c.c.b.i.f
 *  c.c.b.i.j
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package c.c.b.g;

import android.annotation.SuppressLint;
import c.c.b.g.c;
import c.c.b.g.d;
import c.c.b.g.e;
import c.c.b.i.f;
import c.c.b.i.j;
import java.util.ArrayList;
import java.util.HashMap;

@SuppressLint(value={"UseSparseArrays"})
public final class e
implements d {
    public static HashMap<Long, ArrayList<c.a>> a;
    public static int b = -1;

    public e() {
        Thread thread = new Thread((Runnable)new a(this));
        thread.setPriority(1);
        thread.start();
    }

    public ArrayList<c.a> a(j j10) {
        this.b();
        ArrayList arrayList = (ArrayList)a.get((Object)j10.g);
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (c.a a8 : arrayList) {
            c.a a10 = new c.a(a8.a);
            a10.b = (float)(1.0 + 100.0 * Math.sqrt((double)a8.b));
            arrayList2.add((Object)a10);
        }
        return arrayList2;
    }

    public void a(c.c.b.g.a a8) {
    }

    public final void a(j j10, f f10) {
        ArrayList arrayList = (ArrayList)a.get((Object)j10.g);
        if (arrayList == null) {
            arrayList = new ArrayList();
            a.put((Object)j10.g, (Object)arrayList);
        }
        for (int i10 = 0; i10 < arrayList.size(); ++i10) {
            c.a a8 = (c.a)arrayList.get(i10);
            if (!a8.a.equals((Object)f10)) continue;
            a8.b = 1.0f + a8.b;
            return;
        }
        arrayList.add((Object)new c.a(f10));
        b = 1 + b;
    }

    public boolean a() {
        return true;
    }

    /*
     * Exception decompiling
     */
    public final void b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 13[UNCONDITIONALDOLOOP]
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
}

