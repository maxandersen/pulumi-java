// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Qos Traffic Profiler Port range properties.
 * 
 */
public final class QosPortRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final QosPortRangeArgs Empty = new QosPortRangeArgs();

    /**
     * Qos Port Range end.
     * 
     */
    @Import(name="end")
    private @Nullable Output<Integer> end;

    /**
     * @return Qos Port Range end.
     * 
     */
    public Optional<Output<Integer>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * Qos Port Range start.
     * 
     */
    @Import(name="start")
    private @Nullable Output<Integer> start;

    /**
     * @return Qos Port Range start.
     * 
     */
    public Optional<Output<Integer>> start() {
        return Optional.ofNullable(this.start);
    }

    private QosPortRangeArgs() {}

    private QosPortRangeArgs(QosPortRangeArgs $) {
        this.end = $.end;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QosPortRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QosPortRangeArgs $;

        public Builder() {
            $ = new QosPortRangeArgs();
        }

        public Builder(QosPortRangeArgs defaults) {
            $ = new QosPortRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param end Qos Port Range end.
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<Integer> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end Qos Port Range end.
         * 
         * @return builder
         * 
         */
        public Builder end(Integer end) {
            return end(Output.of(end));
        }

        /**
         * @param start Qos Port Range start.
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<Integer> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start Qos Port Range start.
         * 
         * @return builder
         * 
         */
        public Builder start(Integer start) {
            return start(Output.of(start));
        }

        public QosPortRangeArgs build() {
            return $;
        }
    }

}
