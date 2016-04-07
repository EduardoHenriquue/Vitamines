package com.eduardo.android.vitamines;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.eduardo.android.vitamines.Fragments.FragmentVitaminaA;
import com.eduardo.android.vitamines.Fragments.FragmentVitaminaB;
import com.eduardo.android.vitamines.Fragments.FragmentVitaminaC;
import com.eduardo.android.vitamines.Fragments.FragmentVitaminaD;
import com.eduardo.android.vitamines.Fragments.FragmentVitaminaE;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getViewId();


    }

    public void getViewId(){
        this.toolbar = (Toolbar)findViewById(R.id.toolbar_vitamines);
        setSupportActionBar(this.toolbar);
        this.viewPager = (ViewPager)findViewById(R.id.view_pager_vitamines);
        setupViewPager(this.viewPager);
        this.tabLayout = (TabLayout)findViewById(R.id.tabs_vitamines);
        this.tabLayout.setupWithViewPager(this.viewPager);
        /*
        this.spinner = (Spinner)findViewById(R.id.spinner_fontes);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.fontes_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spinner.setAdapter(adapter);
        */

    }

    public void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentVitaminaA(), getResources().getString(R.string.text_vitamina_a));
        adapter.addFragment(new FragmentVitaminaB(), getResources().getString(R.string.text_vitamina_b));
        adapter.addFragment(new FragmentVitaminaC(), getResources().getString(R.string.text_vitamina_c));
        adapter.addFragment(new FragmentVitaminaD(), getResources().getString(R.string.text_vitamina_d));
        adapter.addFragment(new FragmentVitaminaE(), getResources().getString(R.string.text_vitamina_e));
        viewPager.setAdapter(adapter);
    }

}
