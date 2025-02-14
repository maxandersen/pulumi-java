// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recommendationsservice;

import com.pulumi.azurenative.recommendationsservice.inputs.ModelingResourcePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelingArgs Empty = new ModelingArgs();

    /**
     * The name of the RecommendationsService Account resource.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the RecommendationsService Account resource.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Modeling resource.
     * 
     */
    @Import(name="modelingName")
    private @Nullable Output<String> modelingName;

    /**
     * @return The name of the Modeling resource.
     * 
     */
    public Optional<Output<String>> modelingName() {
        return Optional.ofNullable(this.modelingName);
    }

    /**
     * Modeling resource properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ModelingResourcePropertiesArgs> properties;

    /**
     * @return Modeling resource properties.
     * 
     */
    public Optional<Output<ModelingResourcePropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
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

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ModelingArgs() {}

    private ModelingArgs(ModelingArgs $) {
        this.accountName = $.accountName;
        this.location = $.location;
        this.modelingName = $.modelingName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelingArgs $;

        public Builder() {
            $ = new ModelingArgs();
        }

        public Builder(ModelingArgs defaults) {
            $ = new ModelingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the RecommendationsService Account resource.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the RecommendationsService Account resource.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param modelingName The name of the Modeling resource.
         * 
         * @return builder
         * 
         */
        public Builder modelingName(@Nullable Output<String> modelingName) {
            $.modelingName = modelingName;
            return this;
        }

        /**
         * @param modelingName The name of the Modeling resource.
         * 
         * @return builder
         * 
         */
        public Builder modelingName(String modelingName) {
            return modelingName(Output.of(modelingName));
        }

        /**
         * @param properties Modeling resource properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ModelingResourcePropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Modeling resource properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(ModelingResourcePropertiesArgs properties) {
            return properties(Output.of(properties));
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

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ModelingArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
