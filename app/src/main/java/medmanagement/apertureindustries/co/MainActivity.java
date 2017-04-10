package medmanagement.apertureindustries.co;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static medmanagement.apertureindustries.co.R.id.b_submit;
import static medmanagement.apertureindustries.co.R.id.cb_Option_1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        final CheckBox cb_Option_1 = (CheckBox) findViewById(R.id.cb_Option_1);
        final CheckBox cb_Option_2 = (CheckBox) findViewById(R.id.cb_Option_2);
        final TextView txt_Option = (TextView)  findViewById(R.id.txt_Option);

        Button b_submit = (Button) findViewById(R.id.b_submit);
        b_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb_Option_1.isChecked()) {
                    txt_Option.setText("Option 1");

                     //                   Log.e(MainActivity.class.getSimpleName(), "Option 1");
                } else
                {
                    startActivity(new Intent(MainActivity.this,SnazzyActivity.class));
                    //txt_Option.setText("Option 2");
 //                   Log.e(MainActivity.class.getSimpleName(), "Option 2");
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
