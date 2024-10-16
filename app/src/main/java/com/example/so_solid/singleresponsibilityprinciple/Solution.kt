package com.example.so_solid.singleresponsibilityprinciple

data class Report(
    val id: Long,
    val content: String,
)

class ReportReader {

    fun readDataFromDB(report: Report) {
    }
}

class ReportHandle {

    fun processData(report: Report) {
    }
}

class ReportResult {

    fun printReport(report: Report) {
    }
}