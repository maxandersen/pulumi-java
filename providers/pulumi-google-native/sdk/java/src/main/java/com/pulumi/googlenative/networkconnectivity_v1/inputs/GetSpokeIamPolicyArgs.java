// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSpokeIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSpokeIamPolicyArgs Empty = new GetSpokeIamPolicyArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="spokeId", required=true)
      private final String spokeId;

    public String spokeId() {
        return this.spokeId;
    }

    public GetSpokeIamPolicyArgs(
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String spokeId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.spokeId = Objects.requireNonNull(spokeId, "expected parameter 'spokeId' to be non-null");
    }

    private GetSpokeIamPolicyArgs() {
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.spokeId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpokeIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String spokeId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpokeIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.spokeId = defaults.spokeId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder spokeId(String spokeId) {
            this.spokeId = Objects.requireNonNull(spokeId);
            return this;
        }        public GetSpokeIamPolicyArgs build() {
            return new GetSpokeIamPolicyArgs(location, optionsRequestedPolicyVersion, project, spokeId);
        }
    }
}
