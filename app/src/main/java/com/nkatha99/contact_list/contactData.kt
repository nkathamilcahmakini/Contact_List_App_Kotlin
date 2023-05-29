package com.nkatha99.contact_list

import android.provider.ContactsContract.CommonDataKinds.Email

data class contactData(
    var avatar:String,
    var displayName:String,
    var phoneNumber:String,
    var email: String,
)
