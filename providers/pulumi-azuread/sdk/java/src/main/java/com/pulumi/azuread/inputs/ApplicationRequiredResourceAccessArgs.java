// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.azuread.inputs.ApplicationRequiredResourceAccessResourceAccessArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ApplicationRequiredResourceAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationRequiredResourceAccessArgs Empty = new ApplicationRequiredResourceAccessArgs();

    /**
     * A collection of `resource_access` blocks as documented below, describing OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
     * 
     */
    @Import(name="resourceAccesses", required=true)
      private final Output<List<ApplicationRequiredResourceAccessResourceAccessArgs>> resourceAccesses;

    public Output<List<ApplicationRequiredResourceAccessResourceAccessArgs>> resourceAccesses() {
        return this.resourceAccesses;
    }

    /**
     * The unique identifier for the resource that the application requires access to. This should be the Application ID of the target application.
     * 
     */
    @Import(name="resourceAppId", required=true)
      private final Output<String> resourceAppId;

    public Output<String> resourceAppId() {
        return this.resourceAppId;
    }

    public ApplicationRequiredResourceAccessArgs(
        Output<List<ApplicationRequiredResourceAccessResourceAccessArgs>> resourceAccesses,
        Output<String> resourceAppId) {
        this.resourceAccesses = Objects.requireNonNull(resourceAccesses, "expected parameter 'resourceAccesses' to be non-null");
        this.resourceAppId = Objects.requireNonNull(resourceAppId, "expected parameter 'resourceAppId' to be non-null");
    }

    private ApplicationRequiredResourceAccessArgs() {
        this.resourceAccesses = Codegen.empty();
        this.resourceAppId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationRequiredResourceAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ApplicationRequiredResourceAccessResourceAccessArgs>> resourceAccesses;
        private Output<String> resourceAppId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationRequiredResourceAccessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceAccesses = defaults.resourceAccesses;
    	      this.resourceAppId = defaults.resourceAppId;
        }

        public Builder resourceAccesses(Output<List<ApplicationRequiredResourceAccessResourceAccessArgs>> resourceAccesses) {
            this.resourceAccesses = Objects.requireNonNull(resourceAccesses);
            return this;
        }
        public Builder resourceAccesses(List<ApplicationRequiredResourceAccessResourceAccessArgs> resourceAccesses) {
            this.resourceAccesses = Output.of(Objects.requireNonNull(resourceAccesses));
            return this;
        }
        public Builder resourceAccesses(ApplicationRequiredResourceAccessResourceAccessArgs... resourceAccesses) {
            return resourceAccesses(List.of(resourceAccesses));
        }
        public Builder resourceAppId(Output<String> resourceAppId) {
            this.resourceAppId = Objects.requireNonNull(resourceAppId);
            return this;
        }
        public Builder resourceAppId(String resourceAppId) {
            this.resourceAppId = Output.of(Objects.requireNonNull(resourceAppId));
            return this;
        }        public ApplicationRequiredResourceAccessArgs build() {
            return new ApplicationRequiredResourceAccessArgs(resourceAccesses, resourceAppId);
        }
    }
}
