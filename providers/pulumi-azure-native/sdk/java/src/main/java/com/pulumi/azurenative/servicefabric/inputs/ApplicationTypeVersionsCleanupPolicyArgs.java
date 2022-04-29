// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.util.Objects;


public final class ApplicationTypeVersionsCleanupPolicyArgs extends ResourceArgs {

    public static final ApplicationTypeVersionsCleanupPolicyArgs Empty = new ApplicationTypeVersionsCleanupPolicyArgs();

    /**
     * Number of unused versions per application type to keep.
     * 
     */
    @Import(name="maxUnusedVersionsToKeep", required=true)
    private Output<Double> maxUnusedVersionsToKeep;

    /**
     * @return Number of unused versions per application type to keep.
     * 
     */
    public Output<Double> maxUnusedVersionsToKeep() {
        return this.maxUnusedVersionsToKeep;
    }

    private ApplicationTypeVersionsCleanupPolicyArgs() {}

    private ApplicationTypeVersionsCleanupPolicyArgs(ApplicationTypeVersionsCleanupPolicyArgs $) {
        this.maxUnusedVersionsToKeep = $.maxUnusedVersionsToKeep;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationTypeVersionsCleanupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationTypeVersionsCleanupPolicyArgs $;

        public Builder() {
            $ = new ApplicationTypeVersionsCleanupPolicyArgs();
        }

        public Builder(ApplicationTypeVersionsCleanupPolicyArgs defaults) {
            $ = new ApplicationTypeVersionsCleanupPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxUnusedVersionsToKeep Number of unused versions per application type to keep.
         * 
         * @return builder
         * 
         */
        public Builder maxUnusedVersionsToKeep(Output<Double> maxUnusedVersionsToKeep) {
            $.maxUnusedVersionsToKeep = maxUnusedVersionsToKeep;
            return this;
        }

        /**
         * @param maxUnusedVersionsToKeep Number of unused versions per application type to keep.
         * 
         * @return builder
         * 
         */
        public Builder maxUnusedVersionsToKeep(Double maxUnusedVersionsToKeep) {
            return maxUnusedVersionsToKeep(Output.of(maxUnusedVersionsToKeep));
        }

        public ApplicationTypeVersionsCleanupPolicyArgs build() {
            $.maxUnusedVersionsToKeep = Objects.requireNonNull($.maxUnusedVersionsToKeep, "expected parameter 'maxUnusedVersionsToKeep' to be non-null");
            return $;
        }
    }

}
