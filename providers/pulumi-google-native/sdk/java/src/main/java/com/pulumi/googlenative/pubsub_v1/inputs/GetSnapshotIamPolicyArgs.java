// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnapshotIamPolicyArgs Empty = new GetSnapshotIamPolicyArgs();

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

    @Import(name="snapshotId", required=true)
    private String snapshotId;

    public String snapshotId() {
        return this.snapshotId;
    }

    private GetSnapshotIamPolicyArgs() {}

    private GetSnapshotIamPolicyArgs(GetSnapshotIamPolicyArgs $) {
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.snapshotId = $.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnapshotIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnapshotIamPolicyArgs $;

        public Builder() {
            $ = new GetSnapshotIamPolicyArgs();
        }

        public Builder(GetSnapshotIamPolicyArgs defaults) {
            $ = new GetSnapshotIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder snapshotId(String snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        public GetSnapshotIamPolicyArgs build() {
            $.snapshotId = Objects.requireNonNull($.snapshotId, "expected parameter 'snapshotId' to be non-null");
            return $;
        }
    }

}
