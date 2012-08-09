package com.alimuzaffar.powernap.receiver;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;

import com.alimuzaffar.powernap.R;
import com.alimuzaffar.powernap.activity.PowerSleeperActivity;

public class PowerSleeperWidgetProvider extends AppWidgetProvider {
	
	

    @Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		super.onReceive(context, intent);
		Toast.makeText(context, "on receiver", Toast.LENGTH_SHORT).show();
	}

	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        final int N = appWidgetIds.length;

        Toast.makeText(context, "Widget "+N+" Clicked", Toast.LENGTH_SHORT).show();
//        // Perform this loop procedure for each App Widget that belongs to this provider
        for (int i=0; i<N; i++) {
            int appWidgetId = appWidgetIds[i];



            // Get the layout for the App Widget and attach an on-click listener
            // to the button
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_powersleep_layout);
            
            // Create an Intent to launch ExampleActivity
            Intent intent = new Intent(context, PowerSleeperActivity.class);
            intent.setAction("1");
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
            views.setOnClickPendingIntent(R.id.first, pendingIntent);
            
            // Create an Intent to launch ExampleActivity
            intent.setAction("2");
            pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
            views.setOnClickPendingIntent(R.id.second, pendingIntent);
            
            intent.setAction("3");
            pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            PendingIntent pendingIntent3 = PendingIntent.getActivity(context, 0, intent, 0);
            views.setOnClickPendingIntent(R.id.third, pendingIntent3);
            
            intent.setAction("4");
            pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            PendingIntent pendingIntent4 = PendingIntent.getActivity(context, 0, intent, 0);
            views.setOnClickPendingIntent(R.id.fourth, pendingIntent4);

            // Tell the AppWidgetManager to perform an update on the current app widget
            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }
    
}
