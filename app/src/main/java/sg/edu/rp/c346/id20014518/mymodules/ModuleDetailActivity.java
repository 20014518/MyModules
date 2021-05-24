package sg.edu.rp.c346.id20014518.mymodules;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Intent i = getIntent();
        String moduleSelected = i.getStringExtra("Module");

        textView = findViewById(R.id.textView);
        if (moduleSelected.equalsIgnoreCase("C203")){
            textView.setText("Module Code: C203 \nModule name: Web Appln Development in php \nAcademic Year: 2021 \nSemester: 1 \nModule Credit: 4 \nVenue: W67L");
        }
        else if(moduleSelected.equalsIgnoreCase("C228")){
            textView.setText("Module Code: C228 \nModule name: Operation Systems Security \nAcademic Year: 2021 \nSemester: 1 \nModule Credit: 4 \nVenue: E62L");
        }
        else if(moduleSelected.equalsIgnoreCase("C328")){
            textView.setText("Module Code: C328 \nModule name: Intelligent Networks \nAcademic Year: 2021 \nSemester: 1 \nModule Credit: 4 \nVenue: E62C");
        }
        else if(moduleSelected.equalsIgnoreCase("C331")){
            textView.setText("Module Code: C331 \nModule name: Digital Security and Forensics \nAcademic Year: 2021 \nSemester: 1 \nModule Credit: 4 \nVenue: E61J");
        }
        else if(moduleSelected.equalsIgnoreCase("C346")) {
            textView.setText("Module Code: C346 \nModule name: Mobile App Development \nAcademic Year: 2021 \nSemester: 1 \nModule Credit: 4 \nVenue: E62E");
        }
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}