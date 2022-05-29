package gkk.app.android.blockloper.common.di

import com.klaytn.caver.Caver
import dagger.Provides
import gkk.app.android.blockloper.common.Config
import javax.inject.Singleton

object KlaytnModule {

    @Provides
    @Singleton
    fun provideCaver() = Caver(Config.ENDPOINT_URL)


}