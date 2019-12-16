package br.com.philippesis.fragmentinsidefragment.ui.child


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

import br.com.philippesis.fragmentinsidefragment.R

/**
 * A simple [Fragment] subclass.
 */
class ChildFragment : Fragment() {

    private lateinit var confirmLabel: TextView
    private lateinit var confirmBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_child, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.confirmLabel = view.findViewById(R.id.confirmLabel)
        this.confirmBtn = view.findViewById(R.id.confirmBtn)

        this.setupListener()
    }

    private fun setupListener() {
        this.confirmBtn.setOnClickListener { this.confirmLabel.text = "Confirmado." }
    }

}
