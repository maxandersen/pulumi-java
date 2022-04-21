// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerbi.inputs;

import com.pulumi.azurenative.powerbi.enums.AzureSkuName;
import com.pulumi.azurenative.powerbi.enums.AzureSkuTier;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AzureSkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureSkuArgs Empty = new AzureSkuArgs();

    /**
     * SKU name
     * 
     */
    @Import(name="name", required=true)
    private Output<Either<String,AzureSkuName>> name;

    public Output<Either<String,AzureSkuName>> name() {
        return this.name;
    }

    /**
     * SKU tier
     * 
     */
    @Import(name="tier", required=true)
    private Output<Either<String,AzureSkuTier>> tier;

    public Output<Either<String,AzureSkuTier>> tier() {
        return this.tier;
    }

    private AzureSkuArgs() {}

    private AzureSkuArgs(AzureSkuArgs $) {
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureSkuArgs $;

        public Builder() {
            $ = new AzureSkuArgs();
        }

        public Builder(AzureSkuArgs defaults) {
            $ = new AzureSkuArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<Either<String,AzureSkuName>> name) {
            $.name = name;
            return this;
        }

        public Builder name(Either<String,AzureSkuName> name) {
            return name(Output.of(name));
        }

        public Builder tier(Output<Either<String,AzureSkuTier>> tier) {
            $.tier = tier;
            return this;
        }

        public Builder tier(Either<String,AzureSkuTier> tier) {
            return tier(Output.of(tier));
        }

        public AzureSkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.tier = Objects.requireNonNull($.tier, "expected parameter 'tier' to be non-null");
            return $;
        }
    }

}
