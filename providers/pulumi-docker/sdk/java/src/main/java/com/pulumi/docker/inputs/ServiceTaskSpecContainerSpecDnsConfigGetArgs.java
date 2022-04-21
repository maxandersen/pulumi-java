// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecDnsConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecDnsConfigGetArgs Empty = new ServiceTaskSpecContainerSpecDnsConfigGetArgs();

    @Import(name="nameservers", required=true)
    private Output<List<String>> nameservers;

    public Output<List<String>> nameservers() {
        return this.nameservers;
    }

    @Import(name="options")
    private @Nullable Output<List<String>> options;

    public Optional<Output<List<String>>> options() {
        return Optional.ofNullable(this.options);
    }

    @Import(name="searches")
    private @Nullable Output<List<String>> searches;

    public Optional<Output<List<String>>> searches() {
        return Optional.ofNullable(this.searches);
    }

    private ServiceTaskSpecContainerSpecDnsConfigGetArgs() {}

    private ServiceTaskSpecContainerSpecDnsConfigGetArgs(ServiceTaskSpecContainerSpecDnsConfigGetArgs $) {
        this.nameservers = $.nameservers;
        this.options = $.options;
        this.searches = $.searches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTaskSpecContainerSpecDnsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTaskSpecContainerSpecDnsConfigGetArgs $;

        public Builder() {
            $ = new ServiceTaskSpecContainerSpecDnsConfigGetArgs();
        }

        public Builder(ServiceTaskSpecContainerSpecDnsConfigGetArgs defaults) {
            $ = new ServiceTaskSpecContainerSpecDnsConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder nameservers(Output<List<String>> nameservers) {
            $.nameservers = nameservers;
            return this;
        }

        public Builder nameservers(List<String> nameservers) {
            return nameservers(Output.of(nameservers));
        }

        public Builder nameservers(String... nameservers) {
            return nameservers(List.of(nameservers));
        }

        public Builder options(@Nullable Output<List<String>> options) {
            $.options = options;
            return this;
        }

        public Builder options(List<String> options) {
            return options(Output.of(options));
        }

        public Builder options(String... options) {
            return options(List.of(options));
        }

        public Builder searches(@Nullable Output<List<String>> searches) {
            $.searches = searches;
            return this;
        }

        public Builder searches(List<String> searches) {
            return searches(Output.of(searches));
        }

        public Builder searches(String... searches) {
            return searches(List.of(searches));
        }

        public ServiceTaskSpecContainerSpecDnsConfigGetArgs build() {
            $.nameservers = Objects.requireNonNull($.nameservers, "expected parameter 'nameservers' to be non-null");
            return $;
        }
    }

}
