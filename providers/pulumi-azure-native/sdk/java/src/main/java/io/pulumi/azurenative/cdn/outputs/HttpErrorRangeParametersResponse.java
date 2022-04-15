// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HttpErrorRangeParametersResponse {
    /**
     * The inclusive start of the http status code range.
     * 
     */
    private final @Nullable Integer begin;
    /**
     * The inclusive end of the http status code range.
     * 
     */
    private final @Nullable Integer end;

    @CustomType.Constructor
    private HttpErrorRangeParametersResponse(
        @CustomType.Parameter("begin") @Nullable Integer begin,
        @CustomType.Parameter("end") @Nullable Integer end) {
        this.begin = begin;
        this.end = end;
    }

    /**
     * The inclusive start of the http status code range.
     * 
    */
    public Optional<Integer> begin() {
        return Optional.ofNullable(this.begin);
    }
    /**
     * The inclusive end of the http status code range.
     * 
    */
    public Optional<Integer> end() {
        return Optional.ofNullable(this.end);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpErrorRangeParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer begin;
        private @Nullable Integer end;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpErrorRangeParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.begin = defaults.begin;
    	      this.end = defaults.end;
        }

        public Builder begin(@Nullable Integer begin) {
            this.begin = begin;
            return this;
        }
        public Builder end(@Nullable Integer end) {
            this.end = end;
            return this;
        }        public HttpErrorRangeParametersResponse build() {
            return new HttpErrorRangeParametersResponse(begin, end);
        }
    }
}
