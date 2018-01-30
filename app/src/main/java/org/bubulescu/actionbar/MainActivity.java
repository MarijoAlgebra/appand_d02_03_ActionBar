package org.bubulescu.actionbar;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnShowHide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowHide = findViewById(R.id.btnShowhide);
        btnShowHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ActionBar actionBar = getSupportActionBar();
                if (actionBar.isShowing()) {
                    actionBar.hide();
                } else {
                    actionBar.show();
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.abPhonelink:
                Toast.makeText(this, "PhoneLink", Toast.LENGTH_SHORT).show();
                break;

            case R.id.abComposite:
                Toast.makeText(this, "Composite", Toast.LENGTH_SHORT).show();
                break;

            case R.id.abHdmi:
                Toast.makeText(this, "HDMI", Toast.LENGTH_SHORT).show();
                break;

            case R.id.abOverscan:
                Toast.makeText(this, "Overscan", Toast.LENGTH_SHORT).show();
                break;

            case R.id.abShare:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
