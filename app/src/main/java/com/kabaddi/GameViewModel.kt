package com.kabaddi

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    var teamAScore: Int = 0
    var teamBScore: Int = 0

    fun incTeamAScore(byValue:Int) {
        teamAScore += byValue
    }
    fun incTeamBScore(byValue:Int) {
        teamBScore += byValue
    }

    init {
        Log.i("TAG", "view-model started")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("TAG", "view-model cleared")
    }

}