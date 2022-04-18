// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * HttpRouteRuleMatch criteria for field values that must stay within the specified integer range.
 * 
 */
public final class Int64RangeMatchResponse extends com.pulumi.resources.InvokeArgs {

    public static final Int64RangeMatchResponse Empty = new Int64RangeMatchResponse();

    /**
     * The end of the range (exclusive) in signed long integer format.
     * 
     */
    @Import(name="rangeEnd", required=true)
      private final String rangeEnd;

    public String rangeEnd() {
        return this.rangeEnd;
    }

    /**
     * The start of the range (inclusive) in signed long integer format.
     * 
     */
    @Import(name="rangeStart", required=true)
      private final String rangeStart;

    public String rangeStart() {
        return this.rangeStart;
    }

    public Int64RangeMatchResponse(
        String rangeEnd,
        String rangeStart) {
        this.rangeEnd = Objects.requireNonNull(rangeEnd, "expected parameter 'rangeEnd' to be non-null");
        this.rangeStart = Objects.requireNonNull(rangeStart, "expected parameter 'rangeStart' to be non-null");
    }

    private Int64RangeMatchResponse() {
        this.rangeEnd = null;
        this.rangeStart = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Int64RangeMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String rangeEnd;
        private String rangeStart;

        public Builder() {
    	      // Empty
        }

        public Builder(Int64RangeMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rangeEnd = defaults.rangeEnd;
    	      this.rangeStart = defaults.rangeStart;
        }

        public Builder rangeEnd(String rangeEnd) {
            this.rangeEnd = Objects.requireNonNull(rangeEnd);
            return this;
        }
        public Builder rangeStart(String rangeStart) {
            this.rangeStart = Objects.requireNonNull(rangeStart);
            return this;
        }        public Int64RangeMatchResponse build() {
            return new Int64RangeMatchResponse(rangeEnd, rangeStart);
        }
    }
}
