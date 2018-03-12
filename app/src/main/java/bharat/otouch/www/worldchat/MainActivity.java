package bharat.otouch.www.worldchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 private Button mgochat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mgochat = (Button) findViewById(R.id.gochat);

        mgochat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent di = new Intent(MainActivity.this, Chat.class);
                startActivity(di);
            }
        });
    }
}
