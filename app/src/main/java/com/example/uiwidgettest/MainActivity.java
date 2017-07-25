package com.example.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private ImageView imgaView;
    private ProgressBar progessBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        imgaView = (ImageView) findViewById(R.id.imageView);
        progessBar = (ProgressBar)findViewById(R.id.progressBar);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                //editText控件实验代码
                //String inputText = editText.getText().toString();
                //Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
                //imageView控件实验代码
                //imgaView.setImageResource(R.drawable.img_2);
                //ProgressBar控件可见性实验代码
//                if(progessBar.getVisibility() == View.GONE){
//                    progessBar.setVisibility(View.VISIBLE);
//                }else {
//                    progessBar.setVisibility(View.GONE);
//                }
                //ProgressBar控件样式修改实验代码
                int progress = progessBar.getProgress();
                progress = progress + 10;
                progessBar.setProgress(progress);
                break;
            default:
                break;
        }
    }


}
