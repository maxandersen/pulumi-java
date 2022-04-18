// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostedZoneConfig {
    /**
     * Any comments that you want to include about the hosted zone.
     * 
     */
    private final @Nullable String comment;

    @CustomType.Constructor
    private HostedZoneConfig(@CustomType.Parameter("comment") @Nullable String comment) {
        this.comment = comment;
    }

    /**
     * Any comments that you want to include about the hosted zone.
     * 
    */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedZoneConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedZoneConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }        public HostedZoneConfig build() {
            return new HostedZoneConfig(comment);
        }
    }
}
