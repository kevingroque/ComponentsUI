package app.roque.com.componentsui.check_box;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import app.roque.com.componentsui.R;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        checkBox = (CheckBox) findViewById(R.id.checkBox);

        // Setting check to specific checkbox
        checkBox.setChecked(true);

        if(checkBox.isChecked())
            Toast.makeText(this, "First checkbox is checked!", Toast.LENGTH_LONG).show();

    }

    public void androidCheckBoxClicked(View view) {
        // action for checkbox click
        switch (view.getId()) {
            case R.id.checkBox:
                CheckBox checkBox = (CheckBox) view;
                if(checkBox.isChecked())
                    Toast.makeText(this, checkBox.getText() + " selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox2:
                CheckBox checkBox2 = (CheckBox) view;
                if(checkBox2.isChecked())
                    Toast.makeText(this, checkBox2.getText() + " selected!", Toast.LENGTH_LONG).show();
                //DO something when user check the box
                break;
            case R.id.checkBox3:
                //DO something when user check the box
                break;
            case R.id.checkBox4:
                //DO something when user check the box
                break;
            case R.id.checkBox5:
                //DO something when user check the box
                break;
            case R.id.checkBox6:
                //DO something when user check the box
                break;
            case R.id.checkBox7:
                //DO something when user check the box
                break;
            case R.id.checkBox8:
                //DO something when user check the box
                break;
            case R.id.checkBox9:
                //DO something when user check the box
                break;
        }
    }
}
