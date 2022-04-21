// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.CloudServiceRoleSkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the role properties.
 * 
 */
public final class CloudServiceRoleProfilePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudServiceRoleProfilePropertiesArgs Empty = new CloudServiceRoleProfilePropertiesArgs();

    /**
     * Resource name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Describes the cloud service role sku.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<CloudServiceRoleSkuArgs> sku;

    public Optional<Output<CloudServiceRoleSkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    private CloudServiceRoleProfilePropertiesArgs() {}

    private CloudServiceRoleProfilePropertiesArgs(CloudServiceRoleProfilePropertiesArgs $) {
        this.name = $.name;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudServiceRoleProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudServiceRoleProfilePropertiesArgs $;

        public Builder() {
            $ = new CloudServiceRoleProfilePropertiesArgs();
        }

        public Builder(CloudServiceRoleProfilePropertiesArgs defaults) {
            $ = new CloudServiceRoleProfilePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sku(@Nullable Output<CloudServiceRoleSkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(CloudServiceRoleSkuArgs sku) {
            return sku(Output.of(sku));
        }

        public CloudServiceRoleProfilePropertiesArgs build() {
            return $;
        }
    }

}
