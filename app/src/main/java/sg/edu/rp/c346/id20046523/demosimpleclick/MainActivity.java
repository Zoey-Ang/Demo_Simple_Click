package sg.edu.rp.c346.id20046523.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //step 1: Declare the field variables
    Button btnClick;
    EditText etInput;
    TextView tvDisplay;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 2: connecting the variables to the respective UI elements
        //variable name              //ID of the UI element
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnClick = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.radioGroupGender);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput = etInput.getText().toString();
                tvDisplay.setText(userInput);

                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderFemale)
                {
                    stringResponse = "She says " + stringResponse;
                }
                else
                {
                    stringResponse = "He says " + stringResponse;
                }
                tvDisplay.setText(stringResponse);
            }

        }
        );

        tbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if(tbtn.isChecked())
                {
                    etInput.setEnabled(true);
                }
                else
                {
                    etInput.setEnabled(false);
                }

                /*
                one line code that will also have the same function
                etInput.setEnabled(tbtn.isChecked());
                 */
            }
        });
    }
}