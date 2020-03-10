package com.example.drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var toggle:ActionBarDrawerToggle
    lateinit var tbToolbar:Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
tbToolbar=findViewById(R.id.tlbHome)
        setSupportActionBar(tbToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toggle= ActionBarDrawerToggle(this,drlHome,R.string.open,R.string.close)
        drlHome.setDrawerListener(toggle)
        toggle.syncState()

    }
}
