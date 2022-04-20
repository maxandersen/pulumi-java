// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.CredentialReferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinkedIntegrationRuntimeRbacAuthorizationResponse {
    /**
     * The authorization type for integration runtime sharing.
     * Expected value is &#39;RBAC&#39;.
     * 
     */
    private final String authorizationType;
    /**
     * The credential reference containing authentication information.
     * 
     */
    private final @Nullable CredentialReferenceResponse credential;
    /**
     * The resource identifier of the integration runtime to be shared.
     * 
     */
    private final String resourceId;

    @CustomType.Constructor
    private LinkedIntegrationRuntimeRbacAuthorizationResponse(
        @CustomType.Parameter("authorizationType") String authorizationType,
        @CustomType.Parameter("credential") @Nullable CredentialReferenceResponse credential,
        @CustomType.Parameter("resourceId") String resourceId) {
        this.authorizationType = authorizationType;
        this.credential = credential;
        this.resourceId = resourceId;
    }

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is &#39;RBAC&#39;.
     * 
    */
    public String authorizationType() {
        return this.authorizationType;
    }
    /**
     * The credential reference containing authentication information.
     * 
    */
    public Optional<CredentialReferenceResponse> credential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * The resource identifier of the integration runtime to be shared.
     * 
    */
    public String resourceId() {
        return this.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedIntegrationRuntimeRbacAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationType;
        private @Nullable CredentialReferenceResponse credential;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedIntegrationRuntimeRbacAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.credential = defaults.credential;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder authorizationType(String authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }
        public Builder credential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }        public LinkedIntegrationRuntimeRbacAuthorizationResponse build() {
            return new LinkedIntegrationRuntimeRbacAuthorizationResponse(authorizationType, credential, resourceId);
        }
    }
}
