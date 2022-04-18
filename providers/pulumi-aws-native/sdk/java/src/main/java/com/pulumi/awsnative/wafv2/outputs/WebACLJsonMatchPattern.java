// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebACLJsonMatchPattern {
    /**
     * Inspect all parts of the web request's JSON body.
     * 
     */
    private final @Nullable Object all;
    private final @Nullable List<String> includedPaths;

    @CustomType.Constructor
    private WebACLJsonMatchPattern(
        @CustomType.Parameter("all") @Nullable Object all,
        @CustomType.Parameter("includedPaths") @Nullable List<String> includedPaths) {
        this.all = all;
        this.includedPaths = includedPaths;
    }

    /**
     * Inspect all parts of the web request's JSON body.
     * 
    */
    public Optional<Object> all() {
        return Optional.ofNullable(this.all);
    }
    public List<String> includedPaths() {
        return this.includedPaths == null ? List.of() : this.includedPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLJsonMatchPattern defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object all;
        private @Nullable List<String> includedPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLJsonMatchPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.includedPaths = defaults.includedPaths;
        }

        public Builder all(@Nullable Object all) {
            this.all = all;
            return this;
        }
        public Builder includedPaths(@Nullable List<String> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }
        public Builder includedPaths(String... includedPaths) {
            return includedPaths(List.of(includedPaths));
        }        public WebACLJsonMatchPattern build() {
            return new WebACLJsonMatchPattern(all, includedPaths);
        }
    }
}
