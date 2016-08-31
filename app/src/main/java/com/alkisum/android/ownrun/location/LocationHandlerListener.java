package com.alkisum.android.ownrun.location;

/**
 * Listener for LocationHandler.
 *
 * @author Alkisum
 * @version 1.0
 * @since 1.0
 */
interface LocationHandlerListener {

    /**
     * Called when the LocationRequest has been created. After this, it is
     * allowed to build the LocationSettingsRequest.
     */
    void onLocationRequestCreated();

    /**
     * A new speed value has been received.
     *
     * @param value Speed value
     */
    void onNewSpeedValue(final float value);

    /**
     * A new pace value has been received.
     *
     * @param value Pace value
     */
    void onNewPaceValue(final long value);

    /**
     * A new distance value has been received.
     *
     * @param value Distance value
     */
    void onNewDistanceValue(final float value);

    /**
     * New Coordinate values have been received.
     *
     * @param coordinate Coordinate values
     */
    void onNewCoordinate(final Coordinate coordinate);
}
