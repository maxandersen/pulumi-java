// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceConsistentHashHttpCookieTtlGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceConsistentHashHttpCookieTtlGetArgs Empty = new BackendServiceConsistentHashHttpCookieTtlGetArgs();

    /**
     * Span of time that&#39;s a fraction of a second at nanosecond resolution. Durations
     * less than one second are represented with a 0 `seconds` field and a positive
     * `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @Import(name="nanos")
      private final @Nullable Output<Integer> nanos;

    public Output<Integer> nanos() {
        return this.nanos == null ? Codegen.empty() : this.nanos;
    }

    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000
     * inclusive.
     * 
     */
    @Import(name="seconds", required=true)
      private final Output<Integer> seconds;

    public Output<Integer> seconds() {
        return this.seconds;
    }

    public BackendServiceConsistentHashHttpCookieTtlGetArgs(
        @Nullable Output<Integer> nanos,
        Output<Integer> seconds) {
        this.nanos = nanos;
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private BackendServiceConsistentHashHttpCookieTtlGetArgs() {
        this.nanos = Codegen.empty();
        this.seconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceConsistentHashHttpCookieTtlGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> nanos;
        private Output<Integer> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceConsistentHashHttpCookieTtlGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder nanos(@Nullable Output<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }
        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = Codegen.ofNullable(nanos);
            return this;
        }
        public Builder seconds(Output<Integer> seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }
        public Builder seconds(Integer seconds) {
            this.seconds = Output.of(Objects.requireNonNull(seconds));
            return this;
        }        public BackendServiceConsistentHashHttpCookieTtlGetArgs build() {
            return new BackendServiceConsistentHashHttpCookieTtlGetArgs(nanos, seconds);
        }
    }
}
