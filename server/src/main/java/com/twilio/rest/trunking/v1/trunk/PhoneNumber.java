/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.trunking.v1.trunk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhoneNumber extends Resource {
    private static final long serialVersionUID = 152136077896645L;

    public enum AddressRequirement {
        NONE("none"),
        ANY("any"),
        LOCAL("local"),
        FOREIGN("foreign");

        private final String value;

        private AddressRequirement(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a AddressRequirement from a string.
         * @param value string value
         * @return generated AddressRequirement
         */
        @JsonCreator
        public static AddressRequirement forValue(final String value) {
            return Promoter.enumFromString(value, AddressRequirement.values());
        }
    }

    /**
     * Create a PhoneNumberFetcher to execute fetch.
     * 
     * @param pathTrunkSid The trunk_sid
     * @param pathSid The sid
     * @return PhoneNumberFetcher capable of executing the fetch
     */
    public static PhoneNumberFetcher fetcher(final String pathTrunkSid, 
                                             final String pathSid) {
        return new PhoneNumberFetcher(pathTrunkSid, pathSid);
    }

    /**
     * Create a PhoneNumberDeleter to execute delete.
     * 
     * @param pathTrunkSid The trunk_sid
     * @param pathSid The sid
     * @return PhoneNumberDeleter capable of executing the delete
     */
    public static PhoneNumberDeleter deleter(final String pathTrunkSid, 
                                             final String pathSid) {
        return new PhoneNumberDeleter(pathTrunkSid, pathSid);
    }

    /**
     * Create a PhoneNumberCreator to execute create.
     * 
     * @param pathTrunkSid The trunk_sid
     * @param phoneNumberSid The SID of the Incoming Phone Number that you want to
     *                       associate with this trunk.
     * @return PhoneNumberCreator capable of executing the create
     */
    public static PhoneNumberCreator creator(final String pathTrunkSid, 
                                             final String phoneNumberSid) {
        return new PhoneNumberCreator(pathTrunkSid, phoneNumberSid);
    }

    /**
     * Create a PhoneNumberReader to execute read.
     * 
     * @param pathTrunkSid The trunk_sid
     * @return PhoneNumberReader capable of executing the read
     */
    public static PhoneNumberReader reader(final String pathTrunkSid) {
        return new PhoneNumberReader(pathTrunkSid);
    }

    /**
     * Converts a JSON String into a PhoneNumber object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return PhoneNumber object represented by the provided JSON
     */
    public static PhoneNumber fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PhoneNumber.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a PhoneNumber object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return PhoneNumber object represented by the provided JSON
     */
    public static PhoneNumber fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PhoneNumber.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final PhoneNumber.AddressRequirement addressRequirements;
    private final String apiVersion;
    private final Boolean beta;
    private final Map<String, String> capabilities;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String friendlyName;
    private final Map<String, String> links;
    private final com.twilio.type.PhoneNumber phoneNumber;
    private final String sid;
    private final String smsApplicationSid;
    private final HttpMethod smsFallbackMethod;
    private final URI smsFallbackUrl;
    private final HttpMethod smsMethod;
    private final URI smsUrl;
    private final URI statusCallback;
    private final HttpMethod statusCallbackMethod;
    private final String trunkSid;
    private final URI url;
    private final String voiceApplicationSid;
    private final Boolean voiceCallerIdLookup;
    private final HttpMethod voiceFallbackMethod;
    private final URI voiceFallbackUrl;
    private final HttpMethod voiceMethod;
    private final URI voiceUrl;

    @JsonCreator
    private PhoneNumber(@JsonProperty("account_sid")
                        final String accountSid, 
                        @JsonProperty("address_requirements")
                        final PhoneNumber.AddressRequirement addressRequirements, 
                        @JsonProperty("api_version")
                        final String apiVersion, 
                        @JsonProperty("beta")
                        final Boolean beta, 
                        @JsonProperty("capabilities")
                        final Map<String, String> capabilities, 
                        @JsonProperty("date_created")
                        final String dateCreated, 
                        @JsonProperty("date_updated")
                        final String dateUpdated, 
                        @JsonProperty("friendly_name")
                        final String friendlyName, 
                        @JsonProperty("links")
                        final Map<String, String> links, 
                        @JsonProperty("phone_number")
                        final com.twilio.type.PhoneNumber phoneNumber, 
                        @JsonProperty("sid")
                        final String sid, 
                        @JsonProperty("sms_application_sid")
                        final String smsApplicationSid, 
                        @JsonProperty("sms_fallback_method")
                        final HttpMethod smsFallbackMethod, 
                        @JsonProperty("sms_fallback_url")
                        final URI smsFallbackUrl, 
                        @JsonProperty("sms_method")
                        final HttpMethod smsMethod, 
                        @JsonProperty("sms_url")
                        final URI smsUrl, 
                        @JsonProperty("status_callback")
                        final URI statusCallback, 
                        @JsonProperty("status_callback_method")
                        final HttpMethod statusCallbackMethod, 
                        @JsonProperty("trunk_sid")
                        final String trunkSid, 
                        @JsonProperty("url")
                        final URI url, 
                        @JsonProperty("voice_application_sid")
                        final String voiceApplicationSid, 
                        @JsonProperty("voice_caller_id_lookup")
                        final Boolean voiceCallerIdLookup, 
                        @JsonProperty("voice_fallback_method")
                        final HttpMethod voiceFallbackMethod, 
                        @JsonProperty("voice_fallback_url")
                        final URI voiceFallbackUrl, 
                        @JsonProperty("voice_method")
                        final HttpMethod voiceMethod, 
                        @JsonProperty("voice_url")
                        final URI voiceUrl) {
        this.accountSid = accountSid;
        this.addressRequirements = addressRequirements;
        this.apiVersion = apiVersion;
        this.beta = beta;
        this.capabilities = capabilities;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.links = links;
        this.phoneNumber = phoneNumber;
        this.sid = sid;
        this.smsApplicationSid = smsApplicationSid;
        this.smsFallbackMethod = smsFallbackMethod;
        this.smsFallbackUrl = smsFallbackUrl;
        this.smsMethod = smsMethod;
        this.smsUrl = smsUrl;
        this.statusCallback = statusCallback;
        this.statusCallbackMethod = statusCallbackMethod;
        this.trunkSid = trunkSid;
        this.url = url;
        this.voiceApplicationSid = voiceApplicationSid;
        this.voiceCallerIdLookup = voiceCallerIdLookup;
        this.voiceFallbackMethod = voiceFallbackMethod;
        this.voiceFallbackUrl = voiceFallbackUrl;
        this.voiceMethod = voiceMethod;
        this.voiceUrl = voiceUrl;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The address_requirements.
     * 
     * @return The address_requirements
     */
    public final PhoneNumber.AddressRequirement getAddressRequirements() {
        return this.addressRequirements;
    }

    /**
     * Returns The The api_version.
     * 
     * @return The api_version
     */
    public final String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Returns The The beta.
     * 
     * @return The beta
     */
    public final Boolean getBeta() {
        return this.beta;
    }

    /**
     * Returns The The capabilities.
     * 
     * @return The capabilities
     */
    public final Map<String, String> getCapabilities() {
        return this.capabilities;
    }

    /**
     * Returns The The date_created.
     * 
     * @return The date_created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date_updated.
     * 
     * @return The date_updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The friendly_name.
     * 
     * @return The friendly_name
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The The links.
     * 
     * @return The links
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    /**
     * Returns The The phone_number.
     * 
     * @return The phone_number
     */
    public final com.twilio.type.PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Returns The The sid.
     * 
     * @return The sid
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The sms_application_sid.
     * 
     * @return The sms_application_sid
     */
    public final String getSmsApplicationSid() {
        return this.smsApplicationSid;
    }

    /**
     * Returns The The sms_fallback_method.
     * 
     * @return The sms_fallback_method
     */
    public final HttpMethod getSmsFallbackMethod() {
        return this.smsFallbackMethod;
    }

    /**
     * Returns The The sms_fallback_url.
     * 
     * @return The sms_fallback_url
     */
    public final URI getSmsFallbackUrl() {
        return this.smsFallbackUrl;
    }

    /**
     * Returns The The sms_method.
     * 
     * @return The sms_method
     */
    public final HttpMethod getSmsMethod() {
        return this.smsMethod;
    }

    /**
     * Returns The The sms_url.
     * 
     * @return The sms_url
     */
    public final URI getSmsUrl() {
        return this.smsUrl;
    }

    /**
     * Returns The The status_callback.
     * 
     * @return The status_callback
     */
    public final URI getStatusCallback() {
        return this.statusCallback;
    }

    /**
     * Returns The The status_callback_method.
     * 
     * @return The status_callback_method
     */
    public final HttpMethod getStatusCallbackMethod() {
        return this.statusCallbackMethod;
    }

    /**
     * Returns The The trunk_sid.
     * 
     * @return The trunk_sid
     */
    public final String getTrunkSid() {
        return this.trunkSid;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The The voice_application_sid.
     * 
     * @return The voice_application_sid
     */
    public final String getVoiceApplicationSid() {
        return this.voiceApplicationSid;
    }

    /**
     * Returns The The voice_caller_id_lookup.
     * 
     * @return The voice_caller_id_lookup
     */
    public final Boolean getVoiceCallerIdLookup() {
        return this.voiceCallerIdLookup;
    }

    /**
     * Returns The The voice_fallback_method.
     * 
     * @return The voice_fallback_method
     */
    public final HttpMethod getVoiceFallbackMethod() {
        return this.voiceFallbackMethod;
    }

    /**
     * Returns The The voice_fallback_url.
     * 
     * @return The voice_fallback_url
     */
    public final URI getVoiceFallbackUrl() {
        return this.voiceFallbackUrl;
    }

    /**
     * Returns The The voice_method.
     * 
     * @return The voice_method
     */
    public final HttpMethod getVoiceMethod() {
        return this.voiceMethod;
    }

    /**
     * Returns The The voice_url.
     * 
     * @return The voice_url
     */
    public final URI getVoiceUrl() {
        return this.voiceUrl;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PhoneNumber other = (PhoneNumber) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(addressRequirements, other.addressRequirements) && 
               Objects.equals(apiVersion, other.apiVersion) && 
               Objects.equals(beta, other.beta) && 
               Objects.equals(capabilities, other.capabilities) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(links, other.links) && 
               Objects.equals(phoneNumber, other.phoneNumber) && 
               Objects.equals(sid, other.sid) && 
               Objects.equals(smsApplicationSid, other.smsApplicationSid) && 
               Objects.equals(smsFallbackMethod, other.smsFallbackMethod) && 
               Objects.equals(smsFallbackUrl, other.smsFallbackUrl) && 
               Objects.equals(smsMethod, other.smsMethod) && 
               Objects.equals(smsUrl, other.smsUrl) && 
               Objects.equals(statusCallback, other.statusCallback) && 
               Objects.equals(statusCallbackMethod, other.statusCallbackMethod) && 
               Objects.equals(trunkSid, other.trunkSid) && 
               Objects.equals(url, other.url) && 
               Objects.equals(voiceApplicationSid, other.voiceApplicationSid) && 
               Objects.equals(voiceCallerIdLookup, other.voiceCallerIdLookup) && 
               Objects.equals(voiceFallbackMethod, other.voiceFallbackMethod) && 
               Objects.equals(voiceFallbackUrl, other.voiceFallbackUrl) && 
               Objects.equals(voiceMethod, other.voiceMethod) && 
               Objects.equals(voiceUrl, other.voiceUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            addressRequirements,
                            apiVersion,
                            beta,
                            capabilities,
                            dateCreated,
                            dateUpdated,
                            friendlyName,
                            links,
                            phoneNumber,
                            sid,
                            smsApplicationSid,
                            smsFallbackMethod,
                            smsFallbackUrl,
                            smsMethod,
                            smsUrl,
                            statusCallback,
                            statusCallbackMethod,
                            trunkSid,
                            url,
                            voiceApplicationSid,
                            voiceCallerIdLookup,
                            voiceFallbackMethod,
                            voiceFallbackUrl,
                            voiceMethod,
                            voiceUrl);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("addressRequirements", addressRequirements)
                          .add("apiVersion", apiVersion)
                          .add("beta", beta)
                          .add("capabilities", capabilities)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("friendlyName", friendlyName)
                          .add("links", links)
                          .add("phoneNumber", phoneNumber)
                          .add("sid", sid)
                          .add("smsApplicationSid", smsApplicationSid)
                          .add("smsFallbackMethod", smsFallbackMethod)
                          .add("smsFallbackUrl", smsFallbackUrl)
                          .add("smsMethod", smsMethod)
                          .add("smsUrl", smsUrl)
                          .add("statusCallback", statusCallback)
                          .add("statusCallbackMethod", statusCallbackMethod)
                          .add("trunkSid", trunkSid)
                          .add("url", url)
                          .add("voiceApplicationSid", voiceApplicationSid)
                          .add("voiceCallerIdLookup", voiceCallerIdLookup)
                          .add("voiceFallbackMethod", voiceFallbackMethod)
                          .add("voiceFallbackUrl", voiceFallbackUrl)
                          .add("voiceMethod", voiceMethod)
                          .add("voiceUrl", voiceUrl)
                          .toString();
    }
}