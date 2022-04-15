// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class A2AUnprotectedDiskDetailsResponse {
    /**
     * The source lun Id for the data disk.
     * 
     */
    private final @Nullable Integer diskLunId;

    @CustomType.Constructor
    private A2AUnprotectedDiskDetailsResponse(@CustomType.Parameter("diskLunId") @Nullable Integer diskLunId) {
        this.diskLunId = diskLunId;
    }

    /**
     * The source lun Id for the data disk.
     * 
    */
    public Optional<Integer> diskLunId() {
        return Optional.ofNullable(this.diskLunId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(A2AUnprotectedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer diskLunId;

        public Builder() {
    	      // Empty
        }

        public Builder(A2AUnprotectedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskLunId = defaults.diskLunId;
        }

        public Builder diskLunId(@Nullable Integer diskLunId) {
            this.diskLunId = diskLunId;
            return this;
        }        public A2AUnprotectedDiskDetailsResponse build() {
            return new A2AUnprotectedDiskDetailsResponse(diskLunId);
        }
    }
}
