// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AdditionalErrorInfoResponse {
    /**
     * Additional error info.
     * 
     */
    private final @Nullable Object info;
    /**
     * Additional error type.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private AdditionalErrorInfoResponse(
        @CustomType.Parameter("info") @Nullable Object info,
        @CustomType.Parameter("type") @Nullable String type) {
        this.info = info;
        this.type = type;
    }

    /**
     * Additional error info.
     * 
    */
    public Optional<Object> info() {
        return Optional.ofNullable(this.info);
    }
    /**
     * Additional error type.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalErrorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object info;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalErrorInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.info = defaults.info;
    	      this.type = defaults.type;
        }

        public Builder info(@Nullable Object info) {
            this.info = info;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public AdditionalErrorInfoResponse build() {
            return new AdditionalErrorInfoResponse(info, type);
        }
    }
}
