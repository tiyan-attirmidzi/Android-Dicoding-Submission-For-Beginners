package com.example.mealscatalogue;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView food_name = findViewById(R.id.food_name);
        ImageView food_image = findViewById(R.id.food_image);
        TextView food_desc = findViewById(R.id.food_desc);

        Uri image = Uri.parse(this.getIntent().getExtras().getString("image"));
        String desc = this.getIntent().getExtras().getString("desc");
        String name = this.getIntent().getExtras().getString("name");

        food_name.setText(name);
        food_desc.setText(desc);
        Glide.with(getApplicationContext()).load(image).into(food_image);


    }
}
