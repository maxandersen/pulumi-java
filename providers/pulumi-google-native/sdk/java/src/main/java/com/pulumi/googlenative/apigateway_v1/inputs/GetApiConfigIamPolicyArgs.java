// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiConfigIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiConfigIamPolicyArgs Empty = new GetApiConfigIamPolicyArgs();

    @Import(name="apiId", required=true)
      private final String apiId;

    public String apiId() {
        return this.apiId;
    }

    @Import(name="configId", required=true)
      private final String configId;

    public String configId() {
        return this.configId;
    }

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

    public GetApiConfigIamPolicyArgs(
        String apiId,
        String configId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.configId = Objects.requireNonNull(configId, "expected parameter 'configId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetApiConfigIamPolicyArgs() {
        this.apiId = null;
        this.configId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiConfigIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiId;
        private String configId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiConfigIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.configId = defaults.configId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder apiId(String apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }
        public Builder configId(String configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
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
        }        public GetApiConfigIamPolicyArgs build() {
            return new GetApiConfigIamPolicyArgs(apiId, configId, location, optionsRequestedPolicyVersion, project);
        }
    }
}
