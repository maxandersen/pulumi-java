// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.AzureResourceErrorInfoResponse;
import io.pulumi.azurenative.logic.outputs.ExpressionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExpressionRootResponse {
    /**
     * The azure resource error info.
     * 
     */
    private final @Nullable AzureResourceErrorInfoResponse error;
    /**
     * The path.
     * 
     */
    private final @Nullable String path;
    /**
     * The sub expressions.
     * 
     */
    private final @Nullable List<ExpressionResponse> subexpressions;
    /**
     * The text.
     * 
     */
    private final @Nullable String text;
    private final @Nullable Object value;

    @CustomType.Constructor
    private ExpressionRootResponse(
        @CustomType.Parameter("error") @Nullable AzureResourceErrorInfoResponse error,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("subexpressions") @Nullable List<ExpressionResponse> subexpressions,
        @CustomType.Parameter("text") @Nullable String text,
        @CustomType.Parameter("value") @Nullable Object value) {
        this.error = error;
        this.path = path;
        this.subexpressions = subexpressions;
        this.text = text;
        this.value = value;
    }

    /**
     * The azure resource error info.
     * 
    */
    public Optional<AzureResourceErrorInfoResponse> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * The path.
     * 
    */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * The sub expressions.
     * 
    */
    public List<ExpressionResponse> subexpressions() {
        return this.subexpressions == null ? List.of() : this.subexpressions;
    }
    /**
     * The text.
     * 
    */
    public Optional<String> text() {
        return Optional.ofNullable(this.text);
    }
    public Optional<Object> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressionRootResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureResourceErrorInfoResponse error;
        private @Nullable String path;
        private @Nullable List<ExpressionResponse> subexpressions;
        private @Nullable String text;
        private @Nullable Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressionRootResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.path = defaults.path;
    	      this.subexpressions = defaults.subexpressions;
    	      this.text = defaults.text;
    	      this.value = defaults.value;
        }

        public Builder error(@Nullable AzureResourceErrorInfoResponse error) {
            this.error = error;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder subexpressions(@Nullable List<ExpressionResponse> subexpressions) {
            this.subexpressions = subexpressions;
            return this;
        }
        public Builder subexpressions(ExpressionResponse... subexpressions) {
            return subexpressions(List.of(subexpressions));
        }
        public Builder text(@Nullable String text) {
            this.text = text;
            return this;
        }
        public Builder value(@Nullable Object value) {
            this.value = value;
            return this;
        }        public ExpressionRootResponse build() {
            return new ExpressionRootResponse(error, path, subexpressions, text, value);
        }
    }
}
