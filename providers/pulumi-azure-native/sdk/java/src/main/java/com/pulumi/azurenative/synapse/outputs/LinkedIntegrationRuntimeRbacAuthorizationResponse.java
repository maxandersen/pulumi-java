// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LinkedIntegrationRuntimeRbacAuthorizationResponse {
    /**
     * The authorization type for integration runtime sharing.
     * Expected value is &#39;RBAC&#39;.
     * 
     */
    private final String authorizationType;
    /**
     * The resource identifier of the integration runtime to be shared.
     * 
     */
    private final String resourceId;

    @CustomType.Constructor
    private LinkedIntegrationRuntimeRbacAuthorizationResponse(
        @CustomType.Parameter("authorizationType") String authorizationType,
        @CustomType.Parameter("resourceId") String resourceId) {
        this.authorizationType = authorizationType;
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
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedIntegrationRuntimeRbacAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder authorizationType(String authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }        public LinkedIntegrationRuntimeRbacAuthorizationResponse build() {
            return new LinkedIntegrationRuntimeRbacAuthorizationResponse(authorizationType, resourceId);
        }
    }
}
