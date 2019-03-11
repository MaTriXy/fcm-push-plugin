package com.abeade.plugin.fcm.push.settings

import java.io.Serializable

const val DEFAULT_ADB_PORT = 5037
const val DEFAULT_PREFERENCE_KEY = "gcm_token"

data class PushSettings(
    var port: Int? = DEFAULT_ADB_PORT,
    var preferenceKey: String? = DEFAULT_PREFERENCE_KEY,
    var list: MutableList<PushTemplate> = mutableListOf()
) : Serializable

data class PushTemplate(
    var name: String,
    var data: String
) : Serializable
