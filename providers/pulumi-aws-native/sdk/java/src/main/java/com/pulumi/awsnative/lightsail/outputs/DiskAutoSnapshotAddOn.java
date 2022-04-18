// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiskAutoSnapshotAddOn {
    /**
     * The daily time when an automatic snapshot will be created.
     * 
     */
    private final @Nullable String snapshotTimeOfDay;

    @CustomType.Constructor
    private DiskAutoSnapshotAddOn(@CustomType.Parameter("snapshotTimeOfDay") @Nullable String snapshotTimeOfDay) {
        this.snapshotTimeOfDay = snapshotTimeOfDay;
    }

    /**
     * The daily time when an automatic snapshot will be created.
     * 
    */
    public Optional<String> snapshotTimeOfDay() {
        return Optional.ofNullable(this.snapshotTimeOfDay);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskAutoSnapshotAddOn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String snapshotTimeOfDay;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskAutoSnapshotAddOn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snapshotTimeOfDay = defaults.snapshotTimeOfDay;
        }

        public Builder snapshotTimeOfDay(@Nullable String snapshotTimeOfDay) {
            this.snapshotTimeOfDay = snapshotTimeOfDay;
            return this;
        }        public DiskAutoSnapshotAddOn build() {
            return new DiskAutoSnapshotAddOn(snapshotTimeOfDay);
        }
    }
}
