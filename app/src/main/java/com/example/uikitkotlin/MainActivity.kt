package com.example.uikitkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sendbird.uikit.SendbirdUIKit

import com.sendbird.uikit.fragments.ChannelListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val channelListFragment = SendbirdUIKit.getFragmentFactory().newChannelListFragment(Bundle())
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, channelListFragment, "TAG_TEST")
            .commit()
    }
}