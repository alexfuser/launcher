
package com.vidar.applauncherdemo.event.interfaces


//region import directives

import com.vidar.applauncherdemo.viewmodel.AppLauncherViewModel

//endregion import directives


/**
 * Callback interface for the individual App cards in the AppLauncher dialog
 *
 */
interface AppLauncherCallback {

    /**
     * Callback for when the user selects to launch an App
     *
     * @param appInfo AppInfo object for the App card that was selected
     */
    fun onAppClicked(appInfo: AppLauncherViewModel.App.AppInfo)
}