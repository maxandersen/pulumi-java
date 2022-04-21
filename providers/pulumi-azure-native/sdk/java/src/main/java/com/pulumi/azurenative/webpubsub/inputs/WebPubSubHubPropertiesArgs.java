// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.inputs;

import com.pulumi.azurenative.webpubsub.inputs.EventHandlerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a hub.
 * 
 */
public final class WebPubSubHubPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebPubSubHubPropertiesArgs Empty = new WebPubSubHubPropertiesArgs();

    /**
     * The settings for configuring if anonymous connections are allowed for this hub: &#34;allow&#34; or &#34;deny&#34;. Default to &#34;deny&#34;.
     * 
     */
    @Import(name="anonymousConnectPolicy")
    private @Nullable Output<String> anonymousConnectPolicy;

    public Optional<Output<String>> anonymousConnectPolicy() {
        return Optional.ofNullable(this.anonymousConnectPolicy);
    }

    /**
     * Event handler of a hub.
     * 
     */
    @Import(name="eventHandlers")
    private @Nullable Output<List<EventHandlerArgs>> eventHandlers;

    public Optional<Output<List<EventHandlerArgs>>> eventHandlers() {
        return Optional.ofNullable(this.eventHandlers);
    }

    private WebPubSubHubPropertiesArgs() {}

    private WebPubSubHubPropertiesArgs(WebPubSubHubPropertiesArgs $) {
        this.anonymousConnectPolicy = $.anonymousConnectPolicy;
        this.eventHandlers = $.eventHandlers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebPubSubHubPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebPubSubHubPropertiesArgs $;

        public Builder() {
            $ = new WebPubSubHubPropertiesArgs();
        }

        public Builder(WebPubSubHubPropertiesArgs defaults) {
            $ = new WebPubSubHubPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder anonymousConnectPolicy(@Nullable Output<String> anonymousConnectPolicy) {
            $.anonymousConnectPolicy = anonymousConnectPolicy;
            return this;
        }

        public Builder anonymousConnectPolicy(String anonymousConnectPolicy) {
            return anonymousConnectPolicy(Output.of(anonymousConnectPolicy));
        }

        public Builder eventHandlers(@Nullable Output<List<EventHandlerArgs>> eventHandlers) {
            $.eventHandlers = eventHandlers;
            return this;
        }

        public Builder eventHandlers(List<EventHandlerArgs> eventHandlers) {
            return eventHandlers(Output.of(eventHandlers));
        }

        public Builder eventHandlers(EventHandlerArgs... eventHandlers) {
            return eventHandlers(List.of(eventHandlers));
        }

        public WebPubSubHubPropertiesArgs build() {
            $.anonymousConnectPolicy = Codegen.stringProp("anonymousConnectPolicy").output().arg($.anonymousConnectPolicy).def("deny").getNullable();
            return $;
        }
    }

}
