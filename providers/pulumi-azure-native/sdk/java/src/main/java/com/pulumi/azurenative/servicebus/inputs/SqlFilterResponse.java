// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a filter which is a composition of an expression and an action that is executed in the pub/sub pipeline.
 * 
 */
public final class SqlFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlFilterResponse Empty = new SqlFilterResponse();

    /**
     * This property is reserved for future use. An integer value showing the compatibility level, currently hard-coded to 20.
     * 
     */
    @Import(name="compatibilityLevel")
      private final @Nullable Integer compatibilityLevel;

    public Optional<Integer> compatibilityLevel() {
        return this.compatibilityLevel == null ? Optional.empty() : Optional.ofNullable(this.compatibilityLevel);
    }

    /**
     * Value that indicates whether the rule action requires preprocessing.
     * 
     */
    @Import(name="requiresPreprocessing")
      private final @Nullable Boolean requiresPreprocessing;

    public Optional<Boolean> requiresPreprocessing() {
        return this.requiresPreprocessing == null ? Optional.empty() : Optional.ofNullable(this.requiresPreprocessing);
    }

    /**
     * The SQL expression. e.g. MyProperty=&#39;ABC&#39;
     * 
     */
    @Import(name="sqlExpression")
      private final @Nullable String sqlExpression;

    public Optional<String> sqlExpression() {
        return this.sqlExpression == null ? Optional.empty() : Optional.ofNullable(this.sqlExpression);
    }

    public SqlFilterResponse(
        @Nullable Integer compatibilityLevel,
        @Nullable Boolean requiresPreprocessing,
        @Nullable String sqlExpression) {
        this.compatibilityLevel = Codegen.integerProp("compatibilityLevel").arg(compatibilityLevel).def(20).getNullable();
        this.requiresPreprocessing = Codegen.booleanProp("requiresPreprocessing").arg(requiresPreprocessing).def(true).getNullable();
        this.sqlExpression = sqlExpression;
    }

    private SqlFilterResponse() {
        this.compatibilityLevel = null;
        this.requiresPreprocessing = null;
        this.sqlExpression = null;
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
