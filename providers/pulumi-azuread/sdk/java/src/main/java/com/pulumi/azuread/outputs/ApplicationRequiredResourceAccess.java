// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.azuread.outputs.ApplicationRequiredResourceAccessResourceAccess;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ApplicationRequiredResourceAccess {
    /**
     * A collection of `resource_access` blocks as documented below, describing OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
     * 
     */
    private final List<ApplicationRequiredResourceAccessResourceAccess> resourceAccesses;
    /**
     * The unique identifier for the resource that the application requires access to. This should be the Application ID of the target application.
     * 
     */
    private final String resourceAppId;

    @CustomType.Constructor
    private ApplicationRequiredResourceAccess(
        @CustomType.Parameter("resourceAccesses") List<ApplicationRequiredResourceAccessResourceAccess> resourceAccesses,
        @CustomType.Parameter("resourceAppId") String resourceAppId) {
        this.resourceAccesses = resourceAccesses;
        this.resourceAppId = resourceAppId;
    }

    /**
     * A collection of `resource_access` blocks as documented below, describing OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
     * 
    */
    public List<ApplicationRequiredResourceAccessResourceAccess> resourceAccesses() {
        return this.resourceAccesses;
    }
    /**
     * The unique identifier for the resource that the application requires access to. This should be the Application ID of the target application.
     * 
    */
    public String resourceAppId() {
        return this.resourceAppId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationRequiredResourceAccess defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApplicationRequiredResourceAccessResourceAccess> resourceAccesses;
        private String resourceAppId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationRequiredResourceAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceAccesses = defaults.resourceAccesses;
    	      this.resourceAppId = defaults.resourceAppId;
        }

        public Builder resourceAccesses(List<ApplicationRequiredResourceAccessResourceAccess> resourceAccesses) {
            this.resourceAccesses = Objects.requireNonNull(resourceAccesses);
            return this;
        }
        public Builder resourceAccesses(ApplicationRequiredResourceAccessResourceAccess... resourceAccesses) {
            return resourceAccesses(List.of(resourceAccesses));
        }
        public Builder resourceAppId(String resourceAppId) {
            this.resourceAppId = Objects.requireNonNull(resourceAppId);
            return this;
        }        public ApplicationRequiredResourceAccess build() {
            return new ApplicationRequiredResourceAccess(resourceAccesses, resourceAppId);
        }
    }
}
