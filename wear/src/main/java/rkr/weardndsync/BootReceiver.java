package rkr.weardndsync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        intent= new Intent(context, SettingsService.class);
        context.startService(intent);
    }
}
