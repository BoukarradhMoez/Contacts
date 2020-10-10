package fr.mastergime.boukarradhmoez.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter

class ContactListAdapter : ListAdapter<Contact,
        ContactListViewHolder>(Contact.DiffCallback()) {

    // Cette méthode va venir créer et afficher chaque élément à partir de notre modèle là, en retournant la classe "ContactViewHolder".
    // Cette classe  viendra convertir nos données en éléments de notre recycleView.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.items_layout, parent, false)
        return ContactListViewHolder(view)
    }

    //Cette méthode va permettre de mettre à jour notre recycleView avec l’élément à la position donnée en paramètre.
    // Afin d’avoir de charger en mémoire seulement les éléments affiché à l’écran.
    override fun onBindViewHolder(holder: ContactListViewHolder, position: Int) {
        val item: Contact = getItem(position)
        holder.firstNameView.text = item.first_name
        holder.lastNameView.text = item.last_Name
        holder.phoneNumberView.text = "${item.phone_Number}"
    }

}