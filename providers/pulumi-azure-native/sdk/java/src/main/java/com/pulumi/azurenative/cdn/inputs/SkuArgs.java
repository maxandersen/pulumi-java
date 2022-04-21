// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.SkuName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
 * 
 */
public final class SkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * Name of the pricing tier.
     * 
     */
    @Import(name="name")
    private @Nullable Output<Either<String,SkuName>> name;

    public Optional<Output<Either<String,SkuName>>> name() {
        return Optional.ofNullable(this.name);
    }

    private SkuArgs() {}

    private SkuArgs(SkuArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuArgs $;

        public Builder() {
            $ = new SkuArgs();
        }

        public Builder(SkuArgs defaults) {
            $ = new SkuArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<Either<String,SkuName>> name) {
            $.name = name;
            return this;
        }

        public Builder name(Either<String,SkuName> name) {
            return name(Output.of(name));
        }

        public SkuArgs build() {
            return $;
        }
    }

}
