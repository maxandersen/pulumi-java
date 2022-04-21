// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.azurenative.botservice.inputs.DirectLineSpeechChannelPropertiesResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DirectLine Speech channel definition
 * 
 */
public final class DirectLineSpeechChannelResponse extends com.pulumi.resources.InvokeArgs {

    public static final DirectLineSpeechChannelResponse Empty = new DirectLineSpeechChannelResponse();

    /**
     * The channel name
     * Expected value is &#39;DirectLineSpeechChannel&#39;.
     * 
     */
    @Import(name="channelName", required=true)
    private String channelName;

    public String channelName() {
        return this.channelName;
    }

    /**
     * Entity Tag of the resource
     * 
     */
    @Import(name="etag")
    private @Nullable String etag;

    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The set of properties specific to DirectLine Speech channel resource
     * 
     */
    @Import(name="properties")
    private @Nullable DirectLineSpeechChannelPropertiesResponse properties;

    public Optional<DirectLineSpeechChannelPropertiesResponse> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Provisioning state of the resource
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    private DirectLineSpeechChannelResponse() {}

    private DirectLineSpeechChannelResponse(DirectLineSpeechChannelResponse $) {
        this.channelName = $.channelName;
        this.etag = $.etag;
        this.location = $.location;
        this.properties = $.properties;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DirectLineSpeechChannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DirectLineSpeechChannelResponse $;

        public Builder() {
            $ = new DirectLineSpeechChannelResponse();
        }

        public Builder(DirectLineSpeechChannelResponse defaults) {
            $ = new DirectLineSpeechChannelResponse(Objects.requireNonNull(defaults));
        }

        public Builder channelName(String channelName) {
            $.channelName = channelName;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            $.etag = etag;
            return this;
        }

        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        public Builder properties(@Nullable DirectLineSpeechChannelPropertiesResponse properties) {
            $.properties = properties;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public DirectLineSpeechChannelResponse build() {
            $.channelName = Codegen.stringProp("channelName").arg($.channelName).require();
            $.location = Codegen.stringProp("location").arg($.location).def("global").getNullable();
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
