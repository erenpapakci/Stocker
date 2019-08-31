package com.nstudiosappdev.stocker.dashboard.domain

import com.nstudiosappdev.core.coroutines.AsyncManager
import com.nstudiosappdev.core.domain.Interactor
import com.nstudiosappdev.core.injection.modules.CoroutineManagerModule
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class CurrenciesDomainModule {

    @Provides
    fun provideCurrencies(
        @Named(CoroutineManagerModule.AM_NAME_INTERACTOR) asyncManager: AsyncManager,
        currenciesRepository: CurrenciesRepository
    ): Interactor.DeferredRetrieveInteractor<Currencies> =
            GetCurrenciesInteractor(currenciesRepository, asyncManager)
}