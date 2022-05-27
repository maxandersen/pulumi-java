// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ConfigurationFeatureTargetingFilterGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationFeatureTargetingFilterGroupArgs Empty = new ConfigurationFeatureTargetingFilterGroupArgs();

    /**
     * The name of the group.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Rollout percentage of the group.
     * 
     */
    @Import(name="rolloutPercentage", required=true)
    private Output<Integer> rolloutPercentage;

    /**
     * @return Rollout percentage of the group.
     * 
     */
    public Output<Integer> rolloutPercentage() {
        return this.rolloutPercentage;
    }

    private ConfigurationFeatureTargetingFilterGroupArgs() {}

    private ConfigurationFeatureTargetingFilterGroupArgs(ConfigurationFeatureTargetingFilterGroupArgs $) {
        this.name = $.name;
        this.rolloutPercentage = $.rolloutPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationFeatureTargetingFilterGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationFeatureTargetingFilterGroupArgs $;

        public Builder() {
            $ = new ConfigurationFeatureTargetingFilterGroupArgs();
        }

        public Builder(ConfigurationFeatureTargetingFilterGroupArgs defaults) {
            $ = new ConfigurationFeatureTargetingFilterGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the group.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rolloutPercentage Rollout percentage of the group.
         * 
         * @return builder
         * 
         */
        public Builder rolloutPercentage(Output<Integer> rolloutPercentage) {
            $.rolloutPercentage = rolloutPercentage;
            return this;
        }

        /**
         * @param rolloutPercentage Rollout percentage of the group.
         * 
         * @return builder
         * 
         */
        public Builder rolloutPercentage(Integer rolloutPercentage) {
            return rolloutPercentage(Output.of(rolloutPercentage));
        }

        public ConfigurationFeatureTargetingFilterGroupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.rolloutPercentage = Objects.requireNonNull($.rolloutPercentage, "expected parameter 'rolloutPercentage' to be non-null");
            return $;
        }
    }

}
