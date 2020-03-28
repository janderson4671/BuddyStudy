package com.example.buddystudy.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.buddystudy.Fragments.EditStudySetsFragment;
import com.example.buddystudy.Fragments.SettingsFragment;
import com.example.buddystudy.Fragments.StartFragment;
import com.example.buddystudy.Fragments.StartStudyFragment;
import com.example.buddystudy.R;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //Fragments
    private StartFragment mStartFragment;
    private EditStudySetsFragment mEditStudySetsFragment;
    private StartStudyFragment mStartStudyFragment;
    private SettingsFragment mSettingsFragment;

    //Fragment Manager
    private FragmentManager fm;

    //widgets
    private BottomNavigationView mBottomMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get Support Fragment Manager
        fm = getSupportFragmentManager();

        //Find all fragments
        FindFragments(fm);

        //Wire up widgets
        mBottomMenu = findViewById(R.id.main_menu_bottom);

        //set Listeners
        setListeners();

        //Start with the Start Fragment
        fm.beginTransaction()
                .add(R.id.fragment_container, mStartFragment)
                .commit();

    }

    private void setListeners() {

        mBottomMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_button_bottom_menu:
                        switchToStartFrag();
                        return true;

                    case R.id.start_study_menu_button:
                        switchToStudyGameFrag();
                        return true;

                    case R.id.edit_sets_menu_button:
                        switchToEditStudySetFrag();
                        return true;

                    case R.id.settings_menu_button:
                        switchToSettingsFrag();
                        return true;
                }
                return true;
            }

        });

    }

    //Function that finds all necessary fragments for activity
    private void FindFragments(FragmentManager fm) {

        mStartFragment = (StartFragment) fm.findFragmentById(R.id.fragment_container);
        if (mStartFragment == null) {
            mStartFragment = StartFragment.newInstance();
        }

        mEditStudySetsFragment = (EditStudySetsFragment) fm.findFragmentById(R.id.fragment_container);
        if (mEditStudySetsFragment == null) {
            mEditStudySetsFragment = EditStudySetsFragment.newInstance();
        }

        mStartStudyFragment = (StartStudyFragment) fm.findFragmentById(R.id.fragment_container);
        if (mStartStudyFragment == null) {
            mStartStudyFragment = StartStudyFragment.newInstance();
        }

        mSettingsFragment = (SettingsFragment) fm.findFragmentById(R.id.fragment_container);
        if (mSettingsFragment == null) {
            mSettingsFragment = SettingsFragment.newInstance();
        }

    }

    public void switchToEditStudySetFrag() {
        fm.beginTransaction().replace(R.id.fragment_container, mEditStudySetsFragment).commit();
    }

    public void switchToStudyGameFrag() {
        fm.beginTransaction().replace(R.id.fragment_container, mStartStudyFragment).commit();
    }

    public void switchToSettingsFrag() {
        fm.beginTransaction().replace(R.id.fragment_container, mSettingsFragment).commit();
    }

    public void switchToStartFrag() {
        fm.beginTransaction().replace(R.id.fragment_container, mStartFragment).commit();
    }
}
