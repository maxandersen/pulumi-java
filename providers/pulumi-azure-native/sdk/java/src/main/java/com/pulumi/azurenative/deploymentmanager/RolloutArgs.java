// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager;

import com.pulumi.azurenative.deploymentmanager.inputs.IdentityArgs;
import com.pulumi.azurenative.deploymentmanager.inputs.StepGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RolloutArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolloutArgs Empty = new RolloutArgs();

    /**
     * The reference to the artifact source resource Id where the payload is located.
     * 
     */
    @Import(name="artifactSourceId")
      private final @Nullable Output<String> artifactSourceId;

    public Output<String> artifactSourceId() {
        return this.artifactSourceId == null ? Codegen.empty() : this.artifactSourceId;
    }

    /**
     * The version of the build being deployed.
     * 
     */
    @Import(name="buildVersion", required=true)
      private final Output<String> buildVersion;

    public Output<String> buildVersion() {
        return this.buildVersion;
    }

    /**
     * Identity for the resource.
     * 
     */
    @Import(name="identity", required=true)
      private final Output<IdentityArgs> identity;

    public Output<IdentityArgs> identity() {
        return this.identity;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The rollout name.
     * 
     */
    @Import(name="rolloutName")
      private final @Nullable Output<String> rolloutName;

    public Output<String> rolloutName() {
        return this.rolloutName == null ? Codegen.empty() : this.rolloutName;
    }

    /**
     * The list of step groups that define the orchestration.
     * 
     */
    @Import(name="stepGroups", required=true)
      private final Output<List<StepGroupArgs>> stepGroups;

    public Output<List<StepGroupArgs>> stepGroups() {
        return this.stepGroups;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The resource Id of the service topology from which service units are being referenced in step groups to be deployed.
     * 
     */
    @Import(name="targetServiceTopologyId", required=true)
      private final Output<String> targetServiceTopologyId;

    public Output<String> targetServiceTopologyId() {
        return this.targetServiceTopologyId;
    }

    public RolloutArgs(
        @Nullable Output<String> artifactSourceId,
        Output<String> buildVersion,
        Output<IdentityArgs> identity,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> rolloutName,
        Output<List<StepGroupArgs>> stepGroups,
        @Nullable Output<Map<String,String>> tags,
        Output<String> targetServiceTopologyId) {
        this.artifactSourceId = artifactSourceId;
        this.buildVersion = Objects.requireNonNull(buildVersion, "expected parameter 'buildVersion' to be non-null");
        this.identity = Objects.requireNonNull(identity, "expected parameter 'identity' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rolloutName = rolloutName;
        this.stepGroups = Objects.requireNonNull(stepGroups, "expected parameter 'stepGroups' to be non-null");
        this.tags = tags;
        this.targetServiceTopologyId = Objects.requireNonNull(targetServiceTopologyId, "expected parameter 'targetServiceTopologyId' to be non-null");
    }

    private RolloutArgs() {
        this.artifactSourceId = Codegen.empty();
        this.buildVersion = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.rolloutName = Codegen.empty();
        this.stepGroups = Codegen.empty();
        this.tags = Codegen.empty();
        this.targetServiceTopologyId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> artifactSourceId;
        private Output<String> buildVersion;
        private Output<IdentityArgs> identity;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> rolloutName;
        private Output<List<StepGroupArgs>> stepGroups;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> targetServiceTopologyId;

        public Builder() {
    	      // Empty
        }

        public Builder(RolloutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactSourceId = defaults.artifactSourceId;
    	      this.buildVersion = defaults.buildVersion;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rolloutName = defaults.rolloutName;
    	      this.stepGroups = defaults.stepGroups;
    	      this.tags = defaults.tags;
    	      this.targetServiceTopologyId = defaults.targetServiceTopologyId;
        }

        public Builder artifactSourceId(@Nullable Output<String> artifactSourceId) {
            this.artifactSourceId = artifactSourceId;
            return this;
        }
        public Builder artifactSourceId(@Nullable String artifactSourceId) {
            this.artifactSourceId = Codegen.ofNullable(artifactSourceId);
            return this;
        }
        public Builder buildVersion(Output<String> buildVersion) {
            this.buildVersion = Objects.requireNonNull(buildVersion);
            return this;
        }
        public Builder buildVersion(String buildVersion) {
            this.buildVersion = Output.of(Objects.requireNonNull(buildVersion));
            return this;
        }
        public Builder identity(Output<IdentityArgs> identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }
        public Builder identity(IdentityArgs identity) {
            this.identity = Output.of(Objects.requireNonNull(identity));
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder rolloutName(@Nullable Output<String> rolloutName) {
            this.rolloutName = rolloutName;
            return this;
        }
        public Builder rolloutName(@Nullable String rolloutName) {
            this.rolloutName = Codegen.ofNullable(rolloutName);
            return this;
        }
        public Builder stepGroups(Output<List<StepGroupArgs>> stepGroups) {
            this.stepGroups = Objects.requireNonNull(stepGroups);
            return this;
        }
        public Builder stepGroups(List<StepGroupArgs> stepGroups) {
            this.stepGroups = Output.of(Objects.requireNonNull(stepGroups));
            return this;
        }
        public Builder stepGroups(StepGroupArgs... stepGroups) {
            return stepGroups(List.of(stepGroups));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder targetServiceTopologyId(Output<String> targetServiceTopologyId) {
            this.targetServiceTopologyId = Objects.requireNonNull(targetServiceTopologyId);
            return this;
        }
        public Builder targetServiceTopologyId(String targetServiceTopologyId) {
            this.targetServiceTopologyId = Output.of(Objects.requireNonNull(targetServiceTopologyId));
            return this;
        }        public RolloutArgs build() {
            return new RolloutArgs(artifactSourceId, buildVersion, identity, location, resourceGroupName, rolloutName, stepGroups, tags, targetServiceTopologyId);
        }
    }
}
