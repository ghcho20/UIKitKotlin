package com.example.uikitkotlin

import android.app.Application

import com.sendbird.uikit.SendbirdUIKit
import com.sendbird.uikit.adapter.SendbirdUIKitAdapter
import com.sendbird.uikit.interfaces.UserInfo
import com.sendbird.android.handler.InitResultHandler
import com.sendbird.android.exception.SendbirdException

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        SendbirdUIKit.init(object : SendbirdUIKitAdapter {
            override fun getAppId() = "A87436DE-5C89-49B2-8883-9A45835CA6F2"
            override fun getAccessToken() = ""
            override fun getUserInfo(): UserInfo {
                return object: UserInfo {
                    override fun getUserId() = "call01"
                    override fun getNickname() = "Eagle"
                    override fun getProfileUrl() = ""
                }
            }

            override fun getInitResultHandler(): InitResultHandler {
                return object: InitResultHandler {
                    override fun onMigrationStarted() {
                    }
                    override fun onInitFailed(e: SendbirdException) {
                    }
                    override fun onInitSucceed() {
                    }
                }
            }
        }, this)
    }
}