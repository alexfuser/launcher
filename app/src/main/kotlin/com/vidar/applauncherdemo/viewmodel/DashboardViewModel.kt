
package com.vidar.applauncherdemo.viewmodel


//region import directives

import com.vidar.applauncherdemo.util.logging.Logger
import com.vidar.applauncherdemo.view.fragments.DashboardFragmentDirections

//endregion import directives


/**
 * ViewModel for the Dashboard screen
 *
 */
class DashboardViewModel : BaseViewModel() {

    //region action handlers

    /**
     * Handler for when to show the App Launcher dialog
     */
    fun handleActionShowAppLauncher() {
        // log entry
        Logger.i("Entered handleActionShowAppLauncher()")

        try {
            navigate(DashboardFragmentDirections.actionDashboardToAppLauncher())
        } catch (ex: Exception) {
            Logger.w(ex)
        } finally {
            // log exit
            Logger.i("Exiting handleActionShowAppLauncher()")
        }
    }
    //endregion action handlers
}
