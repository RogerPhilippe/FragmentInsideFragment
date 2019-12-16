package br.com.philippesis.fragmentinsidefragment.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.philippesis.fragmentinsidefragment.R
import br.com.philippesis.fragmentinsidefragment.ui.child.ChildFragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // create new Fragment
        val childFragment = ChildFragment()
        val transactionFragment = childFragmentManager.beginTransaction()
        transactionFragment.replace(R.id.child_fragment_container, childFragment).commit()
    }
}