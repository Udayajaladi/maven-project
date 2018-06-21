/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace.worker;

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
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkerChannel extends Resource {
    private static final long serialVersionUID = 181596062682267L;

    /**
     * Create a WorkerChannelReader to execute read.
     * 
     * @param pathWorkspaceSid The workspace_sid
     * @param pathWorkerSid The worker_sid
     * @return WorkerChannelReader capable of executing the read
     */
    public static WorkerChannelReader reader(final String pathWorkspaceSid, 
                                             final String pathWorkerSid) {
        return new WorkerChannelReader(pathWorkspaceSid, pathWorkerSid);
    }

    /**
     * Create a WorkerChannelFetcher to execute fetch.
     * 
     * @param pathWorkspaceSid The workspace_sid
     * @param pathWorkerSid The worker_sid
     * @param pathSid The sid
     * @return WorkerChannelFetcher capable of executing the fetch
     */
    public static WorkerChannelFetcher fetcher(final String pathWorkspaceSid, 
                                               final String pathWorkerSid, 
                                               final String pathSid) {
        return new WorkerChannelFetcher(pathWorkspaceSid, pathWorkerSid, pathSid);
    }

    /**
     * Create a WorkerChannelUpdater to execute update.
     * 
     * @param pathWorkspaceSid The workspace_sid
     * @param pathWorkerSid The worker_sid
     * @param pathSid The sid
     * @return WorkerChannelUpdater capable of executing the update
     */
    public static WorkerChannelUpdater updater(final String pathWorkspaceSid, 
                                               final String pathWorkerSid, 
                                               final String pathSid) {
        return new WorkerChannelUpdater(pathWorkspaceSid, pathWorkerSid, pathSid);
    }

    /**
     * Converts a JSON String into a WorkerChannel object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return WorkerChannel object represented by the provided JSON
     */
    public static WorkerChannel fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkerChannel.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a WorkerChannel object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return WorkerChannel object represented by the provided JSON
     */
    public static WorkerChannel fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkerChannel.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final Integer assignedTasks;
    private final Boolean available;
    private final Integer availableCapacityPercentage;
    private final Integer configuredCapacity;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String sid;
    private final String taskChannelSid;
    private final String taskChannelUniqueName;
    private final String workerSid;
    private final String workspaceSid;
    private final URI url;

    @JsonCreator
    private WorkerChannel(@JsonProperty("account_sid")
                          final String accountSid, 
                          @JsonProperty("assigned_tasks")
                          final Integer assignedTasks, 
                          @JsonProperty("available")
                          final Boolean available, 
                          @JsonProperty("available_capacity_percentage")
                          final Integer availableCapacityPercentage, 
                          @JsonProperty("configured_capacity")
                          final Integer configuredCapacity, 
                          @JsonProperty("date_created")
                          final String dateCreated, 
                          @JsonProperty("date_updated")
                          final String dateUpdated, 
                          @JsonProperty("sid")
                          final String sid, 
                          @JsonProperty("task_channel_sid")
                          final String taskChannelSid, 
                          @JsonProperty("task_channel_unique_name")
                          final String taskChannelUniqueName, 
                          @JsonProperty("worker_sid")
                          final String workerSid, 
                          @JsonProperty("workspace_sid")
                          final String workspaceSid, 
                          @JsonProperty("url")
                          final URI url) {
        this.accountSid = accountSid;
        this.assignedTasks = assignedTasks;
        this.available = available;
        this.availableCapacityPercentage = availableCapacityPercentage;
        this.configuredCapacity = configuredCapacity;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.sid = sid;
        this.taskChannelSid = taskChannelSid;
        this.taskChannelUniqueName = taskChannelUniqueName;
        this.workerSid = workerSid;
        this.workspaceSid = workspaceSid;
        this.url = url;
    }

    /**
     * Returns The The unique ID of the Account that owns this WorkerChannel..
     * 
     * @return The unique ID of the Account that owns this WorkerChannel.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The total number of tasks assigned to Worker for this TaskChannel
     * type..
     * 
     * @return The total number of tasks assigned to Worker for this TaskChannel
     *         type.
     */
    public final Integer getAssignedTasks() {
        return this.assignedTasks;
    }

    /**
     * Returns The Boolean value indicating whether the worker should receive Tasks
     * of this TaskChannel type..
     * 
     * @return Boolean value indicating whether the worker should receive Tasks of
     *         this TaskChannel type.
     */
    public final Boolean getAvailable() {
        return this.available;
    }

    /**
     * Returns The The current available capacity between 0 to 100 for this
     * TaskChannel..
     * 
     * @return The current available capacity between 0 to 100 for this TaskChannel.
     */
    public final Integer getAvailableCapacityPercentage() {
        return this.availableCapacityPercentage;
    }

    /**
     * Returns The The current configured capacity for the WorkerChannel..
     * 
     * @return The current configured capacity for the WorkerChannel.
     */
    public final Integer getConfiguredCapacity() {
        return this.configuredCapacity;
    }

    /**
     * Returns The The date this Activity was created..
     * 
     * @return The date this Activity was created.
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date this Activity was updated..
     * 
     * @return The date this Activity was updated.
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The unique ID for this WorkerChannel..
     * 
     * @return The unique ID for this WorkerChannel.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The unique ID of the TaskChannel..
     * 
     * @return The unique ID of the TaskChannel.
     */
    public final String getTaskChannelSid() {
        return this.taskChannelSid;
    }

    /**
     * Returns The The unique name of TaskChannel, such as 'voice', 'sms', etc..
     * 
     * @return The unique name of TaskChannel, such as 'voice', 'sms', etc.
     */
    public final String getTaskChannelUniqueName() {
        return this.taskChannelUniqueName;
    }

    /**
     * Returns The The unique ID of the Worker that this WorkerChannel belongs to..
     * 
     * @return The unique ID of the Worker that this WorkerChannel belongs to.
     */
    public final String getWorkerSid() {
        return this.workerSid;
    }

    /**
     * Returns The The unique ID of the Workspace that this WorkerChannel belongs
     * to..
     * 
     * @return The unique ID of the Workspace that this WorkerChannel belongs to.
     */
    public final String getWorkspaceSid() {
        return this.workspaceSid;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
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

        WorkerChannel other = (WorkerChannel) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(assignedTasks, other.assignedTasks) && 
               Objects.equals(available, other.available) && 
               Objects.equals(availableCapacityPercentage, other.availableCapacityPercentage) && 
               Objects.equals(configuredCapacity, other.configuredCapacity) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(sid, other.sid) && 
               Objects.equals(taskChannelSid, other.taskChannelSid) && 
               Objects.equals(taskChannelUniqueName, other.taskChannelUniqueName) && 
               Objects.equals(workerSid, other.workerSid) && 
               Objects.equals(workspaceSid, other.workspaceSid) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            assignedTasks,
                            available,
                            availableCapacityPercentage,
                            configuredCapacity,
                            dateCreated,
                            dateUpdated,
                            sid,
                            taskChannelSid,
                            taskChannelUniqueName,
                            workerSid,
                            workspaceSid,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("assignedTasks", assignedTasks)
                          .add("available", available)
                          .add("availableCapacityPercentage", availableCapacityPercentage)
                          .add("configuredCapacity", configuredCapacity)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("sid", sid)
                          .add("taskChannelSid", taskChannelSid)
                          .add("taskChannelUniqueName", taskChannelUniqueName)
                          .add("workerSid", workerSid)
                          .add("workspaceSid", workspaceSid)
                          .add("url", url)
                          .toString();
    }
}