package tab.com.au.codetest.data

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import tab.com.au.codetest.data.model.RaceRepository

class RaceViewModel(val repository: RaceRepository) : ViewModel() {
    private var raceList = MutableLiveData<List<Race>>()
    fun getRaces(){
        repository.getRaces()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    list,trowable->
                    list?.let{raceList.value = list}
                    //todo error
                    trowable?.let{ }
                }
    }
}