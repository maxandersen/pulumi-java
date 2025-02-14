// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebaserules.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetMetadataArgs Empty = new RulesetMetadataArgs();

    @Import(name="services")
    private @Nullable Output<List<String>> services;

    public Optional<Output<List<String>>> services() {
        return Optional.ofNullable(this.services);
    }

    private RulesetMetadataArgs() {}

    private RulesetMetadataArgs(RulesetMetadataArgs $) {
        this.services = $.services;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetMetadataArgs $;

        public Builder() {
            $ = new RulesetMetadataArgs();
        }

        public Builder(RulesetMetadataArgs defaults) {
            $ = new RulesetMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder services(@Nullable Output<List<String>> services) {
            $.services = services;
            return this;
        }

        public Builder services(List<String> services) {
            return services(Output.of(services));
        }

        public Builder services(String... services) {
            return services(List.of(services));
        }

        public RulesetMetadataArgs build() {
            return $;
        }
    }

}
