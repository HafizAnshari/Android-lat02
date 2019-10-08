package poliban.ac.id.mi.hafiz.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btKrisna = findViewById(R.id.btKrisna);
        Button btBisma = findViewById(R.id.btBisma);
        Button btBasudewa = findViewById(R.id.btBasudewa);


        btKrisna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I,m Krisna, Advisor of Arjuna", Toast.LENGTH_SHORT).show();
            }
        });
        btBisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I,m Bisma Dewa Bharata, the godfather of Hastina", Toast.LENGTH_SHORT).show();

            }
        });
        btBasudewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I,m Basudewa, The Brother Of krisna", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
