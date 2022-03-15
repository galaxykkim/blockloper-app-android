package gkk.app.android.blockloper.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gkk.app.android.blockloper.domain.usecase.blockcounter.GetBlockNumberUseCase

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetBlockNumberUseCase(): GetBlockNumberUseCase = GetBlockNumberUseCase()
}