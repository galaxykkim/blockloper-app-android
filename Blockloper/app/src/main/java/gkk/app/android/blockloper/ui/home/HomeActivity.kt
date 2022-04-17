package gkk.app.android.blockloper.ui.home

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import dagger.hilt.android.AndroidEntryPoint
import gkk.app.android.blockloper.R
import gkk.app.android.blockloper.common.base.BaseActivity
import gkk.app.android.blockloper.databinding.ActivityHomeBinding

@AndroidEntryPoint
class HomeActivity: BaseActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

    }


}