package com.example.so_solid.singleresponsibilityprinciple

data class Message2(
    val id: Long,
    val name: String,
)

class MessageNotificationSender {

    fun sendNotification(message: Message2) {
        // send order notifications
    }
}

class MessageInvoiceGenerator {

    fun generateMessage(message: Message2) {
        // generate invoice
    }
}

class MessageRepository {

    fun save(message: Message2) {
        // insert/update data in the db.
    }
}