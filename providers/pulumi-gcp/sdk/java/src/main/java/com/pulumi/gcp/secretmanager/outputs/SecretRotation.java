// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecretRotation {
    /**
     * Timestamp in UTC at which the Secret is scheduled to rotate.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    private final @Nullable String nextRotationTime;
    /**
     * The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
     * If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
     * 
     */
    private final @Nullable String rotationPeriod;

    @CustomType.Constructor
    private SecretRotation(
        @CustomType.Parameter("nextRotationTime") @Nullable String nextRotationTime,
        @CustomType.Parameter("rotationPeriod") @Nullable String rotationPeriod) {
        this.nextRotationTime = nextRotationTime;
        this.rotationPeriod = rotationPeriod;
    }

    /**
     * Timestamp in UTC at which the Secret is scheduled to rotate.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
    */
    public Optional<String> nextRotationTime() {
        return Optional.ofNullable(this.nextRotationTime);
    }
    /**
     * The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
     * If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
     * 
    */
    public Optional<String> rotationPeriod() {
        return Optional.ofNullable(this.rotationPeriod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretRotation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextRotationTime;
        private @Nullable String rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretRotation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.rotationPeriod = defaults.rotationPeriod;
        }

        public Builder nextRotationTime(@Nullable String nextRotationTime) {
            this.nextRotationTime = nextRotationTime;
            return this;
        }
        public Builder rotationPeriod(@Nullable String rotationPeriod) {
            this.rotationPeriod = rotationPeriod;
            return this;
        }        public SecretRotation build() {
            return new SecretRotation(nextRotationTime, rotationPeriod);
        }
    }
}
