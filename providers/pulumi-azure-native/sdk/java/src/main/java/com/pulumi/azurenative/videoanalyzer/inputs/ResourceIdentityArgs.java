// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The user assigned managed identity to use when accessing a resource.
 * 
 */
public final class ResourceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * The user assigned managed identity's resource identifier to use when accessing a resource.
     * 
     */
    @Import(name="userAssignedIdentity", required=true)
      private final Output<String> userAssignedIdentity;

    public Output<String> userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    public ResourceIdentityArgs(Output<String> userAssignedIdentity) {
        this.userAssignedIdentity = Objects.requireNonNull(userAssignedIdentity, "expected parameter 'userAssignedIdentity' to be non-null");
    }

    private ResourceIdentityArgs() {
        this.userAssignedIdentity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder userAssignedIdentity(Output<String> userAssignedIdentity) {
            this.userAssignedIdentity = Objects.requireNonNull(userAssignedIdentity);
            return this;
        }
        public Builder userAssignedIdentity(String userAssignedIdentity) {
            this.userAssignedIdentity = Output.of(Objects.requireNonNull(userAssignedIdentity));
            return this;
        }        public ResourceIdentityArgs build() {
            return new ResourceIdentityArgs(userAssignedIdentity);
        }
    }
}
