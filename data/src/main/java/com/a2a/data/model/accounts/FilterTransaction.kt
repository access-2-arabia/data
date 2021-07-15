package com.a2a.data.model.accounts

data class FilterTransaction(
    var accountNumber: String = "",
    var dateFrom: String = "",
    var dateTo: String = "",
    var transactionType: String = "All",
    var transactionCount: Int = 10,
    var amountType: String = "All",
    var amountFrom: Double = 0.0,
    var amountTo: Double = 0.0,
    var filteredBy: String = "custom",
    )
