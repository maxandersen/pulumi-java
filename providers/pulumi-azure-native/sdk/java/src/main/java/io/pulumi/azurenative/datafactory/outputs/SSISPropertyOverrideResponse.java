// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SSISPropertyOverrideResponse {
    /**
     * Whether SSIS package property override value is sensitive data. Value will be encrypted in SSISDB if it is true
     * 
     */
    private final @Nullable Boolean isSensitive;
    /**
     * SSIS package property override value. Type: string (or Expression with resultType string).
     * 
     */
    private final Object value;

    @CustomType.Constructor
    private SSISPropertyOverrideResponse(
        @CustomType.Parameter("isSensitive") @Nullable Boolean isSensitive,
        @CustomType.Parameter("value") Object value) {
        this.isSensitive = isSensitive;
        this.value = value;
    }

    /**
     * Whether SSIS package property override value is sensitive data. Value will be encrypted in SSISDB if it is true
     * 
    */
    public Optional<Boolean> isSensitive() {
        return Optional.ofNullable(this.isSensitive);
    }
    /**
     * SSIS package property override value. Type: string (or Expression with resultType string).
     * 
    */
    public Object value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISPropertyOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isSensitive;
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISPropertyOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isSensitive = defaults.isSensitive;
    	      this.value = defaults.value;
        }

        public Builder isSensitive(@Nullable Boolean isSensitive) {
            this.isSensitive = isSensitive;
            return this;
        }
        public Builder value(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public SSISPropertyOverrideResponse build() {
            return new SSISPropertyOverrideResponse(isSensitive, value);
        }
    }
}
