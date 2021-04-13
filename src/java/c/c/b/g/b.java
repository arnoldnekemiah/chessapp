/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c.b.g.a
 *  c.c.b.g.c
 *  c.c.b.g.c$a
 *  c.c.b.g.d
 *  c.c.b.i.f
 *  c.c.b.i.j
 *  java.io.File
 *  java.io.RandomAccessFile
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package c.c.b.g;

import c.c.b.g.a;
import c.c.b.g.c;
import c.c.b.g.d;
import c.c.b.i.f;
import c.c.b.i.j;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class b
implements d {
    public a a = new a();
    public File b;
    public File c;
    public File d;

    public static final int a(int n9) {
        if (a.c.a.a.f(n9)) {
            if (n9 >= 1 && n9 <= 6) {
                return n9 + 6;
            }
        } else {
            if (n9 < 7) {
                return n9;
            }
            n9 -= 6;
        }
        return n9;
    }

    public static /* synthetic */ int a(byte[] arrby, int n9, int n10) {
        int n11 = 0;
        for (int i10 = 0; i10 < n10; ++i10) {
            int n12 = arrby[n9 + i10];
            if (n12 < 0) {
                n12 += 256;
            }
            n11 = n12 + (n11 << 8);
        }
        return n11;
    }

    public static final f a(f f10) {
        if (f10 == null) {
            return null;
        }
        f f11 = new f(f10);
        f11.a = b.b(f10.a);
        f11.b = b.b(f10.b);
        f11.c = b.a(f10.c);
        return f11;
    }

    public static /* synthetic */ byte[] a(RandomAccessFile randomAccessFile, long l6, int n9) {
        byte[] arrby = new byte[n9];
        randomAccessFile.seek(l6);
        randomAccessFile.readFully(arrby);
        return arrby;
    }

    public static final int b(int n9) {
        return j.f((int)n9) + 8 * (7 - (n9 >> 3));
    }

    public static final f b(f f10) {
        if (f10 == null) {
            return null;
        }
        f f11 = new f(f10);
        f11.a = b.c(f10.a);
        f11.b = b.c(f10.b);
        f11.c = f10.c;
        return f11;
    }

    public static final int c(int n9) {
        return 7 - j.f((int)n9) + 8 * (n9 >> 3);
    }

    /*
     * Exception decompiling
     */
    public ArrayList<c.a> a(j var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
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

    public void a(a a8) {
        this.a = new a(a8);
        String string = a8.a;
        int n9 = string.length();
        StringBuilder stringBuilder = new StringBuilder();
        int n10 = n9 - 1;
        stringBuilder.append(string.substring(0, n10));
        stringBuilder.append("g");
        this.b = new File(stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string.substring(0, n10));
        stringBuilder2.append("b");
        this.c = new File(stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(string.substring(0, n10));
        stringBuilder3.append("o");
        this.d = new File(stringBuilder3.toString());
    }

    public boolean a() {
        return this.b.canRead() && this.c.canRead() && this.d.canRead();
    }
}

