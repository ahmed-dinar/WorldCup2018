package com.tesseractinfosys.worldcup2018;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.squareup.leakcanary.LeakCanary;
import com.tesseractinfosys.worldcup2018.data.AppDatabase;
import com.tesseractinfosys.worldcup2018.view.activity.GroupsActivity;
import com.tesseractinfosys.worldcup2018.view.activity.MatchesActivity;
import com.tesseractinfosys.worldcup2018.view.activity.RefereesActivity;
import com.tesseractinfosys.worldcup2018.view.activity.StadiumsActivity;
import com.tesseractinfosys.worldcup2018.view.activity.TableActivity;
import com.tesseractinfosys.worldcup2018.view.activity.TeamsActivity;


public class WorldCupApp extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle aToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        navigationView = (NavigationView) findViewById(R.id.nav_view);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        navigationView.setNavigationItemSelectedListener(this);

        aToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(aToggle);
        aToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item){

        switch (item.getItemId()) {
            case R.id.matches:
                startActivity(new Intent(getApplicationContext(), MatchesActivity.class));
                return true;
            case R.id.teams:
                startActivity(new Intent(getApplicationContext(), TeamsActivity.class));
                return true;
            case R.id.groups:
                startActivity(new Intent(getApplicationContext(), GroupsActivity.class));
                return true;
            case R.id.table:
                startActivity(new Intent(getApplicationContext(), TableActivity.class));
                return true;
            case R.id.stadiums:
                startActivity(new Intent(getApplicationContext(), StadiumsActivity.class));
                return true;
            case R.id.referees:
                startActivity(new Intent(getApplicationContext(), RefereesActivity.class));
                return true;
            /*case R.id.giverate:
                startActivity(new Intent(getApplicationContext(), GroupsActivity.class));
                return true;*/
            default:
                return true;
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if(aToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy(){
        AppDatabase.destroyInstance();
        super.onDestroy();
    }

}




