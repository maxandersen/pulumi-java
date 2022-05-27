// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelWebChatArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelWebChatArgs Empty = new ChannelWebChatArgs();

    /**
     * The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="botName", required=true)
    private Output<String> botName;

    /**
     * @return The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> botName() {
        return this.botName;
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A list of Web Chat Site names.
     * 
     */
    @Import(name="siteNames", required=true)
    private Output<List<String>> siteNames;

    /**
     * @return A list of Web Chat Site names.
     * 
     */
    public Output<List<String>> siteNames() {
        return this.siteNames;
    }

    private ChannelWebChatArgs() {}

    private ChannelWebChatArgs(ChannelWebChatArgs $) {
        this.botName = $.botName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.siteNames = $.siteNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelWebChatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelWebChatArgs $;

        public Builder() {
            $ = new ChannelWebChatArgs();
        }

        public Builder(ChannelWebChatArgs defaults) {
            $ = new ChannelWebChatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(Output<String> botName) {
            $.botName = botName;
            return this;
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(String botName) {
            return botName(Output.of(botName));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param siteNames A list of Web Chat Site names.
         * 
         * @return builder
         * 
         */
        public Builder siteNames(Output<List<String>> siteNames) {
            $.siteNames = siteNames;
            return this;
        }

        /**
         * @param siteNames A list of Web Chat Site names.
         * 
         * @return builder
         * 
         */
        public Builder siteNames(List<String> siteNames) {
            return siteNames(Output.of(siteNames));
        }

        /**
         * @param siteNames A list of Web Chat Site names.
         * 
         * @return builder
         * 
         */
        public Builder siteNames(String... siteNames) {
            return siteNames(List.of(siteNames));
        }

        public ChannelWebChatArgs build() {
            $.botName = Objects.requireNonNull($.botName, "expected parameter 'botName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.siteNames = Objects.requireNonNull($.siteNames, "expected parameter 'siteNames' to be non-null");
            return $;
        }
    }

}
