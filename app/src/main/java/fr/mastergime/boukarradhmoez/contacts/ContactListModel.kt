package fr.mastergime.boukarradhmoez.contacts

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData

class ContactListModel : ViewModel() {
    val contactList: LiveData<List<Contact>> = liveData {
        emit(
            listOf(
                Contact("Moez", "pro", 767312905),
                Contact("DMX", "boss", 1234568),
                Contact("Tikay", "Traitor", 9874563),
                Contact("Android", "fag", 1265984),
                Contact("Senor", "trash", 45698256),
                Contact("RH-CZ4", "boy", 72252552),
            )
        )
    }


}