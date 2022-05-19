package sg.edu.rp.c346.id21001096.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAnswer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tvAnswer3 = findViewById(R.id.tvAnswer3);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("Double", 99.9);
        tvAnswer3.setText("Double Value received is: " + value);
    }
}