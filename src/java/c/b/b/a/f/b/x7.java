/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Looper
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.s7
 *  c.b.b.a.f.b.u7
 *  c.b.b.a.f.b.v7
 *  com.google.android.gms.common.ConnectionResult
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package c.b.b.a.f.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import c.b.b.a.b.h.b;
import c.b.b.a.b.i.a;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d3;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.s7;
import c.b.b.a.f.b.u7;
import c.b.b.a.f.b.v7;
import c.b.b.a.f.b.y7;
import com.google.android.gms.common.ConnectionResult;

public final class x7
implements ServiceConnection,
b.a,
b.b {
    public volatile boolean a;
    public volatile d3 b;
    public final /* synthetic */ y7 c;

    public x7(y7 y72) {
        this.c = y72;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        this.c.g();
        Context context = this.c.a.a;
        x7 x72 = this;
        synchronized (x72) {
            try {
                if (this.a) {
                    this.c.a.a().n.a("Connection attempt already in progress");
                    return;
                }
                if (this.b != null && (this.b.e() || this.b.d())) {
                    this.c.a.a().n.a("Already awaiting connection attempt");
                    return;
                }
                this.b = new d3(context, Looper.getMainLooper(), this, this);
                this.c.a.a().n.a("Connecting to remote service");
                this.a = true;
                a.c.a.a.a(this.b);
                this.b.a();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public final void a(int n7) {
        a.c.a.a.b("MeasurementServiceConnection.onConnectionSuspended");
        this.c.a.a().m.a("Service connection suspended");
        this.c.a.d().a((Runnable)new u7(this));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Intent intent) {
        this.c.g();
        Context context = this.c.a.a;
        a a8 = a.a();
        x7 x72 = this;
        synchronized (x72) {
            if (this.a) {
                this.c.a.a().n.a("Connection attempt already in progress");
                return;
            }
            this.c.a.a().n.a("Using local app measurement service");
            this.a = true;
            a8.a(context, intent, this.c.c, 129);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void a(Bundle var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl35 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(ConnectionResult connectionResult) {
        a.c.a.a.b("MeasurementServiceConnection.onConnectionFailed");
        i4 i42 = this.c.a;
        h3 h32 = i42.i;
        h3 h33 = h32 != null && h32.j() ? i42.i : null;
        if (h33 != null) {
            h33.i.a("Service connection failed", (Object)connectionResult);
        }
        x7 x72 = this;
        synchronized (x72) {
            this.a = false;
            this.b = null;
        }
        this.c.a.d().a((Runnable)new v7(this));
    }

    /*
     * Exception decompiling
     */
    public final void onServiceConnected(ComponentName var1, IBinder var2) {
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

    public final void onServiceDisconnected(ComponentName componentName) {
        a.c.a.a.b("MeasurementServiceConnection.onServiceDisconnected");
        this.c.a.a().m.a("Service disconnected");
        this.c.a.d().a((Runnable)new s7(this, componentName));
    }
}

