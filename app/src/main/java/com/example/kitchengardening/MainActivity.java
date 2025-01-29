package com.example.kitchengardening;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaring all the blocks and their corresponding details views
    private LinearLayout block1, block2, block3, block4, block5, block6, block7, block8, block9, block10, block11, block12;
    private TextView title1, title2, title3, title4, title5, title6, title7, title8, title9, title10, title11, title12;
    private TextView details1, details2, details3, details4, details5, details6, details7, details8, details9, details10, details11, details12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        block1 = findViewById(R.id.block1);
        block2 = findViewById(R.id.block2);
        block3 = findViewById(R.id.block3);
        block4 = findViewById(R.id.block4);
        block5 = findViewById(R.id.block5);
        block6 = findViewById(R.id.block6);
        block7 = findViewById(R.id.block7);
        block8 = findViewById(R.id.block8);
        block9 = findViewById(R.id.block9);
        block10 = findViewById(R.id.block10);
        block11 = findViewById(R.id.block11);
        block12 = findViewById(R.id.block12);

        title1 = findViewById(R.id.title1);
        title2 = findViewById(R.id.title2);
        title3 = findViewById(R.id.title3);
        title4 = findViewById(R.id.title4);
        title5 = findViewById(R.id.title5);
        title6 = findViewById(R.id.title6);
        title7 = findViewById(R.id.title7);
        title8 = findViewById(R.id.title8);
        title9 = findViewById(R.id.title9);
        title10 = findViewById(R.id.title10);
        title11 = findViewById(R.id.title11);
        title12 = findViewById(R.id.title12);

        details1 = findViewById(R.id.details1);
        details2 = findViewById(R.id.details2);
        details3 = findViewById(R.id.details3);
        details4 = findViewById(R.id.details4);
        details5 = findViewById(R.id.details5);
        details6 = findViewById(R.id.details6);
        details7 = findViewById(R.id.details7);
        details8 = findViewById(R.id.details8);
        details9 = findViewById(R.id.details9);
        details10 = findViewById(R.id.details10);
        details11 = findViewById(R.id.details11);
        details12 = findViewById(R.id.details12);
        setOnClickListener(title1, details1);
        setOnClickListener(title2, details2);
        setOnClickListener(title3, details3);
        setOnClickListener(title4, details4);
        setOnClickListener(title5, details5);
        setOnClickListener(title6, details6);
        setOnClickListener(title7, details7);
        setOnClickListener(title8, details8);
        setOnClickListener(title9, details9);
        setOnClickListener(title10, details10);
        setOnClickListener(title11, details11);
        setOnClickListener(title12, details12);
    }
    private void setOnClickListener(final TextView title, final TextView details) {
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (details.getVisibility() == View.GONE) {
                    details.setVisibility(View.VISIBLE);
                } else {
                    details.setVisibility(View.GONE);
                }
            }
        });
    }
}
