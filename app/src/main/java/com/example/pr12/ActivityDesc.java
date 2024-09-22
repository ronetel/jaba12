package com.example.pr12;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityDesc extends AppCompatActivity {

    public static final String EXTRA_STATE_NAME = "state_name";
    public static final String EXTRA_STATE_CAPITAL = "state_capital";
    public static final String EXTRA_STATE_FLAG = "state_flag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        TextView nameTextView = findViewById(R.id.detailNameTextView);
        TextView capitalTextView = findViewById(R.id.detailCapitalTextView);
        ImageView flagImageView = findViewById(R.id.detailFlagImageView);

        String stateName = getIntent().getStringExtra(EXTRA_STATE_NAME);
        String stateCapital = getIntent().getStringExtra(EXTRA_STATE_CAPITAL);
        int stateFlag = getIntent().getIntExtra(EXTRA_STATE_FLAG, 0);

        nameTextView.setText(stateName);
        capitalTextView.setText(stateCapital);
        flagImageView.setImageResource(stateFlag);
    }
}
