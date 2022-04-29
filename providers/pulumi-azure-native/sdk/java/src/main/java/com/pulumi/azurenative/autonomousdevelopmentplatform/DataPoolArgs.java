// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.autonomousdevelopmentplatform;

import com.pulumi.azurenative.autonomousdevelopmentplatform.inputs.DataPoolLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataPoolArgs extends ResourceArgs {

    public static final DataPoolArgs Empty = new DataPoolArgs();

    /**
     * The name of the ADP account
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the ADP account
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the Data Pool
     * 
     */
    @Import(name="dataPoolName")
    private @Nullable Output<String> dataPoolName;

    /**
     * @return The name of the Data Pool
     * 
     */
    public Optional<Output<String>> dataPoolName() {
        return Optional.ofNullable(this.dataPoolName);
    }

    /**
     * Gets or sets the collection of locations where Data Pool resources should be created
     * 
     */
    @Import(name="locations", required=true)
    private Output<List<DataPoolLocationArgs>> locations;

    /**
     * @return Gets or sets the collection of locations where Data Pool resources should be created
     * 
     */
    public Output<List<DataPoolLocationArgs>> locations() {
        return this.locations;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private DataPoolArgs() {}

    private DataPoolArgs(DataPoolArgs $) {
        this.accountName = $.accountName;
        this.dataPoolName = $.dataPoolName;
        this.locations = $.locations;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataPoolArgs $;

        public Builder() {
            $ = new DataPoolArgs();
        }

        public Builder(DataPoolArgs defaults) {
            $ = new DataPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the ADP account
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the ADP account
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param dataPoolName The name of the Data Pool
         * 
         * @return builder
         * 
         */
        public Builder dataPoolName(@Nullable Output<String> dataPoolName) {
            $.dataPoolName = dataPoolName;
            return this;
        }

        /**
         * @param dataPoolName The name of the Data Pool
         * 
         * @return builder
         * 
         */
        public Builder dataPoolName(String dataPoolName) {
            return dataPoolName(Output.of(dataPoolName));
        }

        /**
         * @param locations Gets or sets the collection of locations where Data Pool resources should be created
         * 
         * @return builder
         * 
         */
        public Builder locations(Output<List<DataPoolLocationArgs>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations Gets or sets the collection of locations where Data Pool resources should be created
         * 
         * @return builder
         * 
         */
        public Builder locations(List<DataPoolLocationArgs> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations Gets or sets the collection of locations where Data Pool resources should be created
         * 
         * @return builder
         * 
         */
        public Builder locations(DataPoolLocationArgs... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public DataPoolArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.locations = Objects.requireNonNull($.locations, "expected parameter 'locations' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
