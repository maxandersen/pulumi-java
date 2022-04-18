// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AiMetadataStoreState {
    private final @Nullable String diskUtilizationBytes;

    @CustomType.Constructor
    private AiMetadataStoreState(@CustomType.Parameter("diskUtilizationBytes") @Nullable String diskUtilizationBytes) {
        this.diskUtilizationBytes = diskUtilizationBytes;
    }

    public Optional<String> diskUtilizationBytes() {
        return Optional.ofNullable(this.diskUtilizationBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiMetadataStoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskUtilizationBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(AiMetadataStoreState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskUtilizationBytes = defaults.diskUtilizationBytes;
        }

        public Builder diskUtilizationBytes(@Nullable String diskUtilizationBytes) {
            this.diskUtilizationBytes = diskUtilizationBytes;
            return this;
        }        public AiMetadataStoreState build() {
            return new AiMetadataStoreState(diskUtilizationBytes);
        }
    }
}
