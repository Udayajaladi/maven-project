/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.conference;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;
import java.util.List;

public class ParticipantCreator extends Creator<Participant> {
    private String pathAccountSid;
    private final String pathConferenceSid;
    private final com.twilio.type.PhoneNumber from;
    private final com.twilio.type.PhoneNumber to;
    private URI statusCallback;
    private HttpMethod statusCallbackMethod;
    private List<String> statusCallbackEvent;
    private Integer timeout;
    private Boolean record;
    private Boolean muted;
    private String beep;
    private Boolean startConferenceOnEnter;
    private Boolean endConferenceOnExit;
    private URI waitUrl;
    private HttpMethod waitMethod;
    private Boolean earlyMedia;
    private Integer maxParticipants;
    private String conferenceRecord;
    private String conferenceTrim;
    private URI conferenceStatusCallback;
    private HttpMethod conferenceStatusCallbackMethod;
    private List<String> conferenceStatusCallbackEvent;
    private String recordingChannels;
    private URI recordingStatusCallback;
    private HttpMethod recordingStatusCallbackMethod;
    private String sipAuthUsername;
    private String sipAuthPassword;
    private String region;
    private URI conferenceRecordingStatusCallback;
    private HttpMethod conferenceRecordingStatusCallbackMethod;
    private List<String> recordingStatusCallbackEvent;
    private List<String> conferenceRecordingStatusCallbackEvent;

    /**
     * Construct a new ParticipantCreator.
     * 
     * @param pathConferenceSid The conference_sid
     * @param from number, client id
     * @param to number, client id, sip address
     */
    public ParticipantCreator(final String pathConferenceSid, 
                              final com.twilio.type.PhoneNumber from, 
                              final com.twilio.type.PhoneNumber to) {
        this.pathConferenceSid = pathConferenceSid;
        this.from = from;
        this.to = to;
    }

    /**
     * Construct a new ParticipantCreator.
     * 
     * @param pathAccountSid The account_sid
     * @param pathConferenceSid The conference_sid
     * @param from number, client id
     * @param to number, client id, sip address
     */
    public ParticipantCreator(final String pathAccountSid, 
                              final String pathConferenceSid, 
                              final com.twilio.type.PhoneNumber from, 
                              final com.twilio.type.PhoneNumber to) {
        this.pathAccountSid = pathAccountSid;
        this.pathConferenceSid = pathConferenceSid;
        this.from = from;
        this.to = to;
    }

    /**
     * absolute url.
     * 
     * @param statusCallback absolute url
     * @return this
     */
    public ParticipantCreator setStatusCallback(final URI statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }

    /**
     * absolute url.
     * 
     * @param statusCallback absolute url
     * @return this
     */
    public ParticipantCreator setStatusCallback(final String statusCallback) {
        return setStatusCallback(Promoter.uriFromString(statusCallback));
    }

    /**
     * GET, POST.
     * 
     * @param statusCallbackMethod GET, POST
     * @return this
     */
    public ParticipantCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod) {
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }

    /**
     * initiated, ringing, answered, completed.
     * 
     * @param statusCallbackEvent initiated, ringing, answered, completed
     * @return this
     */
    public ParticipantCreator setStatusCallbackEvent(final List<String> statusCallbackEvent) {
        this.statusCallbackEvent = statusCallbackEvent;
        return this;
    }

    /**
     * initiated, ringing, answered, completed.
     * 
     * @param statusCallbackEvent initiated, ringing, answered, completed
     * @return this
     */
    public ParticipantCreator setStatusCallbackEvent(final String statusCallbackEvent) {
        return setStatusCallbackEvent(Promoter.listOfOne(statusCallbackEvent));
    }

    /**
     * 5-600.
     * 
     * @param timeout 5-600
     * @return this
     */
    public ParticipantCreator setTimeout(final Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * true, false.
     * 
     * @param record true, false
     * @return this
     */
    public ParticipantCreator setRecord(final Boolean record) {
        this.record = record;
        return this;
    }

    /**
     * true, false.
     * 
     * @param muted true, false
     * @return this
     */
    public ParticipantCreator setMuted(final Boolean muted) {
        this.muted = muted;
        return this;
    }

    /**
     * true, false, onEnter, onExit.
     * 
     * @param beep true, false, onEnter, onExit
     * @return this
     */
    public ParticipantCreator setBeep(final String beep) {
        this.beep = beep;
        return this;
    }

    /**
     * true, false.
     * 
     * @param startConferenceOnEnter true, false
     * @return this
     */
    public ParticipantCreator setStartConferenceOnEnter(final Boolean startConferenceOnEnter) {
        this.startConferenceOnEnter = startConferenceOnEnter;
        return this;
    }

    /**
     * true, false.
     * 
     * @param endConferenceOnExit true, false
     * @return this
     */
    public ParticipantCreator setEndConferenceOnExit(final Boolean endConferenceOnExit) {
        this.endConferenceOnExit = endConferenceOnExit;
        return this;
    }

    /**
     * absolute url.
     * 
     * @param waitUrl absolute url
     * @return this
     */
    public ParticipantCreator setWaitUrl(final URI waitUrl) {
        this.waitUrl = waitUrl;
        return this;
    }

    /**
     * absolute url.
     * 
     * @param waitUrl absolute url
     * @return this
     */
    public ParticipantCreator setWaitUrl(final String waitUrl) {
        return setWaitUrl(Promoter.uriFromString(waitUrl));
    }

    /**
     * GET, POST.
     * 
     * @param waitMethod GET, POST
     * @return this
     */
    public ParticipantCreator setWaitMethod(final HttpMethod waitMethod) {
        this.waitMethod = waitMethod;
        return this;
    }

    /**
     * true, false.
     * 
     * @param earlyMedia true, false
     * @return this
     */
    public ParticipantCreator setEarlyMedia(final Boolean earlyMedia) {
        this.earlyMedia = earlyMedia;
        return this;
    }

    /**
     * 2-10.
     * 
     * @param maxParticipants 2-10
     * @return this
     */
    public ParticipantCreator setMaxParticipants(final Integer maxParticipants) {
        this.maxParticipants = maxParticipants;
        return this;
    }

    /**
     * true, false, record-from-start, do-not-record.
     * 
     * @param conferenceRecord true, false, record-from-start, do-not-record
     * @return this
     */
    public ParticipantCreator setConferenceRecord(final String conferenceRecord) {
        this.conferenceRecord = conferenceRecord;
        return this;
    }

    /**
     * trim-silence or do-not-trim.
     * 
     * @param conferenceTrim trim-silence or do-not-trim
     * @return this
     */
    public ParticipantCreator setConferenceTrim(final String conferenceTrim) {
        this.conferenceTrim = conferenceTrim;
        return this;
    }

    /**
     * absolute url.
     * 
     * @param conferenceStatusCallback absolute url
     * @return this
     */
    public ParticipantCreator setConferenceStatusCallback(final URI conferenceStatusCallback) {
        this.conferenceStatusCallback = conferenceStatusCallback;
        return this;
    }

    /**
     * absolute url.
     * 
     * @param conferenceStatusCallback absolute url
     * @return this
     */
    public ParticipantCreator setConferenceStatusCallback(final String conferenceStatusCallback) {
        return setConferenceStatusCallback(Promoter.uriFromString(conferenceStatusCallback));
    }

    /**
     * GET, POST.
     * 
     * @param conferenceStatusCallbackMethod GET, POST
     * @return this
     */
    public ParticipantCreator setConferenceStatusCallbackMethod(final HttpMethod conferenceStatusCallbackMethod) {
        this.conferenceStatusCallbackMethod = conferenceStatusCallbackMethod;
        return this;
    }

    /**
     * start end join leave mute hold speaker.
     * 
     * @param conferenceStatusCallbackEvent start end join leave mute hold speaker
     * @return this
     */
    public ParticipantCreator setConferenceStatusCallbackEvent(final List<String> conferenceStatusCallbackEvent) {
        this.conferenceStatusCallbackEvent = conferenceStatusCallbackEvent;
        return this;
    }

    /**
     * start end join leave mute hold speaker.
     * 
     * @param conferenceStatusCallbackEvent start end join leave mute hold speaker
     * @return this
     */
    public ParticipantCreator setConferenceStatusCallbackEvent(final String conferenceStatusCallbackEvent) {
        return setConferenceStatusCallbackEvent(Promoter.listOfOne(conferenceStatusCallbackEvent));
    }

    /**
     * mono, dual.
     * 
     * @param recordingChannels mono, dual
     * @return this
     */
    public ParticipantCreator setRecordingChannels(final String recordingChannels) {
        this.recordingChannels = recordingChannels;
        return this;
    }

    /**
     * absolute url.
     * 
     * @param recordingStatusCallback absolute url
     * @return this
     */
    public ParticipantCreator setRecordingStatusCallback(final URI recordingStatusCallback) {
        this.recordingStatusCallback = recordingStatusCallback;
        return this;
    }

    /**
     * absolute url.
     * 
     * @param recordingStatusCallback absolute url
     * @return this
     */
    public ParticipantCreator setRecordingStatusCallback(final String recordingStatusCallback) {
        return setRecordingStatusCallback(Promoter.uriFromString(recordingStatusCallback));
    }

    /**
     * GET, POST.
     * 
     * @param recordingStatusCallbackMethod GET, POST
     * @return this
     */
    public ParticipantCreator setRecordingStatusCallbackMethod(final HttpMethod recordingStatusCallbackMethod) {
        this.recordingStatusCallbackMethod = recordingStatusCallbackMethod;
        return this;
    }

    /**
     * sip username.
     * 
     * @param sipAuthUsername sip username
     * @return this
     */
    public ParticipantCreator setSipAuthUsername(final String sipAuthUsername) {
        this.sipAuthUsername = sipAuthUsername;
        return this;
    }

    /**
     * sip password.
     * 
     * @param sipAuthPassword sip password
     * @return this
     */
    public ParticipantCreator setSipAuthPassword(final String sipAuthPassword) {
        this.sipAuthPassword = sipAuthPassword;
        return this;
    }

    /**
     * us1, ie1, de1, sg1, br1, au1, jp1.
     * 
     * @param region us1, ie1, de1, sg1, br1, au1, jp1
     * @return this
     */
    public ParticipantCreator setRegion(final String region) {
        this.region = region;
        return this;
    }

    /**
     * absolute url.
     * 
     * @param conferenceRecordingStatusCallback absolute url
     * @return this
     */
    public ParticipantCreator setConferenceRecordingStatusCallback(final URI conferenceRecordingStatusCallback) {
        this.conferenceRecordingStatusCallback = conferenceRecordingStatusCallback;
        return this;
    }

    /**
     * absolute url.
     * 
     * @param conferenceRecordingStatusCallback absolute url
     * @return this
     */
    public ParticipantCreator setConferenceRecordingStatusCallback(final String conferenceRecordingStatusCallback) {
        return setConferenceRecordingStatusCallback(Promoter.uriFromString(conferenceRecordingStatusCallback));
    }

    /**
     * GET, POST.
     * 
     * @param conferenceRecordingStatusCallbackMethod GET, POST
     * @return this
     */
    public ParticipantCreator setConferenceRecordingStatusCallbackMethod(final HttpMethod conferenceRecordingStatusCallbackMethod) {
        this.conferenceRecordingStatusCallbackMethod = conferenceRecordingStatusCallbackMethod;
        return this;
    }

    /**
     * The recording_status_callback_event.
     * 
     * @param recordingStatusCallbackEvent The recording_status_callback_event
     * @return this
     */
    public ParticipantCreator setRecordingStatusCallbackEvent(final List<String> recordingStatusCallbackEvent) {
        this.recordingStatusCallbackEvent = recordingStatusCallbackEvent;
        return this;
    }

    /**
     * The recording_status_callback_event.
     * 
     * @param recordingStatusCallbackEvent The recording_status_callback_event
     * @return this
     */
    public ParticipantCreator setRecordingStatusCallbackEvent(final String recordingStatusCallbackEvent) {
        return setRecordingStatusCallbackEvent(Promoter.listOfOne(recordingStatusCallbackEvent));
    }

    /**
     * The conference_recording_status_callback_event.
     * 
     * @param conferenceRecordingStatusCallbackEvent The
     *                                               conference_recording_status_callback_event
     * @return this
     */
    public ParticipantCreator setConferenceRecordingStatusCallbackEvent(final List<String> conferenceRecordingStatusCallbackEvent) {
        this.conferenceRecordingStatusCallbackEvent = conferenceRecordingStatusCallbackEvent;
        return this;
    }

    /**
     * The conference_recording_status_callback_event.
     * 
     * @param conferenceRecordingStatusCallbackEvent The
     *                                               conference_recording_status_callback_event
     * @return this
     */
    public ParticipantCreator setConferenceRecordingStatusCallbackEvent(final String conferenceRecordingStatusCallbackEvent) {
        return setConferenceRecordingStatusCallbackEvent(Promoter.listOfOne(conferenceRecordingStatusCallbackEvent));
    }

    /**
     * Make the request to the Twilio API to perform the create.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Created Participant
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Participant create(final TwilioRestClient client) {
        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            "/2010-04-01/Accounts/" + this.pathAccountSid + "/Conferences/" + this.pathConferenceSid + "/Participants.json",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Participant creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }

            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }

        return Participant.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (from != null) {
            request.addPostParam("From", from.toString());
        }

        if (to != null) {
            request.addPostParam("To", to.toString());
        }

        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
        }

        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
        }

        if (statusCallbackEvent != null) {
            for (String prop : statusCallbackEvent) {
                request.addPostParam("StatusCallbackEvent", prop);
            }
        }

        if (timeout != null) {
            request.addPostParam("Timeout", timeout.toString());
        }

        if (record != null) {
            request.addPostParam("Record", record.toString());
        }

        if (muted != null) {
            request.addPostParam("Muted", muted.toString());
        }

        if (beep != null) {
            request.addPostParam("Beep", beep);
        }

        if (startConferenceOnEnter != null) {
            request.addPostParam("StartConferenceOnEnter", startConferenceOnEnter.toString());
        }

        if (endConferenceOnExit != null) {
            request.addPostParam("EndConferenceOnExit", endConferenceOnExit.toString());
        }

        if (waitUrl != null) {
            request.addPostParam("WaitUrl", waitUrl.toString());
        }

        if (waitMethod != null) {
            request.addPostParam("WaitMethod", waitMethod.toString());
        }

        if (earlyMedia != null) {
            request.addPostParam("EarlyMedia", earlyMedia.toString());
        }

        if (maxParticipants != null) {
            request.addPostParam("MaxParticipants", maxParticipants.toString());
        }

        if (conferenceRecord != null) {
            request.addPostParam("ConferenceRecord", conferenceRecord);
        }

        if (conferenceTrim != null) {
            request.addPostParam("ConferenceTrim", conferenceTrim);
        }

        if (conferenceStatusCallback != null) {
            request.addPostParam("ConferenceStatusCallback", conferenceStatusCallback.toString());
        }

        if (conferenceStatusCallbackMethod != null) {
            request.addPostParam("ConferenceStatusCallbackMethod", conferenceStatusCallbackMethod.toString());
        }

        if (conferenceStatusCallbackEvent != null) {
            for (String prop : conferenceStatusCallbackEvent) {
                request.addPostParam("ConferenceStatusCallbackEvent", prop);
            }
        }

        if (recordingChannels != null) {
            request.addPostParam("RecordingChannels", recordingChannels);
        }

        if (recordingStatusCallback != null) {
            request.addPostParam("RecordingStatusCallback", recordingStatusCallback.toString());
        }

        if (recordingStatusCallbackMethod != null) {
            request.addPostParam("RecordingStatusCallbackMethod", recordingStatusCallbackMethod.toString());
        }

        if (sipAuthUsername != null) {
            request.addPostParam("SipAuthUsername", sipAuthUsername);
        }

        if (sipAuthPassword != null) {
            request.addPostParam("SipAuthPassword", sipAuthPassword);
        }

        if (region != null) {
            request.addPostParam("Region", region);
        }

        if (conferenceRecordingStatusCallback != null) {
            request.addPostParam("ConferenceRecordingStatusCallback", conferenceRecordingStatusCallback.toString());
        }

        if (conferenceRecordingStatusCallbackMethod != null) {
            request.addPostParam("ConferenceRecordingStatusCallbackMethod", conferenceRecordingStatusCallbackMethod.toString());
        }

        if (recordingStatusCallbackEvent != null) {
            for (String prop : recordingStatusCallbackEvent) {
                request.addPostParam("RecordingStatusCallbackEvent", prop);
            }
        }

        if (conferenceRecordingStatusCallbackEvent != null) {
            for (String prop : conferenceRecordingStatusCallbackEvent) {
                request.addPostParam("ConferenceRecordingStatusCallbackEvent", prop);
            }
        }
    }
}