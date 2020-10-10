package fr.mastergime.boukarradhmoez.contacts

import androidx.recyclerview.widget.DiffUtil

data class Contact(val first_name: String, val last_Name: String, val phone_Number: Int) {

    class DiffCallback : DiffUtil.ItemCallback<Contact>() {
        override fun areItemsTheSame(oldItem: Contact, newItem: Contact): Boolean {
            return oldItem.phone_Number == newItem.phone_Number
        }

        override fun areContentsTheSame(oldItem: Contact, newItem: Contact): Boolean {
            return oldItem.first_name == newItem.first_name && oldItem.last_Name == newItem.last_Name && oldItem.phone_Number == newItem.phone_Number
        }
    }
}