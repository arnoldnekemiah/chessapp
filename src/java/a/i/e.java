/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package a.i;

import a.i.h;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class e {
    public static final String b = h.a("Data");
    public static final e c;
    public Map<String, Object> a;

    public static {
        e e2 = new e((Map<String, ?>)new HashMap());
        e.a(e2);
        c = e2;
    }

    public e() {
    }

    public e(e e2) {
        this.a = new HashMap(e2.a);
    }

    public e(Map<String, ?> map) {
        this.a = new HashMap(map);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static byte[] a(e var0) {
        block22 : {
            block23 : {
                block21 : {
                    var1_1 = new ByteArrayOutputStream();
                    var2_2 = null;
                    var3_3 = new ObjectOutputStream((OutputStream)var1_1);
                    var3_3.writeInt(var0.a.size());
                    for (Map.Entry var21_5 : var0.a.entrySet()) {
                        var3_3.writeUTF((String)var21_5.getKey());
                        var3_3.writeObject(var21_5.getValue());
                    }
                    try {
                        var3_3.close();
                    }
                    catch (IOException var17_6) {
                        Log.e((String)e.b, (String)"Error in Data#toByteArray: ", (Throwable)var17_6);
                    }
                    try {
                        var1_1.close();
                    }
                    catch (IOException var19_7) {
                        Log.e((String)e.b, (String)"Error in Data#toByteArray: ", (Throwable)var19_7);
                    }
                    if (var1_1.size() > 10240) throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    return var1_1.toByteArray();
                    catch (Throwable var11_8) {
                    }
                    catch (IOException var4_11) {
                        break block21;
                    }
                    var2_2 = var3_3;
                    break block22;
                }
                var2_2 = var3_3;
                ** GOTO lbl-1000
                catch (Throwable var11_9) {
                    break block22;
                }
                catch (IOException var4_12) {
                    // empty catch block
                }
lbl-1000: // 2 sources:
                {
                    Log.e((String)e.b, (String)"Error in Data#toByteArray: ", (Throwable)var4_13);
                    var6_14 = var1_1.toByteArray();
                    if (var2_2 == null) break block23;
                }
                try {
                    var2_2.close();
                }
                catch (IOException var9_15) {
                    Log.e((String)e.b, (String)"Error in Data#toByteArray: ", (Throwable)var9_15);
                }
            }
            try {
                var1_1.close();
                return var6_14;
            }
            catch (IOException var7_16) {
                Log.e((String)e.b, (String)"Error in Data#toByteArray: ", (Throwable)var7_16);
                return var6_14;
            }
        }
        if (var2_2 != null) {
            try {
                var2_2.close();
            }
            catch (IOException var14_17) {
                Log.e((String)e.b, (String)"Error in Data#toByteArray: ", (Throwable)var14_17);
            }
        }
        try {
            var1_1.close();
            throw var11_10;
        }
        catch (IOException var12_18) {
            Log.e((String)e.b, (String)"Error in Data#toByteArray: ", (Throwable)var12_18);
            throw var11_10;
        }
    }

    public static Boolean[] a(boolean[] arrbl) {
        Boolean[] arrboolean = new Boolean[arrbl.length];
        for (int i2 = 0; i2 < arrbl.length; ++i2) {
            arrboolean[i2] = arrbl[i2];
        }
        return arrboolean;
    }

    public static Byte[] a(byte[] arrby) {
        Byte[] arrbyte = new Byte[arrby.length];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrbyte[i2] = arrby[i2];
        }
        return arrbyte;
    }

    public static Double[] a(double[] arrd) {
        Double[] arrdouble = new Double[arrd.length];
        for (int i2 = 0; i2 < arrd.length; ++i2) {
            arrdouble[i2] = arrd[i2];
        }
        return arrdouble;
    }

    public static Float[] a(float[] arrf) {
        Float[] arrfloat = new Float[arrf.length];
        for (int i2 = 0; i2 < arrf.length; ++i2) {
            arrfloat[i2] = Float.valueOf((float)arrf[i2]);
        }
        return arrfloat;
    }

    public static Integer[] a(int[] arrn) {
        Integer[] arrinteger = new Integer[arrn.length];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrinteger[i2] = arrn[i2];
        }
        return arrinteger;
    }

    public static Long[] a(long[] arrl) {
        Long[] arrlong = new Long[arrl.length];
        for (int i2 = 0; i2 < arrl.length; ++i2) {
            arrlong[i2] = arrl[i2];
        }
        return arrlong;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static e b(byte[] var0) {
        block23 : {
            block24 : {
                block25 : {
                    if (var0.length > 10240) {
                        var23_21 = new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                        throw var23_21;
                    }
                    var1_1 = new HashMap();
                    var2_2 = new ByteArrayInputStream(var0);
                    var3_3 = new ObjectInputStream((InputStream)var2_2);
                    break block25;
                    catch (Throwable var11_11) {
                        var12_13 = null;
                        break block23;
                    }
                    catch (ClassNotFoundException var21_14) {
                    }
                    catch (IOException var21_15) {
                        // empty catch block
                    }
                    var22_17 = var21_16;
                    var3_3 = null;
                    var4_10 = var22_17;
                    ** GOTO lbl-1000
                }
                for (var17_4 = var3_3.readInt(); var17_4 > 0; --var17_4) {
                    var1_1.put((Object)var3_3.readUTF(), var3_3.readObject());
                }
                try {
                    var3_3.close();
                }
                catch (IOException var19_5) {
                    Log.e((String)e.b, (String)"Error in Data#fromByteArray: ", (Throwable)var19_5);
                }
lbl30: // 5 sources:
                do {
                    try {
                        var2_2.close();
                        return new e((Map<String, ?>)var1_1);
                    }
                    catch (IOException var8_6) {}
                    Log.e((String)e.b, (String)"Error in Data#fromByteArray: ", (Throwable)var8_6);
                    return new e((Map<String, ?>)var1_1);
                    break;
                } while (true);
                catch (Throwable var10_7) {
                    break block24;
                }
                catch (ClassNotFoundException var4_8) {
                    ** GOTO lbl-1000
                }
                catch (IOException var4_9) {}
lbl-1000: // 3 sources:
                {
                    Log.e((String)e.b, (String)"Error in Data#fromByteArray: ", (Throwable)var4_10);
                    if (var3_3 == null) ** GOTO lbl30
                }
                try {
                    var3_3.close();
                }
                catch (IOException var6_18) {
                    Log.e((String)e.b, (String)"Error in Data#fromByteArray: ", (Throwable)var6_18);
                }
                ** while (true)
            }
            var11_12 = var10_7;
            var12_13 = var3_3;
        }
        if (var12_13 != null) {
            try {
                var12_13.close();
            }
            catch (IOException var15_19) {
                Log.e((String)e.b, (String)"Error in Data#fromByteArray: ", (Throwable)var15_19);
            }
        }
        try {
            var2_2.close();
            throw var11_12;
        }
        catch (IOException var13_20) {
            Log.e((String)e.b, (String)"Error in Data#fromByteArray: ", (Throwable)var13_20);
        }
        throw var11_12;
    }

    public String a(String string) {
        Object object = this.a.get((Object)string);
        if (object instanceof String) {
            return (String)object;
        }
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && e.class == object.getClass()) {
            e e2 = (e)object;
            return this.a.equals(e2.a);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode();
    }

    public static final class a {
        public Map<String, Object> a = new HashMap();

        public a a(Map<String, Object> map) {
            for (Map.Entry entry : map.entrySet()) {
                String string = (String)entry.getKey();
                Object object = entry.getValue();
                if (object == null) {
                    this.a.put((Object)string, null);
                    continue;
                }
                Class class_ = object.getClass();
                if (class_ != Boolean.class && class_ != Byte.class && class_ != Integer.class && class_ != Long.class && class_ != Float.class && class_ != Double.class && class_ != String.class && class_ != Boolean[].class && class_ != Byte[].class && class_ != Integer[].class && class_ != Long[].class && class_ != Float[].class && class_ != Double[].class && class_ != String[].class) {
                    if (class_ == boolean[].class) {
                        this.a.put((Object)string, (Object)e.a((boolean[])object));
                        continue;
                    }
                    if (class_ == byte[].class) {
                        this.a.put((Object)string, (Object)e.a((byte[])object));
                        continue;
                    }
                    if (class_ == int[].class) {
                        this.a.put((Object)string, (Object)e.a((int[])object));
                        continue;
                    }
                    if (class_ == long[].class) {
                        this.a.put((Object)string, (Object)e.a((long[])object));
                        continue;
                    }
                    if (class_ == float[].class) {
                        this.a.put((Object)string, (Object)e.a((float[])object));
                        continue;
                    }
                    if (class_ == double[].class) {
                        this.a.put((Object)string, (Object)e.a((double[])object));
                        continue;
                    }
                    throw new IllegalArgumentException(String.format((String)"Key %s has invalid type %s", (Object[])new Object[]{string, class_}));
                }
                this.a.put((Object)string, object);
            }
            return this;
        }

        public e a() {
            e e2 = new e(this.a);
            e.a(e2);
            return e2;
        }
    }

}

