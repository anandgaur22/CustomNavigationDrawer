package com.anand.customnavigation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import com.anand.customnavigation.databinding.ActivityTestBinding
import com.anand.customnavigation.databinding.ContentTestBinding


class TestActivity : AppCompatActivity() {

    private var binding: ActivityTestBinding? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_test)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test)

        binding?.content?.filter?.setOnClickListener(View.OnClickListener {

            if (binding!!.drawerLayout.isDrawerOpen(GravityCompat.START)) {
                binding!!.drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                binding!!.drawerLayout.openDrawer(GravityCompat.START)
            }

        })

    }
}