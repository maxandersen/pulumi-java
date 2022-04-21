// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.azurenative.botservice.inputs.TelegramChannelPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Telegram channel definition
 * 
 */
public final class TelegramChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final TelegramChannelArgs Empty = new TelegramChannelArgs();

    /**
     * The channel name
     * Expected value is &#39;TelegramChannel&#39;.
     * 
     */
    @Import(name="channelName", required=true)
    private Output<String> channelName;

    public Output<String> channelName() {
        return this.channelName;
    }

    /**
     * Entity Tag of the resource
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The set of properties specific to Telegram channel resource
     * 
     */
    @Import(name="properties")
    private @Nullable Output<TelegramChannelPropertiesArgs> properties;

    public Optional<Output<TelegramChannelPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private TelegramChannelArgs() {}

    private TelegramChannelArgs(TelegramChannelArgs $) {
        this.channelName = $.channelName;
        this.etag = $.etag;
        this.location = $.location;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TelegramChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TelegramChannelArgs $;

        public Builder() {
            $ = new TelegramChannelArgs();
        }

        public Builder(TelegramChannelArgs defaults) {
            $ = new TelegramChannelArgs(Objects.requireNonNull(defaults));
        }

        public Builder channelName(Output<String> channelName) {
            $.channelName = channelName;
            return this;
        }

        public Builder channelName(String channelName) {
            return channelName(Output.of(channelName));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder properties(@Nullable Output<TelegramChannelPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(TelegramChannelPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public TelegramChannelArgs build() {
            $.channelName = Codegen.stringProp("channelName").output().arg($.channelName).require();
            $.location = Codegen.stringProp("location").output().arg($.location).def("global").getNullable();
            return $;
        }
    }

}
