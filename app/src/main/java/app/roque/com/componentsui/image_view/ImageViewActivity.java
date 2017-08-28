package app.roque.com.componentsui.image_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import app.roque.com.componentsui.R;

public class ImageViewActivity extends AppCompatActivity {

    private int[] photos = {
            R.drawable.bg_imgview1,
            R.drawable.bg_imgview2,
            R.drawable.bg_imgview3,
    };
    private int index = 0;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        imageView = (ImageView)findViewById(R.id.imageview);
    }

    public void nextImage(View view) {
        if(++index > photos.length-1)
            index = 0;
        imageView.setImageResource(photos[index]);
    }
    public void previousImage(View view) {
        if(--index < 0)
            index = photos.length-1;
        imageView.setImageResource(photos[index]);
    }

}
