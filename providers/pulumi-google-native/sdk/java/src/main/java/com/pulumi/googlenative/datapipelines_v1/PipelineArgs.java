// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datapipelines_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datapipelines_v1.enums.PipelineState;
import com.pulumi.googlenative.datapipelines_v1.enums.PipelineType;
import com.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1ScheduleSpecArgs;
import com.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1WorkloadArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    /**
     * The display name of the pipeline. It can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), and underscores (_).
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), and periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects). * `LOCATION_ID` is the canonical ID for the pipeline&#39;s location. The list of available locations can be obtained by calling `google.cloud.location.Locations.ListLocations`. Note that the Data Pipelines service is not available in all regions. It depends on Cloud Scheduler, an App Engine application, so it&#39;s only available in [App Engine regions](https://cloud.google.com/about/locations#region). * `PIPELINE_ID` is the ID of the pipeline. Must be unique for the selected project and location.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Immutable. The sources of the pipeline (for example, Dataplex). The keys and values are set by the corresponding sources during pipeline creation.
     * 
     */
    @Import(name="pipelineSources")
    private @Nullable Output<Map<String,String>> pipelineSources;

    public Optional<Output<Map<String,String>>> pipelineSources() {
        return Optional.ofNullable(this.pipelineSources);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Internal scheduling information for a pipeline. If this information is provided, periodic jobs will be created per the schedule. If not, users are responsible for creating jobs externally.
     * 
     */
    @Import(name="scheduleInfo")
    private @Nullable Output<GoogleCloudDatapipelinesV1ScheduleSpecArgs> scheduleInfo;

    public Optional<Output<GoogleCloudDatapipelinesV1ScheduleSpecArgs>> scheduleInfo() {
        return Optional.ofNullable(this.scheduleInfo);
    }

    /**
     * Optional. A service account email to be used with the Cloud Scheduler job. If not specified, the default compute engine service account will be used.
     * 
     */
    @Import(name="schedulerServiceAccountEmail")
    private @Nullable Output<String> schedulerServiceAccountEmail;

    public Optional<Output<String>> schedulerServiceAccountEmail() {
        return Optional.ofNullable(this.schedulerServiceAccountEmail);
    }

    /**
     * The state of the pipeline. When the pipeline is created, the state is set to &#39;PIPELINE_STATE_ACTIVE&#39; by default. State changes can be requested by setting the state to stopping, paused, or resuming. State cannot be changed through UpdatePipeline requests.
     * 
     */
    @Import(name="state", required=true)
    private Output<PipelineState> state;

    public Output<PipelineState> state() {
        return this.state;
    }

    /**
     * The type of the pipeline. This field affects the scheduling of the pipeline and the type of metrics to show for the pipeline.
     * 
     */
    @Import(name="type", required=true)
    private Output<PipelineType> type;

    public Output<PipelineType> type() {
        return this.type;
    }

    /**
     * Workload information for creating new jobs.
     * 
     */
    @Import(name="workload")
    private @Nullable Output<GoogleCloudDatapipelinesV1WorkloadArgs> workload;

    public Optional<Output<GoogleCloudDatapipelinesV1WorkloadArgs>> workload() {
        return Optional.ofNullable(this.workload);
    }

    private PipelineArgs() {}

    private PipelineArgs(PipelineArgs $) {
        this.displayName = $.displayName;
        this.location = $.location;
        this.name = $.name;
        this.pipelineSources = $.pipelineSources;
        this.project = $.project;
        this.scheduleInfo = $.scheduleInfo;
        this.schedulerServiceAccountEmail = $.schedulerServiceAccountEmail;
        this.state = $.state;
        this.type = $.type;
        this.workload = $.workload;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineArgs $;

        public Builder() {
            $ = new PipelineArgs();
        }

        public Builder(PipelineArgs defaults) {
            $ = new PipelineArgs(Objects.requireNonNull(defaults));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder pipelineSources(@Nullable Output<Map<String,String>> pipelineSources) {
            $.pipelineSources = pipelineSources;
            return this;
        }

        public Builder pipelineSources(Map<String,String> pipelineSources) {
            return pipelineSources(Output.of(pipelineSources));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder scheduleInfo(@Nullable Output<GoogleCloudDatapipelinesV1ScheduleSpecArgs> scheduleInfo) {
            $.scheduleInfo = scheduleInfo;
            return this;
        }

        public Builder scheduleInfo(GoogleCloudDatapipelinesV1ScheduleSpecArgs scheduleInfo) {
            return scheduleInfo(Output.of(scheduleInfo));
        }

        public Builder schedulerServiceAccountEmail(@Nullable Output<String> schedulerServiceAccountEmail) {
            $.schedulerServiceAccountEmail = schedulerServiceAccountEmail;
            return this;
        }

        public Builder schedulerServiceAccountEmail(String schedulerServiceAccountEmail) {
            return schedulerServiceAccountEmail(Output.of(schedulerServiceAccountEmail));
        }

        public Builder state(Output<PipelineState> state) {
            $.state = state;
            return this;
        }

        public Builder state(PipelineState state) {
            return state(Output.of(state));
        }

        public Builder type(Output<PipelineType> type) {
            $.type = type;
            return this;
        }

        public Builder type(PipelineType type) {
            return type(Output.of(type));
        }

        public Builder workload(@Nullable Output<GoogleCloudDatapipelinesV1WorkloadArgs> workload) {
            $.workload = workload;
            return this;
        }

        public Builder workload(GoogleCloudDatapipelinesV1WorkloadArgs workload) {
            return workload(Output.of(workload));
        }

        public PipelineArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
