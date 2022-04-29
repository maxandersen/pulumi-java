// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.ManagementPolicyActionArgs;
import com.pulumi.azurenative.storage.inputs.ManagementPolicyFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that defines the Lifecycle rule. Each definition is made up with a filters set and an actions set.
 * 
 */
public final class ManagementPolicyDefinitionArgs extends ResourceArgs {

    public static final ManagementPolicyDefinitionArgs Empty = new ManagementPolicyDefinitionArgs();

    /**
     * An object that defines the action set.
     * 
     */
    @Import(name="actions", required=true)
    private Output<ManagementPolicyActionArgs> actions;

    /**
     * @return An object that defines the action set.
     * 
     */
    public Output<ManagementPolicyActionArgs> actions() {
        return this.actions;
    }

    /**
     * An object that defines the filter set.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<ManagementPolicyFilterArgs> filters;

    /**
     * @return An object that defines the filter set.
     * 
     */
    public Optional<Output<ManagementPolicyFilterArgs>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private ManagementPolicyDefinitionArgs() {}

    private ManagementPolicyDefinitionArgs(ManagementPolicyDefinitionArgs $) {
        this.actions = $.actions;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementPolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicyDefinitionArgs $;

        public Builder() {
            $ = new ManagementPolicyDefinitionArgs();
        }

        public Builder(ManagementPolicyDefinitionArgs defaults) {
            $ = new ManagementPolicyDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions An object that defines the action set.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<ManagementPolicyActionArgs> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions An object that defines the action set.
         * 
         * @return builder
         * 
         */
        public Builder actions(ManagementPolicyActionArgs actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param filters An object that defines the filter set.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<ManagementPolicyFilterArgs> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters An object that defines the filter set.
         * 
         * @return builder
         * 
         */
        public Builder filters(ManagementPolicyFilterArgs filters) {
            return filters(Output.of(filters));
        }

        public ManagementPolicyDefinitionArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            return $;
        }
    }

}
