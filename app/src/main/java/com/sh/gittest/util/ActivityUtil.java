package com.sh.gittest.util;

import android.content.Context;
import android.content.Intent;

import com.sh.gittest.Main2Activity;
import com.sh.gittest.Main3Activity;

public class ActivityUtil {

    public static void toMain2Activity(Context context) {
        Intent intent = new Intent(context, Main2Activity.class);
        context.startActivity(intent);
    }

    public static void toMain3Activity(Context context) {
        Intent intent = new Intent(context, Main3Activity.class);
        context.startActivity(intent);
    }
}
