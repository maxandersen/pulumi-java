// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins;

import com.pulumi.azurenative.digitaltwins.inputs.AzureDataExplorerConnectionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TimeSeriesDatabaseConnectionArgs extends ResourceArgs {

    public static final TimeSeriesDatabaseConnectionArgs Empty = new TimeSeriesDatabaseConnectionArgs();

    /**
     * Properties of a specific time series database connection.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<AzureDataExplorerConnectionPropertiesArgs> properties;

    /**
     * @return Properties of a specific time series database connection.
     * 
     */
    public Optional<Output<AzureDataExplorerConnectionPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group that contains the DigitalTwinsInstance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the DigitalTwinsInstance.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the DigitalTwinsInstance.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the DigitalTwinsInstance.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * Name of time series database connection.
     * 
     */
    @Import(name="timeSeriesDatabaseConnectionName")
    private @Nullable Output<String> timeSeriesDatabaseConnectionName;

    /**
     * @return Name of time series database connection.
     * 
     */
    public Optional<Output<String>> timeSeriesDatabaseConnectionName() {
        return Optional.ofNullable(this.timeSeriesDatabaseConnectionName);
    }

    private TimeSeriesDatabaseConnectionArgs() {}

    private TimeSeriesDatabaseConnectionArgs(TimeSeriesDatabaseConnectionArgs $) {
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.timeSeriesDatabaseConnectionName = $.timeSeriesDatabaseConnectionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeSeriesDatabaseConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeSeriesDatabaseConnectionArgs $;

        public Builder() {
            $ = new TimeSeriesDatabaseConnectionArgs();
        }

        public Builder(TimeSeriesDatabaseConnectionArgs defaults) {
            $ = new TimeSeriesDatabaseConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param properties Properties of a specific time series database connection.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<AzureDataExplorerConnectionPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties of a specific time series database connection.
         * 
         * @return builder
         * 
         */
        public Builder properties(AzureDataExplorerConnectionPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the DigitalTwinsInstance.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the DigitalTwinsInstance.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param timeSeriesDatabaseConnectionName Name of time series database connection.
         * 
         * @return builder
         * 
         */
        public Builder timeSeriesDatabaseConnectionName(@Nullable Output<String> timeSeriesDatabaseConnectionName) {
            $.timeSeriesDatabaseConnectionName = timeSeriesDatabaseConnectionName;
            return this;
        }

        /**
         * @param timeSeriesDatabaseConnectionName Name of time series database connection.
         * 
         * @return builder
         * 
         */
        public Builder timeSeriesDatabaseConnectionName(String timeSeriesDatabaseConnectionName) {
            return timeSeriesDatabaseConnectionName(Output.of(timeSeriesDatabaseConnectionName));
        }

        public TimeSeriesDatabaseConnectionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
