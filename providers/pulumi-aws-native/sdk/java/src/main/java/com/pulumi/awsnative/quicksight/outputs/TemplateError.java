// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.awsnative.quicksight.enums.TemplateErrorType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TemplateError {
    /**
     * &lt;p&gt;Description of the error type.&lt;/p&gt;
     * 
     */
    private final @Nullable String message;
    private final @Nullable TemplateErrorType type;

    @CustomType.Constructor
    private TemplateError(
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("type") @Nullable TemplateErrorType type) {
        this.message = message;
        this.type = type;
    }

    /**
     * &lt;p&gt;Description of the error type.&lt;/p&gt;
     * 
    */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    public Optional<TemplateErrorType> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable TemplateErrorType type;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder type(@Nullable TemplateErrorType type) {
            this.type = type;
            return this;
        }        public TemplateError build() {
            return new TemplateError(message, type);
        }
    }
}
