/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.b.a
 *  a.h.b
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Package
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package a.h;

import a.h.b;
import a.h.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {
    public final a.b.a<String, Method> a;
    public final a.b.a<String, Method> b;
    public final a.b.a<String, Class> c;

    public a(a.b.a<String, Method> a2, a.b.a<String, Method> a4, a.b.a<String, Class> a5) {
        this.a = a2;
        this.b = a4;
        this.c = a5;
    }

    public int a(int n2, int n3) {
        if (!this.a(n3)) {
            return n2;
        }
        return ((b)this).e.readInt();
    }

    public <T extends Parcelable> T a(T t2, int n2) {
        if (!this.a(n2)) {
            return t2;
        }
        return (T)((b)this).e.readParcelable(b.class.getClassLoader());
    }

    public CharSequence a(CharSequence charSequence, int n2) {
        if (!this.a(n2)) {
            return charSequence;
        }
        b b2 = (b)this;
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(b2.e);
    }

    public final Class a(Class<? extends c> class_) {
        Class class_2 = (Class)this.c.get(class_.getName());
        if (class_2 == null) {
            String string = class_.getPackage().getName();
            Object[] arrobject = new Object[]{string, class_.getSimpleName()};
            class_2 = Class.forName((String)String.format((String)"%s.%sParcelizer", (Object[])arrobject), (boolean)false, (ClassLoader)class_.getClassLoader());
            this.c.put(class_.getName(), class_2);
        }
        return class_2;
    }

    public final Method a(String string) {
        Method method = (Method)this.a.get(string);
        if (method == null) {
            System.currentTimeMillis();
            method = Class.forName((String)string, (boolean)true, (ClassLoader)a.class.getClassLoader()).getDeclaredMethod("read", new Class[]{a.class});
            this.a.put(string, method);
        }
        return method;
    }

    public abstract void a();

    public void a(c c2) {
        Class class_;
        if (c2 == null) {
            ((b)this).e.writeString(null);
            return;
        }
        try {
            class_ = this.a((Class<? extends c>)c2.getClass());
        }
        catch (ClassNotFoundException classNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c2.getClass().getSimpleName());
            stringBuilder.append(" does not have a Parcelizer");
            throw new RuntimeException(stringBuilder.toString(), (Throwable)classNotFoundException);
        }
        String string = class_.getName();
        ((b)this).e.writeString(string);
        a a2 = this.b();
        try {
            this.b(c2.getClass()).invoke(null, new Object[]{c2, a2});
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", (Throwable)classNotFoundException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", (Throwable)noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            if (invocationTargetException.getCause() instanceof RuntimeException) {
                throw (RuntimeException)invocationTargetException.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", (Throwable)invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", (Throwable)illegalAccessException);
        }
        a2.a();
        return;
    }

    public abstract boolean a(int var1);

    public boolean a(boolean bl, int n2) {
        if (!this.a(n2)) {
            return bl;
        }
        return ((b)this).e.readInt() != 0;
    }

    public abstract a b();

    public final Method b(Class class_) {
        Method method = (Method)this.b.get(class_.getName());
        if (method == null) {
            Class class_2 = this.a((Class<? extends c>)class_);
            System.currentTimeMillis();
            method = class_2.getDeclaredMethod("write", new Class[]{class_, a.class});
            this.b.put(class_.getName(), method);
        }
        return method;
    }

    public abstract void b(int var1);

    public void b(int n2, int n3) {
        this.b(n3);
        ((b)this).e.writeInt(n2);
    }

    public void b(Parcelable parcelable, int n2) {
        this.b(n2);
        ((b)this).e.writeParcelable(parcelable, 0);
    }

    public <T extends c> T c() {
        c c2;
        String string = ((b)this).e.readString();
        if (string == null) {
            return null;
        }
        a a2 = this.b();
        try {
            c2 = (c)this.a(string).invoke(null, new Object[]{a2});
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", (Throwable)classNotFoundException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", (Throwable)noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            if (invocationTargetException.getCause() instanceof RuntimeException) {
                throw (RuntimeException)invocationTargetException.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", (Throwable)invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", (Throwable)illegalAccessException);
        }
        return (T)c2;
    }
}

