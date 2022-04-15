// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceAccessRuleResponse {
    /**
     * Resource Id
     * 
     */
    private final @Nullable String resourceId;
    /**
     * Tenant Id
     * 
     */
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private ResourceAccessRuleResponse(
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.resourceId = resourceId;
        this.tenantId = tenantId;
    }

    /**
     * Resource Id
     * 
    */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * Tenant Id
     * 
    */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAccessRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceAccessRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public ResourceAccessRuleResponse build() {
            return new ResourceAccessRuleResponse(resourceId, tenantId);
        }
    }
}
