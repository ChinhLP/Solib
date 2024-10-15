package com.example.so_solid.opencloseprinciple.solution

class NotificationService {

    fun sendNotification(notification: NotificationRepo) {
        notification.sendNotification()
    }
}
