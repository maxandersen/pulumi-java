// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedInstancePairInfoResponse {
    /**
     * Id of Partner Managed Instance in pair.
     * 
     */
    private final @Nullable String partnerManagedInstanceId;
    /**
     * Id of Primary Managed Instance in pair.
     * 
     */
    private final @Nullable String primaryManagedInstanceId;

    @CustomType.Constructor
    private ManagedInstancePairInfoResponse(
        @CustomType.Parameter("partnerManagedInstanceId") @Nullable String partnerManagedInstanceId,
        @CustomType.Parameter("primaryManagedInstanceId") @Nullable String primaryManagedInstanceId) {
        this.partnerManagedInstanceId = partnerManagedInstanceId;
        this.primaryManagedInstanceId = primaryManagedInstanceId;
    }

    /**
     * Id of Partner Managed Instance in pair.
     * 
    */
    public Optional<String> partnerManagedInstanceId() {
        return Optional.ofNullable(this.partnerManagedInstanceId);
    }
    /**
     * Id of Primary Managed Instance in pair.
     * 
    */
    public Optional<String> primaryManagedInstanceId() {
        return Optional.ofNullable(this.primaryManagedInstanceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstancePairInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String partnerManagedInstanceId;
        private @Nullable String primaryManagedInstanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstancePairInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partnerManagedInstanceId = defaults.partnerManagedInstanceId;
    	      this.primaryManagedInstanceId = defaults.primaryManagedInstanceId;
        }

        public Builder partnerManagedInstanceId(@Nullable String partnerManagedInstanceId) {
            this.partnerManagedInstanceId = partnerManagedInstanceId;
            return this;
        }
        public Builder primaryManagedInstanceId(@Nullable String primaryManagedInstanceId) {
            this.primaryManagedInstanceId = primaryManagedInstanceId;
            return this;
        }        public ManagedInstancePairInfoResponse build() {
            return new ManagedInstancePairInfoResponse(partnerManagedInstanceId, primaryManagedInstanceId);
        }
    }
}
