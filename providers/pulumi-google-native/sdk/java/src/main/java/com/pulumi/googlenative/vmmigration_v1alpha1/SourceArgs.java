// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.vmmigration_v1alpha1.inputs.VmwareSourceDetailsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * User-provided description of the source.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The labels of the source.
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

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    @Import(name="sourceId", required=true)
      private final Output<String> sourceId;

    public Output<String> sourceId() {
        return this.sourceId;
    }

    /**
     * Vmware type source details.
     * 
     */
    @Import(name="vmware")
      private final @Nullable Output<VmwareSourceDetailsArgs> vmware;

    public Output<VmwareSourceDetailsArgs> vmware() {
        return this.vmware == null ? Codegen.empty() : this.vmware;
    }

    public SourceArgs(
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        Output<String> sourceId,
        @Nullable Output<VmwareSourceDetailsArgs> vmware) {
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.project = project;
        this.requestId = requestId;
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
        this.vmware = vmware;
    }

    private SourceArgs() {
        this.description = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.sourceId = Codegen.empty();
        this.vmware = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private Output<String> sourceId;
        private @Nullable Output<VmwareSourceDetailsArgs> vmware;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.sourceId = defaults.sourceId;
    	      this.vmware = defaults.vmware;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder sourceId(Output<String> sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        public Builder sourceId(String sourceId) {
            this.sourceId = Output.of(Objects.requireNonNull(sourceId));
            return this;
        }
        public Builder vmware(@Nullable Output<VmwareSourceDetailsArgs> vmware) {
            this.vmware = vmware;
            return this;
        }
        public Builder vmware(@Nullable VmwareSourceDetailsArgs vmware) {
            this.vmware = Codegen.ofNullable(vmware);
            return this;
        }        public SourceArgs build() {
            return new SourceArgs(description, labels, location, project, requestId, sourceId, vmware);
        }
    }
}
