// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.inputs.FilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Pub/Sub specific notification config.
 * 
 */
public final class PubSubArgs extends com.pulumi.resources.ResourceArgs {

    public static final PubSubArgs Empty = new PubSubArgs();

    /**
     * Enable notifications for Pub/Sub.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Allows filtering to one or more specific event types. If no filter is specified, or if a filter is specified with no event types, all event types will be sent
     * 
     */
    @Import(name="filter")
    private @Nullable Output<FilterArgs> filter;

    public Optional<Output<FilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The desired Pub/Sub topic to which notifications will be sent by GKE. Format is `projects/{project}/topics/{topic}`.
     * 
     */
    @Import(name="topic")
    private @Nullable Output<String> topic;

    public Optional<Output<String>> topic() {
        return Optional.ofNullable(this.topic);
    }

    private PubSubArgs() {}

    private PubSubArgs(PubSubArgs $) {
        this.enabled = $.enabled;
        this.filter = $.filter;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PubSubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PubSubArgs $;

        public Builder() {
            $ = new PubSubArgs();
        }

        public Builder(PubSubArgs defaults) {
            $ = new PubSubArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder filter(@Nullable Output<FilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(FilterArgs filter) {
            return filter(Output.of(filter));
        }

        public Builder topic(@Nullable Output<String> topic) {
            $.topic = topic;
            return this;
        }

        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public PubSubArgs build() {
            return $;
        }
    }

}
