package com.example.tbtekber.DaftarEvent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.tbtekber.R;

public class Event6Activity extends AppCompatActivity {
    LinearLayout expandableView;
    Button arrowBtn,gps6;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event6);
        expandableView = findViewById(R.id.expandableView);
        arrowBtn = findViewById(R.id.arrowBtn);
        cardView = findViewById(R.id.cardView);
        gps6 = findViewById(R.id.gps6);

        gps6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri addressUri = Uri.parse("geo:0,0?q=-0.067819, 109.342499");
                Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
                startActivity(intent);
            }
        });
    }

    public void deskripsi6(View view) {
        if (expandableView.getVisibility() == View.GONE) {
            TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
            expandableView.setVisibility(View.VISIBLE);
            arrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
            expandableView.setVisibility(View.GONE);
            arrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }
}
