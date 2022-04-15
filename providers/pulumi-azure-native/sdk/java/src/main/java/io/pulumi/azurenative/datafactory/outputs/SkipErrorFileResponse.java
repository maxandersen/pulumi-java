// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkipErrorFileResponse {
    /**
     * Skip if source/sink file changed by other concurrent write. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object dataInconsistency;
    /**
     * Skip if file is deleted by other client during copy. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object fileMissing;

    @CustomType.Constructor
    private SkipErrorFileResponse(
        @CustomType.Parameter("dataInconsistency") @Nullable Object dataInconsistency,
        @CustomType.Parameter("fileMissing") @Nullable Object fileMissing) {
        this.dataInconsistency = dataInconsistency;
        this.fileMissing = fileMissing;
    }

    /**
     * Skip if source/sink file changed by other concurrent write. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> dataInconsistency() {
        return Optional.ofNullable(this.dataInconsistency);
    }
    /**
     * Skip if file is deleted by other client during copy. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> fileMissing() {
        return Optional.ofNullable(this.fileMissing);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkipErrorFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object dataInconsistency;
        private @Nullable Object fileMissing;

        public Builder() {
    	      // Empty
        }

        public Builder(SkipErrorFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataInconsistency = defaults.dataInconsistency;
    	      this.fileMissing = defaults.fileMissing;
        }

        public Builder dataInconsistency(@Nullable Object dataInconsistency) {
            this.dataInconsistency = dataInconsistency;
            return this;
        }
        public Builder fileMissing(@Nullable Object fileMissing) {
            this.fileMissing = fileMissing;
            return this;
        }        public SkipErrorFileResponse build() {
            return new SkipErrorFileResponse(dataInconsistency, fileMissing);
        }
    }
}
