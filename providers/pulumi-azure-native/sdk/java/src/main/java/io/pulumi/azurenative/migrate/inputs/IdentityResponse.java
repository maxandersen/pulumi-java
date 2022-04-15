// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the MSI properties of the Move Collection.
 * 
 */
public final class IdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final IdentityResponse Empty = new IdentityResponse();

    /**
     * Gets or sets the principal id.
     * 
     */
    @Import(name="principalId")
      private final @Nullable String principalId;

    public Optional<String> principalId() {
        return this.principalId == null ? Optional.empty() : Optional.ofNullable(this.principalId);
    }

    /**
     * Gets or sets the tenant id.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> tenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    /**
     * The type of identity used for the resource mover service.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public IdentityResponse(
        @Nullable String principalId,
        @Nullable String tenantId,
        @Nullable String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    private IdentityResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public IdentityResponse build() {
            return new IdentityResponse(principalId, tenantId, type);
        }
    }
}
