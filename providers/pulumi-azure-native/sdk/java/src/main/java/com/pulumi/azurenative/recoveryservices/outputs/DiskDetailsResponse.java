// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiskDetailsResponse {
    /**
     * The hard disk max size in MB.
     * 
     */
    private final @Nullable Double maxSizeMB;
    /**
     * The VHD Id.
     * 
     */
    private final @Nullable String vhdId;
    /**
     * The VHD name.
     * 
     */
    private final @Nullable String vhdName;
    /**
     * The type of the volume.
     * 
     */
    private final @Nullable String vhdType;

    @CustomType.Constructor
    private DiskDetailsResponse(
        @CustomType.Parameter("maxSizeMB") @Nullable Double maxSizeMB,
        @CustomType.Parameter("vhdId") @Nullable String vhdId,
        @CustomType.Parameter("vhdName") @Nullable String vhdName,
        @CustomType.Parameter("vhdType") @Nullable String vhdType) {
        this.maxSizeMB = maxSizeMB;
        this.vhdId = vhdId;
        this.vhdName = vhdName;
        this.vhdType = vhdType;
    }

    /**
     * The hard disk max size in MB.
     * 
    */
    public Optional<Double> maxSizeMB() {
        return Optional.ofNullable(this.maxSizeMB);
    }
    /**
     * The VHD Id.
     * 
    */
    public Optional<String> vhdId() {
        return Optional.ofNullable(this.vhdId);
    }
    /**
     * The VHD name.
     * 
    */
    public Optional<String> vhdName() {
        return Optional.ofNullable(this.vhdName);
    }
    /**
     * The type of the volume.
     * 
    */
    public Optional<String> vhdType() {
        return Optional.ofNullable(this.vhdType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double maxSizeMB;
        private @Nullable String vhdId;
        private @Nullable String vhdName;
        private @Nullable String vhdType;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSizeMB = defaults.maxSizeMB;
    	      this.vhdId = defaults.vhdId;
    	      this.vhdName = defaults.vhdName;
    	      this.vhdType = defaults.vhdType;
        }

        public Builder maxSizeMB(@Nullable Double maxSizeMB) {
            this.maxSizeMB = maxSizeMB;
            return this;
        }
        public Builder vhdId(@Nullable String vhdId) {
            this.vhdId = vhdId;
            return this;
        }
        public Builder vhdName(@Nullable String vhdName) {
            this.vhdName = vhdName;
            return this;
        }
        public Builder vhdType(@Nullable String vhdType) {
            this.vhdType = vhdType;
            return this;
        }        public DiskDetailsResponse build() {
            return new DiskDetailsResponse(maxSizeMB, vhdId, vhdName, vhdType);
        }
    }
}
