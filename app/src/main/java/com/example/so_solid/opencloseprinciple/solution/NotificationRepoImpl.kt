package com.example.so_solid.opencloseprinciple.solution

class PushNotification : NotificationRepo {
    override fun sendNotification() {
        // send push notification
    }
}

class SMSNotification : NotificationRepo {
    override fun sendNotification() {
        // send sms notification
    }
}