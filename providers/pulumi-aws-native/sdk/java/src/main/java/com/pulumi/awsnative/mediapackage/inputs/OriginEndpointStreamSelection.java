// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.awsnative.mediapackage.enums.OriginEndpointStreamSelectionStreamOrder;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A StreamSelection configuration.
 * 
 */
public final class OriginEndpointStreamSelection extends com.pulumi.resources.InvokeArgs {

    public static final OriginEndpointStreamSelection Empty = new OriginEndpointStreamSelection();

    /**
     * The maximum video bitrate (bps) to include in output.
     * 
     */
    @Import(name="maxVideoBitsPerSecond")
    private @Nullable Integer maxVideoBitsPerSecond;

    public Optional<Integer> maxVideoBitsPerSecond() {
        return Optional.ofNullable(this.maxVideoBitsPerSecond);
    }

    /**
     * The minimum video bitrate (bps) to include in output.
     * 
     */
    @Import(name="minVideoBitsPerSecond")
    private @Nullable Integer minVideoBitsPerSecond;

    public Optional<Integer> minVideoBitsPerSecond() {
        return Optional.ofNullable(this.minVideoBitsPerSecond);
    }

    /**
     * A directive that determines the order of streams in the output.
     * 
     */
    @Import(name="streamOrder")
    private @Nullable OriginEndpointStreamSelectionStreamOrder streamOrder;

    public Optional<OriginEndpointStreamSelectionStreamOrder> streamOrder() {
        return Optional.ofNullable(this.streamOrder);
    }

    private OriginEndpointStreamSelection() {}

    private OriginEndpointStreamSelection(OriginEndpointStreamSelection $) {
        this.maxVideoBitsPerSecond = $.maxVideoBitsPerSecond;
        this.minVideoBitsPerSecond = $.minVideoBitsPerSecond;
        this.streamOrder = $.streamOrder;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginEndpointStreamSelection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginEndpointStreamSelection $;

        public Builder() {
            $ = new OriginEndpointStreamSelection();
        }

        public Builder(OriginEndpointStreamSelection defaults) {
            $ = new OriginEndpointStreamSelection(Objects.requireNonNull(defaults));
        }

        public Builder maxVideoBitsPerSecond(@Nullable Integer maxVideoBitsPerSecond) {
            $.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
            return this;
        }

        public Builder minVideoBitsPerSecond(@Nullable Integer minVideoBitsPerSecond) {
            $.minVideoBitsPerSecond = minVideoBitsPerSecond;
            return this;
        }

        public Builder streamOrder(@Nullable OriginEndpointStreamSelectionStreamOrder streamOrder) {
            $.streamOrder = streamOrder;
            return this;
        }

        public OriginEndpointStreamSelection build() {
            return $;
        }
    }

}
