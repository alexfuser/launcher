
package com.vidar.applauncherdemo.navigation


//region import directives

import androidx.navigation.NavDirections

//endregion import directives


/**
 * Encapsulates our classes for navigating in the app
 *
 */
sealed class NavigationCommand {

    /**
     * Used for navigating to somewhere
     */
    data class To(val directions: NavDirections) : NavigationCommand()

    /**
     * Used for navigating up (or Back)
     */
    object Up : NavigationCommand()
}
