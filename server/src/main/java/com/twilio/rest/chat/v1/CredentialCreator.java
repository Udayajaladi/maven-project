/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.chat.v1;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class CredentialCreator extends Creator<Credential> {
    private final Credential.PushService type;
    private String friendlyName;
    private String certificate;
    private String privateKey;
    private Boolean sandbox;
    private String apiKey;
    private String secret;

    /**
     * Construct a new CredentialCreator.
     * 
     * @param type Credential type, one of "gcm" or "apn"
     */
    public CredentialCreator(final Credential.PushService type) {
        this.type = type;
    }

    /**
     * Friendly name for stored credential.
     * 
     * @param friendlyName Friendly name for stored credential
     * @return this
     */
    public CredentialCreator setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * [APN only] URL encoded representation of the certificate, e.g. `-----BEGIN
     * CERTIFICATE-----MIIFnTCCBIWgAwIBAgIIAjy9H849+E8wDQYJKoZIhvcNAQEFBQAwgZYxCzAJBgNV.....A==-----END CERTIFICATE-----`.
     * 
     * @param certificate [APN only] URL encoded representation of the certificate,
     *                    e.
     * @return this
     */
    public CredentialCreator setCertificate(final String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * [APN only] URL encoded representation of the private key, e.g. `-----BEGIN
     * RSA PRIVATE
     * KEY-----MIIEpQIBAAKCAQEAuyf/lNrH9ck8DmNyo3fGgvCI1l9s+cmBY3WIz+cUDqmxiieR\n.-----END RSA PRIVATE KEY-----`.
     * 
     * @param privateKey [APN only] URL encoded representation of the private key,
     *                   e.
     * @return this
     */
    public CredentialCreator setPrivateKey(final String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * [APN only] use this credential for sending to production or sandbox APNs
     * (string `true` or `false`).
     * 
     * @param sandbox [APN only] use this credential for sending to production or
     *                sandbox APNs
     * @return this
     */
    public CredentialCreator setSandbox(final Boolean sandbox) {
        this.sandbox = sandbox;
        return this;
    }

    /**
     * [GCM only] This is the "API key" for project from Google Developer console
     * for your GCM Service application credential.
     * 
     * @param apiKey [GCM only] This is the "API key" for project from Google
     *               Developer console for your GCM Service application credential
     * @return this
     */
    public CredentialCreator setApiKey(final String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The secret.
     * 
     * @param secret The secret
     * @return this
     */
    public CredentialCreator setSecret(final String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Created Credential
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Credential create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.CHAT.toString(),
            "/v1/Credentials",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Credential creation failed: Unable to connect to server");
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

        return Credential.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (type != null) {
            request.addPostParam("Type", type.toString());
        }

        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (certificate != null) {
            request.addPostParam("Certificate", certificate);
        }

        if (privateKey != null) {
            request.addPostParam("PrivateKey", privateKey);
        }

        if (sandbox != null) {
            request.addPostParam("Sandbox", sandbox.toString());
        }

        if (apiKey != null) {
            request.addPostParam("ApiKey", apiKey);
        }

        if (secret != null) {
            request.addPostParam("Secret", secret);
        }
    }
}