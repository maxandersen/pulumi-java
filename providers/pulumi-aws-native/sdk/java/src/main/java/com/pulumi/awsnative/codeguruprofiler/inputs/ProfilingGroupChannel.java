// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codeguruprofiler.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Notification medium for users to get alerted for events that occur in application profile. We support SNS topic as a notification channel.
 * 
 */
public final class ProfilingGroupChannel extends com.pulumi.resources.InvokeArgs {

    public static final ProfilingGroupChannel Empty = new ProfilingGroupChannel();

    @Import(name="channelId")
    private @Nullable String channelId;

    public Optional<String> channelId() {
        return Optional.ofNullable(this.channelId);
    }

    @Import(name="channelUri", required=true)
    private String channelUri;

    public String channelUri() {
        return this.channelUri;
    }

    private ProfilingGroupChannel() {}

    private ProfilingGroupChannel(ProfilingGroupChannel $) {
        this.channelId = $.channelId;
        this.channelUri = $.channelUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProfilingGroupChannel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProfilingGroupChannel $;

        public Builder() {
            $ = new ProfilingGroupChannel();
        }

        public Builder(ProfilingGroupChannel defaults) {
            $ = new ProfilingGroupChannel(Objects.requireNonNull(defaults));
        }

        public Builder channelId(@Nullable String channelId) {
            $.channelId = channelId;
            return this;
        }

        public Builder channelUri(String channelUri) {
            $.channelUri = channelUri;
            return this;
        }

        public ProfilingGroupChannel build() {
            $.channelUri = Objects.requireNonNull($.channelUri, "expected parameter 'channelUri' to be non-null");
            return $;
        }
    }

}
