// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PodIP {
    private final @Nullable String ip;

    @OutputCustomType.Constructor({"ip"})
    private PodIP(@Nullable String ip) {
        this.ip = ip;
    }

    public Optional<String> getIp() {
        return Optional.ofNullable(this.ip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodIP defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;

        public Builder() {
    	      // Empty
        }

        public Builder(PodIP defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public PodIP build() {
            return new PodIP(ip);
        }
    }
}
