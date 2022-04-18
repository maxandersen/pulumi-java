// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.OrderedJobArgs;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.TemplateParameterArgs;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.WorkflowTemplatePlacementArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateArgs Empty = new WorkflowTemplateArgs();

    /**
     * Optional. Timeout duration for the DAG of jobs, expressed in seconds (see JSON representation of duration (https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10 minutes ("600s") to 24 hours ("86400s"). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a managed cluster, the cluster is deleted.
     * 
     */
    @Import(name="dagTimeout")
      private final @Nullable Output<String> dagTimeout;

    public Output<String> dagTimeout() {
        return this.dagTimeout == null ? Codegen.empty() : this.dagTimeout;
    }

    /**
     * The template id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters..
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    @Import(name="jobs", required=true)
      private final Output<List<OrderedJobArgs>> jobs;

    public Output<List<OrderedJobArgs>> jobs() {
        return this.jobs;
    }

    /**
     * Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created by the workflow instance.Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels can be associated with a template.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<TemplateParameterArgs>> parameters;

    public Output<List<TemplateParameterArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * WorkflowTemplate scheduling information.
     * 
     */
    @Import(name="placement", required=true)
      private final Output<WorkflowTemplatePlacementArgs> placement;

    public Output<WorkflowTemplatePlacementArgs> placement() {
        return this.placement;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. Used to perform a consistent read-modify-write.This field should be left blank for a CreateWorkflowTemplate request. It is required for an UpdateWorkflowTemplate request, and must match the current server version. A typical update template flow would fetch the current template with a GetWorkflowTemplate request, which will return the current template with the version field filled in with the current server version. The user updates other fields in the template, then returns it as part of the UpdateWorkflowTemplate request.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Integer> version;

    public Output<Integer> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public WorkflowTemplateArgs(
        @Nullable Output<String> dagTimeout,
        Output<String> id,
        Output<List<OrderedJobArgs>> jobs,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<List<TemplateParameterArgs>> parameters,
        Output<WorkflowTemplatePlacementArgs> placement,
        @Nullable Output<String> project,
        @Nullable Output<Integer> version) {
        this.dagTimeout = dagTimeout;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.jobs = Objects.requireNonNull(jobs, "expected parameter 'jobs' to be non-null");
        this.labels = labels;
        this.location = location;
        this.parameters = parameters;
        this.placement = Objects.requireNonNull(placement, "expected parameter 'placement' to be non-null");
        this.project = project;
        this.version = version;
    }

    private WorkflowTemplateArgs() {
        this.dagTimeout = Codegen.empty();
        this.id = Codegen.empty();
        this.jobs = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.parameters = Codegen.empty();
        this.placement = Codegen.empty();
        this.project = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dagTimeout;
        private Output<String> id;
        private Output<List<OrderedJobArgs>> jobs;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<List<TemplateParameterArgs>> parameters;
        private Output<WorkflowTemplatePlacementArgs> placement;
        private @Nullable Output<String> project;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dagTimeout = defaults.dagTimeout;
    	      this.id = defaults.id;
    	      this.jobs = defaults.jobs;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.parameters = defaults.parameters;
    	      this.placement = defaults.placement;
    	      this.project = defaults.project;
    	      this.version = defaults.version;
        }

        public Builder dagTimeout(@Nullable Output<String> dagTimeout) {
            this.dagTimeout = dagTimeout;
            return this;
        }
        public Builder dagTimeout(@Nullable String dagTimeout) {
            this.dagTimeout = Codegen.ofNullable(dagTimeout);
            return this;
        }
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder jobs(Output<List<OrderedJobArgs>> jobs) {
            this.jobs = Objects.requireNonNull(jobs);
            return this;
        }
        public Builder jobs(List<OrderedJobArgs> jobs) {
            this.jobs = Output.of(Objects.requireNonNull(jobs));
            return this;
        }
        public Builder jobs(OrderedJobArgs... jobs) {
            return jobs(List.of(jobs));
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
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
        public Builder parameters(@Nullable Output<List<TemplateParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<TemplateParameterArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder parameters(TemplateParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder placement(Output<WorkflowTemplatePlacementArgs> placement) {
            this.placement = Objects.requireNonNull(placement);
            return this;
        }
        public Builder placement(WorkflowTemplatePlacementArgs placement) {
            this.placement = Output.of(Objects.requireNonNull(placement));
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
        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Integer version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public WorkflowTemplateArgs build() {
            return new WorkflowTemplateArgs(dagTimeout, id, jobs, labels, location, parameters, placement, project, version);
        }
    }
}
