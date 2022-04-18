// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.accessanalyzer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyzerFilter {
    private final @Nullable List<String> contains;
    private final @Nullable List<String> eq;
    private final @Nullable Boolean exists;
    private final @Nullable List<String> neq;
    private final String property;

    @CustomType.Constructor
    private AnalyzerFilter(
        @CustomType.Parameter("contains") @Nullable List<String> contains,
        @CustomType.Parameter("eq") @Nullable List<String> eq,
        @CustomType.Parameter("exists") @Nullable Boolean exists,
        @CustomType.Parameter("neq") @Nullable List<String> neq,
        @CustomType.Parameter("property") String property) {
        this.contains = contains;
        this.eq = eq;
        this.exists = exists;
        this.neq = neq;
        this.property = property;
    }

    public List<String> contains() {
        return this.contains == null ? List.of() : this.contains;
    }
    public List<String> eq() {
        return this.eq == null ? List.of() : this.eq;
    }
    public Optional<Boolean> exists() {
        return Optional.ofNullable(this.exists);
    }
    public List<String> neq() {
        return this.neq == null ? List.of() : this.neq;
    }
    public String property() {
        return this.property;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyzerFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> contains;
        private @Nullable List<String> eq;
        private @Nullable Boolean exists;
        private @Nullable List<String> neq;
        private String property;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyzerFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contains = defaults.contains;
    	      this.eq = defaults.eq;
    	      this.exists = defaults.exists;
    	      this.neq = defaults.neq;
    	      this.property = defaults.property;
        }

        public Builder contains(@Nullable List<String> contains) {
            this.contains = contains;
            return this;
        }
        public Builder contains(String... contains) {
            return contains(List.of(contains));
        }
        public Builder eq(@Nullable List<String> eq) {
            this.eq = eq;
            return this;
        }
        public Builder eq(String... eq) {
            return eq(List.of(eq));
        }
        public Builder exists(@Nullable Boolean exists) {
            this.exists = exists;
            return this;
        }
        public Builder neq(@Nullable List<String> neq) {
            this.neq = neq;
            return this;
        }
        public Builder neq(String... neq) {
            return neq(List.of(neq));
        }
        public Builder property(String property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }        public AnalyzerFilter build() {
            return new AnalyzerFilter(contains, eq, exists, neq, property);
        }
    }
}
