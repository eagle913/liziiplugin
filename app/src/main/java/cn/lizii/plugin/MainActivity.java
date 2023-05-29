package cn.lizii.plugin;

import cn.lizii.shake.LZShake;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    LZShake shake ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shake = new LZShake(this);
        shake.startShake();
    }
}