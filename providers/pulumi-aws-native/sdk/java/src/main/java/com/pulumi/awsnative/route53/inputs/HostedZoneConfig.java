// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A complex type that contains an optional comment.
 * 
 * If you don't want to specify a comment, omit the HostedZoneConfig and Comment elements.
 * 
 */
public final class HostedZoneConfig extends com.pulumi.resources.InvokeArgs {

    public static final HostedZoneConfig Empty = new HostedZoneConfig();

    /**
     * Any comments that you want to include about the hosted zone.
     * 
     */
    @Import(name="comment")
      private final @Nullable String comment;

    public Optional<String> comment() {
        return this.comment == null ? Optional.empty() : Optional.ofNullable(this.comment);
    }

    public HostedZoneConfig(@Nullable String comment) {
        this.comment = comment;
    }

    private HostedZoneConfig() {
        this.comment = null;
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
