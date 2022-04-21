// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.SkuName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identifies the unique system identifier for each Azure resource.
 * 
 */
public final class SkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The Sku name.
     * 
     */
    @Import(name="name", required=true)
    private Output<Either<String,SkuName>> name;

    public Output<Either<String,SkuName>> name() {
        return this.name;
    }

    /**
     * The Sku tier.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private SkuArgs() {}

    private SkuArgs(SkuArgs $) {
        this.name = $.name;
        this.tier = $.tier;
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

        public Builder name(Output<Either<String,SkuName>> name) {
            $.name = name;
            return this;
        }

        public Builder name(Either<String,SkuName> name) {
            return name(Output.of(name));
        }

        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public SkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
