package com.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public  static  final  String TAG="MainActivity";
  TextDoubleView  textDoubleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textDoubleView= (TextDoubleView) findViewById(R.id.textDoubleView);
        textDoubleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        textDoubleView.setOnDoubleTapListener(new TextDoubleView.OnDoubleTapListener() {
            @Override
            public void onDoubleTap(TextDoubleView myButton) {
                Toast.makeText(getApplication(),"双击了",Toast.LENGTH_LONG).show();
            }
        });
    }
}
