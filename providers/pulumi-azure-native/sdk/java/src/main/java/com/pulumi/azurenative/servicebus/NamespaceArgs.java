// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus;

import com.pulumi.azurenative.servicebus.inputs.SBSkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceArgs extends ResourceArgs {

    public static final NamespaceArgs Empty = new NamespaceArgs();

    /**
     * The Geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The namespace name.
     * 
     */
    @Import(name="namespaceName")
    private @Nullable Output<String> namespaceName;

    /**
     * @return The namespace name.
     * 
     */
    public Optional<Output<String>> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Properties of Sku
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SBSkuArgs> sku;

    /**
     * @return Properties of Sku
     * 
     */
    public Optional<Output<SBSkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NamespaceArgs() {}

    private NamespaceArgs(NamespaceArgs $) {
        this.location = $.location;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceArgs $;

        public Builder() {
            $ = new NamespaceArgs();
        }

        public Builder(NamespaceArgs defaults) {
            $ = new NamespaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param namespaceName The namespace name.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(@Nullable Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The namespace name.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku Properties of Sku
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<SBSkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku Properties of Sku
         * 
         * @return builder
         * 
         */
        public Builder sku(SBSkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NamespaceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
