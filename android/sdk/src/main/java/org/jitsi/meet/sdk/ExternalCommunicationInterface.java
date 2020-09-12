package org.jitsi.meet.sdk;

/**
 * Use this interface to invoke methods inside JitsiMeetActivity
 * Add methods here according to requirements
 *
 */
public interface ExternalCommunicationInterface {
    /**
     * This method is used to leave the ongoing conference from the app using the library
     */
    void leaveOngoingConference();
}
