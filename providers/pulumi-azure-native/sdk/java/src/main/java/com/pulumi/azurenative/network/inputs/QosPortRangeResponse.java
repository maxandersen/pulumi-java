// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Qos Traffic Profiler Port range properties.
 * 
 */
public final class QosPortRangeResponse extends com.pulumi.resources.InvokeArgs {

    public static final QosPortRangeResponse Empty = new QosPortRangeResponse();

    /**
     * Qos Port Range end.
     * 
     */
    @Import(name="end")
      private final @Nullable Integer end;

    public Optional<Integer> end() {
        return this.end == null ? Optional.empty() : Optional.ofNullable(this.end);
    }

    /**
     * Qos Port Range start.
     * 
     */
    @Import(name="start")
      private final @Nullable Integer start;

    public Optional<Integer> start() {
        return this.start == null ? Optional.empty() : Optional.ofNullable(this.start);
    }

    public QosPortRangeResponse(
        @Nullable Integer end,
        @Nullable Integer start) {
        this.end = end;
        this.start = start;
    }

    private QosPortRangeResponse() {
        this.end = null;
        this.start = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QosPortRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer end;
        private @Nullable Integer start;

        public Builder() {
    	      // Empty
        }

        public Builder(QosPortRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder end(@Nullable Integer end) {
            this.end = end;
            return this;
        }
        public Builder start(@Nullable Integer start) {
            this.start = start;
            return this;
        }        public QosPortRangeResponse build() {
            return new QosPortRangeResponse(end, start);
        }
    }
}
