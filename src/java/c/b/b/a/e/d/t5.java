/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.c5
 *  c.b.b.a.e.d.c7
 *  c.b.b.a.e.d.d5
 *  c.b.b.a.e.d.e8
 *  c.b.b.a.e.d.f7
 *  c.b.b.a.e.d.j4
 *  c.b.b.a.e.d.t7
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.y5
 *  c.b.b.a.e.d.z5
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Error
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package c.b.b.a.e.d;

import a.c.a.a;
import c.b.b.a.e.d.c5;
import c.b.b.a.e.d.c7;
import c.b.b.a.e.d.d5;
import c.b.b.a.e.d.e8;
import c.b.b.a.e.d.f7;
import c.b.b.a.e.d.j4;
import c.b.b.a.e.d.k4;
import c.b.b.a.e.d.k6;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.t7;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.y5;
import c.b.b.a.e.d.z5;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class t5<MessageType extends t5<MessageType, BuilderType>, BuilderType extends q5<MessageType, BuilderType>>
extends k4<MessageType, BuilderType> {
    public static final Map<Object, t5<?, ?>> zza = new ConcurrentHashMap();
    public t7 zzc = t7.f;
    public int zzd = -1;

    public static <T extends t5> T a(Class<T> class_) {
        t5 t52;
        t52 = (t5)zza.get(class_);
        if (t52 == null) {
            try {
                Class.forName((String)class_.getName(), (boolean)true, (ClassLoader)class_.getClassLoader());
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException("Class initialization cannot fail.", (Throwable)classNotFoundException);
            }
            t52 = (t5)zza.get(class_);
        }
        if (t52 == null) {
            t5 t53 = (t5)((t5)e8.d(class_)).a(6, null, null);
            if (t53 != null) {
                zza.put(class_, (Object)t53);
                return (T)t53;
            }
            throw new IllegalStateException();
        }
        return (T)t52;
    }

    public static y5 a(y5 y52) {
        int n7 = y52.size();
        int n9 = n7 == 0 ? 10 : n7 + n7;
        return ((k6)y52).d(n9);
    }

    public static <E> z5<E> a(z5<E> z52) {
        int n7 = z52.size();
        int n9 = n7 == 0 ? 10 : n7 + n7;
        return z52.a(n9);
    }

    public static /* varargs */ Object a(Method method, Object object, Object ... arrobject) {
        try {
            Object object2 = method.invoke(object, arrobject);
            return object2;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (!(throwable instanceof RuntimeException)) {
                if (throwable instanceof Error) {
                    throw (Error)throwable;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable);
            }
            throw (RuntimeException)throwable;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", (Throwable)illegalAccessException);
        }
    }

    public abstract Object a(int var1, Object var2, Object var3);

    public final void a(c5 c52) {
        f7 f72 = c7.c.a(this.getClass());
        d5 d52 = c52.a;
        if (d52 == null) {
            d52 = new d5(c52);
        }
        f72.a((Object)this, d52);
    }

    public final int c() {
        int n7 = this.zzd;
        if (n7 == -1) {
            this.zzd = n7 = c7.c.a(this.getClass()).c((Object)this);
        }
        return n7;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        return c7.c.a(this.getClass()).a((Object)this, (Object)((t5)object));
    }

    public final <MessageType extends t5<MessageType, BuilderType>, BuilderType extends q5<MessageType, BuilderType>> BuilderType g() {
        return (BuilderType)((Object)((q5)((Object)this.a(5, null, null))));
    }

    public final BuilderType h() {
        q5 q52 = (q5)((Object)this.a(5, null, null));
        q52.a(this);
        return (BuilderType)((Object)q52);
    }

    public final int hashCode() {
        int n7;
        int n9 = this.zzb;
        if (n9 != 0) {
            return n9;
        }
        this.zzb = n7 = c7.c.a(this.getClass()).b((Object)this);
        return n7;
    }

    public final String toString() {
        String string = Object.super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(string);
        a.a(this, stringBuilder, 0);
        return stringBuilder.toString();
    }
}

