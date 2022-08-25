
package com.vidar.applauncherdemo.configuration


//region import directives

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

//endregion import directives


/**
 * Encapsulates an example App Launcher configuration
 *
 */
data class AppLauncherConfiguration(
    @Expose @SerializedName("Apps") val apps: List<String>,
    @Expose @SerializedName("FloatApps") val floatApps: Boolean
)
