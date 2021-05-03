package sg.edu.rp.c346.id20046523.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    EditText etInput;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnClick = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput = etInput.getText().toString();
                tvDisplay.setText(userInput);
            }

        }
        );
    }
}