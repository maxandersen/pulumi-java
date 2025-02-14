// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v1.enums.AxisScale;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A chart axis.
 * 
 */
public final class AxisArgs extends com.pulumi.resources.ResourceArgs {

    public static final AxisArgs Empty = new AxisArgs();

    /**
     * The label of the axis.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The label of the axis.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The axis scale. By default, a linear scale is used.
     * 
     */
    @Import(name="scale")
    private @Nullable Output<AxisScale> scale;

    /**
     * @return The axis scale. By default, a linear scale is used.
     * 
     */
    public Optional<Output<AxisScale>> scale() {
        return Optional.ofNullable(this.scale);
    }

    private AxisArgs() {}

    private AxisArgs(AxisArgs $) {
        this.label = $.label;
        this.scale = $.scale;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AxisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AxisArgs $;

        public Builder() {
            $ = new AxisArgs();
        }

        public Builder(AxisArgs defaults) {
            $ = new AxisArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label The label of the axis.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the axis.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param scale The axis scale. By default, a linear scale is used.
         * 
         * @return builder
         * 
         */
        public Builder scale(@Nullable Output<AxisScale> scale) {
            $.scale = scale;
            return this;
        }

        /**
         * @param scale The axis scale. By default, a linear scale is used.
         * 
         * @return builder
         * 
         */
        public Builder scale(AxisScale scale) {
            return scale(Output.of(scale));
        }

        public AxisArgs build() {
            return $;
        }
    }

}
