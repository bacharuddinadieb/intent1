package id.sch.smktelkom_mlg.learn.intent1;

import android.annotation.TargetApi;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class hasilactivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilactivity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String nama = getIntent().getStringExtra(MainActivity.NAMA);
        int umur = getIntent().getIntExtra(MainActivity.UMUR, 0);

        int yearnow = Calendar.getInstance().get(Calendar.YEAR);
        int tahunlahir = yearnow - umur;

        TextView tvhasil = (TextView) findViewById(R.id.textviewhasil);
        tvhasil.setText(nama + " lahir pada tahun " + tahunlahir);

        setTitle("Hasil");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
