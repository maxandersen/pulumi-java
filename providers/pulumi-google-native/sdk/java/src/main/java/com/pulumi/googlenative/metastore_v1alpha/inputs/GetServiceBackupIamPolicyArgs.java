// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceBackupIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceBackupIamPolicyArgs Empty = new GetServiceBackupIamPolicyArgs();

    @Import(name="backupId", required=true)
    private String backupId;

    public String backupId() {
        return this.backupId;
    }

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

    @Import(name="serviceId", required=true)
    private String serviceId;

    public String serviceId() {
        return this.serviceId;
    }

    private GetServiceBackupIamPolicyArgs() {}

    private GetServiceBackupIamPolicyArgs(GetServiceBackupIamPolicyArgs $) {
        this.backupId = $.backupId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceBackupIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceBackupIamPolicyArgs $;

        public Builder() {
            $ = new GetServiceBackupIamPolicyArgs();
        }

        public Builder(GetServiceBackupIamPolicyArgs defaults) {
            $ = new GetServiceBackupIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupId(String backupId) {
            $.backupId = backupId;
            return this;
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

        public Builder serviceId(String serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public GetServiceBackupIamPolicyArgs build() {
            $.backupId = Objects.requireNonNull($.backupId, "expected parameter 'backupId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}
