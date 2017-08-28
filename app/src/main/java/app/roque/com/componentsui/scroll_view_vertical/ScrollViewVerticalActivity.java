package app.roque.com.componentsui.scroll_view_vertical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.roque.com.componentsui.R;
import app.roque.com.componentsui.android_button.AndroidButtonActivity;
import app.roque.com.componentsui.calendar_view.CalendarViewActivity;
import app.roque.com.componentsui.check_box.CheckBoxActivity;
import app.roque.com.componentsui.custom_alert_dialog.CustomAlertDialogActivity;
import app.roque.com.componentsui.date_picker.DatePickerActivity;
import app.roque.com.componentsui.edit_text.EditTextActivity;
import app.roque.com.componentsui.floating_action_button.FloatingActionButtonActivity;
import app.roque.com.componentsui.floating_labels.FloatingLabelsActivity;
import app.roque.com.componentsui.image_view.ImageViewActivity;
import app.roque.com.componentsui.imagen_button.ImageButtonActivity;
import app.roque.com.componentsui.notification.NotificationActivity;
import app.roque.com.componentsui.progress_bar.ProgressBarActivity;
import app.roque.com.componentsui.radio_button.RadioButtonActivity;
import app.roque.com.componentsui.rating_bar.RatingBarActivity;
import app.roque.com.componentsui.scroll_view_horizontal.ScrollViewHorizontalActivity;
import app.roque.com.componentsui.search_view.SearchViewActivity;
import app.roque.com.componentsui.seek_bar.SeekBarActivity;
import app.roque.com.componentsui.simple_dialog.SimpleDialogActivity;
import app.roque.com.componentsui.snack_bar.SnackbarActivity;
import app.roque.com.componentsui.spinner.SpinnerActivity;
import app.roque.com.componentsui.switch_button.SwitchButtonActivity;
import app.roque.com.componentsui.time_picker.TimePickerActivity;
import app.roque.com.componentsui.toggle_button.ToggleButtonActivity;
import app.roque.com.componentsui.video_view.VideoViewActivity;
import app.roque.com.componentsui.web_view.WebViewActivity;

public class ScrollViewVerticalActivity extends AppCompatActivity {

    Button btnScrollH, btnAButton, btnImageButton, btnEditText, btnCheckBox, btnRadioButton,
            btnSwitchButton, btnToggleButton, btnRatingBar, btnSpinner, btnProgressBar, btnDatePicker,
            btnTimePicker, btnFlotingButton, btnFlotingLabel, btnSeekBar, btnSimpleDialog, btnCustomDialog,
            btnSnackBar, btnNotification, btnImageView, btnVideoView, btnWebView, btnSearchView, btnCalendarView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_vertical);

        btnScrollH = (Button)findViewById(R.id.btnScrollH);
        btnAButton = (Button)findViewById(R.id.btnAButton);
        btnImageButton = (Button)findViewById(R.id.btnImageButton);
        btnEditText = (Button)findViewById(R.id.btnEditText);
        btnCheckBox = (Button)findViewById(R.id.btnCheckBox);
        btnRadioButton = (Button)findViewById(R.id.btnRadioButton);
        btnSwitchButton = (Button)findViewById(R.id.btnSwitchButton);
        btnToggleButton = (Button)findViewById(R.id.btnToggleButton);
        btnRatingBar = (Button)findViewById(R.id.btnRatingBar);
        btnSpinner = (Button)findViewById(R.id.btnSpinner);
        btnProgressBar = (Button)findViewById(R.id.btnProgressBar);
        btnDatePicker = (Button)findViewById(R.id.btnDatePicker);
        btnTimePicker = (Button)findViewById(R.id.btnTimePicker);
        btnFlotingButton = (Button)findViewById(R.id.btnFloatingButton);
        btnFlotingLabel = (Button)findViewById(R.id.btnFloatingLabel);
        btnSeekBar = (Button)findViewById(R.id.btnSeekBar);
        btnSimpleDialog = (Button)findViewById(R.id.btnSimpleDialog);
        btnCustomDialog = (Button)findViewById(R.id.btnCustomDialog);
        btnSnackBar = (Button)findViewById(R.id.btnSnackBar);
        btnNotification = (Button)findViewById(R.id.btnNotification);
        btnImageView = (Button)findViewById(R.id.btnImageView);
        btnVideoView = (Button)findViewById(R.id.btnVideoView);
        btnWebView = (Button)findViewById(R.id.btnWebView);
        btnSearchView = (Button)findViewById(R.id.btnSearchView);
        btnCalendarView = (Button)findViewById(R.id.btnCalendarView);

        btnCalendarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, CalendarViewActivity.class);
                startActivity(intent);
            }
        });

        btnSearchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, SearchViewActivity.class);
                startActivity(intent);
            }
        });

        btnWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

        btnVideoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, VideoViewActivity.class);
                startActivity(intent);
            }
        });

        btnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, ImageViewActivity.class);
                startActivity(intent);
            }
        });

        btnNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });

        btnScrollH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, ScrollViewHorizontalActivity.class);
                startActivity(intent);
            }
        });

        btnAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, AndroidButtonActivity.class);
                startActivity(intent);
            }
        });

        btnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, ImageButtonActivity.class);
                startActivity(intent);
            }
        });

        btnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, EditTextActivity.class);
                startActivity(intent);
            }
        });

        btnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, CheckBoxActivity.class);
                startActivity(intent);
            }
        });

        btnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, RadioButtonActivity.class);
                startActivity(intent);
            }
        });

        btnSwitchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, SwitchButtonActivity.class);
                startActivity(intent);
            }
        });

        btnToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, ToggleButtonActivity.class);
                startActivity(intent);
            }
        });

        btnRatingBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, RatingBarActivity.class);
                startActivity(intent);
            }
        });

        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, SpinnerActivity.class);
                startActivity(intent);
            }
        });

        btnProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, ProgressBarActivity.class);
                startActivity(intent);
            }
        });

        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, DatePickerActivity.class);
                startActivity(intent);
            }
        });

        btnTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, TimePickerActivity.class);
                startActivity(intent);
            }
        });

        btnFlotingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, FloatingActionButtonActivity.class);
                startActivity(intent);
            }
        });

        btnFlotingLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, FloatingLabelsActivity.class);
                startActivity(intent);
            }
        });

        btnSeekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, SeekBarActivity.class);
                startActivity(intent);
            }
        });

        btnSimpleDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, SimpleDialogActivity.class);
                startActivity(intent);
            }
        });

        btnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, CustomAlertDialogActivity.class);
                startActivity(intent);
            }
        });

        btnSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollViewVerticalActivity.this, SnackbarActivity.class);
                startActivity(intent);
            }
        });
    }
}
