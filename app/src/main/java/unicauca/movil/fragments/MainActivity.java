package unicauca.movil.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import unicauca.movil.fragments.fragments.ColorFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        ColorFragment f1 = (ColorFragment) manager.findFragmentById(R.id.f1);
        ColorFragment f2 = (ColorFragment) manager.findFragmentById(R.id.f2);

        f1.setColor(ColorFragment.BLUE);
        f2.setColor(ColorFragment.VIOLET);

    }
}
