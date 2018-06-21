/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.trunking.v1.trunk;

import com.twilio.base.Updater;
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

public class OriginationUrlUpdater extends Updater<OriginationUrl> {
    private final String pathTrunkSid;
    private final String pathSid;
    private Integer weight;
    private Integer priority;
    private Boolean enabled;
    private String friendlyName;
    private URI sipUrl;

    /**
     * Construct a new OriginationUrlUpdater.
     * 
     * @param pathTrunkSid The trunk_sid
     * @param pathSid The sid
     */
    public OriginationUrlUpdater(final String pathTrunkSid, 
                                 final String pathSid) {
        this.pathTrunkSid = pathTrunkSid;
        this.pathSid = pathSid;
    }

    /**
     * Weight is used to determine the share of load when more than one URI has the
     * same priority. Its values range from 1 to 65535. The higher the value, the
     * more load a URI is given. Defaults to 10..
     * 
     * @param weight Weight is used to determine the share of load when more than
     *               one URI has the same priority.
     * @return this
     */
    public OriginationUrlUpdater setWeight(final Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Priority ranks the importance of the URI. Values range from 0 to 65535, where
     * the lowest number represents the highest importance. Defaults to 10..
     * 
     * @param priority Priority ranks the importance of the URI.
     * @return this
     */
    public OriginationUrlUpdater setPriority(final Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * A boolean value indicating whether the URL is enabled or disabled. Defaults
     * to true..
     * 
     * @param enabled A boolean value indicating whether the URL is enabled or
     *                disabled.
     * @return this
     */
    public OriginationUrlUpdater setEnabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * A human readable descriptive text, up to 64 characters long..
     * 
     * @param friendlyName A human readable descriptive text, up to 64 characters
     *                     long.
     * @return this
     */
    public OriginationUrlUpdater setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * The SIP address you want Twilio to route your Origination calls to. This must
     * be a `sip:` schema. `sips` is NOT supported.
     * 
     * @param sipUrl The SIP address you want Twilio to route your Origination
     *               calls to.
     * @return this
     */
    public OriginationUrlUpdater setSipUrl(final URI sipUrl) {
        this.sipUrl = sipUrl;
        return this;
    }

    /**
     * The SIP address you want Twilio to route your Origination calls to. This must
     * be a `sip:` schema. `sips` is NOT supported.
     * 
     * @param sipUrl The SIP address you want Twilio to route your Origination
     *               calls to.
     * @return this
     */
    public OriginationUrlUpdater setSipUrl(final String sipUrl) {
        return setSipUrl(Promoter.uriFromString(sipUrl));
    }

    /**
     * Make the request to the Twilio API to perform the update.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Updated OriginationUrl
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public OriginationUrl update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.TRUNKING.toString(),
            "/v1/Trunks/" + this.pathTrunkSid + "/OriginationUrls/" + this.pathSid + "",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("OriginationUrl update failed: Unable to connect to server");
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

        return OriginationUrl.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (weight != null) {
            request.addPostParam("Weight", weight.toString());
        }

        if (priority != null) {
            request.addPostParam("Priority", priority.toString());
        }

        if (enabled != null) {
            request.addPostParam("Enabled", enabled.toString());
        }

        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (sipUrl != null) {
            request.addPostParam("SipUrl", sipUrl.toString());
        }
    }
}