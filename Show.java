package com.example.noshi.loginapp;


        import android.content.Context;
        import android.content.SharedPreferences;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class Show extends AppCompatActivity {

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        SharedPreferences settings = getSharedPreferences("MYPREFS", Context.MODE_PRIVATE);
        username = settings.getString("UserName", "");
        TextView tv=(TextView)findViewById(R.id.txt2welcome);
        tv.setText(username);





    }
}
