package fr.mastergime.boukarradhmoez.contacts

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//ContactListViewHolder étend //RecyclerView.ViewHolder ; il //s’agit simplement de relier les 3
//TextViews sous forme d'attributs :
class ContactListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val firstNameView: TextView = view.findViewById(R.id.First_name)
    val lastNameView: TextView = view.findViewById(R.id.Last_name)
    val phoneNumberView: TextView = view.findViewById(R.id.Phone_number)

}