package id.sch.smktelkom_mlg.learn.intent1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String NAMA = "Nama ";
    public static final String UMUR = "Umur ";
    EditText etnama;
    EditText etumur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Input Data");
        etnama = (EditText) findViewById(R.id.editText);
        etumur = (EditText) findViewById(R.id.editText2);
        findViewById(R.id.buttonHitung).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHasil();
            }
        });

    }

    private void goHasil() {
        String nama = etnama.getText().toString();
        String umurstr = etumur.getText().toString();

        int umur = umurstr.isEmpty() ? 0 : Integer.parseInt(umurstr);

        Intent intent = new Intent(MainActivity.this, hasilactivity.class);
        intent.putExtra(NAMA, nama);
        intent.putExtra(UMUR, umur);
        startActivity(intent);
    }

}