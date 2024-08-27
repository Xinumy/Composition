package com.kurbatov.composition.domain.usecases

import com.kurbatov.composition.domain.entity.GameSettings
import com.kurbatov.composition.domain.entity.Level
import com.kurbatov.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}