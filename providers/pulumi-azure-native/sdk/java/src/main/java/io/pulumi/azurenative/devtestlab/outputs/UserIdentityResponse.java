// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserIdentityResponse {
    /**
     * Set to the app Id of the client JWT making the request.
     * 
     */
    private final @Nullable String appId;
    /**
     * Set to the object Id of the client JWT making the request. Not all users have object Id. For CSP (reseller) scenarios for example, object Id is not available.
     * 
     */
    private final @Nullable String objectId;
    /**
     * Set to the principal Id of the client JWT making the request. Service principal will not have the principal Id.
     * 
     */
    private final @Nullable String principalId;
    /**
     * Set to the principal name / UPN of the client JWT making the request.
     * 
     */
    private final @Nullable String principalName;
    /**
     * Set to the tenant ID of the client JWT making the request.
     * 
     */
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private UserIdentityResponse(
        @CustomType.Parameter("appId") @Nullable String appId,
        @CustomType.Parameter("objectId") @Nullable String objectId,
        @CustomType.Parameter("principalId") @Nullable String principalId,
        @CustomType.Parameter("principalName") @Nullable String principalName,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.appId = appId;
        this.objectId = objectId;
        this.principalId = principalId;
        this.principalName = principalName;
        this.tenantId = tenantId;
    }

    /**
     * Set to the app Id of the client JWT making the request.
     * 
    */
    public Optional<String> appId() {
        return Optional.ofNullable(this.appId);
    }
    /**
     * Set to the object Id of the client JWT making the request. Not all users have object Id. For CSP (reseller) scenarios for example, object Id is not available.
     * 
    */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * Set to the principal Id of the client JWT making the request. Service principal will not have the principal Id.
     * 
    */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * Set to the principal name / UPN of the client JWT making the request.
     * 
    */
    public Optional<String> principalName() {
        return Optional.ofNullable(this.principalName);
    }
    /**
     * Set to the tenant ID of the client JWT making the request.
     * 
    */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appId;
        private @Nullable String objectId;
        private @Nullable String principalId;
        private @Nullable String principalName;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.objectId = defaults.objectId;
    	      this.principalId = defaults.principalId;
    	      this.principalName = defaults.principalName;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder appId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder principalName(@Nullable String principalName) {
            this.principalName = principalName;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public UserIdentityResponse build() {
            return new UserIdentityResponse(appId, objectId, principalId, principalName, tenantId);
        }
    }
}
