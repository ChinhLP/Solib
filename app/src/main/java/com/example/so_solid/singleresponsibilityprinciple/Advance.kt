package com.example.so_solid.singleresponsibilityprinciple

class OrderFacade(
    private val orderNotificationSender: MessageNotificationSender,
    private val orderInvoiceGenerator: MessageInvoiceGenerator,
    private val orderRepository: MessageRepository
) {

    fun sendNotification(message: Message2) {
        // sends notification about order updates to the user.
        orderNotificationSender.sendNotification(message)
    }

    fun generateInvoice(message: Message2) {
        // generates invoice
        orderInvoiceGenerator.generateMessage(message)
    }

    fun save(message: Message2) {
        // insert/update data in the db
        orderRepository.save(message)
    }
}