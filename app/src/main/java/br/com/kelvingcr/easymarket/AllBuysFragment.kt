package br.com.kelvingcr.easymarket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.kelvingcr.easymarket.databinding.FragmentAllBuysBinding


class AllBuysFragment : Fragment() {

    private var _binding: FragmentAllBuysBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentAllBuysBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

}