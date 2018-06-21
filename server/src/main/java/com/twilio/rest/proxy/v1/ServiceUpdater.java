/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.proxy.v1;

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

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class ServiceUpdater extends Updater<Service> {
    private final String pathSid;
    private String uniqueName;
    private Integer defaultTtl;
    private URI callbackUrl;
    private Service.GeoMatchLevel geoMatchLevel;
    private Service.NumberSelectionBehavior numberSelectionBehavior;
    private URI interceptCallbackUrl;
    private URI outOfSessionCallbackUrl;

    /**
     * Construct a new ServiceUpdater.
     * 
     * @param pathSid A string that uniquely identifies this Service.
     */
    public ServiceUpdater(final String pathSid) {
        this.pathSid = pathSid;
    }

    /**
     * A human readable description of this resource, up to 64 characters..
     * 
     * @param uniqueName A human readable description of this resource.
     * @return this
     */
    public ServiceUpdater setUniqueName(final String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * The default time delay in seconds after the latest of Session create time or
     * the Session's last Interaction time, after which a session will expire.  Used
     * for sessions where ttl is not specified..
     * 
     * @param defaultTtl Default TTL for Sessions in Service, in seconds.
     * @return this
     */
    public ServiceUpdater setDefaultTtl(final Integer defaultTtl) {
        this.defaultTtl = defaultTtl;
        return this;
    }

    /**
     * The URL to which Twilio will make callbacks on interaction status changes..
     * 
     * @param callbackUrl URL Twilio will send callbacks to
     * @return this
     */
    public ServiceUpdater setCallbackUrl(final URI callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * The URL to which Twilio will make callbacks on interaction status changes..
     * 
     * @param callbackUrl URL Twilio will send callbacks to
     * @return this
     */
    public ServiceUpdater setCallbackUrl(final String callbackUrl) {
        return setCallbackUrl(Promoter.uriFromString(callbackUrl));
    }

    /**
     * Whether proxy number selected must be in the same area code as the
     * participant identifier. Options: `country`, `area-code`,
     * `extended-area-code`. Default: `country`. Levels lower than country are only
     * available in North America..
     * 
     * @param geoMatchLevel Whether proxy number selected must be in the same area
     *                      code as the participant identifier.
     * @return this
     */
    public ServiceUpdater setGeoMatchLevel(final Service.GeoMatchLevel geoMatchLevel) {
        this.geoMatchLevel = geoMatchLevel;
        return this;
    }

    /**
     * Options: `prefer-sticky`, `avoid-sticky`. Default: `prefer-sticky`..
     * 
     * @param numberSelectionBehavior What behavior to use when choosing a proxy
     *                                number.
     * @return this
     */
    public ServiceUpdater setNumberSelectionBehavior(final Service.NumberSelectionBehavior numberSelectionBehavior) {
        this.numberSelectionBehavior = numberSelectionBehavior;
        return this;
    }

    /**
     * A URL for Twilio call before each Interaction. Returning a 403 status code
     * will prevent the interaction from continuing..
     * 
     * @param interceptCallbackUrl A URL for Twilio call before each Interaction.
     * @return this
     */
    public ServiceUpdater setInterceptCallbackUrl(final URI interceptCallbackUrl) {
        this.interceptCallbackUrl = interceptCallbackUrl;
        return this;
    }

    /**
     * A URL for Twilio call before each Interaction. Returning a 403 status code
     * will prevent the interaction from continuing..
     * 
     * @param interceptCallbackUrl A URL for Twilio call before each Interaction.
     * @return this
     */
    public ServiceUpdater setInterceptCallbackUrl(final String interceptCallbackUrl) {
        return setInterceptCallbackUrl(Promoter.uriFromString(interceptCallbackUrl));
    }

    /**
     * A URL for Twilio call when a new Interaction has no
     * [Session](https://www.twilio.com/docs/proxy/api/session)..
     * 
     * @param outOfSessionCallbackUrl A URL for Twilio call when a new Interaction
     *                                has no Session.
     * @return this
     */
    public ServiceUpdater setOutOfSessionCallbackUrl(final URI outOfSessionCallbackUrl) {
        this.outOfSessionCallbackUrl = outOfSessionCallbackUrl;
        return this;
    }

    /**
     * A URL for Twilio call when a new Interaction has no
     * [Session](https://www.twilio.com/docs/proxy/api/session)..
     * 
     * @param outOfSessionCallbackUrl A URL for Twilio call when a new Interaction
     *                                has no Session.
     * @return this
     */
    public ServiceUpdater setOutOfSessionCallbackUrl(final String outOfSessionCallbackUrl) {
        return setOutOfSessionCallbackUrl(Promoter.uriFromString(outOfSessionCallbackUrl));
    }

    /**
     * Make the request to the Twilio API to perform the update.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Updated Service
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Service update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.PROXY.toString(),
            "/v1/Services/" + this.pathSid + "",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Service update failed: Unable to connect to server");
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

        return Service.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
        }

        if (defaultTtl != null) {
            request.addPostParam("DefaultTtl", defaultTtl.toString());
        }

        if (callbackUrl != null) {
            request.addPostParam("CallbackUrl", callbackUrl.toString());
        }

        if (geoMatchLevel != null) {
            request.addPostParam("GeoMatchLevel", geoMatchLevel.toString());
        }

        if (numberSelectionBehavior != null) {
            request.addPostParam("NumberSelectionBehavior", numberSelectionBehavior.toString());
        }

        if (interceptCallbackUrl != null) {
            request.addPostParam("InterceptCallbackUrl", interceptCallbackUrl.toString());
        }

        if (outOfSessionCallbackUrl != null) {
            request.addPostParam("OutOfSessionCallbackUrl", outOfSessionCallbackUrl.toString());
        }
    }
}