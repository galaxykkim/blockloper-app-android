package gkk.app.android.blockloper.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gkk.app.android.blockloper.domain.model.CaverModel
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ModelModule {

    @Provides
    @Singleton
    fun provideCaverModel(): CaverModel = CaverModel()

}