package unicauca.movil.fragments;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import unicauca.movil.fragments.adapters.ColorAdapter;
import unicauca.movil.fragments.databinding.ActivityTabsBinding;
import unicauca.movil.fragments.fragments.ColorFragment;

public class TabsActivity extends AppCompatActivity {

    ActivityTabsBinding binding;
    ColorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_tabs);

        setSupportActionBar(binding.toolbar);

        List<Fragment> data = new ArrayList<>();
        data.add(ColorFragment.instance(ColorFragment.BLUE));
        data.add(ColorFragment.instance(ColorFragment.RED));
        data.add(ColorFragment.instance(ColorFragment.YELLOW));
        data.add(ColorFragment.instance(ColorFragment.GREEN));
        data.add(ColorFragment.instance(ColorFragment.ORANGE));
        data.add(ColorFragment.instance(ColorFragment.VIOLET));

        adapter = new ColorAdapter(getSupportFragmentManager(), data);
        binding.pager.setAdapter(adapter);

        binding.tabs.setupWithViewPager(binding.pager);

    }
}
