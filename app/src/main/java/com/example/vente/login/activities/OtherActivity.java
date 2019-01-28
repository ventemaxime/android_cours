package com.example.vente.login.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.vente.login.common.Friend;
import com.example.vente.login.R;
import com.example.vente.login.fragments.ChallengeFragment;
import com.example.vente.login.fragments.SensorFragment;
import com.google.gson.JsonArray;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.util.ArrayList;


/**
 * Created by vente on 07/12/2018.
 */

public class OtherActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static Friend me;
    public static ArrayList<Friend> friends;
    public ActionBarDrawerToggle toggle;
    public FragmentManager fm;
    public DrawerLayout drawer;
    public NavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        drawer = findViewById(R.id.drawer);
        nav = findViewById(R.id.nav_view);
        fm = getSupportFragmentManager();
        View header = nav.getHeaderView(0);

        nav.setNavigationItemSelectedListener(this);
        nav.getMenu().performIdentifierAction(R.id.nav_first, 0);

        toggle = new ActionBarDrawerToggle(this, drawer, R.string.open, R.string.close);

        drawer.setDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        me = (Friend) b.getSerializable("moi");
        String p = me.getPrenom();
        String n = me.getNom();
        TextView t = header.findViewById(R.id.nameTV);
        t.setText(p + " " + n);
        getRemoteFriends();
       // Log.d("test", friends.toString());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return toggle.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.nav_first: drawer.closeDrawers(); break;
            case R.id.nav_second: fm.beginTransaction().replace(R.id.contentFL, new ChallengeFragment()).commit(); drawer.closeDrawers(); break;
            case R.id.nav_third: fm.beginTransaction().replace(R.id.contentFL, new SensorFragment()).commit(); drawer.closeDrawers(); break;
            case R.id.nav_fourth: drawer.closeDrawers(); break;
            case R.id.nav_fifth: drawer.closeDrawers(); break;
        }
        return false;
    }

    public void getRemoteFriends(){
        String urlString = "http://172.30.46.136/iot-server/api/getFriends.php?key=iot1235";
        Ion.with(this).load(urlString).asString().setCallback(new FutureCallback<String>() {
            @Override
            public void onCompleted(Exception e, String result) {
                friends = Friend.getListOfFriendsFromJson(result);
                Log.d("test", friends.toString());
            }
        });
    }
}
