/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.BufferedOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipInputStream
 */
package c.c.a;

import c.a.b.a.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class d {
    public String a;
    public String b;
    public boolean c = false;

    public d(String string, String string2) {
        this.a = string;
        this.b = string2;
        this.a("");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        try {
            ZipInputStream zipInputStream = new ZipInputStream((InputStream)new FileInputStream(this.a));
            do {
                ZipEntry zipEntry;
                int n10;
                if ((zipEntry = zipInputStream.getNextEntry()) == null) {
                    zipInputStream.close();
                    return;
                }
                if (zipEntry.isDirectory()) {
                    this.a(zipEntry.getName());
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.b);
                stringBuilder.append(zipEntry.getName());
                FileOutputStream fileOutputStream = new FileOutputStream(stringBuilder.toString());
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((OutputStream)fileOutputStream);
                byte[] arrby = new byte[1024];
                while ((n10 = zipInputStream.read(arrby)) != -1) {
                    bufferedOutputStream.write(arrby, 0, n10);
                }
                zipInputStream.closeEntry();
                bufferedOutputStream.close();
                fileOutputStream.close();
            } while (true);
        }
        catch (Exception exception) {
            this.c = true;
            return;
        }
    }

    public final void a(String string) {
        File file = new File(a.a(new StringBuilder(), this.b, string));
        if (!file.isDirectory()) {
            file.mkdirs();
        }
    }
}

