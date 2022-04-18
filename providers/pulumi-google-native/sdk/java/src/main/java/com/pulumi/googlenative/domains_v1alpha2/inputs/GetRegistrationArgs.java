// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1alpha2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistrationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistrationArgs Empty = new GetRegistrationArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="registrationId", required=true)
      private final String registrationId;

    public String registrationId() {
        return this.registrationId;
    }

    public GetRegistrationArgs(
        String location,
        @Nullable String project,
        String registrationId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.registrationId = Objects.requireNonNull(registrationId, "expected parameter 'registrationId' to be non-null");
    }

    private GetRegistrationArgs() {
        this.location = null;
        this.project = null;
        this.registrationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String registrationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.registrationId = defaults.registrationId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder registrationId(String registrationId) {
            this.registrationId = Objects.requireNonNull(registrationId);
            return this;
        }        public GetRegistrationArgs build() {
            return new GetRegistrationArgs(location, project, registrationId);
        }
    }
}
