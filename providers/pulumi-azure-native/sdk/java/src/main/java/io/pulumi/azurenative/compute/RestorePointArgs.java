// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.inputs.ApiEntityReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RestorePointArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestorePointArgs Empty = new RestorePointArgs();

    /**
     * List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
     * 
     */
    @Import(name="excludeDisks")
      private final @Nullable Output<List<ApiEntityReferenceArgs>> excludeDisks;

    public Output<List<ApiEntityReferenceArgs>> excludeDisks() {
        return this.excludeDisks == null ? Codegen.empty() : this.excludeDisks;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the restore point collection.
     * 
     */
    @Import(name="restorePointCollectionName", required=true)
      private final Output<String> restorePointCollectionName;

    public Output<String> restorePointCollectionName() {
        return this.restorePointCollectionName;
    }

    /**
     * The name of the restore point.
     * 
     */
    @Import(name="restorePointName")
      private final @Nullable Output<String> restorePointName;

    public Output<String> restorePointName() {
        return this.restorePointName == null ? Codegen.empty() : this.restorePointName;
    }

    /**
     * Gets the creation time of the restore point.
     * 
     */
    @Import(name="timeCreated")
      private final @Nullable Output<String> timeCreated;

    public Output<String> timeCreated() {
        return this.timeCreated == null ? Codegen.empty() : this.timeCreated;
    }

    public RestorePointArgs(
        @Nullable Output<List<ApiEntityReferenceArgs>> excludeDisks,
        Output<String> resourceGroupName,
        Output<String> restorePointCollectionName,
        @Nullable Output<String> restorePointName,
        @Nullable Output<String> timeCreated) {
        this.excludeDisks = excludeDisks;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorePointCollectionName = Objects.requireNonNull(restorePointCollectionName, "expected parameter 'restorePointCollectionName' to be non-null");
        this.restorePointName = restorePointName;
        this.timeCreated = timeCreated;
    }

    private RestorePointArgs() {
        this.excludeDisks = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.restorePointCollectionName = Codegen.empty();
        this.restorePointName = Codegen.empty();
        this.timeCreated = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ApiEntityReferenceArgs>> excludeDisks;
        private Output<String> resourceGroupName;
        private Output<String> restorePointCollectionName;
        private @Nullable Output<String> restorePointName;
        private @Nullable Output<String> timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeDisks = defaults.excludeDisks;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorePointCollectionName = defaults.restorePointCollectionName;
    	      this.restorePointName = defaults.restorePointName;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder excludeDisks(@Nullable Output<List<ApiEntityReferenceArgs>> excludeDisks) {
            this.excludeDisks = excludeDisks;
            return this;
        }
        public Builder excludeDisks(@Nullable List<ApiEntityReferenceArgs> excludeDisks) {
            this.excludeDisks = Codegen.ofNullable(excludeDisks);
            return this;
        }
        public Builder excludeDisks(ApiEntityReferenceArgs... excludeDisks) {
            return excludeDisks(List.of(excludeDisks));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder restorePointCollectionName(Output<String> restorePointCollectionName) {
            this.restorePointCollectionName = Objects.requireNonNull(restorePointCollectionName);
            return this;
        }
        public Builder restorePointCollectionName(String restorePointCollectionName) {
            this.restorePointCollectionName = Output.of(Objects.requireNonNull(restorePointCollectionName));
            return this;
        }
        public Builder restorePointName(@Nullable Output<String> restorePointName) {
            this.restorePointName = restorePointName;
            return this;
        }
        public Builder restorePointName(@Nullable String restorePointName) {
            this.restorePointName = Codegen.ofNullable(restorePointName);
            return this;
        }
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }
        public Builder timeCreated(@Nullable String timeCreated) {
            this.timeCreated = Codegen.ofNullable(timeCreated);
            return this;
        }        public RestorePointArgs build() {
            return new RestorePointArgs(excludeDisks, resourceGroupName, restorePointCollectionName, restorePointName, timeCreated);
        }
    }
}
