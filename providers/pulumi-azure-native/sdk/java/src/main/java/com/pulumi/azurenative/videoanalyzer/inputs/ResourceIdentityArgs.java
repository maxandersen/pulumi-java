// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * The user assigned managed identity to use when accessing a resource.
 * 
 */
public final class ResourceIdentityArgs extends ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * The user assigned managed identity&#39;s resource identifier to use when accessing a resource.
     * 
     */
    @Import(name="userAssignedIdentity", required=true)
    private Output<String> userAssignedIdentity;

    /**
     * @return The user assigned managed identity&#39;s resource identifier to use when accessing a resource.
     * 
     */
    public Output<String> userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    private ResourceIdentityArgs() {}

    private ResourceIdentityArgs(ResourceIdentityArgs $) {
        this.userAssignedIdentity = $.userAssignedIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceIdentityArgs $;

        public Builder() {
            $ = new ResourceIdentityArgs();
        }

        public Builder(ResourceIdentityArgs defaults) {
            $ = new ResourceIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param userAssignedIdentity The user assigned managed identity&#39;s resource identifier to use when accessing a resource.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentity(Output<String> userAssignedIdentity) {
            $.userAssignedIdentity = userAssignedIdentity;
            return this;
        }

        /**
         * @param userAssignedIdentity The user assigned managed identity&#39;s resource identifier to use when accessing a resource.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentity(String userAssignedIdentity) {
            return userAssignedIdentity(Output.of(userAssignedIdentity));
        }

        public ResourceIdentityArgs build() {
            $.userAssignedIdentity = Objects.requireNonNull($.userAssignedIdentity, "expected parameter 'userAssignedIdentity' to be non-null");
            return $;
        }
    }

}
