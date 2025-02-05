package com.example.tbtekber.DaftarEvent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tbtekber.Intent.CariEvent2;
import com.example.tbtekber.Intent.CariEvent3;
import com.example.tbtekber.R;

public class Event8Activity extends AppCompatActivity {
    LinearLayout expandableView;
    Button arrowBtn,gps7;
    CardView cardView;
    ImageView arrow;
    TextView textloc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event8);
        expandableView = findViewById(R.id.expandableView);
        arrowBtn = findViewById(R.id.arrowBtn);
        cardView = findViewById(R.id.cardView);
        gps7 = findViewById(R.id.gps7);
        arrow = findViewById(R.id.arrow);
        textloc = findViewById(R.id.textloc);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Event8Activity.this, CariEvent3.class);
                startActivity(intent);
            }
        });
    }

    public void deskripsi8(View view) {
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
