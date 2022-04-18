// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodeGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeGroupArgs Empty = new GetNodeGroupArgs();

    @Import(name="nodeGroup", required=true)
      private final String nodeGroup;

    public String nodeGroup() {
        return this.nodeGroup;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
      private final String zone;

    public String zone() {
        return this.zone;
    }

    public GetNodeGroupArgs(
        String nodeGroup,
        @Nullable String project,
        String zone) {
        this.nodeGroup = Objects.requireNonNull(nodeGroup, "expected parameter 'nodeGroup' to be non-null");
        this.project = project;
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetNodeGroupArgs() {
        this.nodeGroup = null;
        this.project = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nodeGroup;
        private @Nullable String project;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeGroup = defaults.nodeGroup;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder nodeGroup(String nodeGroup) {
            this.nodeGroup = Objects.requireNonNull(nodeGroup);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetNodeGroupArgs build() {
            return new GetNodeGroupArgs(nodeGroup, project, zone);
        }
    }
}
