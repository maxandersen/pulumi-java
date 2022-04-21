// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceConsistentHashHttpCookieTtlArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceConsistentHashHttpCookieTtlArgs Empty = new BackendServiceConsistentHashHttpCookieTtlArgs();

    /**
     * Span of time that&#39;s a fraction of a second at nanosecond resolution. Durations
     * less than one second are represented with a 0 `seconds` field and a positive
     * `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @Import(name="nanos")
    private @Nullable Output<Integer> nanos;

    public Optional<Output<Integer>> nanos() {
        return Optional.ofNullable(this.nanos);
    }

    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000
     * inclusive.
     * 
     */
    @Import(name="seconds", required=true)
    private Output<Integer> seconds;

    public Output<Integer> seconds() {
        return this.seconds;
    }

    private BackendServiceConsistentHashHttpCookieTtlArgs() {}

    private BackendServiceConsistentHashHttpCookieTtlArgs(BackendServiceConsistentHashHttpCookieTtlArgs $) {
        this.nanos = $.nanos;
        this.seconds = $.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceConsistentHashHttpCookieTtlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceConsistentHashHttpCookieTtlArgs $;

        public Builder() {
            $ = new BackendServiceConsistentHashHttpCookieTtlArgs();
        }

        public Builder(BackendServiceConsistentHashHttpCookieTtlArgs defaults) {
            $ = new BackendServiceConsistentHashHttpCookieTtlArgs(Objects.requireNonNull(defaults));
        }

        public Builder nanos(@Nullable Output<Integer> nanos) {
            $.nanos = nanos;
            return this;
        }

        public Builder nanos(Integer nanos) {
            return nanos(Output.of(nanos));
        }

        public Builder seconds(Output<Integer> seconds) {
            $.seconds = seconds;
            return this;
        }

        public Builder seconds(Integer seconds) {
            return seconds(Output.of(seconds));
        }

        public BackendServiceConsistentHashHttpCookieTtlArgs build() {
            $.seconds = Objects.requireNonNull($.seconds, "expected parameter 'seconds' to be non-null");
            return $;
        }
    }

}
