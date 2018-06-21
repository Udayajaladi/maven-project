/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.video.v1.room.participant;

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
public class PublishedTrack extends Resource {
    private static final long serialVersionUID = 4379513694924L;

    public enum Kind {
        AUDIO("audio"),
        VIDEO("video"),
        DATA("data");

        private final String value;

        private Kind(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Kind from a string.
         * @param value string value
         * @return generated Kind
         */
        @JsonCreator
        public static Kind forValue(final String value) {
            return Promoter.enumFromString(value, Kind.values());
        }
    }

    /**
     * Create a PublishedTrackFetcher to execute fetch.
     * 
     * @param pathRoomSid Unique Room identifier where this Track is published.
     * @param pathParticipantSid Unique Participant identifier that publishes this
     *                           Track.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     * @return PublishedTrackFetcher capable of executing the fetch
     */
    public static PublishedTrackFetcher fetcher(final String pathRoomSid, 
                                                final String pathParticipantSid, 
                                                final String pathSid) {
        return new PublishedTrackFetcher(pathRoomSid, pathParticipantSid, pathSid);
    }

    /**
     * Create a PublishedTrackReader to execute read.
     * 
     * @param pathRoomSid Unique Room identifier where this Track is published.
     * @param pathParticipantSid Unique Participant identifier that publishes this
     *                           Track.
     * @return PublishedTrackReader capable of executing the read
     */
    public static PublishedTrackReader reader(final String pathRoomSid, 
                                              final String pathParticipantSid) {
        return new PublishedTrackReader(pathRoomSid, pathParticipantSid);
    }

    /**
     * Converts a JSON String into a PublishedTrack object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return PublishedTrack object represented by the provided JSON
     */
    public static PublishedTrack fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PublishedTrack.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a PublishedTrack object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return PublishedTrack object represented by the provided JSON
     */
    public static PublishedTrack fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PublishedTrack.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String participantSid;
    private final String roomSid;
    private final String name;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final Boolean enabled;
    private final PublishedTrack.Kind kind;
    private final URI url;

    @JsonCreator
    private PublishedTrack(@JsonProperty("sid")
                           final String sid, 
                           @JsonProperty("participant_sid")
                           final String participantSid, 
                           @JsonProperty("room_sid")
                           final String roomSid, 
                           @JsonProperty("name")
                           final String name, 
                           @JsonProperty("date_created")
                           final String dateCreated, 
                           @JsonProperty("date_updated")
                           final String dateUpdated, 
                           @JsonProperty("enabled")
                           final Boolean enabled, 
                           @JsonProperty("kind")
                           final PublishedTrack.Kind kind, 
                           @JsonProperty("url")
                           final URI url) {
        this.sid = sid;
        this.participantSid = participantSid;
        this.roomSid = roomSid;
        this.name = name;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.enabled = enabled;
        this.kind = kind;
        this.url = url;
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
     * Returns The Unique Participant identifier that publishes this Track..
     * 
     * @return Unique Participant identifier that publishes this Track.
     */
    public final String getParticipantSid() {
        return this.participantSid;
    }

    /**
     * Returns The Unique Room identifier where this Track is published..
     * 
     * @return Unique Room identifier where this Track is published.
     */
    public final String getRoomSid() {
        return this.roomSid;
    }

    /**
     * Returns The Track name. Limited to 128 characters..
     * 
     * @return Track name. Limited to 128 characters.
     */
    public final String getName() {
        return this.name;
    }

    /**
     * Returns The The date that this resource was created..
     * 
     * @return The date that this resource was created.
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date that this resource was last updated..
     * 
     * @return The date that this resource was last updated.
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The Specifies whether the Track is enabled or not..
     * 
     * @return Specifies whether the Track is enabled or not.
     */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Returns The Specifies whether Track represents `audio`, `video` or `data`.
     * 
     * @return Specifies whether Track represents `audio`, `video` or `data`
     */
    public final PublishedTrack.Kind getKind() {
        return this.kind;
    }

    /**
     * Returns The The absolute URL for this resource..
     * 
     * @return The absolute URL for this resource.
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PublishedTrack other = (PublishedTrack) o;

        return Objects.equals(sid, other.sid) && 
               Objects.equals(participantSid, other.participantSid) && 
               Objects.equals(roomSid, other.roomSid) && 
               Objects.equals(name, other.name) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(enabled, other.enabled) && 
               Objects.equals(kind, other.kind) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            participantSid,
                            roomSid,
                            name,
                            dateCreated,
                            dateUpdated,
                            enabled,
                            kind,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("participantSid", participantSid)
                          .add("roomSid", roomSid)
                          .add("name", name)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("enabled", enabled)
                          .add("kind", kind)
                          .add("url", url)
                          .toString();
    }
}