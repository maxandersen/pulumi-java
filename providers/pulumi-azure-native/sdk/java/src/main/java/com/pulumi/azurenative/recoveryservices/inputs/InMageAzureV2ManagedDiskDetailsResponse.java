// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * InMageAzureV2 Managed disk details.
 * 
 */
public final class InMageAzureV2ManagedDiskDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final InMageAzureV2ManagedDiskDetailsResponse Empty = new InMageAzureV2ManagedDiskDetailsResponse();

    /**
     * The disk id.
     * 
     */
    @Import(name="diskId")
      private final @Nullable String diskId;

    public Optional<String> diskId() {
        return this.diskId == null ? Optional.empty() : Optional.ofNullable(this.diskId);
    }

    /**
     * The replica disk type.
     * 
     */
    @Import(name="replicaDiskType")
      private final @Nullable String replicaDiskType;

    public Optional<String> replicaDiskType() {
        return this.replicaDiskType == null ? Optional.empty() : Optional.ofNullable(this.replicaDiskType);
    }

    /**
     * Seed managed disk Id.
     * 
     */
    @Import(name="seedManagedDiskId")
      private final @Nullable String seedManagedDiskId;

    public Optional<String> seedManagedDiskId() {
        return this.seedManagedDiskId == null ? Optional.empty() : Optional.ofNullable(this.seedManagedDiskId);
    }

    public InMageAzureV2ManagedDiskDetailsResponse(
        @Nullable String diskId,
        @Nullable String replicaDiskType,
        @Nullable String seedManagedDiskId) {
        this.diskId = diskId;
        this.replicaDiskType = replicaDiskType;
        this.seedManagedDiskId = seedManagedDiskId;
    }

    private InMageAzureV2ManagedDiskDetailsResponse() {
        this.diskId = null;
        this.replicaDiskType = null;
        this.seedManagedDiskId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageAzureV2ManagedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskId;
        private @Nullable String replicaDiskType;
        private @Nullable String seedManagedDiskId;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageAzureV2ManagedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskId = defaults.diskId;
    	      this.replicaDiskType = defaults.replicaDiskType;
    	      this.seedManagedDiskId = defaults.seedManagedDiskId;
        }

        public Builder diskId(@Nullable String diskId) {
            this.diskId = diskId;
            return this;
        }
        public Builder replicaDiskType(@Nullable String replicaDiskType) {
            this.replicaDiskType = replicaDiskType;
            return this;
        }
        public Builder seedManagedDiskId(@Nullable String seedManagedDiskId) {
            this.seedManagedDiskId = seedManagedDiskId;
            return this;
        }        public InMageAzureV2ManagedDiskDetailsResponse build() {
            return new InMageAzureV2ManagedDiskDetailsResponse(diskId, replicaDiskType, seedManagedDiskId);
        }
    }
}
