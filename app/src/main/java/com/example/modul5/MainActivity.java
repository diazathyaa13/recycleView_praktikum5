package com.example.modul5;

import android.annotation.SuppressLint;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
public class MainActivity extends TabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();
        this.setNewTab(this, tabHost, "tab1", "Universitas Kuningan", new Intent(this,
                tab1.class));
        this.setNewTab(this, tabHost, "tab2", "Fakultas Ilmu Komputer", new Intent(this,
                tab2.class));
        this.setNewTab(this, tabHost, "tab3", "Teknik Informatika", new Intent(this,
                tab3.class));
    }
    @SuppressLint("UseCompatLoadingForDrawables")
    private void setNewTab(Context context, TabHost tabHost, String tag, String title, Intent intentid){
        TabSpec tabSpec = tabHost.newTabSpec(tag);
        tabSpec.setIndicator(title, context.getResources().getDrawable(R.drawable.ic_launcher_background));
        tabSpec.setContent(intentid);
        tabHost.addTab(tabSpec);
    }
}