// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.SkuCapabilityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SkuZoneDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuZoneDetailArgs Empty = new SkuZoneDetailArgs();

    @Import(name="capabilities")
    private @Nullable Output<List<SkuCapabilityArgs>> capabilities;

    public Optional<Output<List<SkuCapabilityArgs>>> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }

    @Import(name="name")
    private @Nullable Output<List<String>> name;

    public Optional<Output<List<String>>> name() {
        return Optional.ofNullable(this.name);
    }

    private SkuZoneDetailArgs() {}

    private SkuZoneDetailArgs(SkuZoneDetailArgs $) {
        this.capabilities = $.capabilities;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuZoneDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuZoneDetailArgs $;

        public Builder() {
            $ = new SkuZoneDetailArgs();
        }

        public Builder(SkuZoneDetailArgs defaults) {
            $ = new SkuZoneDetailArgs(Objects.requireNonNull(defaults));
        }

        public Builder capabilities(@Nullable Output<List<SkuCapabilityArgs>> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        public Builder capabilities(List<SkuCapabilityArgs> capabilities) {
            return capabilities(Output.of(capabilities));
        }

        public Builder capabilities(SkuCapabilityArgs... capabilities) {
            return capabilities(List.of(capabilities));
        }

        public Builder name(@Nullable Output<List<String>> name) {
            $.name = name;
            return this;
        }

        public Builder name(List<String> name) {
            return name(Output.of(name));
        }

        public Builder name(String... name) {
            return name(List.of(name));
        }

        public SkuZoneDetailArgs build() {
            return $;
        }
    }

}
