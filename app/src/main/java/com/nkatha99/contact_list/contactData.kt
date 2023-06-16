package com.nkatha99.contact_list

import android.provider.ContactsContract.CommonDataKinds.Email

data class ContactData(
    var displayName:String,
    var phoneNumber:String,
    var email: String,
    var avatar:String
)
