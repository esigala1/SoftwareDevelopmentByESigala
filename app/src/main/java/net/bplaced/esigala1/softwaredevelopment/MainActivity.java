package net.bplaced.esigala1.softwaredevelopment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Retrieve the widgets from the UI and set the movement method.
        // "LinkMovementMethod" => A movement method that traverses links
        // in the text buffer and scrolls if necessary.
        ((TextView) findViewById(R.id.text_view_webpage)).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) findViewById(R.id.text_view_facebook)).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) findViewById(R.id.text_view_location)).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
