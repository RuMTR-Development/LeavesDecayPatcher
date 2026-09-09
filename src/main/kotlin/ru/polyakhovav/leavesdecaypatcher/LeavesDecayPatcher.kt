package ru.polyakhovav.leavesdecaypatcher

import net.fabricmc.api.ModInitializer

class LeavesDecayPatcher : ModInitializer {
    companion object {
        const val MOD_ID = "leavesdecaypatcher"
    }

    override fun onInitialize() {
        ModGameRules.register()
    }
}