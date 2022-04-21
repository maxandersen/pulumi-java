// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1alpha2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistrationIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistrationIamPolicyArgs Empty = new GetRegistrationIamPolicyArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="registrationId", required=true)
    private String registrationId;

    public String registrationId() {
        return this.registrationId;
    }

    private GetRegistrationIamPolicyArgs() {}

    private GetRegistrationIamPolicyArgs(GetRegistrationIamPolicyArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.registrationId = $.registrationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistrationIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistrationIamPolicyArgs $;

        public Builder() {
            $ = new GetRegistrationIamPolicyArgs();
        }

        public Builder(GetRegistrationIamPolicyArgs defaults) {
            $ = new GetRegistrationIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder registrationId(String registrationId) {
            $.registrationId = registrationId;
            return this;
        }

        public GetRegistrationIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.registrationId = Objects.requireNonNull($.registrationId, "expected parameter 'registrationId' to be non-null");
            return $;
        }
    }

}
