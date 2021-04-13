/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.q$a
 *  android.content.Context
 *  androidx.work.ListenableWorker
 *  androidx.work.WorkerParameters
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 */
package a.i;

import a.i.h;
import a.i.q;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.lang.reflect.Constructor;

public abstract class q {
    public static final String a = h.a("WorkerFactory");

    public static q a() {
        return new a();
    }

    public final ListenableWorker a(Context context, String string, WorkerParameters workerParameters) {
        Class class_;
        try {
            class_ = Class.forName((String)string).asSubclass(ListenableWorker.class);
        }
        catch (ClassNotFoundException classNotFoundException) {
            h.a().b(a, c.a.b.a.a.a("Class not found: ", string), new Throwable[0]);
            return null;
        }
        try {
            ListenableWorker listenableWorker = (ListenableWorker)class_.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            return listenableWorker;
        }
        catch (Exception exception) {
            h.a().b(a, c.a.b.a.a.a("Could not instantiate ", string), exception);
            return null;
        }
    }
}

