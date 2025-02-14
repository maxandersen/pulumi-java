// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.azurenative.databox.outputs.TransferFilterDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransferConfigurationResponseTransferFilterDetails {
    /**
     * @return Details of the filtering the transfer of data.
     * 
     */
    private final @Nullable TransferFilterDetailsResponse include;

    @CustomType.Constructor
    private TransferConfigurationResponseTransferFilterDetails(@CustomType.Parameter("include") @Nullable TransferFilterDetailsResponse include) {
        this.include = include;
    }

    /**
     * @return Details of the filtering the transfer of data.
     * 
     */
    public Optional<TransferFilterDetailsResponse> include() {
        return Optional.ofNullable(this.include);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferConfigurationResponseTransferFilterDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TransferFilterDetailsResponse include;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferConfigurationResponseTransferFilterDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.include = defaults.include;
        }

        public Builder include(@Nullable TransferFilterDetailsResponse include) {
            this.include = include;
            return this;
        }        public TransferConfigurationResponseTransferFilterDetails build() {
            return new TransferConfigurationResponseTransferFilterDetails(include);
        }
    }
}
