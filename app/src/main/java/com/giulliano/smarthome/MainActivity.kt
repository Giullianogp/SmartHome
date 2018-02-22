package com.giulliano.smarthome

import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.database.*

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null

    //internal abstract var database: FirebaseDatabase
    //internal abstract var myRef: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)

//        database = FirebaseDatabase.getInstance()

        // Set up the ViewPager with the sections adapter.
        container.adapter = mSectionsPagerAdapter

        container.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(container))

  //      myRef = database.getReference("Pins")

//        myRef.addValueEventListener(object : ValueEventListener {
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//                for (postSnapshot in dataSnapshot.children) {
//                    changeStatus(postSnapshot)
//                }
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                Log.w("SmartHome", "Failed to read value.", error.toException())
//            }
//        })


//        val clickEvent = View.OnClickListener { view -> switchChange(view) }
//
//        switch1!!.setOnClickListener(clickEvent)
//        switch2!!.setOnClickListener(clickEvent)
//        switch3!!.setOnClickListener(clickEvent)
//        switch4!!.setOnClickListener(clickEvent)
    }

    inner class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {

            return when (position) {
                0 -> QuartoFragment()
                1 -> SalaFragment()
                else -> QuartoFragment()
            }
        }

        override fun getCount(): Int {
            return tabs.tabCount
        }
    }



//    private fun changeStatus(postSnapshot: DataSnapshot) {
//        val key = postSnapshot.key
//
//        val value: Long
//        val valueFloat: Double
//
//        when (key) {
//            "pin1" -> {
//                value = postSnapshot.value as Long
//                switch1!!.isIconEnabled = value != 0L
//            }
//            "pin2" -> {
//                value = postSnapshot.value as Long
//                switch2!!.isIconEnabled = value != 0L
//            }
//            "pin3" -> {
//                value = postSnapshot.value as Long
//                switch3!!.isIconEnabled = value != 0L
//            }
//            "pin4" -> {
//                value = postSnapshot.value as Long
//                switch4!!.isIconEnabled = value != 0L
//            }
//            "pin5" -> {
//                valueFloat = postSnapshot.value as Double
//                txtTemperatura!!.text = valueFloat.toString() + " °"
//            }
//        }
//    }
//
//    private fun switchChange(v: View) {
//        when (v.id) {
//            R.id.switch1 -> {
//                switch1!!.setIconEnabled(!switch1!!.isIconEnabled, true)
//                changeValue("pin1", switch1!!.isIconEnabled)
//            }
//            R.id.switch2 -> {
//                switch2!!.setIconEnabled(!switch2!!.isIconEnabled, true)
//                changeValue("pin2", switch2!!.isIconEnabled)
//            }
//            R.id.switch3 -> {
//                switch3!!.setIconEnabled(!switch3!!.isIconEnabled, true)
//                changeValue("pin3", switch3!!.isIconEnabled)
//            }
//            R.id.switch4 -> {
//                switch4!!.setIconEnabled(!switch4!!.isIconEnabled, true)
//                changeValue("pin4", switch4!!.isIconEnabled)
//            }
//        }
//
//    }
//
//
//
//
//    private fun changeValue(porta: String, status: Boolean) {
//        myRef.child(porta).setValue(if (status) 1 else 0)
//    }
}
