    package app.roque.com.componentsui.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import app.roque.com.componentsui.R;
import app.roque.com.componentsui.scroll_view_vertical.ScrollViewVerticalActivity;

    public class NotificationActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_notification);
        }

        public void showNotification(View view){

            Intent intent = new Intent(this, ScrollViewVerticalActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);

            // Notification
            Notification notification = new NotificationCompat.Builder(this)
                    .setContentTitle("Nueva Notificacion")
                    .setContentText("Some Content...")
                    .setSmallIcon(R.mipmap.ic_launcher_round)
                    .setColor(ContextCompat.getColor(this, R.color.colorPrimary))
                    .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                    .setContentIntent(pendingIntent)
                    .setAutoCancel(true)
                    .build();

            // Notification manager
            NotificationManager notificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.notify(0, notification);

        }

    }
