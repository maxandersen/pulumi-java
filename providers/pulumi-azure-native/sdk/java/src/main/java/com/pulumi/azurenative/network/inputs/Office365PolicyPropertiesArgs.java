// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.BreakOutCategoryPoliciesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network Virtual Appliance Sku Properties.
 * 
 */
public final class Office365PolicyPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final Office365PolicyPropertiesArgs Empty = new Office365PolicyPropertiesArgs();

    /**
     * Office 365 breakout categories.
     * 
     */
    @Import(name="breakOutCategories")
    private @Nullable Output<BreakOutCategoryPoliciesArgs> breakOutCategories;

    public Optional<Output<BreakOutCategoryPoliciesArgs>> breakOutCategories() {
        return Optional.ofNullable(this.breakOutCategories);
    }

    private Office365PolicyPropertiesArgs() {}

    private Office365PolicyPropertiesArgs(Office365PolicyPropertiesArgs $) {
        this.breakOutCategories = $.breakOutCategories;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Office365PolicyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Office365PolicyPropertiesArgs $;

        public Builder() {
            $ = new Office365PolicyPropertiesArgs();
        }

        public Builder(Office365PolicyPropertiesArgs defaults) {
            $ = new Office365PolicyPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder breakOutCategories(@Nullable Output<BreakOutCategoryPoliciesArgs> breakOutCategories) {
            $.breakOutCategories = breakOutCategories;
            return this;
        }

        public Builder breakOutCategories(BreakOutCategoryPoliciesArgs breakOutCategories) {
            return breakOutCategories(Output.of(breakOutCategories));
        }

        public Office365PolicyPropertiesArgs build() {
            return $;
        }
    }

}
