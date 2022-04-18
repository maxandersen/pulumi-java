// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.redhatopenshift.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MasterProfile represents a master profile.
 * 
 */
public final class MasterProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final MasterProfileResponse Empty = new MasterProfileResponse();

    /**
     * The Azure resource ID of the master subnet (immutable).
     * 
     */
    @Import(name="subnetId")
      private final @Nullable String subnetId;

    public Optional<String> subnetId() {
        return this.subnetId == null ? Optional.empty() : Optional.ofNullable(this.subnetId);
    }

    /**
     * The size of the master VMs (immutable).
     * 
     */
    @Import(name="vmSize")
      private final @Nullable String vmSize;

    public Optional<String> vmSize() {
        return this.vmSize == null ? Optional.empty() : Optional.ofNullable(this.vmSize);
    }

    public MasterProfileResponse(
        @Nullable String subnetId,
        @Nullable String vmSize) {
        this.subnetId = subnetId;
        this.vmSize = vmSize;
    }

    private MasterProfileResponse() {
        this.subnetId = null;
        this.vmSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetId;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }        public MasterProfileResponse build() {
            return new MasterProfileResponse(subnetId, vmSize);
        }
    }
}
