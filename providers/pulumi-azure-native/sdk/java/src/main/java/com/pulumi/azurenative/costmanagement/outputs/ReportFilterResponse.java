// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.azurenative.costmanagement.outputs.ReportComparisonExpressionResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReportFilterResponse {
    /**
     * The logical &#34;AND&#34; expression. Must have at least 2 items.
     * 
     */
    private final @Nullable List<ReportFilterResponse> and;
    /**
     * Has comparison expression for a dimension
     * 
     */
    private final @Nullable ReportComparisonExpressionResponse dimension;
    /**
     * The logical &#34;NOT&#34; expression.
     * 
     */
    private final @Nullable ReportFilterResponse not;
    /**
     * The logical &#34;OR&#34; expression. Must have at least 2 items.
     * 
     */
    private final @Nullable List<ReportFilterResponse> or;
    /**
     * Has comparison expression for a tag
     * 
     */
    private final @Nullable ReportComparisonExpressionResponse tag;

    @CustomType.Constructor
    private ReportFilterResponse(
        @CustomType.Parameter("and") @Nullable List<ReportFilterResponse> and,
        @CustomType.Parameter("dimension") @Nullable ReportComparisonExpressionResponse dimension,
        @CustomType.Parameter("not") @Nullable ReportFilterResponse not,
        @CustomType.Parameter("or") @Nullable List<ReportFilterResponse> or,
        @CustomType.Parameter("tag") @Nullable ReportComparisonExpressionResponse tag) {
        this.and = and;
        this.dimension = dimension;
        this.not = not;
        this.or = or;
        this.tag = tag;
    }

    /**
     * The logical &#34;AND&#34; expression. Must have at least 2 items.
     * 
    */
    public List<ReportFilterResponse> and() {
        return this.and == null ? List.of() : this.and;
    }
    /**
     * Has comparison expression for a dimension
     * 
    */
    public Optional<ReportComparisonExpressionResponse> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    /**
     * The logical &#34;NOT&#34; expression.
     * 
    */
    public Optional<ReportFilterResponse> not() {
        return Optional.ofNullable(this.not);
    }
    /**
     * The logical &#34;OR&#34; expression. Must have at least 2 items.
     * 
    */
    public List<ReportFilterResponse> or() {
        return this.or == null ? List.of() : this.or;
    }
    /**
     * Has comparison expression for a tag
     * 
    */
    public Optional<ReportComparisonExpressionResponse> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ReportFilterResponse> and;
        private @Nullable ReportComparisonExpressionResponse dimension;
        private @Nullable ReportFilterResponse not;
        private @Nullable List<ReportFilterResponse> or;
        private @Nullable ReportComparisonExpressionResponse tag;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.dimension = defaults.dimension;
    	      this.not = defaults.not;
    	      this.or = defaults.or;
    	      this.tag = defaults.tag;
        }

        public Builder and(@Nullable List<ReportFilterResponse> and) {
            this.and = and;
            return this;
        }
        public Builder and(ReportFilterResponse... and) {
            return and(List.of(and));
        }
        public Builder dimension(@Nullable ReportComparisonExpressionResponse dimension) {
            this.dimension = dimension;
            return this;
        }
        public Builder not(@Nullable ReportFilterResponse not) {
            this.not = not;
            return this;
        }
        public Builder or(@Nullable List<ReportFilterResponse> or) {
            this.or = or;
            return this;
        }
        public Builder or(ReportFilterResponse... or) {
            return or(List.of(or));
        }
        public Builder tag(@Nullable ReportComparisonExpressionResponse tag) {
            this.tag = tag;
            return this;
        }        public ReportFilterResponse build() {
            return new ReportFilterResponse(and, dimension, not, or, tag);
        }
    }
}
