package gkk.app.android.blockloper.ui.blockcounter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import dagger.hilt.android.AndroidEntryPoint
import gkk.app.android.blockloper.R
import gkk.app.android.blockloper.common.base.BaseFragment
import gkk.app.android.blockloper.databinding.FragmentBlockCounterBinding

@AndroidEntryPoint
class BlockCounterFragment: BaseFragment() {

    private lateinit var binding: FragmentBlockCounterBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_block_counter,
            container,
            false)
        return binding.root
    }





}