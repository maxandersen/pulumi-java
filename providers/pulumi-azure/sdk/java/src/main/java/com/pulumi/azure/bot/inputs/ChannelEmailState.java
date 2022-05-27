// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEmailState extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEmailState Empty = new ChannelEmailState();

    /**
     * The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="botName")
    private @Nullable Output<String> botName;

    /**
     * @return The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> botName() {
        return Optional.ofNullable(this.botName);
    }

    /**
     * The email address that the Bot will authenticate with.
     * 
     */
    @Import(name="emailAddress")
    private @Nullable Output<String> emailAddress;

    /**
     * @return The email address that the Bot will authenticate with.
     * 
     */
    public Optional<Output<String>> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    /**
     * The email password that the Bot will authenticate with.
     * 
     */
    @Import(name="emailPassword")
    private @Nullable Output<String> emailPassword;

    /**
     * @return The email password that the Bot will authenticate with.
     * 
     */
    public Optional<Output<String>> emailPassword() {
        return Optional.ofNullable(this.emailPassword);
    }

    /**
     * The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private ChannelEmailState() {}

    private ChannelEmailState(ChannelEmailState $) {
        this.botName = $.botName;
        this.emailAddress = $.emailAddress;
        this.emailPassword = $.emailPassword;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEmailState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEmailState $;

        public Builder() {
            $ = new ChannelEmailState();
        }

        public Builder(ChannelEmailState defaults) {
            $ = new ChannelEmailState(Objects.requireNonNull(defaults));
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(@Nullable Output<String> botName) {
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
         * @param emailAddress The email address that the Bot will authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        /**
         * @param emailAddress The email address that the Bot will authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        /**
         * @param emailPassword The email password that the Bot will authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder emailPassword(@Nullable Output<String> emailPassword) {
            $.emailPassword = emailPassword;
            return this;
        }

        /**
         * @param emailPassword The email password that the Bot will authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder emailPassword(String emailPassword) {
            return emailPassword(Output.of(emailPassword));
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ChannelEmailState build() {
            return $;
        }
    }

}
