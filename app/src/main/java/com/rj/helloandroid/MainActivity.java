package com.rj.helloandroid;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void submitResponce(View b1)
    {
        EditText n1= findViewById(R.id.name);
        EditText p1= findViewById(R.id.phone);
        Log.i("Name", n1.getText().toString());
        Log.i("Phone", p1.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
