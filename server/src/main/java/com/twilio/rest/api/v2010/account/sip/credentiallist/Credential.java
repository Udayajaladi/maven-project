/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.sip.credentiallist;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
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
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Credential extends Resource {
    private static final long serialVersionUID = 207131851434233L;

    /**
     * Create a CredentialReader to execute read.
     * 
     * @param pathAccountSid The account_sid
     * @param pathCredentialListSid The credential_list_sid
     * @return CredentialReader capable of executing the read
     */
    public static CredentialReader reader(final String pathAccountSid, 
                                          final String pathCredentialListSid) {
        return new CredentialReader(pathAccountSid, pathCredentialListSid);
    }

    /**
     * Create a CredentialReader to execute read.
     * 
     * @param pathCredentialListSid The credential_list_sid
     * @return CredentialReader capable of executing the read
     */
    public static CredentialReader reader(final String pathCredentialListSid) {
        return new CredentialReader(pathCredentialListSid);
    }

    /**
     * Create a CredentialCreator to execute create.
     * 
     * @param pathAccountSid The account_sid
     * @param pathCredentialListSid The credential_list_sid
     * @param username The username for this credential.
     * @param password The password will not be returned in the response.
     * @return CredentialCreator capable of executing the create
     */
    public static CredentialCreator creator(final String pathAccountSid, 
                                            final String pathCredentialListSid, 
                                            final String username, 
                                            final String password) {
        return new CredentialCreator(pathAccountSid, pathCredentialListSid, username, password);
    }

    /**
     * Create a CredentialCreator to execute create.
     * 
     * @param pathCredentialListSid The credential_list_sid
     * @param username The username for this credential.
     * @param password The password will not be returned in the response.
     * @return CredentialCreator capable of executing the create
     */
    public static CredentialCreator creator(final String pathCredentialListSid, 
                                            final String username, 
                                            final String password) {
        return new CredentialCreator(pathCredentialListSid, username, password);
    }

    /**
     * Create a CredentialFetcher to execute fetch.
     * 
     * @param pathAccountSid The account_sid
     * @param pathCredentialListSid The credential_list_sid
     * @param pathSid The sid
     * @return CredentialFetcher capable of executing the fetch
     */
    public static CredentialFetcher fetcher(final String pathAccountSid, 
                                            final String pathCredentialListSid, 
                                            final String pathSid) {
        return new CredentialFetcher(pathAccountSid, pathCredentialListSid, pathSid);
    }

    /**
     * Create a CredentialFetcher to execute fetch.
     * 
     * @param pathCredentialListSid The credential_list_sid
     * @param pathSid The sid
     * @return CredentialFetcher capable of executing the fetch
     */
    public static CredentialFetcher fetcher(final String pathCredentialListSid, 
                                            final String pathSid) {
        return new CredentialFetcher(pathCredentialListSid, pathSid);
    }

    /**
     * Create a CredentialUpdater to execute update.
     * 
     * @param pathAccountSid The account_sid
     * @param pathCredentialListSid The credential_list_sid
     * @param pathSid The sid
     * @return CredentialUpdater capable of executing the update
     */
    public static CredentialUpdater updater(final String pathAccountSid, 
                                            final String pathCredentialListSid, 
                                            final String pathSid) {
        return new CredentialUpdater(pathAccountSid, pathCredentialListSid, pathSid);
    }

    /**
     * Create a CredentialUpdater to execute update.
     * 
     * @param pathCredentialListSid The credential_list_sid
     * @param pathSid The sid
     * @return CredentialUpdater capable of executing the update
     */
    public static CredentialUpdater updater(final String pathCredentialListSid, 
                                            final String pathSid) {
        return new CredentialUpdater(pathCredentialListSid, pathSid);
    }

    /**
     * Create a CredentialDeleter to execute delete.
     * 
     * @param pathAccountSid The account_sid
     * @param pathCredentialListSid The credential_list_sid
     * @param pathSid The sid
     * @return CredentialDeleter capable of executing the delete
     */
    public static CredentialDeleter deleter(final String pathAccountSid, 
                                            final String pathCredentialListSid, 
                                            final String pathSid) {
        return new CredentialDeleter(pathAccountSid, pathCredentialListSid, pathSid);
    }

    /**
     * Create a CredentialDeleter to execute delete.
     * 
     * @param pathCredentialListSid The credential_list_sid
     * @param pathSid The sid
     * @return CredentialDeleter capable of executing the delete
     */
    public static CredentialDeleter deleter(final String pathCredentialListSid, 
                                            final String pathSid) {
        return new CredentialDeleter(pathCredentialListSid, pathSid);
    }

    /**
     * Converts a JSON String into a Credential object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Credential object represented by the provided JSON
     */
    public static Credential fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Credential.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Credential object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Credential object represented by the provided JSON
     */
    public static Credential fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Credential.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String credentialListSid;
    private final String username;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String uri;

    @JsonCreator
    private Credential(@JsonProperty("sid")
                       final String sid, 
                       @JsonProperty("account_sid")
                       final String accountSid, 
                       @JsonProperty("credential_list_sid")
                       final String credentialListSid, 
                       @JsonProperty("username")
                       final String username, 
                       @JsonProperty("date_created")
                       final String dateCreated, 
                       @JsonProperty("date_updated")
                       final String dateUpdated, 
                       @JsonProperty("uri")
                       final String uri) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.credentialListSid = credentialListSid;
        this.username = username;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.uri = uri;
    }

    /**
     * Returns The A 34 character string that uniquely identifies this resource..
     * 
     * @return A 34 character string that uniquely identifies this resource.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The unique id of the Account that responsible for this resource..
     * 
     * @return The unique id of the Account that responsible for this resource.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The credential_list_sid.
     * 
     * @return The credential_list_sid
     */
    public final String getCredentialListSid() {
        return this.credentialListSid;
    }

    /**
     * Returns The The username for this credential..
     * 
     * @return The username for this credential.
     */
    public final String getUsername() {
        return this.username;
    }

    /**
     * Returns The The date that this resource was created, given as GMT in RFC 2822
     * format..
     * 
     * @return The date that this resource was created, given as GMT in RFC 2822
     *         format.
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date that this resource was last updated, given as GMT in RFC
     * 2822 format..
     * 
     * @return The date that this resource was last updated, given as GMT in RFC
     *         2822 format.
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The URI for this resource, relative to https://api..
     * 
     * @return The URI for this resource, relative to https://api.
     */
    public final String getUri() {
        return this.uri;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Credential other = (Credential) o;

        return Objects.equals(sid, other.sid) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(credentialListSid, other.credentialListSid) && 
               Objects.equals(username, other.username) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(uri, other.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            credentialListSid,
                            username,
                            dateCreated,
                            dateUpdated,
                            uri);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("credentialListSid", credentialListSid)
                          .add("username", username)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("uri", uri)
                          .toString();
    }
}