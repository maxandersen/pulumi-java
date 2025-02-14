// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthbot;

import com.pulumi.azurenative.healthbot.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotArgs Empty = new BotArgs();

    /**
     * The name of the Bot resource.
     * 
     */
    @Import(name="botName")
    private @Nullable Output<String> botName;

    /**
     * @return The name of the Bot resource.
     * 
     */
    public Optional<Output<String>> botName() {
        return Optional.ofNullable(this.botName);
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
     * The name of the Bot resource group in the user subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Bot resource group in the user subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * SKU of the HealthBot.
     * 
     */
    @Import(name="sku", required=true)
    private Output<SkuArgs> sku;

    /**
     * @return SKU of the HealthBot.
     * 
     */
    public Output<SkuArgs> sku() {
        return this.sku;
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

    private BotArgs() {}

    private BotArgs(BotArgs $) {
        this.botName = $.botName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotArgs $;

        public Builder() {
            $ = new BotArgs();
        }

        public Builder(BotArgs defaults) {
            $ = new BotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param botName The name of the Bot resource.
         * 
         * @return builder
         * 
         */
        public Builder botName(@Nullable Output<String> botName) {
            $.botName = botName;
            return this;
        }

        /**
         * @param botName The name of the Bot resource.
         * 
         * @return builder
         * 
         */
        public Builder botName(String botName) {
            return botName(Output.of(botName));
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
         * @param resourceGroupName The name of the Bot resource group in the user subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Bot resource group in the user subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku SKU of the HealthBot.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku SKU of the HealthBot.
         * 
         * @return builder
         * 
         */
        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
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

        public BotArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
