package tab.com.au.codetest.data.model

import io.reactivex.Single
import tab.com.au.codetest.RaceData
import tab.com.au.codetest.data.Race

class RaceRepository(private val raceData: RaceData) {
    private var cachedRaceList: List<Race>? = null
    //todo check location AU or not
    fun getRaces(): Single<List<Race>>{
        val remoteResult = raceData.racesLoader.racesObservable.doOnNext { cachedRaceList = it.races }

        //todo if couldn't get remote data load from database
        return Single.just(cachedRaceList)
    }
}