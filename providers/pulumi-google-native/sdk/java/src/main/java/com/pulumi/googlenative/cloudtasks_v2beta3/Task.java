// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudtasks_v2beta3.TaskArgs;
import com.pulumi.googlenative.cloudtasks_v2beta3.outputs.AppEngineHttpRequestResponse;
import com.pulumi.googlenative.cloudtasks_v2beta3.outputs.AttemptResponse;
import com.pulumi.googlenative.cloudtasks_v2beta3.outputs.HttpRequestResponse;
import com.pulumi.googlenative.cloudtasks_v2beta3.outputs.PullMessageResponse;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a task and adds it to a queue. Tasks cannot be updated after creation; there is no UpdateTask command. * The maximum task size is 100KB.
 * 
 */
@ResourceType(type="google-native:cloudtasks/v2beta3:Task")
public class Task extends com.pulumi.resources.CustomResource {
    /**
     * HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    @Export(name="appEngineHttpRequest", type=AppEngineHttpRequestResponse.class, parameters={})
    private Output<AppEngineHttpRequestResponse> appEngineHttpRequest;

    /**
     * @return HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    public Output<AppEngineHttpRequestResponse> appEngineHttpRequest() {
        return this.appEngineHttpRequest;
    }
    /**
     * The time that the task was created. `create_time` will be truncated to the nearest second.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time that the task was created. `create_time` will be truncated to the nearest second.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The number of attempts dispatched. This count includes attempts which have been dispatched but haven&#39;t received a response.
     * 
     */
    @Export(name="dispatchCount", type=Integer.class, parameters={})
    private Output<Integer> dispatchCount;

    /**
     * @return The number of attempts dispatched. This count includes attempts which have been dispatched but haven&#39;t received a response.
     * 
     */
    public Output<Integer> dispatchCount() {
        return this.dispatchCount;
    }
    /**
     * The deadline for requests sent to the worker. If the worker does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the task according to the RetryConfig. Note that when the request is cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops processing depends on the worker. For example, if the worker is stuck, it may not react to cancelled requests. The default and maximum values depend on the type of request: * For HTTP tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30 minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The default deadline depends on the [scaling type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling, 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds]. Regardless of the task&#39;s `dispatch_deadline`, the app handler will not run for longer than than the service&#39;s timeout. We recommend setting the `dispatch_deadline` to at most a few seconds more than the app handler&#39;s timeout. For more information see [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts). `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an approximate deadline.
     * 
     */
    @Export(name="dispatchDeadline", type=String.class, parameters={})
    private Output<String> dispatchDeadline;

    /**
     * @return The deadline for requests sent to the worker. If the worker does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the task according to the RetryConfig. Note that when the request is cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops processing depends on the worker. For example, if the worker is stuck, it may not react to cancelled requests. The default and maximum values depend on the type of request: * For HTTP tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30 minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The default deadline depends on the [scaling type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling, 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds]. Regardless of the task&#39;s `dispatch_deadline`, the app handler will not run for longer than than the service&#39;s timeout. We recommend setting the `dispatch_deadline` to at most a few seconds more than the app handler&#39;s timeout. For more information see [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts). `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an approximate deadline.
     * 
     */
    public Output<String> dispatchDeadline() {
        return this.dispatchDeadline;
    }
    /**
     * The status of the task&#39;s first attempt. Only dispatch_time will be set. The other Attempt information is not retained by Cloud Tasks.
     * 
     */
    @Export(name="firstAttempt", type=AttemptResponse.class, parameters={})
    private Output<AttemptResponse> firstAttempt;

    /**
     * @return The status of the task&#39;s first attempt. Only dispatch_time will be set. The other Attempt information is not retained by Cloud Tasks.
     * 
     */
    public Output<AttemptResponse> firstAttempt() {
        return this.firstAttempt;
    }
    /**
     * HTTP request that is sent to the task&#39;s target. An HTTP task is a task that has HttpRequest set.
     * 
     */
    @Export(name="httpRequest", type=HttpRequestResponse.class, parameters={})
    private Output<HttpRequestResponse> httpRequest;

    /**
     * @return HTTP request that is sent to the task&#39;s target. An HTTP task is a task that has HttpRequest set.
     * 
     */
    public Output<HttpRequestResponse> httpRequest() {
        return this.httpRequest;
    }
    /**
     * The status of the task&#39;s last attempt.
     * 
     */
    @Export(name="lastAttempt", type=AttemptResponse.class, parameters={})
    private Output<AttemptResponse> lastAttempt;

    /**
     * @return The status of the task&#39;s last attempt.
     * 
     */
    public Output<AttemptResponse> lastAttempt() {
        return this.lastAttempt;
    }
    /**
     * Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Pull Message contained in a task in a PULL queue type. This payload type cannot be explicitly set through Cloud Tasks API. Its purpose, currently is to provide backward compatibility with App Engine Task Queue [pull](https://cloud.google.com/appengine/docs/standard/java/taskqueue/pull/) queues to provide a way to inspect contents of pull tasks through the CloudTasks.GetTask.
     * 
     */
    @Export(name="pullMessage", type=PullMessageResponse.class, parameters={})
    private Output<PullMessageResponse> pullMessage;

    /**
     * @return Pull Message contained in a task in a PULL queue type. This payload type cannot be explicitly set through Cloud Tasks API. Its purpose, currently is to provide backward compatibility with App Engine Task Queue [pull](https://cloud.google.com/appengine/docs/standard/java/taskqueue/pull/) queues to provide a way to inspect contents of pull tasks through the CloudTasks.GetTask.
     * 
     */
    public Output<PullMessageResponse> pullMessage() {
        return this.pullMessage;
    }
    /**
     * The number of attempts which have received a response.
     * 
     */
    @Export(name="responseCount", type=Integer.class, parameters={})
    private Output<Integer> responseCount;

    /**
     * @return The number of attempts which have received a response.
     * 
     */
    public Output<Integer> responseCount() {
        return this.responseCount;
    }
    /**
     * The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    @Export(name="scheduleTime", type=String.class, parameters={})
    private Output<String> scheduleTime;

    /**
     * @return The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    public Output<String> scheduleTime() {
        return this.scheduleTime;
    }
    /**
     * The view specifies which subset of the Task has been returned.
     * 
     */
    @Export(name="view", type=String.class, parameters={})
    private Output<String> view;

    /**
     * @return The view specifies which subset of the Task has been returned.
     * 
     */
    public Output<String> view() {
        return this.view;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Task(String name) {
        this(name, TaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Task(String name, TaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Task(String name, TaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtasks/v2beta3:Task", name, args == null ? TaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Task(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtasks/v2beta3:Task", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Task get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Task(name, id, options);
    }
}
