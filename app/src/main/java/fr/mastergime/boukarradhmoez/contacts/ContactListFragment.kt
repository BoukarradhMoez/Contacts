package fr.mastergime.boukarradhmoez.contacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import fr.mastergime.boukarradhmoez.contacts.databinding.FragmentContactListBinding

class ContactListFragment : Fragment() {
    lateinit var  _binding: FragmentContactListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentContactListBinding.inflate(inflater)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val contactListAdapter = ContactListAdapter()
        val contactListModel = ContactListModel()

        _binding.recyclerView.apply {
            setHasFixedSize(true)       //setHasFixedSize(true) permet d’optimiser le rendu graphique, en ndiquant que tous les items ont la méme taille
            layoutManager = LinearLayoutManager(context)
            adapter = contactListAdapter

            contactListModel.contactList.observe(viewLifecycleOwner) { list ->
                contactListAdapter.submitList(list)
            }
        }

    }
}