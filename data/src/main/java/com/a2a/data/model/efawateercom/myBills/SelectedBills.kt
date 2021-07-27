package com.a2a.data.model.efawateercom.myBills

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class SelectedBills : ArrayList<MyBillResponse.A2AResponse.Body.Bill>(), Parcelable