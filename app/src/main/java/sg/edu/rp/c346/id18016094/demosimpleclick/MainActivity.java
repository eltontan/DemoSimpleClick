package sg.edu.rp.c346.id18016094.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgbutt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tgbutt = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });
        if (tgbutt.isChecked()) {
            etInput.setEnabled(true);
        } else {
            etInput.setEnabled(false);
        }
    }
}
