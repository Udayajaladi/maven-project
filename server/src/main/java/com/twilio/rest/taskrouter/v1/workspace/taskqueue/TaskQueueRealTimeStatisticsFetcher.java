/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace.taskqueue;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class TaskQueueRealTimeStatisticsFetcher extends Fetcher<TaskQueueRealTimeStatistics> {
    private final String pathWorkspaceSid;
    private final String pathTaskQueueSid;
    private String taskChannel;

    /**
     * Construct a new TaskQueueRealTimeStatisticsFetcher.
     * 
     * @param pathWorkspaceSid The workspace_sid
     * @param pathTaskQueueSid The task_queue_sid
     */
    public TaskQueueRealTimeStatisticsFetcher(final String pathWorkspaceSid, 
                                              final String pathTaskQueueSid) {
        this.pathWorkspaceSid = pathWorkspaceSid;
        this.pathTaskQueueSid = pathTaskQueueSid;
    }

    /**
     * Filter real-time and cumulative statistics by TaskChannel. Takes in a Unique
     * Name ("voice", "sms", "default", etc.) or a TaskChannelSid..
     * 
     * @param taskChannel Filter real-time and cumulative statistics by TaskChannel.
     * @return this
     */
    public TaskQueueRealTimeStatisticsFetcher setTaskChannel(final String taskChannel) {
        this.taskChannel = taskChannel;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Fetched TaskQueueRealTimeStatistics
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public TaskQueueRealTimeStatistics fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.TASKROUTER.toString(),
            "/v1/Workspaces/" + this.pathWorkspaceSid + "/TaskQueues/" + this.pathTaskQueueSid + "/RealTimeStatistics",
            client.getRegion()
        );

        addQueryParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("TaskQueueRealTimeStatistics fetch failed: Unable to connect to server");
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

        return TaskQueueRealTimeStatistics.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested query string arguments to the Request.
     * 
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (taskChannel != null) {
            request.addQueryParam("TaskChannel", taskChannel);
        }
    }
}