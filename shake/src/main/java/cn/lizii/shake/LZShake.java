package cn.lizii.shake;

import android.content.Context;
import android.os.Vibrator;

public class LZShake {
    public String getVersion(){
        return "--";
    }

    public void shake(Context context,int timeMs){
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(timeMs);
    }

    public void shake(Context context,long [] times,int repeat){
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(times,repeat);
    }
}
