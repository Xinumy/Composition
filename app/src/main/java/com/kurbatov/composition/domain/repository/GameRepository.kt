package com.kurbatov.composition.domain.repository

import com.kurbatov.composition.domain.entity.GameSettings
import com.kurbatov.composition.domain.entity.Level
import com.kurbatov.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ) : Question

    fun getGameSettings(level: Level): GameSettings
}