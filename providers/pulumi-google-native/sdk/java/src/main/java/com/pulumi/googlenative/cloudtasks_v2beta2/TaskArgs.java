// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.cloudtasks_v2beta2.enums.TaskResponseView;
import com.pulumi.googlenative.cloudtasks_v2beta2.inputs.AppEngineHttpRequestArgs;
import com.pulumi.googlenative.cloudtasks_v2beta2.inputs.PullMessageArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskArgs Empty = new TaskArgs();

    /**
     * App Engine HTTP request that is sent to the task's target. Can be set only if app_engine_http_target is set on the queue. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    @Import(name="appEngineHttpRequest")
      private final @Nullable Output<AppEngineHttpRequestArgs> appEngineHttpRequest;

    public Output<AppEngineHttpRequestArgs> appEngineHttpRequest() {
        return this.appEngineHttpRequest == null ? Codegen.empty() : this.appEngineHttpRequest;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * LeaseTasks to process the task. Can be set only if pull_target is set on the queue. A pull task is a task that has PullMessage set.
     * 
     */
    @Import(name="pullMessage")
      private final @Nullable Output<PullMessageArgs> pullMessage;

    public Output<PullMessageArgs> pullMessage() {
        return this.pullMessage == null ? Codegen.empty() : this.pullMessage;
    }

    @Import(name="queueId", required=true)
      private final Output<String> queueId;

    public Output<String> queueId() {
        return this.queueId;
    }

    /**
     * The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
     * 
     */
    @Import(name="responseView")
      private final @Nullable Output<TaskResponseView> responseView;

    public Output<TaskResponseView> responseView() {
        return this.responseView == null ? Codegen.empty() : this.responseView;
    }

    /**
     * The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. For pull queues, this is the time when the task is available to be leased; if a task is currently leased, this is the time when the current lease expires, that is, the time that the task was leased plus the lease_duration. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    @Import(name="scheduleTime")
      private final @Nullable Output<String> scheduleTime;

    public Output<String> scheduleTime() {
        return this.scheduleTime == null ? Codegen.empty() : this.scheduleTime;
    }

    public TaskArgs(
        @Nullable Output<AppEngineHttpRequestArgs> appEngineHttpRequest,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<PullMessageArgs> pullMessage,
        Output<String> queueId,
        @Nullable Output<TaskResponseView> responseView,
        @Nullable Output<String> scheduleTime) {
        this.appEngineHttpRequest = appEngineHttpRequest;
        this.location = location;
        this.name = name;
        this.project = project;
        this.pullMessage = pullMessage;
        this.queueId = Objects.requireNonNull(queueId, "expected parameter 'queueId' to be non-null");
        this.responseView = responseView;
        this.scheduleTime = scheduleTime;
    }

    private TaskArgs() {
        this.appEngineHttpRequest = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.pullMessage = Codegen.empty();
        this.queueId = Codegen.empty();
        this.responseView = Codegen.empty();
        this.scheduleTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AppEngineHttpRequestArgs> appEngineHttpRequest;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<PullMessageArgs> pullMessage;
        private Output<String> queueId;
        private @Nullable Output<TaskResponseView> responseView;
        private @Nullable Output<String> scheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpRequest = defaults.appEngineHttpRequest;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pullMessage = defaults.pullMessage;
    	      this.queueId = defaults.queueId;
    	      this.responseView = defaults.responseView;
    	      this.scheduleTime = defaults.scheduleTime;
        }

        public Builder appEngineHttpRequest(@Nullable Output<AppEngineHttpRequestArgs> appEngineHttpRequest) {
            this.appEngineHttpRequest = appEngineHttpRequest;
            return this;
        }
        public Builder appEngineHttpRequest(@Nullable AppEngineHttpRequestArgs appEngineHttpRequest) {
            this.appEngineHttpRequest = Codegen.ofNullable(appEngineHttpRequest);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder pullMessage(@Nullable Output<PullMessageArgs> pullMessage) {
            this.pullMessage = pullMessage;
            return this;
        }
        public Builder pullMessage(@Nullable PullMessageArgs pullMessage) {
            this.pullMessage = Codegen.ofNullable(pullMessage);
            return this;
        }
        public Builder queueId(Output<String> queueId) {
            this.queueId = Objects.requireNonNull(queueId);
            return this;
        }
        public Builder queueId(String queueId) {
            this.queueId = Output.of(Objects.requireNonNull(queueId));
            return this;
        }
        public Builder responseView(@Nullable Output<TaskResponseView> responseView) {
            this.responseView = responseView;
            return this;
        }
        public Builder responseView(@Nullable TaskResponseView responseView) {
            this.responseView = Codegen.ofNullable(responseView);
            return this;
        }
        public Builder scheduleTime(@Nullable Output<String> scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public Builder scheduleTime(@Nullable String scheduleTime) {
            this.scheduleTime = Codegen.ofNullable(scheduleTime);
            return this;
        }        public TaskArgs build() {
            return new TaskArgs(appEngineHttpRequest, location, name, project, pullMessage, queueId, responseView, scheduleTime);
        }
    }
}
