package com.rj.helloandroid;

        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void submitResponce(View b1)
    {
        EditText n1= findViewById(R.id.name);
        EditText p1= findViewById(R.id.phone);
//        Log.i("Name", n1.getText().toString());
//        Log.i("Phone", p1.getText().toString());
        Toast.makeText(MainActivity.this,"Your Name is " + n1.getText().toString() + "\nYour Enrollment No. is " + p1.getText().toString(),Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
