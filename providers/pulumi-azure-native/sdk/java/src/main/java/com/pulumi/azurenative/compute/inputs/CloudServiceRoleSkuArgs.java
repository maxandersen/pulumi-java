// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the cloud service role sku.
 * 
 */
public final class CloudServiceRoleSkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudServiceRoleSkuArgs Empty = new CloudServiceRoleSkuArgs();

    /**
     * Specifies the number of role instances in the cloud service.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Double> capacity;

    public Optional<Output<Double>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is currently on, you need to delete and recreate the cloud service or move back to the old sku.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the tier of the cloud service. Possible Values are &lt;br /&gt;&lt;br /&gt; **Standard** &lt;br /&gt;&lt;br /&gt; **Basic**
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private CloudServiceRoleSkuArgs() {}

    private CloudServiceRoleSkuArgs(CloudServiceRoleSkuArgs $) {
        this.capacity = $.capacity;
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudServiceRoleSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudServiceRoleSkuArgs $;

        public Builder() {
            $ = new CloudServiceRoleSkuArgs();
        }

        public Builder(CloudServiceRoleSkuArgs defaults) {
            $ = new CloudServiceRoleSkuArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacity(@Nullable Output<Double> capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder capacity(Double capacity) {
            return capacity(Output.of(capacity));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public CloudServiceRoleSkuArgs build() {
            return $;
        }
    }

}
