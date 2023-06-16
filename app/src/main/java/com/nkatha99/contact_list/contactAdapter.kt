package com.nkatha99.contact_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nkatha99.contact_list.databinding.ContactsListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactsAdapter(var contactList:List<ContactData>):RecyclerView.Adapter< ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ContactViewHolder {
        val binding=
            ContactsListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact=contactList.get(position)
        val binding=holder.binding
        binding.tvdisplayName.text=currentContact.displayName
        binding.tvphoneNumber.text =currentContact.phoneNumber
        binding.tvemailAddress.text=currentContact.email
        Picasso
            .get()
            .load(currentContact.avatar)
//            .resize(80, 80)
            .transform(CropCircleTransformation())
//            .centerCrop()
            .into(binding.ivavator)

    }
    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(var binding:ContactsListItemBinding):RecyclerView.ViewHolder(binding.root)