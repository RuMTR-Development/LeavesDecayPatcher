package ru.polyakhovav.leavesdecaypatcher

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry
import net.minecraft.world.level.GameRules

object ModGameRules {
    lateinit var LEAVES_DECAY: GameRules.Key<GameRules.BooleanValue>

    fun register() {
        LEAVES_DECAY = GameRuleRegistry.register(
            "${LeavesDecayPatcher.MOD_ID}:leaves_decay",
            GameRules.Category.UPDATES,
            GameRuleFactory.createBooleanRule(true)
        )
    }
}