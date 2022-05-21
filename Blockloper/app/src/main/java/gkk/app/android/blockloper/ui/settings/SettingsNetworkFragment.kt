package gkk.app.android.blockloper.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import gkk.app.android.blockloper.R
import gkk.app.android.blockloper.common.base.BaseFragment
import gkk.app.android.blockloper.databinding.FragmentSettingsNetworkBinding

class SettingsNetworkFragment: BaseFragment() {

    private lateinit var binding: FragmentSettingsNetworkBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings_network, container, false)
        return binding.root
    }
}