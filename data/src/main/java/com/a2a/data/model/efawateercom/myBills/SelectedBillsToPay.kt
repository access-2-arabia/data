package com.a2a.data.model.efawateercom.myBills

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class SelectedBillsToPay : ArrayList<BulkInquireResponse.A2AResponse.Body.Bill>(), Parcelable