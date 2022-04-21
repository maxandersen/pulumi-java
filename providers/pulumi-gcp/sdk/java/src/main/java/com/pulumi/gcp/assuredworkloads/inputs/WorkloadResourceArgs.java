// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.assuredworkloads.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadResourceArgs Empty = new WorkloadResourceArgs();

    /**
     * Resource identifier. For a project this represents project_number. If the project is already taken, the workload creation will fail.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<Integer> resourceId;

    public Optional<Output<Integer>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT) Possible values: RESOURCE_TYPE_UNSPECIFIED, CONSUMER_PROJECT, ENCRYPTION_KEYS_PROJECT, KEYRING, CONSUMER_FOLDER
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    private WorkloadResourceArgs() {}

    private WorkloadResourceArgs(WorkloadResourceArgs $) {
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadResourceArgs $;

        public Builder() {
            $ = new WorkloadResourceArgs();
        }

        public Builder(WorkloadResourceArgs defaults) {
            $ = new WorkloadResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceId(@Nullable Output<Integer> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(Integer resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public WorkloadResourceArgs build() {
            return $;
        }
    }

}
