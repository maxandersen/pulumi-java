// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedIdentityResponse {
    /**
     * The principal ID of the workspace managed identity
     * 
     */
    private final String principalId;
    /**
     * The tenant ID of the workspace managed identity
     * 
     */
    private final String tenantId;
    /**
     * The type of managed identity for the workspace
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ManagedIdentityResponse(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") @Nullable String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The principal ID of the workspace managed identity
     * 
    */
    public String principalId() {
        return this.principalId;
    }
    /**
     * The tenant ID of the workspace managed identity
     * 
    */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * The type of managed identity for the workspace
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ManagedIdentityResponse build() {
            return new ManagedIdentityResponse(principalId, tenantId, type);
        }
    }
}
