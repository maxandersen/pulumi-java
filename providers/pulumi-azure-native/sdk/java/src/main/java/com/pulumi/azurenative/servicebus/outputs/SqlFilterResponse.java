// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlFilterResponse {
    /**
     * This property is reserved for future use. An integer value showing the compatibility level, currently hard-coded to 20.
     * 
     */
    private final @Nullable Integer compatibilityLevel;
    /**
     * Value that indicates whether the rule action requires preprocessing.
     * 
     */
    private final @Nullable Boolean requiresPreprocessing;
    /**
     * The SQL expression. e.g. MyProperty=&#39;ABC&#39;
     * 
     */
    private final @Nullable String sqlExpression;

    @CustomType.Constructor
    private SqlFilterResponse(
        @CustomType.Parameter("compatibilityLevel") @Nullable Integer compatibilityLevel,
        @CustomType.Parameter("requiresPreprocessing") @Nullable Boolean requiresPreprocessing,
        @CustomType.Parameter("sqlExpression") @Nullable String sqlExpression) {
        this.compatibilityLevel = compatibilityLevel;
        this.requiresPreprocessing = requiresPreprocessing;
        this.sqlExpression = sqlExpression;
    }

    /**
     * This property is reserved for future use. An integer value showing the compatibility level, currently hard-coded to 20.
     * 
    */
    public Optional<Integer> compatibilityLevel() {
        return Optional.ofNullable(this.compatibilityLevel);
    }
    /**
     * Value that indicates whether the rule action requires preprocessing.
     * 
    */
    public Optional<Boolean> requiresPreprocessing() {
        return Optional.ofNullable(this.requiresPreprocessing);
    }
    /**
     * The SQL expression. e.g. MyProperty=&#39;ABC&#39;
     * 
    */
    public Optional<String> sqlExpression() {
        return Optional.ofNullable(this.sqlExpression);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer compatibilityLevel;
        private @Nullable Boolean requiresPreprocessing;
        private @Nullable String sqlExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.requiresPreprocessing = defaults.requiresPreprocessing;
    	      this.sqlExpression = defaults.sqlExpression;
        }

        public Builder compatibilityLevel(@Nullable Integer compatibilityLevel) {
            this.compatibilityLevel = compatibilityLevel;
            return this;
        }
        public Builder requiresPreprocessing(@Nullable Boolean requiresPreprocessing) {
            this.requiresPreprocessing = requiresPreprocessing;
            return this;
        }
        public Builder sqlExpression(@Nullable String sqlExpression) {
            this.sqlExpression = sqlExpression;
            return this;
        }        public SqlFilterResponse build() {
            return new SqlFilterResponse(compatibilityLevel, requiresPreprocessing, sqlExpression);
        }
    }
}
