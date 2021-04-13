/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.app.AppOpsManager
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.location.Location
 *  android.net.Uri
 *  android.os.Binder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.Process
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.Xml
 *  android.view.View
 *  android.widget.TextView
 *  c.b.b.a.e.a.jb
 *  c.b.b.a.e.a.kb
 *  c.b.b.a.e.a.n6
 *  c.b.b.a.e.a.p0
 *  c.b.b.a.e.d.a3
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.c6
 *  c.b.b.a.e.d.f7
 *  c.b.b.a.e.d.f8
 *  c.b.b.a.e.d.j8
 *  c.b.b.a.e.d.n4
 *  c.b.b.a.e.d.r5
 *  c.b.b.a.e.d.t5
 *  c.b.b.a.e.d.t7
 *  c.b.b.a.e.d.u5
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.x3
 *  c.b.b.a.e.d.x4
 *  c.b.b.a.e.d.x6
 *  c.b.b.a.e.d.y3
 *  c.b.b.a.e.d.z3
 *  c.b.b.a.e.d.z5
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.h3
 *  c.b.b.a.f.b.v9
 *  c.b.b.a.g.a
 *  c.b.b.a.g.b
 *  c.b.b.a.g.c
 *  c.b.b.a.g.d
 *  c.b.b.a.g.e
 *  c.b.b.a.g.g
 *  c.b.b.a.g.h
 *  c.b.b.a.g.j
 *  c.b.b.a.g.l
 *  c.b.b.a.g.m
 *  c.b.b.a.g.o
 *  c.b.b.a.g.p
 *  c.b.d.g.c
 *  c.b.d.g.d
 *  c.b.d.g.d$b
 *  c.b.d.g.f
 *  c.b.d.m.a
 *  c.b.d.m.e
 *  c.c.a.b
 *  com.google.ads.AdRequest
 *  com.google.ads.AdRequest$ErrorCode
 *  com.google.ads.AdRequest$Gender
 *  com.google.ads.mediation.MediationAdRequest
 *  com.google.android.gms.dynamite.DynamiteModule
 *  com.google.android.gms.dynamite.DynamiteModule$b
 *  com.google.android.gms.internal.ads.zzvl
 *  com.jetstartgames.chess.MainActivity
 *  java.io.ByteArrayInputStream
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.OutputStream
 *  java.io.OutputStreamWriter
 *  java.io.Serializable
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NoClassDefFoundError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.SecurityException
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.lang.reflect.Modifier
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeSet
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 *  javax.xml.parsers.DocumentBuilder
 *  javax.xml.parsers.DocumentBuilderFactory
 *  kotlin.KotlinVersion
 *  org.checkerframework.checker.nullness.qual.EnsuresNonNull
 *  org.w3c.dom.Document
 *  org.w3c.dom.Element
 *  org.w3c.dom.Node
 *  org.w3c.dom.NodeList
 *  org.xmlpull.v1.XmlSerializer
 */
package a.c.a;

import a.i.d;
import a.i.i;
import a.i.n;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.TextView;
import c.b.b.a.b.e;
import c.b.b.a.b.h.h;
import c.b.b.a.b.h.y;
import c.b.b.a.e.a.jb;
import c.b.b.a.e.a.kb;
import c.b.b.a.e.a.n6;
import c.b.b.a.e.a.p0;
import c.b.b.a.e.d.a3;
import c.b.b.a.e.d.a6;
import c.b.b.a.e.d.c6;
import c.b.b.a.e.d.f7;
import c.b.b.a.e.d.f8;
import c.b.b.a.e.d.j8;
import c.b.b.a.e.d.n4;
import c.b.b.a.e.d.r5;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.t7;
import c.b.b.a.e.d.u5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.x3;
import c.b.b.a.e.d.x4;
import c.b.b.a.e.d.x6;
import c.b.b.a.e.d.y3;
import c.b.b.a.e.d.z3;
import c.b.b.a.e.d.z5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.v9;
import c.b.b.a.g.b;
import c.b.b.a.g.g;
import c.b.b.a.g.j;
import c.b.b.a.g.l;
import c.b.b.a.g.m;
import c.b.b.a.g.o;
import c.b.b.a.g.p;
import c.b.d.g.c;
import c.b.d.g.d;
import c.b.d.g.f;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.ads.zzvl;
import com.jetstartgames.chess.MainActivity;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.KotlinVersion;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xmlpull.v1.XmlSerializer;

public final class a {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Context d;
    public static Boolean e;
    public static v9 f;

    public static int a(int n2, byte[] arrby, int n3, int n5, t7 t72, n4 n42) {
        c6 c62;
        if (n2 >>> 3 != 0) {
            int n6 = n2 & 7;
            if (n6 != 0) {
                if (n6 != 1) {
                    if (n6 != 2) {
                        if (n6 != 3) {
                            if (n6 == 5) {
                                t72.a(n2, (Object)a.a(arrby, n3));
                                return n3 + 4;
                            }
                            throw new c6("Protocol message contained an invalid tag (zero).");
                        }
                        int n7 = 4 | n2 & -8;
                        t7 t73 = t7.b();
                        int n8 = 0;
                        while (n3 < n5) {
                            int n9;
                            int n10 = a.a(arrby, n3, n42);
                            n8 = n9 = n42.a;
                            if (n9 == n7) {
                                n3 = n10;
                                break;
                            }
                            int n11 = a.a(n8, arrby, n10, n5, t73, n42);
                            n8 = n9;
                            n3 = n11;
                        }
                        if (n3 <= n5 && n8 == n7) {
                            t72.a(n2, (Object)t73);
                            return n3;
                        }
                        throw c6.d();
                    }
                    int n12 = a.a(arrby, n3, n42);
                    int n13 = n42.a;
                    if (n13 >= 0) {
                        if (n13 <= arrby.length - n12) {
                            x4 x42 = n13 == 0 ? x4.b : x4.a((byte[])arrby, (int)n12, (int)n13);
                            t72.a(n2, (Object)x42);
                            return n12 + n13;
                        }
                        throw c6.a();
                    }
                    throw c6.b();
                }
                t72.a(n2, (Object)a.b(arrby, n3));
                return n3 + 8;
            }
            int n14 = a.b(arrby, n3, n42);
            t72.a(n2, (Object)n42.b);
            return n14;
        }
        c62 = new c6("Protocol message contained an invalid tag (zero).");
        throw c62;
    }

    public static int a(int n2, byte[] arrby, int n3, int n5, z5<?> z52, n4 n42) {
        u5 u52 = (u5)z52;
        int n6 = a.a(arrby, n3, n42);
        do {
            u52.d(n42.a);
            if (n6 >= n5) break;
            int n7 = a.a(arrby, n6, n42);
            if (n2 != n42.a) {
                return n6;
            }
            n6 = a.a(arrby, n7, n42);
        } while (true);
        return n6;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(int n2, byte[] arrby, int n3, n4 n42) {
        int n5;
        byte by;
        int n6;
        block13 : {
            int n7;
            block11 : {
                int n8;
                byte by2;
                int n9;
                block12 : {
                    int n10;
                    block9 : {
                        byte by3;
                        block10 : {
                            byte by4;
                            block8 : {
                                n8 = n2 & 127;
                                n9 = n3 + 1;
                                by4 = arrby[n3];
                                if (by4 < 0) break block8;
                                n10 = by4 << 7;
                                break block9;
                            }
                            n5 = n8 | (by4 & 127) << 7;
                            n6 = n9 + 1;
                            by3 = arrby[n9];
                            if (by3 < 0) break block10;
                            n7 = by3 << 14;
                            break block11;
                        }
                        n8 = n5 | (by3 & 127) << 14;
                        n9 = n6 + 1;
                        by2 = arrby[n6];
                        if (by2 < 0) break block12;
                        n10 = by2 << 21;
                    }
                    n42.a = n8 | n10;
                    return n9;
                }
                n5 = n8 | (by2 & 127) << 21;
                n6 = n9 + 1;
                by = arrby[n9];
                if (by < 0) break block13;
                n7 = by << 28;
            }
            n42.a = n5 | n7;
            return n6;
        }
        int n11 = n5 | (by & 127) << 28;
        do {
            int n12 = n6 + 1;
            if (arrby[n6] >= 0) {
                n42.a = n11;
                return n12;
            }
            n6 = n12;
        } while (true);
    }

    public static int a(n n2) {
        int n3 = n2.ordinal();
        if (n3 != 0) {
            int n5 = 1;
            if (n3 != n5 && n3 != (n5 = 2) && n3 != (n5 = 3) && n3 != (n5 = 4)) {
                if (n3 == 5) {
                    return 5;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not convert ");
                stringBuilder.append((Object)n2);
                stringBuilder.append(" to int");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return n5;
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(Context context, String string) {
        int n2;
        int n3 = Process.myPid();
        int n5 = Process.myUid();
        String string2 = context.getPackageName();
        int n6 = context.checkPermission(string, n3, n5);
        if (n6 == (n2 = -1)) {
            return n2;
        }
        if (Build.VERSION.SDK_INT < 23) return 0;
        String string3 = AppOpsManager.permissionToOp((String)string);
        if (string3 == null) {
            return 0;
        }
        if (string2 == null) {
            String[] arrstring = context.getPackageManager().getPackagesForUid(n5);
            if (arrstring == null) return n2;
            if (arrstring.length <= 0) {
                return n2;
            }
            string2 = arrstring[0];
        }
        if (Build.VERSION.SDK_INT < 23) return -2;
        int n7 = ((AppOpsManager)context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(string3, string2);
        if (n7 == 0) return 0;
        return -2;
    }

    public static int a(Cursor cursor, String string) {
        int n2 = cursor.getColumnIndex(string);
        if (n2 >= 0) {
            return n2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("`");
        stringBuilder.append(string);
        stringBuilder.append("`");
        return cursor.getColumnIndexOrThrow(stringBuilder.toString());
    }

    public static int a(Parcel parcel) {
        return a.k(parcel, 20293);
    }

    public static int a(f7<?> f72, int n2, byte[] arrby, int n3, int n5, z5<?> z52, n4 n42) {
        int n6 = a.a(f72, arrby, n3, n5, n42);
        do {
            z52.add(n42.c);
            if (n6 >= n5) break;
            int n7 = a.a(arrby, n6, n42);
            if (n2 != n42.a) {
                return n6;
            }
            n6 = a.a(f72, arrby, n7, n5, n42);
        } while (true);
        return n6;
    }

    public static int a(f7 f72, byte[] arrby, int n2, int n3, int n5, n4 n42) {
        x6 x62 = (x6)f72;
        Object object = ((t5)x62.e).a(4, null, null);
        int n6 = x62.a(object, arrby, n2, n3, n5, n42);
        x62.d(object);
        n42.c = object;
        return n6;
    }

    public static int a(f7 f72, byte[] arrby, int n2, int n3, n4 n42) {
        int n5 = n2 + 1;
        int n6 = arrby[n2];
        if (n6 < 0) {
            n5 = a.a(n6, arrby, n5, n42);
            n6 = n42.a;
        }
        int n7 = n5;
        if (n6 >= 0 && n6 <= n3 - n7) {
            Object object = f72.a();
            int n8 = n6 + n7;
            f72.a(object, arrby, n7, n8, n42);
            f72.d(object);
            n42.c = object;
            return n8;
        }
        throw c6.a();
    }

    public static int a(AdRequest.ErrorCode errorCode) {
        int n2 = n6.b[errorCode.ordinal()];
        if (n2 != 2) {
            if (n2 != 3) {
                if (n2 != 4) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static int a(byte[] arrby, int n2) {
        return 255 & arrby[n2] | (255 & arrby[n2 + 1]) << 8 | (255 & arrby[n2 + 2]) << 16 | (255 & arrby[n2 + 3]) << 24;
    }

    public static int a(byte[] arrby, int n2, n4 n42) {
        int n3 = n2 + 1;
        int n5 = arrby[n2];
        if (n5 >= 0) {
            n42.a = n5;
            return n3;
        }
        return a.a(n5, arrby, n3, n42);
    }

    public static int a(byte[] arrby, int n2, z5<?> z52, n4 n42) {
        c6 c62;
        u5 u52 = (u5)z52;
        int n3 = a.a(arrby, n2, n42);
        int n5 = n3 + n42.a;
        while (n3 < n5) {
            n3 = a.a(arrby, n3, n42);
            u52.d(n42.a);
        }
        if (n3 == n5) {
            return n3;
        }
        c62 = c6.a();
        throw c62;
    }

    public static a.i.a a(int n2) {
        if (n2 != 0) {
            if (n2 == 1) {
                return a.i.a.b;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not convert ");
            stringBuilder.append(n2);
            stringBuilder.append(" to BackoffPolicy");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return a.i.a.a;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static a.i.d a(byte[] arrby) {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        a.i.d d2;
        block21 : {
            Throwable throwable;
            block23 : {
                block24 : {
                    IOException iOException;
                    block22 : {
                        d2 = new a.i.d();
                        if (arrby == null) {
                            return d2;
                        }
                        byteArrayInputStream = new ByteArrayInputStream(arrby);
                        objectInputStream = new ObjectInputStream((InputStream)byteArrayInputStream);
                        try {
                            break block21;
                        }
                        catch (IOException iOException2) {
                            break block22;
                        }
                        catch (Throwable throwable2) {
                            throwable = throwable2;
                            objectInputStream = null;
                            break block23;
                        }
                        catch (IOException iOException3) {
                            objectInputStream = null;
                            iOException = iOException3;
                        }
                    }
                    iOException.printStackTrace();
                    if (objectInputStream == null) break block24;
                    try {
                        objectInputStream.close();
                    }
                    catch (IOException iOException4) {
                        iOException4.printStackTrace();
                    }
                }
                byteArrayInputStream.close();
                return d2;
                catch (Throwable throwable3) {
                    // empty catch block
                }
            }
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            try {
                byteArrayInputStream.close();
                throw throwable;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                throw throwable;
            }
        }
        for (int i2 = objectInputStream.readInt(); i2 > 0; --i2) {
            d.a a2 = new d.a(Uri.parse((String)objectInputStream.readUTF()), objectInputStream.readBoolean());
            d2.a.add((Object)a2);
        }
        try {
            objectInputStream.close();
        }
        catch (IOException iOException2) {
            iOException2.printStackTrace();
        }
        try {
            byteArrayInputStream.close();
            return d2;
        }
        catch (IOException iOException3) {
            iOException3.printStackTrace();
            return d2;
        }
    }

    public static Bundle a(Parcel parcel, int n2) {
        int n3 = a.i(parcel, n2);
        int n5 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(n5 + n3);
        return bundle;
    }

    public static <T extends Parcelable> T a(Parcel parcel, int n2, Parcelable.Creator<T> creator) {
        int n3 = a.i(parcel, n2);
        int n5 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable)creator.createFromParcel(parcel);
        parcel.setDataPosition(n5 + n3);
        return (T)parcelable;
    }

    public static <T> x3<T> a(x3<T> x32) {
        if (!(x32 instanceof z3)) {
            if (x32 instanceof y3) {
                return x32;
            }
            if (x32 instanceof Serializable) {
                return new y3(x32);
            }
            return new z3(x32);
        }
        return x32;
    }

    public static MediationAdRequest a(zzvl zzvl2, boolean bl) {
        HashSet hashSet = zzvl2.e != null ? new HashSet((Collection)zzvl2.e) : null;
        HashSet hashSet2 = hashSet;
        Date date = new Date(zzvl2.b);
        int n2 = zzvl2.d;
        AdRequest.Gender gender = n2 != 1 ? (n2 != 2 ? AdRequest.Gender.UNKNOWN : AdRequest.Gender.FEMALE) : AdRequest.Gender.MALE;
        MediationAdRequest mediationAdRequest = new MediationAdRequest(date, gender, (Set)hashSet2, bl, zzvl2.k);
        return mediationAdRequest;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static <T> T a(Context context, String string, kb<IBinder, T> kb2) {
        DynamiteModule dynamiteModule = DynamiteModule.a((Context)context, (DynamiteModule.b)DynamiteModule.i, (String)"com.google.android.gms.ads.dynamite");
        {
            catch (Exception exception) {
                throw new jb((Throwable)exception);
            }
        }
        try {
            return (T)kb2.a((Object)dynamiteModule.a(string));
        }
        catch (Exception exception) {
            throw new jb((Throwable)exception);
        }
    }

    public static <T> T a(Bundle bundle, String string, Class<T> class_, T t2) {
        Object object = bundle.get(string);
        if (object == null) {
            return t2;
        }
        if (class_.isAssignableFrom(object.getClass())) {
            return (T)object;
        }
        Object[] arrobject = new Object[]{string, class_.getCanonicalName(), object.getClass().getCanonicalName()};
        throw new IllegalStateException(String.format((String)"Invalid conditional user property field type. '%s' expected [%s] but was [%s]", (Object[])arrobject));
    }

    public static <V> V a(a3<V> a32) {
        Object object;
        try {
            object = a32.a();
        }
        catch (SecurityException securityException) {
            long l2 = Binder.clearCallingIdentity();
            try {
                Object object2 = a32.a();
                return (V)object2;
            }
            finally {
                Binder.restoreCallingIdentity((long)l2);
            }
        }
        return (V)object;
    }

    public static <TResult> TResult a(o<TResult> o2) {
        if (o2.d()) {
            return (TResult)o2.b();
        }
        o2.a();
        throw new ExecutionException(null);
    }

    public static <TResult> TResult a(o<TResult> o2, long l2, TimeUnit timeUnit) {
        a.d("Must not be called on the main application thread");
        a.a(o2, (Object)"Task must not be null");
        a.a(timeUnit, (Object)"TimeUnit must not be null");
        if (o2.c()) {
            return (TResult)a.a(o2);
        }
        c.b.b.a.g.e e2 = new c.b.b.a.g.e(null);
        Executor executor = c.b.b.a.g.d.a;
        o2.b.a((l)new j(executor, (c.b.b.a.g.c)e2));
        o2.e();
        Executor executor2 = c.b.b.a.g.d.a;
        o2.b.a((l)new c.b.b.a.g.h(executor2, (b)e2));
        o2.e();
        Executor executor3 = c.b.b.a.g.d.a;
        o2.b.a((l)new g(executor3, (c.b.b.a.g.a)e2));
        o2.e();
        if (e2.a.await(l2, timeUnit)) {
            return (TResult)a.a(o2);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @EnsuresNonNull(value={"#1"})
    public static <T> T a(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("null reference");
    }

    @EnsuresNonNull(value={"#1"})
    public static <T> T a(T t2, Object object) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf((Object)object));
    }

    public static <T> T a(T t2, String string) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(string);
    }

    public static String a() {
        try {
            String string = KotlinVersion.CURRENT.toString();
            return string;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(x4 x42) {
        StringBuilder stringBuilder = new StringBuilder(x42.c());
        int n2 = 0;
        do {
            block15 : {
                String string;
                block16 : {
                    block12 : {
                        block13 : {
                            block14 : {
                                if (n2 >= x42.c()) {
                                    return stringBuilder.toString();
                                }
                                int n3 = x42.c(n2);
                                if (n3 == 34) break block12;
                                if (n3 == 39) break block13;
                                if (n3 == 92) break block14;
                                switch (n3) {
                                    default: {
                                        if (n3 < 32 || n3 > 126) {
                                            stringBuilder.append('\\');
                                            stringBuilder.append((char)(48 + (3 & n3 >>> 6)));
                                            stringBuilder.append((char)(48 + (7 & n3 >>> 3)));
                                            n3 = 48 + (n3 & 7);
                                        }
                                        stringBuilder.append((char)n3);
                                        break block15;
                                    }
                                    case 13: {
                                        string = "\\r";
                                        break;
                                    }
                                    case 12: {
                                        string = "\\f";
                                        break;
                                    }
                                    case 11: {
                                        string = "\\v";
                                        break;
                                    }
                                    case 10: {
                                        string = "\\n";
                                        break;
                                    }
                                    case 9: {
                                        string = "\\t";
                                        break;
                                    }
                                    case 8: {
                                        string = "\\b";
                                        break;
                                    }
                                    case 7: {
                                        string = "\\a";
                                        break;
                                    }
                                }
                                break block16;
                            }
                            string = "\\\\";
                            break block16;
                        }
                        string = "\\'";
                        break block16;
                    }
                    string = "\\\"";
                }
                stringBuilder.append(string);
            }
            ++n2;
        } while (true);
    }

    public static String a(File file) {
        try {
            if (file.exists()) {
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                documentBuilderFactory.setNamespaceAware(true);
                String string = ((Element)documentBuilderFactory.newDocumentBuilder().parse(file).getElementsByTagName("root").item(0)).getElementsByTagName("time").item(0).getFirstChild().getNodeValue();
                return string;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static String a(String string) {
        String string2 = a.a(new File(c.a.b.a.a.a(new StringBuilder(), c.c.a.b.c, "/", string)));
        if (string2 == null) {
            string2 = a.a(new File(c.a.b.a.a.a("/data/data/com.jetstartgames.chess/", string)));
        }
        return string2;
    }

    public static final String a(String string, Resources resources, String string2) {
        String string3;
        int n2 = resources.getIdentifier(string, "string", string2);
        string3 = null;
        if (n2 == 0) {
            return null;
        }
        try {
            string3 = resources.getString(n2);
        }
        catch (Resources.NotFoundException notFoundException) {}
        return string3;
    }

    public static String a(String string, Object object) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        throw new IllegalArgumentException(String.valueOf((Object)object));
    }

    public static /* synthetic */ void a(byte by, byte by2, byte by3, byte by4, char[] arrc, int n2) {
        if (!(a.b(by2) || (by << 28) + (by2 + 112) >> 30 != 0 || a.b(by3) || a.b(by4))) {
            int n3 = (by & 7) << 18 | (by2 & 63) << 12 | (by3 & 63) << 6 | by4 & 63;
            arrc[n2] = (char)(55232 + (n3 >>> 10));
            arrc[n2 + 1] = (char)(56320 + (n3 & 1023));
            return;
        }
        throw c6.e();
    }

    public static /* synthetic */ void a(byte by, byte by2, byte by3, char[] arrc, int n2) {
        block4 : {
            block6 : {
                block5 : {
                    if (a.b(by2)) break block4;
                    if (by != -32) break block5;
                    if (by2 < -96) break block4;
                    by = (byte)-32;
                }
                if (by != -19) break block6;
                if (by2 >= -96) break block4;
                by = (byte)-19;
            }
            if (!a.b(by3)) {
                arrc[n2] = (char)((by & 15) << 12 | (by2 & 63) << 6 | by3 & 63);
                return;
            }
        }
        throw c6.e();
    }

    public static /* synthetic */ void a(byte by, byte by2, char[] arrc, int n2) {
        if (by >= -62 && !a.b(by2)) {
            arrc[n2] = (char)((by & 31) << 6 | by2 & 63);
            return;
        }
        throw c6.e();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(Context context, View view, boolean bl, boolean bl2) {
        block11 : {
            block10 : {
                String string;
                if (!a.e("Themes.xml") || (string = a.a("Themes.xml")) == null) {
                    string = "0";
                }
                if (string.equals((Object)"0")) break block10;
                if (string.equals((Object)"1")) {
                    a.d(context, view, bl, bl2);
                    return;
                }
                if (string.equals((Object)"2")) {
                    a.j(context, view, bl, bl2);
                    return;
                }
                if (string.equals((Object)"3")) {
                    a.i(context, view, bl, bl2);
                    return;
                }
                if (string.equals((Object)"4")) {
                    a.h(context, view, bl, bl2);
                    return;
                }
                if (string.equals((Object)"5")) {
                    a.c(context, view, bl, bl2);
                    return;
                }
                if (string.equals((Object)"6")) {
                    a.f(context, view, bl, bl2);
                    return;
                }
                if (string.equals((Object)"7")) break block11;
            }
            a.e(context, view, bl, bl2);
            return;
        }
        a.g(context, view, bl, bl2);
    }

    public static void a(Bundle bundle, Object object) {
        if (object instanceof Double) {
            bundle.putDouble("value", ((Double)object).doubleValue());
            return;
        }
        if (object instanceof Long) {
            bundle.putLong("value", ((Long)object).longValue());
            return;
        }
        bundle.putString("value", object.toString());
    }

    public static void a(Parcel parcel, int n2, int n3) {
        a.c(parcel, n2, 4);
        parcel.writeInt(n3);
    }

    public static void a(Parcel parcel, int n2, long l2) {
        a.c(parcel, n2, 8);
        parcel.writeLong(l2);
    }

    public static void a(Parcel parcel, int n2, Bundle bundle, boolean bl) {
        if (bundle == null) {
            if (bl) {
                a.c(parcel, n2, 0);
            }
            return;
        }
        int n3 = a.k(parcel, n2);
        parcel.writeBundle(bundle);
        a.l(parcel, n3);
    }

    public static void a(Parcel parcel, int n2, IBinder iBinder, boolean bl) {
        if (iBinder == null) {
            if (bl) {
                a.c(parcel, n2, 0);
            }
            return;
        }
        int n3 = a.k(parcel, n2);
        parcel.writeStrongBinder(iBinder);
        a.l(parcel, n3);
    }

    public static void a(Parcel parcel, int n2, Parcelable parcelable, int n3, boolean bl) {
        if (parcelable == null) {
            if (bl) {
                a.c(parcel, n2, 0);
            }
            return;
        }
        int n5 = a.k(parcel, n2);
        parcelable.writeToParcel(parcel, n3);
        a.l(parcel, n5);
    }

    public static void a(Parcel parcel, int n2, String string, boolean bl) {
        if (string == null) {
            if (bl) {
                a.c(parcel, n2, 0);
            }
            return;
        }
        int n3 = a.k(parcel, n2);
        parcel.writeString(string);
        a.l(parcel, n3);
    }

    public static void a(Parcel parcel, int n2, List<String> list, boolean bl) {
        if (list == null) {
            if (bl) {
                a.c(parcel, n2, 0);
            }
            return;
        }
        int n3 = a.k(parcel, n2);
        parcel.writeStringList(list);
        a.l(parcel, n3);
    }

    public static void a(Parcel parcel, int n2, boolean bl) {
        a.c(parcel, n2, 4);
        parcel.writeInt((int)bl);
    }

    public static <T extends Parcelable> void a(Parcel parcel, int n2, T[] arrT, int n3, boolean bl) {
        if (arrT == null) {
            if (bl) {
                a.c(parcel, n2, 0);
            }
            return;
        }
        int n5 = a.k(parcel, n2);
        int n7 = arrT.length;
        parcel.writeInt(n7);
        for (int i2 = 0; i2 < n7; ++i2) {
            T t2 = arrT[i2];
            if (t2 == null) {
                parcel.writeInt(0);
                continue;
            }
            int n8 = parcel.dataPosition();
            parcel.writeInt(1);
            int n9 = parcel.dataPosition();
            t2.writeToParcel(parcel, n3);
            int n10 = parcel.dataPosition();
            parcel.setDataPosition(n8);
            parcel.writeInt(n10 - n9);
            parcel.setDataPosition(n10);
        }
        a.l(parcel, n5);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void a(u6 var0, StringBuilder var1_1, int var2_2) {
        var3_3 = new HashMap();
        var4_4 = new HashMap();
        var5_5 = new TreeSet();
        for (Method var36_9 : var0.getClass().getDeclaredMethods()) {
            var4_4.put((Object)var36_9.getName(), (Object)var36_9);
            if (var36_9.getParameterTypes().length != 0) continue;
            var3_3.put((Object)var36_9.getName(), (Object)var36_9);
            if (!var36_9.getName().startsWith("get")) continue;
            var5_5.add((Object)var36_9.getName());
        }
        for (String var13_11 : var5_5) {
            block12 : {
                block10 : {
                    block16 : {
                        block15 : {
                            block14 : {
                                block13 : {
                                    block11 : {
                                        var14_12 = var13_11.startsWith("get") != false ? var13_11.substring(3) : var13_11;
                                        if (var14_12.endsWith("List") && !var14_12.endsWith("OrBuilderList") && !var14_12.equals((Object)"List")) {
                                            var32_30 = String.valueOf((Object)var14_12.substring(0, 1).toLowerCase());
                                            var33_31 = String.valueOf((Object)var14_12.substring(1, -4 + var14_12.length()));
                                            var34_32 = var33_31.length() != 0 ? var32_30.concat(var33_31) : new String(var32_30);
                                            var35_33 = (Method)var3_3.get((Object)var13_11);
                                            if (var35_33 != null && var35_33.getReturnType().equals(List.class)) {
                                                a.a(var1_1, var2_2, a.f(var34_32), t5.a((Method)var35_33, (Object)var0, (Object[])new Object[0]));
                                                continue;
                                            }
                                        }
                                        if (var14_12.endsWith("Map") && !var14_12.equals((Object)"Map")) {
                                            var28_26 = String.valueOf((Object)var14_12.substring(0, 1).toLowerCase());
                                            var29_27 = String.valueOf((Object)var14_12.substring(1, -3 + var14_12.length()));
                                            var30_28 = var29_27.length() != 0 ? var28_26.concat(var29_27) : new String(var28_26);
                                            var31_29 = (Method)var3_3.get((Object)var13_11);
                                            if (var31_29 != null && var31_29.getReturnType().equals(Map.class) && !var31_29.isAnnotationPresent(Deprecated.class) && Modifier.isPublic((int)var31_29.getModifiers())) {
                                                a.a(var1_1, var2_2, a.f(var30_28), t5.a((Method)var31_29, (Object)var0, (Object[])new Object[0]));
                                                continue;
                                            }
                                        }
                                        if ((Method)var4_4.get((Object)(var15_13 = var14_12.length() != 0 ? "set".concat(var14_12) : new String("set"))) == null || var14_12.endsWith("Bytes") && var3_3.containsKey((Object)(var27_25 = (var26_24 = String.valueOf((Object)var14_12.substring(0, -5 + var14_12.length()))).length() != 0 ? "get".concat(var26_24) : new String("get")))) continue;
                                        var16_14 = String.valueOf((Object)var14_12.substring(0, 1).toLowerCase());
                                        var17_15 = String.valueOf((Object)var14_12.substring(1));
                                        var18_16 = var17_15.length() != 0 ? var16_14.concat(var17_15) : new String(var16_14);
                                        var19_17 = var14_12.length() != 0 ? "get".concat(var14_12) : new String("get");
                                        var20_18 = (Method)var3_3.get((Object)var19_17);
                                        var21_19 = var14_12.length() != 0 ? "has".concat(var14_12) : new String("has");
                                        var22_20 = (Method)var3_3.get((Object)var21_19);
                                        if (var20_18 == null) continue;
                                        var23_21 = t5.a((Method)var20_18, (Object)var0, (Object[])new Object[0]);
                                        if (var22_20 != null) break block10;
                                        if (!(var23_21 instanceof Boolean)) break block11;
                                        if (!((Boolean)var23_21).booleanValue()) continue;
                                        break block12;
                                    }
                                    if (!(var23_21 instanceof Integer)) break block13;
                                    if ((Integer)var23_21 == 0) continue;
                                    break block12;
                                }
                                if (!(var23_21 instanceof Float)) break block14;
                                if (((Float)var23_21).floatValue() == 0.0f) continue;
                                break block12;
                            }
                            if (!(var23_21 instanceof Double)) break block15;
                            if ((Double)var23_21 == 0.0) continue;
                            break block12;
                        }
                        if (!(var23_21 instanceof String)) break block16;
                        var24_22 = "";
                        ** GOTO lbl62
                    }
                    if (var23_21 instanceof x4) {
                        var24_22 = x4.b;
lbl62: // 2 sources:
                        if (var25_23 = var23_21.equals((Object)var24_22)) continue;
                    } else if (!(var23_21 instanceof u6 != false ? var23_21 != ((u6)var23_21).a() : var23_21 instanceof Enum == false || ((Enum)var23_21).ordinal() != 0)) continue;
                    break block12;
                }
                if (!((Boolean)t5.a((Method)var22_20, (Object)var0, (Object[])new Object[0])).booleanValue()) continue;
            }
            a.a(var1_1, var2_2, a.f(var18_16), var23_21);
        }
        if (var0 instanceof r5) {
            (r5)var0;
            throw null;
        }
        var11_34 = ((t5)var0).zzc;
        var12_35 = 0;
        if (var11_34 == null) return;
        while (var12_35 < var11_34.a) {
            a.a(var1_1, var2_2, String.valueOf((int)(var11_34.b[var12_35] >>> 3)), var11_34.c[var12_35]);
            ++var12_35;
        }
    }

    public static void a(h3 h32, SQLiteDatabase sQLiteDatabase) {
        if (h32 != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                h32.i.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                h32.i.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                h32.i.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                h32.i.a("Failed to turn on database write permission for owner");
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /*
     * Exception decompiling
     */
    public static void a(h3 var0, SQLiteDatabase var1_1, String var2_2, String var3_3, String var4_4, String[] var5_5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.b.a.a.j.b(Op04StructuredStatement.java:409)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:487)
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

    public static void a(String string, String string2) {
        String string3;
        XmlSerializer xmlSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        try {
            xmlSerializer.setOutput((Writer)stringWriter);
            xmlSerializer.startDocument("UTF-8", Boolean.valueOf((boolean)true));
            xmlSerializer.startTag("", "root");
            xmlSerializer.startTag("", "time");
            xmlSerializer.text(string2);
            xmlSerializer.endTag("", "time");
            xmlSerializer.endTag("", "root");
            xmlSerializer.endDocument();
            string3 = stringWriter.toString();
        }
        catch (Exception exception) {
            throw new RuntimeException((Throwable)exception);
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c.c.a.b.c);
            stringBuilder.append("/");
            File file = new File(stringBuilder.toString());
            file.mkdir();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)new FileOutputStream(new File(file, string)));
            outputStreamWriter.write(string3);
            outputStreamWriter.flush();
            outputStreamWriter.close();
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public static void a(String string, Throwable throwable) {
        if (a.d(6)) {
            Log.e((String)"Ads", (String)string, (Throwable)throwable);
        }
    }

    public static final void a(StringBuilder stringBuilder, int n2, String string, Object object) {
        if (object instanceof List) {
            Iterator iterator = ((List)object).iterator();
            while (iterator.hasNext()) {
                a.a(stringBuilder, n2, string, iterator.next());
            }
            return;
        }
        if (object instanceof Map) {
            Iterator iterator = ((Map)object).entrySet().iterator();
            while (iterator.hasNext()) {
                a.a(stringBuilder, n2, string, (Object)((Map.Entry)iterator.next()));
            }
            return;
        }
        stringBuilder.append('\n');
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(string);
        if (object instanceof String) {
            stringBuilder.append(": \"");
            stringBuilder.append(a.a(x4.a((String)((String)object))));
            stringBuilder.append('\"');
            return;
        }
        if (object instanceof x4) {
            stringBuilder.append(": \"");
            stringBuilder.append(a.a((x4)object));
            stringBuilder.append('\"');
            return;
        }
        if (object instanceof t5) {
            stringBuilder.append(" {");
            a.a((u6)((t5)object), stringBuilder, n2 + 2);
            stringBuilder.append("\n");
            while (n3 < n2) {
                stringBuilder.append(' ');
                ++n3;
            }
            stringBuilder.append("}");
            return;
        }
        if (object instanceof Map.Entry) {
            stringBuilder.append(" {");
            Map.Entry entry = (Map.Entry)object;
            int n5 = n2 + 2;
            a.a(stringBuilder, n5, "key", entry.getKey());
            a.a(stringBuilder, n5, "value", entry.getValue());
            stringBuilder.append("\n");
            while (n3 < n2) {
                stringBuilder.append(' ');
                ++n3;
            }
            stringBuilder.append("}");
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(object.toString());
    }

    public static void a(List<String> list, p0<String> p02) {
        String string = (String)p02.a();
        if (!TextUtils.isEmpty((CharSequence)string)) {
            list.add((Object)string);
        }
    }

    public static void a(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void a(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf((Object)object));
    }

    public static /* synthetic */ boolean a(byte by) {
        return by >= 0;
    }

    /*
     * Exception decompiling
     */
    public static boolean a(Context var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl31 : ALOAD_3 : trying to set 1 previously set to 0
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
    public static boolean a(Context context, int n2) {
        PackageInfo packageInfo;
        if (!a.a(context, n2, "com.google.android.gms")) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            if (!Log.isLoggable((String)"UidVerifier", (int)3)) return false;
            Log.d((String)"UidVerifier", (String)"Package manager can't find google play services package, defaulting to false");
            return false;
        }
        e e2 = e.a(context);
        if (e2 == null) throw null;
        if (packageInfo == null) {
            return false;
        }
        if (e.a(packageInfo, false)) {
            return true;
        }
        if (!e.a(packageInfo, true)) return false;
        if (c.b.b.a.b.d.c(e2.a)) {
            return true;
        }
        Log.w((String)"GoogleSignatureVerifier", (String)"Test-keys aren't accepted on this build.");
        return false;
    }

    /*
     * Exception decompiling
     */
    @TargetApi(value=19)
    public static boolean a(Context var0, int var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl51.1 : ICONST_0 : trying to set 0 previously set to 1
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

    public static int b(Parcel parcel) {
        int n2 = parcel.readInt();
        int n3 = a.i(parcel, n2);
        int n5 = parcel.dataPosition();
        if ((65535 & n2) != 20293) {
            String string = String.valueOf((Object)Integer.toHexString((int)n2));
            String string2 = string.length() != 0 ? "Expected object header. Got 0x".concat(string) : new String("Expected object header. Got 0x");
            throw new c.b.b.a.b.h.j.a(string2, parcel);
        }
        int n7 = n3 + n5;
        if (n7 >= n5 && n7 <= parcel.dataSize()) {
            return n7;
        }
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Size read is invalid start=");
        stringBuilder.append(n5);
        stringBuilder.append(" end=");
        stringBuilder.append(n7);
        throw new c.b.b.a.b.h.j.a(stringBuilder.toString(), parcel);
    }

    public static int b(byte[] arrby, int n2, n4 n42) {
        int n3 = n2 + 1;
        long l2 = arrby[n2];
        if (l2 < 0L) {
            int n5 = n3 + 1;
            byte by = arrby[n3];
            long l3 = l2 & 127L | (long)(by & 127) << 7;
            int n7 = 7;
            while (by < 0) {
                int n8 = n5 + 1;
                byte by2 = arrby[n5];
                l3 |= (long)(by2 & 127) << (n7 += 7);
                by = by2;
                n5 = n8;
            }
            n42.b = l3;
            return n5;
        }
        n42.b = l2;
        return n3;
    }

    public static long b(byte[] arrby, int n2) {
        return 255L & (long)arrby[n2] | (255L & (long)arrby[n2 + 1]) << 8 | (255L & (long)arrby[n2 + 2]) << 16 | (255L & (long)arrby[n2 + 3]) << 24 | (255L & (long)arrby[n2 + 4]) << 32 | (255L & (long)arrby[n2 + 5]) << 40 | (255L & (long)arrby[n2 + 6]) << 48 | (255L & (long)arrby[n2 + 7]) << 56;
    }

    public static i b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 == 4) {
                            return i.e;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Could not convert ");
                        stringBuilder.append(n2);
                        stringBuilder.append(" to NetworkType");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    return i.d;
                }
                return i.c;
            }
            return i.b;
        }
        return i.a;
    }

    public static h b(Object object) {
        return new h(object, null);
    }

    public static d<?> b(String string, String string2) {
        c.b.d.m.a a2 = new c.b.d.m.a(string, string2);
        d.b b2 = d.a(c.b.d.m.e.class);
        b2.d = 1;
        b2.a((f)new c((Object)a2));
        return b2.a();
    }

    public static String b(Context context) {
        try {
            String string = context.getResources().getResourcePackageName(c.b.b.a.b.f.common_google_play_services_unknown_issue);
            return string;
        }
        catch (Resources.NotFoundException notFoundException) {
            return context.getPackageName();
        }
    }

    public static String b(Parcel parcel, int n2) {
        int n3 = a.i(parcel, n2);
        int n5 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(n5 + n3);
        return string;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"NewApi"})
    public static void b(Context var0, View var1_1, boolean var2_2, boolean var3_3) {
        if (var1_1 == null) {
            return;
        }
        if (!var3_3) ** GOTO lbl-1000
        var4_5 = c.c.a.b.a((Context)var0, (String)"/themes/", (String)"bg.jpg");
        if (var4_5 != null) {
            var4_5 = c.c.a.b.b((Bitmap)var4_5);
        }
        if (var4_5 == null) lbl-1000: // 2 sources:
        {
            var5_4 = c.c.a.b.a((Context)var0, (String)"/themes/", (String)"bg_3d.jpg");
        } else {
            var5_4 = var4_5;
        }
        if (var5_4 != null) {
            var1_1.setBackground((Drawable)new BitmapDrawable(var0.getResources(), var5_4));
            return;
        }
        a.e(var0, var1_1, var2_2, var3_3);
    }

    public static void b(Parcel parcel, int n2, int n3) {
        int n5 = a.i(parcel, n2);
        if (n5 == n3) {
            return;
        }
        String string = Integer.toHexString((int)n5);
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string, 46));
        stringBuilder.append("Expected size ");
        stringBuilder.append(n3);
        stringBuilder.append(" got ");
        stringBuilder.append(n5);
        throw new c.b.b.a.b.h.j.a(c.a.b.a.a.a(stringBuilder, " (0x", string, ")"), parcel);
    }

    public static void b(String string) {
        boolean bl = Looper.getMainLooper() == Looper.myLooper();
        if (bl) {
            return;
        }
        throw new IllegalStateException(string);
    }

    public static void b(String string, Throwable throwable) {
        if (a.d(5)) {
            Log.w((String)"Ads", (String)string, (Throwable)throwable);
        }
    }

    public static void b(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void b(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(String.valueOf((Object)object));
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean b(byte by) {
        return by > -65;
    }

    public static boolean b(Context context, int n2) {
        RuntimeException runtimeException;
        block5 : {
            boolean bl;
            block8 : {
                block7 : {
                    block6 : {
                        String string = context.getApplicationContext().getPackageName();
                        int n3 = 3;
                        for (int i2 = 0; i2 < string.length(); ++i2) {
                            n3 = n3 * 21 + string.charAt(i2);
                        }
                        if (1336500074 != n3) break block5;
                        if (!a.e("View.xml")) break block6;
                        String string2 = a.a("View.xml");
                        if (string2 == null) break block7;
                        boolean bl2 = string2.equals((Object)"0");
                        bl = false;
                        if (!bl2) break block8;
                        break block7;
                    }
                    bl = false;
                    if (n2 < 800) break block8;
                }
                bl = true;
            }
            return bl;
        }
        runtimeException = new RuntimeException();
        throw runtimeException;
    }

    public static boolean b(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    public static <T> T[] b(Parcel parcel, int n2, Parcelable.Creator<T> creator) {
        int n3 = a.i(parcel, n2);
        int n5 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        Object[] arrobject = parcel.createTypedArray(creator);
        parcel.setDataPosition(n5 + n3);
        return arrobject;
    }

    public static int c(byte[] arrby, int n2, n4 n42) {
        int n3 = a.a(arrby, n2, n42);
        int n5 = n42.a;
        if (n5 >= 0) {
            if (n5 == 0) {
                n42.c = "";
                return n3;
            }
            n42.c = new String(arrby, n3, n5, a6.a);
            return n3 + n5;
        }
        throw c6.b();
    }

    public static n c(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 == 5) {
                                return n.f;
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Could not convert ");
                            stringBuilder.append(n2);
                            stringBuilder.append(" to State");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        return n.e;
                    }
                    return n.d;
                }
                return n.c;
            }
            return n.b;
        }
        return n.a;
    }

    public static String c() {
        boolean bl = a.e("Level.xml");
        String string = "0";
        if (bl) {
            String string2 = a.a("Level.xml");
            if (string2 == null) {
                return string;
            }
            string = string2;
        }
        return string;
    }

    public static String c(String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static ArrayList<String> c(Parcel parcel, int n2) {
        int n3 = a.i(parcel, n2);
        int n5 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        ArrayList arrayList = parcel.createStringArrayList();
        parcel.setDataPosition(n5 + n3);
        return arrayList;
    }

    @SuppressLint(value={"NewApi"})
    public static void c(Context context, View view, boolean bl, boolean bl2) {
        Bitmap bitmap;
        if (view == null) {
            return;
        }
        if (bl) {
            MainActivity.Y0 = -7829368;
            MainActivity.h0 = BitmapFactory.decodeResource((Resources)context.getResources(), (int)2131099696);
            a.b(context, view, bl, bl2);
            return;
        }
        TextView textView = (TextView)view.findViewById(2131165400);
        if (textView != null) {
            textView.setBackgroundResource(2131099696);
        }
        if ((bitmap = c.c.a.b.a((Context)context, (String)"/themes/", (String)"bg.jpg")) != null) {
            view.setBackground((Drawable)new BitmapDrawable(context.getResources(), bitmap));
            return;
        }
        a.e(context, view, bl, bl2);
    }

    public static void c(Parcel parcel, int n2, int n3) {
        if (n3 >= 65535) {
            parcel.writeInt(n2 | -65536);
            parcel.writeInt(n3);
            return;
        }
        parcel.writeInt(n2 | n3 << 16);
    }

    public static void c(String string, Throwable throwable) {
        if (a.d(5)) {
            String string2 = a.j(string);
            if (throwable != null) {
                a.b(string2, throwable);
                return;
            }
            a.i(string2);
        }
    }

    public static int d() {
        if (a.e("Move.xml")) {
            String string = a.a("Move.xml");
            if (string == null) {
                return 1;
            }
            if (string.equals((Object)"1")) {
                return 1;
            }
            if (string.equals((Object)"2")) {
                return 2;
            }
            if (string.equals((Object)"3")) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    public static int d(byte[] arrby, int n2, n4 n42) {
        int n3 = a.a(arrby, n2, n42);
        int n5 = n42.a;
        if (n5 >= 0) {
            if (n5 == 0) {
                n42.c = "";
                return n3;
            }
            n42.c = j8.a.a(arrby, n3, n5);
            return n3 + n5;
        }
        throw c6.b();
    }

    @SuppressLint(value={"NewApi"})
    public static void d(Context context, View view, boolean bl, boolean bl2) {
        if (view == null) {
            return;
        }
        MainActivity.Y0 = -7829368;
        if (bl) {
            MainActivity.h0 = BitmapFactory.decodeResource((Resources)context.getResources(), (int)2131099696);
            a.b(context, view, bl, bl2);
            return;
        }
        Bitmap bitmap = c.c.a.b.a((Context)context, (String)"/themes/", (String)"bg.jpg");
        if (bitmap != null) {
            view.setBackground((Drawable)new BitmapDrawable(context.getResources(), bitmap));
            return;
        }
        a.e(context, view, bl, bl2);
    }

    public static void d(Parcel parcel, int n2) {
        if (parcel.dataPosition() == n2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(n2);
        throw new c.b.b.a.b.h.j.a(stringBuilder.toString(), parcel);
    }

    public static void d(Parcel parcel, int n2, int n3) {
        if (n2 == n3) {
            return;
        }
        String string = Integer.toHexString((int)n2);
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string, 46));
        stringBuilder.append("Expected size ");
        stringBuilder.append(n3);
        stringBuilder.append(" got ");
        stringBuilder.append(n2);
        throw new c.b.b.a.b.h.j.a(c.a.b.a.a.a(stringBuilder, " (0x", string, ")"), parcel);
    }

    public static void d(String string) {
        boolean bl = Looper.getMainLooper() == Looper.myLooper();
        if (!bl) {
            return;
        }
        throw new IllegalStateException(string);
    }

    public static boolean d(int n2) {
        return n2 >= 5 || Log.isLoggable((String)"Ads", (int)n2);
        {
        }
    }

    public static int e(byte[] arrby, int n2, n4 n42) {
        int n3 = a.a(arrby, n2, n42);
        int n5 = n42.a;
        if (n5 >= 0) {
            if (n5 <= arrby.length - n3) {
                if (n5 == 0) {
                    n42.c = x4.b;
                    return n3;
                }
                n42.c = x4.a((byte[])arrby, (int)n3, (int)n5);
                return n3 + n5;
            }
            throw c6.a();
        }
        throw c6.b();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void e(Context context, View view, boolean bl, boolean bl2) {
        if (view == null) {
            return;
        }
        MainActivity.Y0 = -7829368;
        if (bl) {
            MainActivity.h0 = BitmapFactory.decodeResource((Resources)context.getResources(), (int)2131099694);
            if (bl2) {
                Bitmap bitmap = c.c.a.b.a((Drawable)context.getResources().getDrawable(2131099651));
                if (bitmap != null) {
                    bitmap = c.c.a.b.b((Bitmap)bitmap);
                }
                if (bitmap != null) {
                    view.setBackground((Drawable)new BitmapDrawable(context.getResources(), bitmap));
                }
                if (bitmap != null) return;
            }
            view.setBackgroundResource(2131099653);
            return;
        }
        TextView textView = (TextView)view.findViewById(2131165400);
        if (textView != null) {
            textView.setBackgroundResource(2131099695);
        }
        view.setBackgroundResource(2131099651);
    }

    public static boolean e() {
        if (a.e("Sound.xml")) {
            String string = a.a("Sound.xml");
            if (string == null) {
                return true;
            }
            if (string.equals((Object)"0")) {
                return false;
            }
        }
        return true;
    }

    public static final boolean e(int n2) {
        return n2 < 7;
    }

    public static boolean e(Parcel parcel, int n2) {
        a.b(parcel, n2, 4);
        return parcel.readInt() != 0;
    }

    public static boolean e(String string) {
        block4 : {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c.c.a.b.c);
            stringBuilder.append("/");
            stringBuilder.append(string);
            if (!new File(stringBuilder.toString()).exists()) break block4;
            return true;
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/data/data/com.jetstartgames.chess/");
            stringBuilder.append(string);
            boolean bl = new File(stringBuilder.toString()).exists();
            if (bl) {
                return true;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public static int f() {
        boolean bl = a.e("TrainingUnlocked.xml");
        int n2 = 0;
        if (bl) {
            String string = a.a("TrainingUnlocked.xml");
            n2 = 0;
            if (string != null) {
                n2 = Integer.valueOf((String)string);
            }
        }
        return n2;
    }

    public static IBinder f(Parcel parcel, int n2) {
        int n3 = a.i(parcel, n2);
        int n5 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        IBinder iBinder = parcel.readStrongBinder();
        parcel.setDataPosition(n5 + n3);
        return iBinder;
    }

    public static final String f(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (Character.isUpperCase((char)c2)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase((char)c2));
        }
        return stringBuilder.toString();
    }

    @SuppressLint(value={"NewApi"})
    public static void f(Context context, View view, boolean bl, boolean bl2) {
        Bitmap bitmap;
        if (view == null) {
            return;
        }
        MainActivity.Y0 = -7829368;
        if (bl) {
            MainActivity.h0 = BitmapFactory.decodeResource((Resources)context.getResources(), (int)2131099696);
            a.b(context, view, bl, bl2);
            return;
        }
        TextView textView = (TextView)view.findViewById(2131165400);
        if (textView != null) {
            textView.setBackgroundResource(2131099696);
        }
        if ((bitmap = c.c.a.b.a((Context)context, (String)"/themes/", (String)"bg.jpg")) != null) {
            view.setBackground((Drawable)new BitmapDrawable(context.getResources(), bitmap));
            return;
        }
        a.e(context, view, bl, bl2);
    }

    public static boolean f(int n2) {
        return n2 < 7;
    }

    public static int g(Parcel parcel, int n2) {
        a.b(parcel, n2, 4);
        return parcel.readInt();
    }

    @SuppressLint(value={"NewApi"})
    public static void g(Context context, View view, boolean bl, boolean bl2) {
        Bitmap bitmap;
        if (view == null) {
            return;
        }
        if (bl) {
            MainActivity.Y0 = -7829368;
            MainActivity.h0 = BitmapFactory.decodeResource((Resources)context.getResources(), (int)2131099696);
            a.b(context, view, bl, bl2);
            return;
        }
        TextView textView = (TextView)view.findViewById(2131165400);
        if (textView != null) {
            textView.setBackgroundResource(2131099696);
        }
        if ((bitmap = c.c.a.b.a((Context)context, (String)"/themes/", (String)"bg.jpg")) != null) {
            view.setBackground((Drawable)new BitmapDrawable(context.getResources(), bitmap));
            return;
        }
        a.e(context, view, bl, bl2);
    }

    public static void g(String string) {
        if (a.d(3)) {
            Log.d((String)"Ads", (String)string);
        }
    }

    public static int[] g() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    public static long h(Parcel parcel, int n2) {
        a.b(parcel, n2, 8);
        return parcel.readLong();
    }

    @SuppressLint(value={"NewApi"})
    public static void h(Context context, View view, boolean bl, boolean bl2) {
        Bitmap bitmap;
        if (view == null) {
            return;
        }
        if (bl) {
            MainActivity.Y0 = -16777216;
            MainActivity.h0 = BitmapFactory.decodeResource((Resources)context.getResources(), (int)2131099697);
            a.b(context, view, bl, bl2);
            return;
        }
        TextView textView = (TextView)view.findViewById(2131165400);
        if (textView != null) {
            textView.setBackgroundResource(2131099693);
        }
        if ((bitmap = c.c.a.b.a((Context)context, (String)"/themes/", (String)"bg.jpg")) != null) {
            view.setBackground((Drawable)new BitmapDrawable(context.getResources(), bitmap));
            return;
        }
        a.e(context, view, bl, bl2);
    }

    public static void h(String string) {
        if (a.d(6)) {
            Log.e((String)"Ads", (String)string);
        }
    }

    public static int i(Parcel parcel, int n2) {
        if ((n2 & -65536) != -65536) {
            return 65535 & n2 >> 16;
        }
        return parcel.readInt();
    }

    @SuppressLint(value={"NewApi"})
    public static void i(Context context, View view, boolean bl, boolean bl2) {
        Bitmap bitmap;
        if (view == null) {
            return;
        }
        MainActivity.Y0 = -7829368;
        if (bl) {
            MainActivity.h0 = BitmapFactory.decodeResource((Resources)context.getResources(), (int)2131099695);
            a.b(context, view, bl, bl2);
            return;
        }
        TextView textView = (TextView)view.findViewById(2131165400);
        if (textView != null) {
            textView.setBackgroundResource(2131099694);
        }
        if ((bitmap = c.c.a.b.a((Context)context, (String)"/themes/", (String)"bg.jpg")) != null) {
            view.setBackground((Drawable)new BitmapDrawable(context.getResources(), bitmap));
            return;
        }
        a.e(context, view, bl, bl2);
    }

    public static void i(String string) {
        if (a.d(5)) {
            Log.w((String)"Ads", (String)string);
        }
    }

    public static String j(String string) {
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        if (arrstackTraceElement.length >= 4) {
            int n2 = arrstackTraceElement[3].getLineNumber();
            StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string, 13));
            stringBuilder.append(string);
            stringBuilder.append(" @");
            stringBuilder.append(n2);
            string = stringBuilder.toString();
        }
        return string;
    }

    @SuppressLint(value={"NewApi"})
    public static void j(Context context, View view, boolean bl, boolean bl2) {
        if (view == null) {
            return;
        }
        MainActivity.Y0 = -7829368;
        if (bl) {
            MainActivity.h0 = BitmapFactory.decodeResource((Resources)context.getResources(), (int)2131099693);
            a.b(context, view, bl, bl2);
            return;
        }
        Bitmap bitmap = c.c.a.b.a((Context)context, (String)"/themes/", (String)"bg.jpg");
        if (bitmap != null) {
            view.setBackground((Drawable)new BitmapDrawable(context.getResources(), bitmap));
            return;
        }
        a.e(context, view, bl, bl2);
    }

    public static void j(Parcel parcel, int n2) {
        parcel.setDataPosition(a.i(parcel, n2) + parcel.dataPosition());
    }

    public static int k(Parcel parcel, int n2) {
        parcel.writeInt(n2 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void l(Parcel parcel, int n2) {
        int n3 = parcel.dataPosition();
        int n5 = n3 - n2;
        parcel.setDataPosition(n2 - 4);
        parcel.writeInt(n5);
        parcel.setDataPosition(n3);
    }
}

