package com.example.so_solid.singleresponsibilityprinciple

class MessageViewModel(
    private val reportReader: ReportReader,
    private val reportHandle: ReportHandle,
    private val reportResult: ReportResult
) {

    fun readDataReport(report: Report) {
        reportReader.readDataFromDB(report)
    }

    fun processDataReport(report: Report) {
        reportHandle.processData(report)
    }

    fun printReportReport(report: Report) {
        reportResult.printReport(report)
    }
}