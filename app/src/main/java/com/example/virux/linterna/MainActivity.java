package com.example.virux.linterna;


import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Camera camera;
    Button encenderButton;

    Boolean apagado = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encenderButton = (Button) findViewById(R.id.buttonEncender);
        camera = Camera.open();

        encenderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Parameters parameters = camera.getParameters();

                if(apagado){
                    parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                }else{
                    parameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                }
                camera.setParameters(parameters);
                //camera.startPreview();



            }
        });


    }
}
