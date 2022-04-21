// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SeedNodeResponse extends com.pulumi.resources.InvokeArgs {

    public static final SeedNodeResponse Empty = new SeedNodeResponse();

    /**
     * IP address of this seed node.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable String ipAddress;

    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    private SeedNodeResponse() {}

    private SeedNodeResponse(SeedNodeResponse $) {
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SeedNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SeedNodeResponse $;

        public Builder() {
            $ = new SeedNodeResponse();
        }

        public Builder(SeedNodeResponse defaults) {
            $ = new SeedNodeResponse(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public SeedNodeResponse build() {
            return $;
        }
    }

}
