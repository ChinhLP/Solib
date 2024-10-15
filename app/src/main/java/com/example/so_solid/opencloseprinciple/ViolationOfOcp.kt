package com.example.so_solid.opencloseprinciple

enum class Notification1 {
    PUSH_NOTIFICATION, EMAIL
}

class Notification1Service {

    fun sendNotification(notification: Notification1) {
        when (notification) {
            Notification1.PUSH_NOTIFICATION -> {
                // send push notification
            }

            Notification1.EMAIL -> {
                // send email notification
            }

            /*Notification.SMS -> {
                // send sms notification
            }*/
        }
    }
}

/*
enum class Notification {
    PUSH_NOTIFICATION, EMAIL, SMS
}*/

