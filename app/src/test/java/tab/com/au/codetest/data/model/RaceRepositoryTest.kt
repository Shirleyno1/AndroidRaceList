package tab.com.au.codetest.data.model

import io.reactivex.Observable
import org.junit.After
import org.junit.Before
import org.junit.Test

import org.mockito.Mock
import org.mockito.Mockito
import tab.com.au.codetest.RaceData
import tab.com.au.codetest.data.Race
import java.util.*

class RaceRepositoryTest {

    @Mock
    lateinit var raceData: RaceData

    var repository: RaceRepository? = null

    val raceList = Arrays.asList(Race())

    @Before
    fun setUp(){
        repository = RaceRepository(raceData)
    }

    @Test
    fun getRemoteRaceList_returnData() {
//        Mockito.doReturn(Observable.just(raceList)).`when`(raceData).racesLoader.racesObservable
    }

    @After
    fun tearDown() {
        repository = null
    }
}