// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.azurenative.automation.inputs.AzureQueryPropertiesArgs;
import com.pulumi.azurenative.automation.inputs.NonAzureQueryPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Group specific to the update configuration.
 * 
 */
public final class TargetPropertiesArgs extends ResourceArgs {

    public static final TargetPropertiesArgs Empty = new TargetPropertiesArgs();

    /**
     * List of Azure queries in the software update configuration.
     * 
     */
    @Import(name="azureQueries")
    private @Nullable Output<List<AzureQueryPropertiesArgs>> azureQueries;

    /**
     * @return List of Azure queries in the software update configuration.
     * 
     */
    public Optional<Output<List<AzureQueryPropertiesArgs>>> azureQueries() {
        return Optional.ofNullable(this.azureQueries);
    }

    /**
     * List of non Azure queries in the software update configuration.
     * 
     */
    @Import(name="nonAzureQueries")
    private @Nullable Output<List<NonAzureQueryPropertiesArgs>> nonAzureQueries;

    /**
     * @return List of non Azure queries in the software update configuration.
     * 
     */
    public Optional<Output<List<NonAzureQueryPropertiesArgs>>> nonAzureQueries() {
        return Optional.ofNullable(this.nonAzureQueries);
    }

    private TargetPropertiesArgs() {}

    private TargetPropertiesArgs(TargetPropertiesArgs $) {
        this.azureQueries = $.azureQueries;
        this.nonAzureQueries = $.nonAzureQueries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetPropertiesArgs $;

        public Builder() {
            $ = new TargetPropertiesArgs();
        }

        public Builder(TargetPropertiesArgs defaults) {
            $ = new TargetPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureQueries List of Azure queries in the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder azureQueries(@Nullable Output<List<AzureQueryPropertiesArgs>> azureQueries) {
            $.azureQueries = azureQueries;
            return this;
        }

        /**
         * @param azureQueries List of Azure queries in the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder azureQueries(List<AzureQueryPropertiesArgs> azureQueries) {
            return azureQueries(Output.of(azureQueries));
        }

        /**
         * @param azureQueries List of Azure queries in the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder azureQueries(AzureQueryPropertiesArgs... azureQueries) {
            return azureQueries(List.of(azureQueries));
        }

        /**
         * @param nonAzureQueries List of non Azure queries in the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder nonAzureQueries(@Nullable Output<List<NonAzureQueryPropertiesArgs>> nonAzureQueries) {
            $.nonAzureQueries = nonAzureQueries;
            return this;
        }

        /**
         * @param nonAzureQueries List of non Azure queries in the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder nonAzureQueries(List<NonAzureQueryPropertiesArgs> nonAzureQueries) {
            return nonAzureQueries(Output.of(nonAzureQueries));
        }

        /**
         * @param nonAzureQueries List of non Azure queries in the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder nonAzureQueries(NonAzureQueryPropertiesArgs... nonAzureQueries) {
            return nonAzureQueries(List.of(nonAzureQueries));
        }

        public TargetPropertiesArgs build() {
            return $;
        }
    }

}
