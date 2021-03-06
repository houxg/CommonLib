package org.houxg.pixiurss.utils.toolbox;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharedPreferences相关
 * <br>
 * author: houxg
 * <br>
 * create on 2015/6/25
 **/
public class SharedPreferencesTool {

    public static SharedPreferences getSharedPreferences(Context ctx, String name) {
        return ctx.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    public static void clear(Context ctx, String name) {
        getSharedPreferences(ctx, name).edit().clear().commit();
    }

    public static void write(Context ctx, String name, String key, String val) {
        getSharedPreferences(ctx, name).edit().putString(key, val).commit();
    }

    public static void write(Context ctx, String name, String key, boolean val) {
        getSharedPreferences(ctx, name).edit().putBoolean(key, val).commit();
    }

    public static void write(Context ctx, String name, String key, int val) {
        getSharedPreferences(ctx, name).edit().putInt(key, val).commit();
    }

    public static void write(Context ctx, String name, String key, long val) {
        getSharedPreferences(ctx, name).edit().putLong(key, val).commit();
    }

    public static String read(Context ctx, String name, String key, String def) {
        return getSharedPreferences(ctx, name).getString(key, def);
    }

    public static boolean read(Context ctx, String name, String key, boolean def) {
        return getSharedPreferences(ctx, name).getBoolean(key, def);
    }

    public static int read(Context ctx, String name, String key, int def) {
        return getSharedPreferences(ctx, name).getInt(key, def);
    }

    public static long read(Context ctx, String name, String key, long def) {
        return getSharedPreferences(ctx, name).getLong(key, def);
    }

}
