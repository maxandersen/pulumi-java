// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretRotationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretRotationArgs Empty = new SecretRotationArgs();

    /**
     * Timestamp in UTC at which the Secret is scheduled to rotate.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="nextRotationTime")
      private final @Nullable Output<String> nextRotationTime;

    public Output<String> nextRotationTime() {
        return this.nextRotationTime == null ? Codegen.empty() : this.nextRotationTime;
    }

    /**
     * The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
     * If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
     * 
     */
    @Import(name="rotationPeriod")
      private final @Nullable Output<String> rotationPeriod;

    public Output<String> rotationPeriod() {
        return this.rotationPeriod == null ? Codegen.empty() : this.rotationPeriod;
    }

    public SecretRotationArgs(
        @Nullable Output<String> nextRotationTime,
        @Nullable Output<String> rotationPeriod) {
        this.nextRotationTime = nextRotationTime;
        this.rotationPeriod = rotationPeriod;
    }

    private SecretRotationArgs() {
        this.nextRotationTime = Codegen.empty();
        this.rotationPeriod = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretRotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> nextRotationTime;
        private @Nullable Output<String> rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretRotationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.rotationPeriod = defaults.rotationPeriod;
        }

        public Builder nextRotationTime(@Nullable Output<String> nextRotationTime) {
            this.nextRotationTime = nextRotationTime;
            return this;
        }
        public Builder nextRotationTime(@Nullable String nextRotationTime) {
            this.nextRotationTime = Codegen.ofNullable(nextRotationTime);
            return this;
        }
        public Builder rotationPeriod(@Nullable Output<String> rotationPeriod) {
            this.rotationPeriod = rotationPeriod;
            return this;
        }
        public Builder rotationPeriod(@Nullable String rotationPeriod) {
            this.rotationPeriod = Codegen.ofNullable(rotationPeriod);
            return this;
        }        public SecretRotationArgs build() {
            return new SecretRotationArgs(nextRotationTime, rotationPeriod);
        }
    }
}
