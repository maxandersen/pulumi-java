// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListTenantAccessSecretsResult {
    /**
     * Determines whether direct access is enabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Access Information type ('access' or 'gitAccess')
     * 
     */
    private final @Nullable String id;
    /**
     * Primary access key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * Principal (User) Identifier.
     * 
     */
    private final @Nullable String principalId;
    /**
     * Secondary access key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    private final @Nullable String secondaryKey;

    @CustomType.Constructor
    private ListTenantAccessSecretsResult(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("primaryKey") @Nullable String primaryKey,
        @CustomType.Parameter("principalId") @Nullable String principalId,
        @CustomType.Parameter("secondaryKey") @Nullable String secondaryKey) {
        this.enabled = enabled;
        this.id = id;
        this.primaryKey = primaryKey;
        this.principalId = principalId;
        this.secondaryKey = secondaryKey;
    }

    /**
     * Determines whether direct access is enabled.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Access Information type ('access' or 'gitAccess')
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Primary access key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
    */
    public Optional<String> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * Principal (User) Identifier.
     * 
    */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * Secondary access key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
    */
    public Optional<String> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTenantAccessSecretsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String id;
        private @Nullable String primaryKey;
        private @Nullable String principalId;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTenantAccessSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.primaryKey = defaults.primaryKey;
    	      this.principalId = defaults.principalId;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }        public ListTenantAccessSecretsResult build() {
            return new ListTenantAccessSecretsResult(enabled, id, primaryKey, principalId, secondaryKey);
        }
    }
}
