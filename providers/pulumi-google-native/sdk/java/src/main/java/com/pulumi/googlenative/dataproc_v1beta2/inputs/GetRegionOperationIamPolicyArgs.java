// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionOperationIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionOperationIamPolicyArgs Empty = new GetRegionOperationIamPolicyArgs();

    @Import(name="operationId", required=true)
    private String operationId;

    public String operationId() {
        return this.operationId;
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

    @Import(name="regionId", required=true)
    private String regionId;

    public String regionId() {
        return this.regionId;
    }

    private GetRegionOperationIamPolicyArgs() {}

    private GetRegionOperationIamPolicyArgs(GetRegionOperationIamPolicyArgs $) {
        this.operationId = $.operationId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.regionId = $.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionOperationIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionOperationIamPolicyArgs $;

        public Builder() {
            $ = new GetRegionOperationIamPolicyArgs();
        }

        public Builder(GetRegionOperationIamPolicyArgs defaults) {
            $ = new GetRegionOperationIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder operationId(String operationId) {
            $.operationId = operationId;
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

        public Builder regionId(String regionId) {
            $.regionId = regionId;
            return this;
        }

        public GetRegionOperationIamPolicyArgs build() {
            $.operationId = Objects.requireNonNull($.operationId, "expected parameter 'operationId' to be non-null");
            $.regionId = Objects.requireNonNull($.regionId, "expected parameter 'regionId' to be non-null");
            return $;
        }
    }

}
