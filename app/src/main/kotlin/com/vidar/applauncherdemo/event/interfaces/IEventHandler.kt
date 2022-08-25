
package com.vidar.applauncherdemo.event.interfaces


//region import directives

import com.vidar.applauncherdemo.util.logging.Logger
import org.greenrobot.eventbus.EventBus

//endregion import directives


/**
 * Interface that all event handlers should implement
 *
 */
interface IEventHandler {

    //region interface methods

    /**
     * Registers the event handler with the event bus
     */
    fun register() {
        try {
            if (!EventBus.getDefault().isRegistered(this)) {
                EventBus.getDefault().register(this)
            }
        } catch (ex: Exception) {
            Logger.w(ex)
        }
    }

    /**
     * Unregisters the event handler from the event bus
     */
    fun unregister() {
        try {
            if (EventBus.getDefault().isRegistered(this)) {
                EventBus.getDefault().unregister(this)
            }
        } catch (ex: Exception) {
            Logger.w(ex)
        }
    }
    //endregion interface methods
}
