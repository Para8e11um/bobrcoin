package com.para8.d3bober;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int bobrcoin = 0;
    TextView textBottom;
    TextView textUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textBottom = findViewById(R.id.textBottom);
        textUp = findViewById(R.id.textUp);
    }

    public void tapBober(View view) {
        bobrcoin += 1;
        textBottom.setText("BOBRCOIN: "+bobrcoin);
        if(bobrcoin==10){
            textUp.setText("Хорошо тапаешь");
        }
    }
}