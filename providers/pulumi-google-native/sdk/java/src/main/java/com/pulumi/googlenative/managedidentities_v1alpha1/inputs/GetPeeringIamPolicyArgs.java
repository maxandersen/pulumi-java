// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPeeringIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPeeringIamPolicyArgs Empty = new GetPeeringIamPolicyArgs();

    @Import(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="peeringId", required=true)
      private final String peeringId;

    public String peeringId() {
        return this.peeringId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetPeeringIamPolicyArgs(
        @Nullable String optionsRequestedPolicyVersion,
        String peeringId,
        @Nullable String project) {
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.peeringId = Objects.requireNonNull(peeringId, "expected parameter 'peeringId' to be non-null");
        this.project = project;
    }

    private GetPeeringIamPolicyArgs() {
        this.optionsRequestedPolicyVersion = null;
        this.peeringId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String optionsRequestedPolicyVersion;
        private String peeringId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeringIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.peeringId = defaults.peeringId;
    	      this.project = defaults.project;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }
        public Builder peeringId(String peeringId) {
            this.peeringId = Objects.requireNonNull(peeringId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetPeeringIamPolicyArgs build() {
            return new GetPeeringIamPolicyArgs(optionsRequestedPolicyVersion, peeringId, project);
        }
    }
}
